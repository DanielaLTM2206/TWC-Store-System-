package ec.edu.espe.codeproject.controller;

import com.google.gson.Gson;
import com.google.gson.JsonSyntaxException;
import com.mongodb.BasicDBObject;
import com.mongodb.MongoClient;
import com.mongodb.client.MongoCollection;
import com.mongodb.client.MongoDatabase;
import static com.mongodb.client.model.Filters.eq;
import ec.edu.espe.codeproject.model.Customer;
import java.awt.HeadlessException;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import org.bson.Document;
import static org.bson.codecs.configuration.CodecRegistries.fromProviders;
import static org.bson.codecs.configuration.CodecRegistries.fromRegistries;
import org.bson.codecs.configuration.CodecRegistry;
import org.bson.codecs.pojo.PojoCodecProvider;

/**
 *
 * @author Diana Sosa, DCCO-ESPE MyWayCode
 */
public class CustomerController {

    public boolean register(Customer customer, JFrame frmFrame) {
        int reply;
        String message;
        message = customer.getName() + " is going to be added to the system";
        JOptionPane.showMessageDialog(frmFrame, message);
        message = customer.getName() + " Are you sure that you want to register "
                + customer.getName() + " to the system?";
        reply = JOptionPane.showConfirmDialog(frmFrame, message);

        if (reply == JOptionPane.YES_OPTION) {
            Document doc;
            doc = createDBObject(customer);
            MongoDatabase userDB = DBManager.getDatabase();
            MongoCollection<Document> col = userDB.getCollection("Customer");
            col.insertOne(doc);
            JOptionPane.showMessageDialog(frmFrame, "saving");
            return true;
        } else {
            JOptionPane.showMessageDialog(frmFrame, "it was not saved", "WARNING", 
            JOptionPane.ERROR_MESSAGE);
            return false;
        }
    }

    public static Document createDBObject(Customer customer) {
        Document docBuilder = new Document();
        docBuilder.append("_id", customer.getId());
        docBuilder.append("name", customer.getName());
        docBuilder.append("adress", customer.getAdress());
        docBuilder.append("cellphone", customer.getCellphone());
        docBuilder.append("email", customer.getEmail());
        return docBuilder;
    }

    public boolean delete(int id, JFrame frmFrame) {
        int reply;
        String message;
        message = id + " is going to be delete to the system";
        JOptionPane.showMessageDialog(frmFrame, message);
        message = id + " Are you sure that you want to delete "
                + id + " to the system?";
        reply = JOptionPane.showConfirmDialog(frmFrame, message);

        if (reply == JOptionPane.YES_OPTION) {
            try {
                MongoDatabase userDB = DBManager.getDatabase();
                MongoCollection<Document> col = userDB.getCollection("Customer");
                col.deleteOne(eq("_id", id));
                JOptionPane.showMessageDialog(frmFrame, "deleing");
                return true;
            } catch (ExceptionInInitializerError e) {
                JOptionPane.showMessageDialog(frmFrame, "it was not delete", 
                "WARNING", JOptionPane.ERROR_MESSAGE);
                return false;
            }

        } else {
            JOptionPane.showMessageDialog(frmFrame, "it was not delete", "WARNING", 
            JOptionPane.ERROR_MESSAGE);
            return false;
        }
    }

    public void PrintMongoData(JTable jTable) {

        CodecRegistry codecRegistry = fromRegistries(MongoClient.getDefaultCodecRegistry(),
        fromProviders(PojoCodecProvider.builder().automatic(true).build()));

        MongoDatabase db = DBManager.getDatabase().withCodecRegistry(codecRegistry);
        MongoCollection<Customer> collectionCustomers = db.getCollection("Customer",
        Customer.class).withCodecRegistry(codecRegistry);
        List<Customer> customers = collectionCustomers.find(new Document(), 
        Customer.class).into(new ArrayList<Customer>());

        Object[][] objects = new Object[customers.size()][5];

        for (int i = 0; i < customers.size(); i++) {
            objects[i][0] = customers.get(i).getId();
            objects[i][1] = customers.get(i).getName();
            objects[i][2] = customers.get(i).getCellphone();
            objects[i][3] = customers.get(i).getAdress();
            objects[i][4] = customers.get(i).getEmail();

            jTable.setModel(new javax.swing.table.DefaultTableModel(
                    objects,
                    new String[]{
                        "Id", "Name", "Cellphone", "Email", "Address"
                    }
            ));

        }

    }

    public boolean Find(JTextField txtIdFind, JFrame frmFrame, JTextField txtId,
             JTextField txtName, JTextArea txtAdress, JTextField txtCellphone, JTextField txtEmail) {
        boolean reply;
        try {
            MongoDatabase userDB = DBManager.getDatabase();
            MongoCollection<Document> col = userDB.getCollection("Customer");
            Document doc = col.find(eq("_id", Integer.parseInt(txtIdFind.getText()))).first();
            Gson gson = new Gson();
            Customer customer = gson.fromJson(doc.toJson(), Customer.class);
            txtId.setText(String.valueOf(customer.getId()));
            txtName.setText(customer.getName());
            txtAdress.setText(customer.getAdress());
            txtCellphone.setText(customer.getCellphone());
            txtEmail.setText(customer.getEmail());
            reply = true;

        } catch (JsonSyntaxException | NumberFormatException e) {

            JOptionPane.showMessageDialog(frmFrame, "Please Select Customer");
            reply = false;
        }
        return reply;
    }

    public boolean Update(JTextField txtIdFind, JFrame frmFrame, JTextField txtId,
             JTextField txtName, JTextArea txtAdress, JTextField txtCellphone, JTextField txtEmail) {
        boolean reply;
        try {

            MongoCollection<Document> col = DBManager.getDatabase().getCollection("Customer");

            BasicDBObject query = new BasicDBObject("_id", 
            new BasicDBObject("$eq", Integer.parseInt(txtId.getText())));

            BasicDBObject newDocument = new BasicDBObject();

            newDocument.put("name", txtName.getText());
            newDocument.put("adress", txtAdress.getText());
            newDocument.put("cellphone", txtCellphone.getText());
            newDocument.put("email", txtEmail.getText());

            BasicDBObject updateObject = new BasicDBObject();
            updateObject.put("$set", newDocument);
            col.updateOne(query, updateObject);

            JOptionPane.showMessageDialog(frmFrame, "Customer Update SucessFully...!");
            reply = true;
        } catch (HeadlessException | NumberFormatException e) {
            JOptionPane.showMessageDialog(frmFrame, "Please Select Customer");
            reply = false;
        }
        return reply;
    }

}

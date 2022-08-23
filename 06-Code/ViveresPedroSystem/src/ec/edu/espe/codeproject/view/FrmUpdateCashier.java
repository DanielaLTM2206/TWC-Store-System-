
package ec.edu.espe.codeproject.view;

import com.google.gson.Gson;
import com.mongodb.BasicDBObject;
import com.mongodb.client.MongoCollection;
import com.mongodb.client.MongoDatabase;
import static com.mongodb.client.model.Filters.eq;
import ec.edu.espe.codeproject.controller.CashierController;
import ec.edu.espe.codeproject.controller.CustomerController;
import ec.edu.espe.codeproject.controller.DBManager;
import ec.edu.espe.codeproject.controller.ValidationController;
import ec.edu.espe.codeproject.model.Cashier;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import org.bson.Document;

/**
 *
 * @author Daniela Tituaña, DCCO-ESPE, MyWayCode
 */
public class FrmUpdateCashier extends javax.swing.JFrame {
ValidationController validation;
  
    public FrmUpdateCashier() {
        validation = new ValidationController();
        initComponents();
        this.setLocationRelativeTo(null);
        setDefaultCloseOperation(JFrame.DO_NOTHING_ON_CLOSE);  
                    
    }

   
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        txtID = new javax.swing.JTextField();
        txtName = new javax.swing.JTextField();
        txtAddress = new javax.swing.JTextField();
        txtCellPhone = new javax.swing.JTextField();
        txtEmail = new javax.swing.JTextField();
        btnUpdate = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jLabel7 = new javax.swing.JLabel();
        txtIdFind = new javax.swing.JTextField();
        btnFind = new javax.swing.JButton();
        lblErrorCellPhone = new javax.swing.JLabel();
        lblErrorName = new javax.swing.JLabel();
        lblErrorIdFind = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(211, 157, 212));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Berlin Sans FB", 1, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("UPDATE CASHIER");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 20, -1, -1));

        jLabel2.setFont(new java.awt.Font("Berlin Sans FB", 0, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("ID:");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 130, -1, -1));

        jLabel3.setFont(new java.awt.Font("Berlin Sans FB", 0, 18)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Name:");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 170, -1, -1));

        jLabel4.setFont(new java.awt.Font("Berlin Sans FB", 0, 18)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Address:");
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 210, -1, -1));

        jLabel5.setFont(new java.awt.Font("Berlin Sans FB", 0, 18)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("CellPhone:");
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 260, -1, -1));

        jLabel6.setFont(new java.awt.Font("Berlin Sans FB", 0, 18)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("E-mail:");
        jPanel1.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 320, -1, -1));

        txtID.setToolTipText("Enter you Cedula");
        txtID.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtIDActionPerformed(evt);
            }
        });
        jPanel1.add(txtID, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 130, 160, -1));

        txtName.setToolTipText("Enter your complet name");
        txtName.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtNameKeyTyped(evt);
            }
        });
        jPanel1.add(txtName, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 170, 160, -1));

        txtAddress.setToolTipText("Enter your address with streets");
        txtAddress.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtAddressActionPerformed(evt);
            }
        });
        jPanel1.add(txtAddress, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 210, 160, -1));

        txtCellPhone.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtCellPhoneActionPerformed(evt);
            }
        });
        txtCellPhone.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtCellPhoneKeyTyped(evt);
            }
        });
        jPanel1.add(txtCellPhone, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 260, 160, -1));

        txtEmail.setToolTipText("dont forget @");
        jPanel1.add(txtEmail, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 320, 160, -1));

        btnUpdate.setText("UPDATE");
        btnUpdate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnUpdateActionPerformed(evt);
            }
        });
        jPanel1.add(btnUpdate, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 390, 80, 40));

        jButton3.setBackground(new java.awt.Color(247, 177, 191));
        jButton3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ec/edu/espe/codeproject/images/out.png"))); // NOI18N
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton3, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 400, 80, -1));

        jLabel7.setFont(new java.awt.Font("Berlin Sans FB Demi", 0, 18)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setText("ID:");
        jPanel1.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 80, -1, -1));

        txtIdFind.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtIdFindKeyTyped(evt);
            }
        });
        jPanel1.add(txtIdFind, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 80, 146, -1));

        btnFind.setText("FIND CASHIER");
        btnFind.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnFindActionPerformed(evt);
            }
        });
        jPanel1.add(btnFind, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 80, -1, -1));

        lblErrorCellPhone.setForeground(new java.awt.Color(255, 0, 0));
        jPanel1.add(lblErrorCellPhone, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 260, 50, 20));

        lblErrorName.setForeground(new java.awt.Color(255, 0, 0));
        jPanel1.add(lblErrorName, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 170, 50, 20));

        lblErrorIdFind.setForeground(new java.awt.Color(255, 0, 0));
        jPanel1.add(lblErrorIdFind, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 80, 50, 20));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 479, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtIDActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtIDActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtIDActionPerformed

    private void txtAddressActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtAddressActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtAddressActionPerformed

    private void txtCellPhoneActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtCellPhoneActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtCellPhoneActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        FrmMenu frmMenu = new FrmMenu();
        frmMenu.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_jButton3ActionPerformed

    private void btnUpdateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnUpdateActionPerformed
        CashierController cashierController;
        cashierController = new CashierController();

        cashierController.Update(txtIdFind, this, txtID,
        txtName, txtAddress, txtCellPhone, txtEmail);
        
        txtID.setText("");
        txtName.setText("");
        txtAddress.setText("");
        txtCellPhone.setText("");
        txtEmail.setText("");
        txtIdFind.setText("");
    }//GEN-LAST:event_btnUpdateActionPerformed

    private void btnFindActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnFindActionPerformed
        CashierController customerController;
        customerController = new CashierController();
 
        customerController.Find(txtIdFind, this, txtID
         , txtName, txtAddress, txtCellPhone, txtEmail);

    }//GEN-LAST:event_btnFindActionPerformed

    private void txtIdFindKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtIdFindKeyTyped
      validation.NumberValidation(txtIdFind, evt, lblErrorIdFind, 10);
    }//GEN-LAST:event_txtIdFindKeyTyped

    private void txtNameKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtNameKeyTyped
        validation.StringValidation(txtName, evt, lblErrorCellPhone, 50);
    }//GEN-LAST:event_txtNameKeyTyped

    private void txtCellPhoneKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtCellPhoneKeyTyped
        validation.NumberValidation(txtCellPhone, evt, lblErrorCellPhone, 10);
    }//GEN-LAST:event_txtCellPhoneKeyTyped

    
    
    
    
    
    
    
    public static void main(String args[]) {
        
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FrmUpdateCashier().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnFind;
    private javax.swing.JButton btnUpdate;
    private javax.swing.JButton jButton3;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel lblErrorCellPhone;
    private javax.swing.JLabel lblErrorIdFind;
    private javax.swing.JLabel lblErrorName;
    private javax.swing.JTextField txtAddress;
    private javax.swing.JTextField txtCellPhone;
    private javax.swing.JTextField txtEmail;
    private javax.swing.JTextField txtID;
    private javax.swing.JTextField txtIdFind;
    private javax.swing.JTextField txtName;
    // End of variables declaration//GEN-END:variables

}

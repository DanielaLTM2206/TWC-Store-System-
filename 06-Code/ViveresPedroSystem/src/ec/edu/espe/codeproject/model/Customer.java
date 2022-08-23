
package ec.edu.espe.codeproject.model;

/**
 *
 * @author Diana Sosa, DCCO-ESPE MyWayCode
 */
public class Customer {
    private int _id;
    private String cellphone;
    private String name;
    private String adress; 
    private String email;
    

    public Customer() {
    }
        
    
    public Customer(int identification, String name, String adress,String cellphone, String email) {
        this._id = identification;
        this.cellphone = cellphone;
        this.name = name;
        this.adress = adress;
        this.email = email;
      
    }


    /**
     * @return the _id
     */
    public int getId() {
        return _id;
    }

    /**
     * @param _id the _id to set
     */
    public void setId(int _id) {
        this._id = _id;
    }

    /**
     * @return the CellPhone
     */
    public String getCellphone() {
        return cellphone;
    }

    /**
     * @param cellphone the CellPhone to set
     */
    public void setCellphone(String cellphone) {
        this.cellphone = cellphone;
    }

    /**
     * @return the name
     */
    public String getName() {
        return name;
    }

    /**
     * @param name the name to set
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * @return the adress
     */
    public String getAdress() {
        return adress;
    }

    /**
     * @param adress the adress to set
     */
    public void setAdress(String adress) {
        this.adress = adress;
    }

    /**
     * @return the email
     */
    public String getEmail() {
        return email;
    }

    /**
     * @param email the email to set
     */
    public void setEmail(String email) {
        this.email = email;
    }

    /**
     * @return the user
     */
    
}

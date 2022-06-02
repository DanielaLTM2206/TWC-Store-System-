package ec.edu.espe.codeproject.model;

/**
 *
 * @author Daniela Tituaña, DCCO-ESPE, MyWayCode
 */
public class Inventory {
    private String product;
    private int code;
    private String type;
    private int amount; 
    private float price;
    private String date;

    public Inventory(String product, int code, String type, int amount, float price, String date) {
        this.product = product;
        this.code = code;
        this.type = type;
        this.amount = amount;
        this.price = price;
        this.date = date;
    }

    @Override
    public String toString() {
        return "Inventory{" + "product=" + product + ", code=" + code + ", type=" + type + ", amount=" + amount + ", price=" + price + ", date=" + date + '}';
    }

    /**
     * @return the product
     */
    public String getProduct() {
        return product;
    }

    /**
     * @param product the product to set
     */
    public void setProduct(String product) {
        this.product = product;
    }

    /**
     * @return the code
     */
    public int getCode() {
        return code;
    }

    /**
     * @param code the code to set
     */
    public void setCode(int code) {
        this.code = code;
    }

    /**
     * @return the type
     */
    public String getType() {
        return type;
    }

    /**
     * @param type the type to set
     */
    public void setType(String type) {
        this.type = type;
    }

    /**
     * @return the amount
     */
    public int getAmount() {
        return amount;
    }

    /**
     * @param amount the amount to set
     */
    public void setAmount(int amount) {
        this.amount = amount;
    }

    /**
     * @return the price
     */
    public float getPrice() {
        return price;
    }

    /**
     * @param price the price to set
     */
    public void setPrice(float price) {
        this.price = price;
    }

    /**
     * @return the date
     */
    public String getDate() {
        return date;
    }

    /**
     * @param date the date to set
     */
    public void setDate(String date) {
        this.date = date;
    }
    
    
}

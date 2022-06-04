package ec.edu.espe.codeproject.model;

/**
 *
 * @author Martín Toapanta, DCCO-ESPE, MyWayCode
 */
public class Inventoryy {
    private String product;
    private int code;
    private String type;
    private int amount;
    private float price;
    private boolean discount;
    private String date;
    private String status;
    
    public void addProduct(){
    }
    public void editProduct(){
    }
    public productList searchProduct(){
    return new productList();
    }
    public void deleteProduct(){
    }

    public Inventoryy(String product, int code, String type, int amount, float price, boolean discount, String date, String status) {
        this.product = product;
        this.code = code;
        this.type = type;
        this.amount = amount;
        this.price = price;
        this.discount = discount;
        this.date = date;
        this.status = status;
    }

    @Override
    public String toString() {
        return "Inventoryy{" + "product=" + product + ", code=" + code + ", type=" + type + ", amount=" + amount + ", price=" + price + ", discount=" + discount + ", date=" + date + ", status=" + status + '}';
    }

    public String getProduct() {
        return product;
    }

    public void setProduct(String product) {
        this.product = product;
    }

    public int getCode() {
        return code;
    }

    public void setCode(int code) {
        this.code = code;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public int getAmount() {
        return amount;
    }

    public void setAmount(int amount) {
        this.amount = amount;
    }

    public float getPrice() {
        return price;
    }

    public void setPrice(float price) {
        this.price = price;
    }

    public boolean isDiscount() {
        return discount;
    }

    public void setDiscount(boolean discount) {
        this.discount = discount;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

}
    
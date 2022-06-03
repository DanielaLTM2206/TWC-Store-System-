package ec.edu.espe.codeproject.model;
/**
 *
 * @author Martin Toapanta, DCCO-ESPE, MyWayCode
 */
public class Inventory {
<<<<<<< HEAD
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
 ArrayList<ProductList> productList;
 public productList(ProductList productList){ 
 }

=======
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
>>>>>>> c833160813a764342251e61e363887520e4b9411
    public String getProduct() {
        return product;
    }

<<<<<<< HEAD
    public int getCode() {
        return code;
    }

    public String getType() {
        return type;
    }

    public int getAmount() {
        return amount;
    }

    public float getPrice() {
        return price;
    }

    public boolean isDiscount() {
        return discount;
    }

    public String getDate() {
        return date;
    }

    public String getStatus() {
        return status;
    }

    public <any> getProductList() {
        return productList;
    }

=======
    /**
     * @param product the product to set
     */
>>>>>>> c833160813a764342251e61e363887520e4b9411
    public void setProduct(String product) {
        this.product = product;
    }

<<<<<<< HEAD
=======
    /**
     * @return the code
     */
    public int getCode() {
        return code;
    }

    /**
     * @param code the code to set
     */
>>>>>>> c833160813a764342251e61e363887520e4b9411
    public void setCode(int code) {
        this.code = code;
    }

<<<<<<< HEAD
=======
    /**
     * @return the type
     */
    public String getType() {
        return type;
    }

    /**
     * @param type the type to set
     */
>>>>>>> c833160813a764342251e61e363887520e4b9411
    public void setType(String type) {
        this.type = type;
    }

<<<<<<< HEAD
=======
    /**
     * @return the amount
     */
    public int getAmount() {
        return amount;
    }

    /**
     * @param amount the amount to set
     */
>>>>>>> c833160813a764342251e61e363887520e4b9411
    public void setAmount(int amount) {
        this.amount = amount;
    }

<<<<<<< HEAD
=======
    /**
     * @return the price
     */
    public float getPrice() {
        return price;
    }

    /**
     * @param price the price to set
     */
>>>>>>> c833160813a764342251e61e363887520e4b9411
    public void setPrice(float price) {
        this.price = price;
    }

<<<<<<< HEAD
    public void setDiscount(boolean discount) {
        this.discount = discount;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public void setProductList(<any> productList) {
        this.productList = productList;
    }

   
    }
 
 
=======
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
>>>>>>> c833160813a764342251e61e363887520e4b9411

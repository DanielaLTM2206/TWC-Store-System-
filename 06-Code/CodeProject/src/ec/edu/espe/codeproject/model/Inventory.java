package ec.edu.espe.codeproject.model;
/**
 *
 * @author Martin Toapanta, DCCO-ESPE, MyWayCode
 */
public class Inventory {
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

    public String getProduct() {
        return product;
    }

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

    public void setProduct(String product) {
        this.product = product;
    }

    public void setCode(int code) {
        this.code = code;
    }

    public void setType(String type) {
        this.type = type;
    }

    public void setAmount(int amount) {
        this.amount = amount;
    }

    public void setPrice(float price) {
        this.price = price;
    }

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
 
 

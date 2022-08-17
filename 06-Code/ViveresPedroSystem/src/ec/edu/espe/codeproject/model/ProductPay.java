package ec.edu.espe.codeproject.model;

import javax.swing.JTextField;

/**
 *price
 * @author Daniela Tituaña, DCCO-ESPE, MyWayCode
 */
public class ProductPay {
   
    private int unit;
    private float price ;
    private float totalPay;
    private float totalPayIva;

   
    public ProductPay( int unit, float price, float totalPay, float totalPayIva) {
   
        this.unit = unit;
        this.price = price;
        this.totalPay = totalPay;
        this.totalPayIva = totalPayIva;
    }

     public ProductPay() {
    }
     
     

 

    /**
 


    /**
     * @return the unit
     */
    public int getUnit() {
        return unit;
    }

    /**
     * @param unit the unit to set
     */
    public void setUnit(int unit) {
        this.unit = unit;
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
     * @return the totalPay
     */
    public double getTotalPay() {
        return totalPay;
    }

    /**
     * @param totalPay the totalPay to set
     */
    public void setTotalPay(float totalPay) {
        this.totalPay = totalPay;
    }

    /**
     * @return the totalPayIva
     */
    public double getTotalPayIva() {
        return totalPayIva;
    }

    /**
     * @param totalPayIva the totalPayIva to set
     */
    public void setTotalPayIva(float totalPayIva) {
        this.totalPayIva = totalPayIva;
    }
    
    
    public void total(JTextField txtField){
       totalPay = price*unit; 
       txtField.setText("$"+totalPay);
   }
}

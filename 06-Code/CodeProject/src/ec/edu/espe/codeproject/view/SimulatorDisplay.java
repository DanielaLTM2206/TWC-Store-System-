 package ec.edu.espe.codeproject.view;

/**
 *
 * @author  DCCO - ESPE,MyWayCode
 */
public class SimulatorDisplay {
    public static void main(String[] args) {
        System.out.println("Viveres Pedro System, MyWayCode");
        
         int limitMenu;
        limitMenu = 2;
        
        System.out.println("1. Sale Register ");
        System.out.println("2. Inventory Record");
        System.out.println("3. Add New Product");
        System.out.println("4. Seach Product");
        System.out.println("5. Invoice History");
        
        
        switch(limitMenu){
            case 1 -> System.out.println("Record of sales of the day with date and time");
            case 2 -> System.out.println("Registers the entry and exit of products from inventory");
            case 3 -> System.out.println("New products are added with name, batch and unit price");
            case 4 -> System.out.println("Search for a product by name and batch");
            case 5 -> System.out.println("There will be a record of the invoices issued daily");
            
        }
    }
}
        
    
        


package ec.edu.espe.codeproject.view;
 
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.PrintWriter;
import java.util.Scanner;

/**
 *
 * @author  DCCO - ESPE,MyWayCode
 */
public class ViveresPedro {
    public static void main(String[] args) {
        
        Scanner Input;
        String textData;
        String idData;
        String nameData;
        String emailData;
        String userData;
        String passwordData;
        String Password="1106";
        
        
        
        Input = new Scanner(System.in);
        try {
            FileWriter fileWriter;
            BufferedWriter bufferedWriter;
            String path = "C:\\Users\\USER\\Desktop\\POO EDISON\\Cashier.csv";
            
            File file = new File(path);
            fileWriter = new FileWriter(file);
            bufferedWriter = new BufferedWriter(fileWriter);
            
            if (!file.exists()) {
                file.createNewFile();
            }
            
            
       
        Scanner sn = new Scanner (System.in);
        boolean exit = false;
        int option;
        String cashier;
        while (!exit){
            System.out.println("VIVERES PEDRO SYSTEM");
            System.out.println("========WELCOME========");
            
            System.out.println("1.Cashier");
            System.out.println("2.Customer");
            System.out.println("3.Inventory");
            System.out.println("4.Providers");
            System.out.println("5.Exit");

            
            System.out.println("Enter your option to choose: ");
            option = sn.nextInt();
            
            switch(option){
                case 1:
                    System.out.println("Cashier data");
                    cashier = Input.nextLine();
                    bufferedWriter.write(cashier);
                    bufferedWriter.newLine();
                    break;
                case 2:
                    
                    break;
                case 3:
                    
                    break;
                case 4:
                    
                    break;
                case 5:
                    exit=true;
                    
                    break;
                default:
                    System.out.println("The options are from 1 to 7 ");

                    
            }
                  
                
            }
            
             
        }  catch (Exception e) {
            e.printStackTrace();
        }
    }
        
        
    }

        
    
        


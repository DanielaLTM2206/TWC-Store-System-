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
        System.out.println("Viveres Pedro System, MyWayCode");
        
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
            
            System.out.println("Enter your ID: ");
            idData = Input.nextLine();
            String name;
            bufferedWriter.write(idData);
            bufferedWriter.newLine();
            
            System.out.println("Enther your Name");
            nameData = Input.nextLine();
            bufferedWriter.write(nameData);
            bufferedWriter.newLine();
            
            System.out.println("Enther your Email");
            emailData = Input.nextLine();
            bufferedWriter.write(emailData);
            bufferedWriter.newLine();
            
            System.out.println("Enther your User");
            userData = Input.nextLine();
            bufferedWriter.write(userData);
            bufferedWriter.newLine();
            
            System.out.println("Enther your Password");
            passwordData = Input.nextLine();
            
            
            

            //String Pass=new String(this.Password.getPassword());
      
            
            //bufferedWriter.write(textData);
            //bufferedWriter.newLine();
            bufferedWriter.close();
            System.out.println("=======USER INFORMATION========");
            System.out.println("ID: "+idData);
            System.out.println("Name: "+nameData);
            System.out.println("Email: "+emailData);
            System.out.println("User: "+userData);
            System.out.println("Password: "+passwordData);
            if(passwordData.equals(Password)){
                System.out.println("Right Password");
                System.out.println("/////WELCOME/////");
            }
            else{
                System.out.println("Incorrect Password Try Again");
            }
        } catch (Exception e) {
            e.printStackTrace();
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
    }
        
        
    }

        
    
        


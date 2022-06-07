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
            textData = Input.nextLine();
            bufferedWriter.write(textData);
            bufferedWriter.newLine();
            System.out.println("Enther your Name");
            textData = Input.nextLine();
            bufferedWriter.write(textData);
            bufferedWriter.newLine();
            System.out.println("Enther your Email");
            textData = Input.nextLine();
            bufferedWriter.write(textData);
            bufferedWriter.newLine();
            System.out.println("Enther your User");
            textData = Input.nextLine();
            bufferedWriter.write(textData);
            bufferedWriter.newLine();
            System.out.println("Enther your Password");
            textData = Input.nextLine();
            bufferedWriter.write(textData);
            bufferedWriter.newLine();
            bufferedWriter.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
        
        
    }

        
    
        


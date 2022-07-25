/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ec.edu.espe.codeproject.controller;

import ec.edu.espe.codeproject.model.Cashier;
import java.awt.event.KeyEvent;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

/**
 *
 * @author Daniela Tituaña, DCCO-ESPE, MyWayCode
 */
public class CashierController {
    public boolean register(Cashier cashier, JFrame frmFrame) {
        int reply;
        String message;
        message = cashier.getName() + " is going to be added to the system";
        JOptionPane.showMessageDialog(frmFrame, message);
        message = cashier.getName() + " Are you sure that you want to register "
                + cashier.getName() + " to the system?";
        reply = JOptionPane.showConfirmDialog(frmFrame, message);

        if (reply == JOptionPane.YES_OPTION) {
            //code to save the customer in the database
            JOptionPane.showMessageDialog(frmFrame, "Saving");
        } else {
            JOptionPane.showMessageDialog(frmFrame, "it was not saved","WARNING",JOptionPane.ERROR_MESSAGE);
        }
        //if yes - save to data base
        //else- don´t save it
        //code to insert in the database
        {
            return true;
        }
    }
    
    public void ValidateNumbers (KeyEvent evt, JTextField txt, JLabel IblError){
        String value = txt.getText();
        int length = value.length();
        
        if(evt.getKeyChar()>='0' && evt.getKeyChar()<='9'){
            txt.setEditable(true);
            IblError.setText("");
            if(length>9){
                txt.setEditable(false);
                IblError.setText("Max 10 digits");
            }
        }else{
            txt.setEditable(true);
            IblError.setText("*Only digits (0-9)");
            
        }
        
    }
    
}

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ec.edu.espe.codeproject.controller;

import ec.edu.espe.codeproject.model.Cashier;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

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
    
}

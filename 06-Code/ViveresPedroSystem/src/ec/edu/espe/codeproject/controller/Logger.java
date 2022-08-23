
package ec.edu.espe.codeproject.controller;

import ec.edu.espe.codeproject.view.FrmMenu;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

/**
 *
 * @author Diana Sosa, DCCO-ESPE MyWayCode
 */
public class Logger {
     private static Logger log;

    private Logger() {
    }

    public static Logger getInstance() {
        if (log == null) {
            log = new Logger();
        }
        return log;
    }

    public void log(JFrame frmFrame,JTextField txtPassword,JTextField txtUsername) {
        
        String username="oop";
        String password="1234";

        if(txtUsername.getText().equals(username)&&txtPassword.getText().equals(password)){   
        FrmMenu EP=new FrmMenu();
        EP.setVisible(true);
        frmFrame.setVisible(false);
        }
        else{
         JOptionPane.showMessageDialog(frmFrame,"Incorrect Username / Password");
         txtPassword.setText("");
         txtUsername.setText("");
      }
    }
}

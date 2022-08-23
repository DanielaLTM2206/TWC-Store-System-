
package ec.edu.espe.codeproject.view;

import ec.edu.espe.codeproject.controller.CashierController;
import ec.edu.espe.codeproject.controller.DBManager;
import ec.edu.espe.codeproject.controller.ValidationController;
import javax.swing.JFrame;

/**
 *
 * @author Daniela Tituaña, DCCO-ESPE, MyWayCode
 */
public class FrmDeleteCashier extends javax.swing.JFrame {
    ValidationController input;
    

    /**
     * Creates new form FrmUpyDeCashier
     */
    public FrmDeleteCashier() {
        input = new ValidationController();
        initComponents();
        this.setLocationRelativeTo(null);
        setDefaultCloseOperation(JFrame.DO_NOTHING_ON_CLOSE);
        DBManager.getDatabase();     
        returnButton.setOpaque(false);
        returnButton.setContentAreaFilled(false);
        returnButton.setBorderPainted(false);
             
             
    }


    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        btnDelete = new javax.swing.JButton();
        returnButton = new javax.swing.JButton();
        txtIdEliminar = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        IblErrorID = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(211, 157, 212));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Berlin Sans FB", 1, 36)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("DELETE CASHIER");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(106, 12, -1, -1));

        btnDelete.setBackground(new java.awt.Color(253, 186, 255));
        btnDelete.setText("DELETE");
        btnDelete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDeleteActionPerformed(evt);
            }
        });
        jPanel1.add(btnDelete, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 198, -1, 38));

        returnButton.setBackground(new java.awt.Color(253, 186, 255));
        returnButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ec/edu/espe/codeproject/images/out.png"))); // NOI18N
        returnButton.setText("RETURN");
        returnButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                returnButtonActionPerformed(evt);
            }
        });
        jPanel1.add(returnButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 210, 52, -1));

        txtIdEliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtIdEliminarActionPerformed(evt);
            }
        });
        txtIdEliminar.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtIdEliminarKeyPressed(evt);
            }
        });
        jPanel1.add(txtIdEliminar, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 120, 137, -1));

        jLabel7.setFont(new java.awt.Font("Berlin Sans FB", 0, 18)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setText("ID to Delete");
        jPanel1.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 120, -1, -1));

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ec/edu/espe/codeproject/images/Ellipse 2.png"))); // NOI18N
        jLabel2.setText("jLabel2");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(29, 164, 105, -1));

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ec/edu/espe/codeproject/images/Ellipse 1.png"))); // NOI18N
        jLabel3.setText("jLabel3");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 40, 100, 120));

        IblErrorID.setForeground(new java.awt.Color(255, 0, 51));
        jPanel1.add(IblErrorID, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 150, 140, 10));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnDeleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDeleteActionPerformed
        CashierController cashierController;
        cashierController = new CashierController();
        cashierController.delete(Integer.parseInt(txtIdEliminar.getText()), this);

        txtIdEliminar.setText("");
    }//GEN-LAST:event_btnDeleteActionPerformed

    private void returnButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_returnButtonActionPerformed
        FrmMenu frmMenu = new FrmMenu();
        frmMenu.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_returnButtonActionPerformed

    private void txtIdEliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtIdEliminarActionPerformed
       
    }//GEN-LAST:event_txtIdEliminarActionPerformed

    private void txtIdEliminarKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtIdEliminarKeyPressed
        input.NumberValidation(txtIdEliminar, evt, IblErrorID, 10);
    }//GEN-LAST:event_txtIdEliminarKeyPressed

    
    public static void main(String args[]) {
   
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FrmDeleteCashier().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel IblErrorID;
    private javax.swing.JButton btnDelete;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JButton returnButton;
    private javax.swing.JTextField txtIdEliminar;
    // End of variables declaration//GEN-END:variables

}


package ec.edu.espe.codeproject.view;

import ec.edu.espe.codeproject.controller.PayProductController;
import ec.edu.espe.codeproject.model.ProductPay;

/**
 *
 * @author Diana Sosa, DCCO-ESPE MyWayCode
 */
public class FrmPayProduct extends javax.swing.JFrame {

    
    public FrmPayProduct() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        totalPayIva = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        txtUnit = new javax.swing.JTextField();
        txtPrice = new javax.swing.JTextField();
        txtTotalPay = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        returnButton = new javax.swing.JButton();
        jLabel7 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        labelInvoice = new javax.swing.JLabel();
        txtID = new javax.swing.JTextField();
        txtName = new javax.swing.JTextField();
        InvoiceCombo = new javax.swing.JComboBox<>();
        btnFind = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        totalPayIva.setBackground(new java.awt.Color(211, 157, 212));
        totalPayIva.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Berlin Sans FB", 0, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("PAY PRODUCTS ");
        totalPayIva.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(156, 16, -1, -1));

        jLabel2.setFont(new java.awt.Font("Berlin Sans FB", 0, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Units");
        totalPayIva.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 160, -1, -1));

        jLabel3.setFont(new java.awt.Font("Berlin Sans FB", 0, 18)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Price");
        totalPayIva.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 200, -1, -1));

        jLabel4.setFont(new java.awt.Font("Berlin Sans FB", 0, 18)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Total to pay");
        totalPayIva.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 240, -1, -1));
        totalPayIva.add(txtUnit, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 160, 114, -1));
        totalPayIva.add(txtPrice, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 200, 120, -1));
        totalPayIva.add(txtTotalPay, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 240, 120, -1));

        jButton1.setText("CALCULATE");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jButton1.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jButton1KeyPressed(evt);
            }
        });
        totalPayIva.add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 340, -1, -1));

        returnButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ec/edu/espe/codeproject/images/out.png"))); // NOI18N
        returnButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                returnButtonActionPerformed(evt);
            }
        });
        totalPayIva.add(returnButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 360, 59, 71));

        jLabel7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ec/edu/espe/codeproject/images/Ellipse 2.png"))); // NOI18N
        totalPayIva.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 300, -1, 120));

        jLabel5.setFont(new java.awt.Font("Berlin Sans FB", 0, 18)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("Client Name");
        totalPayIva.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 120, -1, -1));

        jLabel8.setFont(new java.awt.Font("Berlin Sans FB", 0, 18)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(255, 255, 255));
        jLabel8.setText("ID");
        totalPayIva.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 80, -1, -1));

        labelInvoice.setFont(new java.awt.Font("Berlin Sans FB", 0, 18)); // NOI18N
        labelInvoice.setForeground(new java.awt.Color(255, 255, 255));
        labelInvoice.setText("Invoice with data     ");
        totalPayIva.add(labelInvoice, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 280, -1, -1));
        totalPayIva.add(txtID, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 90, 120, -1));
        totalPayIva.add(txtName, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 120, 120, -1));

        InvoiceCombo.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "YES", "NO" }));
        totalPayIva.add(InvoiceCombo, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 280, -1, -1));

        btnFind.setBackground(new java.awt.Color(204, 153, 255));
        btnFind.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ec/edu/espe/codeproject/images/findIcon.png"))); // NOI18N
        btnFind.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnFindActionPerformed(evt);
            }
        });
        totalPayIva.add(btnFind, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 67, 60, 50));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 470, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(totalPayIva, javax.swing.GroupLayout.PREFERRED_SIZE, 470, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 431, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(totalPayIva, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        PayProductController payProductController;
        payProductController = new PayProductController();
        ProductPay productPay = new ProductPay();
        productPay.setId(Integer.parseInt(txtID.getText()));
        productPay.setName(txtName.getText());
        productPay.setInvoice(labelInvoice.getText() + InvoiceCombo.getSelectedItem().toString());
        productPay.setPrice(Float.parseFloat(txtPrice.getText()));
        productPay.setUnit(Float.parseFloat(txtUnit.getText()));

        productPay.total(txtTotalPay);
        payProductController.total(productPay,
                txtTotalPay, (float) productPay.getTotalPay(),
                productPay.getUnit(),
                productPay.getPrice());
        productPay.getId();
        productPay.getName();
        payProductController.mongo(productPay, this);

    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton1KeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jButton1KeyPressed
        txtPrice.setText("");
        txtTotalPay.setText("");
        txtUnit.setText("");

    }//GEN-LAST:event_jButton1KeyPressed

    private void returnButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_returnButtonActionPerformed
        FrmMenu frmMenu = new FrmMenu();
        frmMenu.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_returnButtonActionPerformed

    private void btnFindActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnFindActionPerformed

        PayProductController payProductController;
        payProductController = new PayProductController();

        payProductController.Find(txtID, this, txtName);
    }//GEN-LAST:event_btnFindActionPerformed

    public static void main(String args[]) {
      
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FrmPayProduct().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<String> InvoiceCombo;
    private javax.swing.JButton btnFind;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel labelInvoice;
    private javax.swing.JButton returnButton;
    private javax.swing.JPanel totalPayIva;
    private javax.swing.JTextField txtID;
    private javax.swing.JTextField txtName;
    private javax.swing.JTextField txtPrice;
    private javax.swing.JTextField txtTotalPay;
    private javax.swing.JTextField txtUnit;
    // End of variables declaration//GEN-END:variables
}

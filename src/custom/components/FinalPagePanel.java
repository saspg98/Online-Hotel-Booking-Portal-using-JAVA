/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package custom.components;

/**
 *
 * @author Pranek
 */
public class FinalPagePanel extends javax.swing.JPanel {

    /**
     * Creates new form BookNow
     */
    public FinalPagePanel() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {
        java.awt.GridBagConstraints gridBagConstraints;

        buttonGroup1 = new javax.swing.ButtonGroup();
        adharCardRB = new javax.swing.JRadioButton();
        panCardRB = new javax.swing.JRadioButton();
        adharCardNumberTF = new javax.swing.JTextField();
        confirmButton = new javax.swing.JButton();
        panCardNumberTF = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        PriceTF = new javax.swing.JTextField();
        hotelNameTF = new javax.swing.JTextField();
        guestsTF = new javax.swing.JTextField();
        roomsTF = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        HotelAddressTextArea = new javax.swing.JTextArea();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        checkInDatePanel = new custom.components.DatePanel();
        checkOutDatePanel = new custom.components.DatePanel();

        setBackground(new java.awt.Color(0, 0, 0));
        setForeground(new java.awt.Color(255, 255, 255));
        setLayout(new java.awt.GridBagLayout());

        adharCardRB.setBackground(new java.awt.Color(0, 0, 0));
        buttonGroup1.add(adharCardRB);
        adharCardRB.setFont(new java.awt.Font("Lato Black", 0, 24)); // NOI18N
        adharCardRB.setForeground(new java.awt.Color(255, 255, 255));
        adharCardRB.setText("Adhar card");
        adharCardRB.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                adharCardRBActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 7;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.WEST;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.weighty = 1.0;
        gridBagConstraints.insets = new java.awt.Insets(17, 17, 17, 17);
        add(adharCardRB, gridBagConstraints);

        panCardRB.setBackground(new java.awt.Color(0, 0, 0));
        buttonGroup1.add(panCardRB);
        panCardRB.setFont(new java.awt.Font("Lato Black", 0, 24)); // NOI18N
        panCardRB.setForeground(new java.awt.Color(255, 255, 255));
        panCardRB.setText("Pan card");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 8;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.WEST;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.weighty = 1.0;
        gridBagConstraints.insets = new java.awt.Insets(17, 17, 17, 17);
        add(panCardRB, gridBagConstraints);

        adharCardNumberTF.setFont(new java.awt.Font("Lato", 0, 24)); // NOI18N
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 7;
        gridBagConstraints.ipadx = 250;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.WEST;
        gridBagConstraints.weightx = 3.0;
        gridBagConstraints.weighty = 1.0;
        gridBagConstraints.insets = new java.awt.Insets(10, 10, 10, 10);
        add(adharCardNumberTF, gridBagConstraints);

        confirmButton.setBackground(new java.awt.Color(204, 255, 204));
        confirmButton.setFont(new java.awt.Font("Lato Black", 0, 30)); // NOI18N
        confirmButton.setText("Confirm Booking");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 9;
        gridBagConstraints.gridwidth = 5;
        gridBagConstraints.ipadx = 71;
        gridBagConstraints.ipady = 34;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.weighty = 1.0;
        gridBagConstraints.insets = new java.awt.Insets(20, 20, 20, 20);
        add(confirmButton, gridBagConstraints);

        panCardNumberTF.setFont(new java.awt.Font("Lato", 0, 24)); // NOI18N
        panCardNumberTF.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                panCardNumberTFActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 8;
        gridBagConstraints.ipadx = 250;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.WEST;
        gridBagConstraints.weightx = 3.0;
        gridBagConstraints.weighty = 1.0;
        gridBagConstraints.insets = new java.awt.Insets(10, 10, 10, 10);
        add(panCardNumberTF, gridBagConstraints);

        jLabel1.setFont(new java.awt.Font("Lato Black", 0, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Hotel Address");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.WEST;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.weighty = 1.0;
        gridBagConstraints.insets = new java.awt.Insets(17, 17, 17, 17);
        add(jLabel1, gridBagConstraints);

        jLabel2.setFont(new java.awt.Font("Lato Black", 0, 24)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Hotel Name");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.anchor = java.awt.GridBagConstraints.LINE_START;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.weighty = 1.0;
        gridBagConstraints.insets = new java.awt.Insets(17, 17, 17, 17);
        add(jLabel2, gridBagConstraints);

        jButton1.setFont(new java.awt.Font("Lato Black", 0, 28)); // NOI18N
        jButton1.setText("Cancel");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 9;
        add(jButton1, gridBagConstraints);

        jLabel3.setFont(new java.awt.Font("Lato Black", 0, 24)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Price");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 2;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.WEST;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.weighty = 1.0;
        gridBagConstraints.insets = new java.awt.Insets(17, 17, 17, 17);
        add(jLabel3, gridBagConstraints);

        jLabel4.setFont(new java.awt.Font("Lato Black", 0, 24)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Check Out");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 6;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.WEST;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.weighty = 1.0;
        gridBagConstraints.insets = new java.awt.Insets(17, 17, 17, 17);
        add(jLabel4, gridBagConstraints);

        jLabel5.setFont(new java.awt.Font("Lato Black", 0, 24)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("Number of Guests");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 3;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.WEST;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.weighty = 1.0;
        gridBagConstraints.insets = new java.awt.Insets(17, 17, 17, 17);
        add(jLabel5, gridBagConstraints);

        PriceTF.setEditable(false);
        PriceTF.setFont(new java.awt.Font("Lato", 0, 24)); // NOI18N
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 2;
        gridBagConstraints.ipadx = 250;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.WEST;
        gridBagConstraints.weightx = 3.0;
        gridBagConstraints.weighty = 1.0;
        add(PriceTF, gridBagConstraints);

        hotelNameTF.setEditable(false);
        hotelNameTF.setFont(new java.awt.Font("Lato", 0, 24)); // NOI18N
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.ipadx = 250;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.LINE_START;
        gridBagConstraints.weightx = 3.0;
        gridBagConstraints.weighty = 1.0;
        add(hotelNameTF, gridBagConstraints);

        guestsTF.setEditable(false);
        guestsTF.setFont(new java.awt.Font("Lato", 0, 24)); // NOI18N
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 3;
        gridBagConstraints.ipadx = 250;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.WEST;
        gridBagConstraints.weightx = 3.0;
        gridBagConstraints.weighty = 1.0;
        add(guestsTF, gridBagConstraints);

        roomsTF.setEditable(false);
        roomsTF.setFont(new java.awt.Font("Lato", 0, 24)); // NOI18N
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 4;
        gridBagConstraints.ipadx = 250;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.WEST;
        gridBagConstraints.weightx = 3.0;
        gridBagConstraints.weighty = 1.0;
        add(roomsTF, gridBagConstraints);

        HotelAddressTextArea.setEditable(false);
        HotelAddressTextArea.setColumns(20);
        HotelAddressTextArea.setFont(new java.awt.Font("Lato Black", 0, 24)); // NOI18N
        HotelAddressTextArea.setLineWrap(true);
        HotelAddressTextArea.setRows(5);
        HotelAddressTextArea.setWrapStyleWord(true);
        jScrollPane1.setViewportView(HotelAddressTextArea);

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.ipadx = 230;
        gridBagConstraints.ipady = 100;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.WEST;
        gridBagConstraints.weightx = 3.0;
        gridBagConstraints.weighty = 1.0;
        add(jScrollPane1, gridBagConstraints);

        jLabel6.setFont(new java.awt.Font("Lato Black", 0, 24)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("Check In");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 5;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.WEST;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.weighty = 1.0;
        gridBagConstraints.insets = new java.awt.Insets(17, 17, 17, 17);
        add(jLabel6, gridBagConstraints);

        jLabel7.setFont(new java.awt.Font("Lato Black", 0, 24)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setText("Number of Rooms");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 4;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.WEST;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.weighty = 1.0;
        gridBagConstraints.insets = new java.awt.Insets(17, 17, 17, 17);
        add(jLabel7, gridBagConstraints);

        checkInDatePanel.setBackground(new java.awt.Color(204, 204, 204));
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 5;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.LINE_START;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.weighty = 1.0;
        gridBagConstraints.insets = new java.awt.Insets(10, 10, 10, 10);
        add(checkInDatePanel, gridBagConstraints);

        checkOutDatePanel.setBackground(new java.awt.Color(204, 204, 204));
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 6;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.LINE_START;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.weighty = 1.0;
        gridBagConstraints.insets = new java.awt.Insets(10, 10, 10, 10);
        add(checkOutDatePanel, gridBagConstraints);
    }// </editor-fold>//GEN-END:initComponents

    private void adharCardRBActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_adharCardRBActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_adharCardRBActionPerformed

    private void panCardNumberTFActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_panCardNumberTFActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_panCardNumberTFActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextArea HotelAddressTextArea;
    private javax.swing.JTextField PriceTF;
    private javax.swing.JTextField adharCardNumberTF;
    private javax.swing.JRadioButton adharCardRB;
    private javax.swing.ButtonGroup buttonGroup1;
    private custom.components.DatePanel checkInDatePanel;
    private custom.components.DatePanel checkOutDatePanel;
    private javax.swing.JButton confirmButton;
    private javax.swing.JTextField guestsTF;
    private javax.swing.JTextField hotelNameTF;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField panCardNumberTF;
    private javax.swing.JRadioButton panCardRB;
    private javax.swing.JTextField roomsTF;
    // End of variables declaration//GEN-END:variables
}

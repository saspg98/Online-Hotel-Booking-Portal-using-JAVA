/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package custom.components;

import java.awt.event.ActionListener;

/**
 *
 * @author Sarthak
 */
public class GuestRoomDialogPanel extends javax.swing.JPanel {

    public static final String  G_UPDATE= "GUEST_UPDATE";
    public static final String  G_CANCEL= "GUEST_CANCEL";
    
    /**
     * Creates new form GuestRoomDialogPanel
     */
    public GuestRoomDialogPanel() {
        initComponents();
        updateButton.setActionCommand(G_UPDATE);
        cancelButton.setActionCommand(G_CANCEL);
    }
    
     public void setActionListener(ActionListener a){
        updateButton.addActionListener(a);
        cancelButton.addActionListener(a);
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

        cancelButton = new javax.swing.JButton();
        updateButton = new javax.swing.JButton();
        guestRoomPanel = new custom.components.GuestRoomPanel();
        roomTypeCB = new javax.swing.JComboBox<>();
        jLabel1 = new javax.swing.JLabel();

        setBackground(new java.awt.Color(25, 25, 25));
        setLayout(new java.awt.GridBagLayout());

        cancelButton.setBackground(new java.awt.Color(59, 35, 59));
        cancelButton.setFont(new java.awt.Font("Lato Black", 0, 24)); // NOI18N
        cancelButton.setForeground(new java.awt.Color(255, 255, 255));
        cancelButton.setText("Cancel");
        cancelButton.setContentAreaFilled(false);
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 2;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.LAST_LINE_END;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.weighty = 1.0;
        gridBagConstraints.insets = new java.awt.Insets(10, 10, 10, 10);
        add(cancelButton, gridBagConstraints);

        updateButton.setBackground(new java.awt.Color(59, 35, 59));
        updateButton.setFont(new java.awt.Font("Lato Black", 0, 24)); // NOI18N
        updateButton.setForeground(new java.awt.Color(255, 255, 255));
        updateButton.setText("Update");
        updateButton.setContentAreaFilled(false);
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 2;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.LAST_LINE_START;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.weighty = 1.0;
        gridBagConstraints.insets = new java.awt.Insets(10, 10, 10, 10);
        add(updateButton, gridBagConstraints);
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridwidth = 2;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.weightx = 2.0;
        gridBagConstraints.weighty = 1.0;
        gridBagConstraints.insets = new java.awt.Insets(5, 5, 5, 5);
        add(guestRoomPanel, gridBagConstraints);

        roomTypeCB.setFont(new java.awt.Font("Lato", 0, 24)); // NOI18N
        roomTypeCB.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Executive", "Savita ka", "Non-AC" }));
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.LINE_START;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.weighty = 1.0;
        gridBagConstraints.insets = new java.awt.Insets(10, 10, 10, 10);
        add(roomTypeCB, gridBagConstraints);

        jLabel1.setFont(new java.awt.Font("Lato Black", 0, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Room Type");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.LINE_END;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.weighty = 1.0;
        gridBagConstraints.insets = new java.awt.Insets(10, 19, 10, 10);
        add(jLabel1, gridBagConstraints);
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton cancelButton;
    private custom.components.GuestRoomPanel guestRoomPanel;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JComboBox<String> roomTypeCB;
    private javax.swing.JButton updateButton;
    // End of variables declaration//GEN-END:variables
}

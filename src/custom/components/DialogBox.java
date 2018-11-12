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
public class DialogBox extends javax.swing.JPanel {

    /**
     * Creates new form dialogBox
     */
    public DialogBox() {
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

        changePasswordDialog = new javax.swing.JDialog();
        oldPasswordTF = new javax.swing.JTextField();
        newPasswordTF = new javax.swing.JTextField();
        cNewPasswordTF = new javax.swing.JTextField();
        ok1Button = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();

        changePasswordDialog.setBackground(new java.awt.Color(204, 204, 204));

        oldPasswordTF.setFont(new java.awt.Font("Lato", 0, 24)); // NOI18N
        oldPasswordTF.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                oldPasswordTFActionPerformed(evt);
            }
        });

        newPasswordTF.setFont(new java.awt.Font("Lato", 0, 24)); // NOI18N
        newPasswordTF.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                newPasswordTFActionPerformed(evt);
            }
        });

        cNewPasswordTF.setFont(new java.awt.Font("Lato", 0, 24)); // NOI18N

        ok1Button.setFont(new java.awt.Font("Lato", 0, 30)); // NOI18N
        ok1Button.setText("OK");
        ok1Button.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));

        jLabel1.setFont(new java.awt.Font("Lato Black", 0, 24)); // NOI18N
        jLabel1.setText("Old Password");

        jLabel2.setFont(new java.awt.Font("Lato Black", 0, 24)); // NOI18N
        jLabel2.setText("New Password");

        jLabel3.setFont(new java.awt.Font("Lato Black", 0, 24)); // NOI18N
        jLabel3.setText("Confirm New Password");

        javax.swing.GroupLayout changePasswordDialogLayout = new javax.swing.GroupLayout(changePasswordDialog.getContentPane());
        changePasswordDialog.getContentPane().setLayout(changePasswordDialogLayout);
        changePasswordDialogLayout.setHorizontalGroup(
            changePasswordDialogLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(changePasswordDialogLayout.createSequentialGroup()
                .addGap(41, 41, 41)
                .addGroup(changePasswordDialogLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(changePasswordDialogLayout.createSequentialGroup()
                        .addComponent(jLabel3)
                        .addGap(18, 18, 18)
                        .addComponent(cNewPasswordTF))
                    .addGroup(changePasswordDialogLayout.createSequentialGroup()
                        .addGroup(changePasswordDialogLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 164, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 196, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(changePasswordDialogLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(oldPasswordTF)
                            .addComponent(newPasswordTF, javax.swing.GroupLayout.DEFAULT_SIZE, 295, Short.MAX_VALUE))))
                .addGap(27, 27, 27))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, changePasswordDialogLayout.createSequentialGroup()
                .addContainerGap(269, Short.MAX_VALUE)
                .addComponent(ok1Button, javax.swing.GroupLayout.PREFERRED_SIZE, 114, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(255, 255, 255))
        );
        changePasswordDialogLayout.setVerticalGroup(
            changePasswordDialogLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(changePasswordDialogLayout.createSequentialGroup()
                .addGap(34, 34, 34)
                .addGroup(changePasswordDialogLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(changePasswordDialogLayout.createSequentialGroup()
                        .addGroup(changePasswordDialogLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(oldPasswordTF, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(43, 43, 43)
                        .addGroup(changePasswordDialogLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(newPasswordTF, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(75, 75, 75))
                    .addGroup(changePasswordDialogLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(cNewPasswordTF, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel3)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 46, Short.MAX_VALUE)
                .addComponent(ok1Button, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(40, 40, 40))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 400, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 300, Short.MAX_VALUE)
        );
    }// </editor-fold>//GEN-END:initComponents

    private void newPasswordTFActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_newPasswordTFActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_newPasswordTFActionPerformed

    private void oldPasswordTFActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_oldPasswordTFActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_oldPasswordTFActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField cNewPasswordTF;
    private javax.swing.JDialog changePasswordDialog;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JTextField newPasswordTF;
    private javax.swing.JButton ok1Button;
    private javax.swing.JTextField oldPasswordTF;
    // End of variables declaration//GEN-END:variables
}
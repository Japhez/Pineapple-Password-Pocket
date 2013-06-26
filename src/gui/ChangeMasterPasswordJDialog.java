package gui;

import java.awt.event.KeyEvent;
import javax.swing.JOptionPane;

/**
 * Allows a user to change their master password.
 *
 * @author Jacob Dorman
 */
public class ChangeMasterPasswordJDialog extends javax.swing.JDialog {

    private boolean windowExited;

    public ChangeMasterPasswordJDialog(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();
        windowExited = true;
    }

    /**
     * Returns the text in the text field if there was proper input, otherwise
     * closes the program if the window was closed.
     *
     * @return the text in the text field
     */
    public char[] getInput() {
        if (windowExited) {
            System.exit(0);
        }
        return securePasswordTextField.getPassword();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        passwordPromptLabel = new javax.swing.JLabel();
        submitButton = new javax.swing.JButton();
        securePasswordTextField = new javax.swing.JPasswordField();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Gate Keeper");

        passwordPromptLabel.setText("Enter new master password:");

        submitButton.setText("Submit");
        submitButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                submitButtonActionPerformed(evt);
            }
        });

        securePasswordTextField.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                securePasswordTextFieldKeyReleased(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(passwordPromptLabel))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(41, 41, 41)
                        .addComponent(submitButton))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(securePasswordTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 138, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(passwordPromptLabel)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(securePasswordTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(submitButton)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void submitButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_submitButtonActionPerformed
        if (!(securePasswordTextField.getPassword().length == 0)) {
            windowExited = false;
            dispose();
        } else {
            JOptionPane.showMessageDialog(this, "A master password cannot be empty.", "Invalid master password", JOptionPane.WARNING_MESSAGE);
        }
    }//GEN-LAST:event_submitButtonActionPerformed

    private void securePasswordTextFieldKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_securePasswordTextFieldKeyReleased
        if (evt.getKeyCode() == KeyEvent.VK_ENTER && !securePasswordTextField.getPassword().toString().equals("")) {
            windowExited = false;
            dispose();
        }
    }//GEN-LAST:event_securePasswordTextFieldKeyReleased
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel passwordPromptLabel;
    private javax.swing.JPasswordField securePasswordTextField;
    private javax.swing.JButton submitButton;
    // End of variables declaration//GEN-END:variables
}

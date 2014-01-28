package gui;

import password.pocket.Entry;
import java.awt.Toolkit;
import java.awt.datatransfer.Clipboard;
import java.awt.datatransfer.StringSelection;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.DefaultListModel;
import javax.swing.JOptionPane;
import password.pocket.PasswordPocket;
import password.string.safety.StringConverter;

/**
 * A graphical interface for manipulating the PasswordPocket.
 *
 * @author Jacob Dorman
 */
public class HomeFrame extends javax.swing.JFrame {

    private final String TITLE = "Pineapple Password Pocket";
    private PasswordPocket pocket;
    private DefaultListModel listModel;

    /**
     * Creates new form HomeFrame
     */
    public HomeFrame(PasswordPocket pocket) {
        //Initialize member variables
        initComponents();
        this.pocket = pocket;
        //Set the title of the main program window
        this.setTitle(TITLE);
        //Hide labels and buttons that wouldn't be meaningful yet
        locationDisplayLabel.setVisible(false);
        loginDisplayLabel.setVisible(false);
        passwordDisplayLabel.setVisible(false);
        copyPasswordButton.setEnabled(false);
        editListingButton.setEnabled(false);
        removeListingButton.setEnabled(false);
        //Switch focus to the filter
        locationFilterTextField.requestFocusInWindow();
        //Create the list model for the search result list and display the list
        listModel = new DefaultListModel();
        resultList.setModel(listModel);
        clearFilter();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        locationFilterTextField = new javax.swing.JTextField();
        locationNameLabel = new javax.swing.JLabel();
        resultScrollPane = new javax.swing.JScrollPane();
        resultList = new javax.swing.JList();
        copyPasswordButton = new javax.swing.JButton();
        passwordDisplayLabel = new javax.swing.JLabel();
        removeListingButton = new javax.swing.JButton();
        addListingButton = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        loginDisplayLabel = new javax.swing.JLabel();
        locationDisplayLabel = new javax.swing.JLabel();
        editListingButton = new javax.swing.JButton();
        dumpButton = new javax.swing.JButton();
        changeMasterPasswordButton = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);

        locationFilterTextField.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                locationFilterTextFieldKeyReleased(evt);
            }
        });

        locationNameLabel.setText("Type the location name:");

        resultList.setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);
        resultList.addListSelectionListener(new javax.swing.event.ListSelectionListener() {
            public void valueChanged(javax.swing.event.ListSelectionEvent evt) {
                resultListValueChanged(evt);
            }
        });
        resultScrollPane.setViewportView(resultList);

        copyPasswordButton.setText("Copy Password");
        copyPasswordButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                copyPasswordButtonActionPerformed(evt);
            }
        });

        passwordDisplayLabel.setText("[password]");

        removeListingButton.setText("Remove Listing");
        removeListingButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                removeListingButtonActionPerformed(evt);
            }
        });

        addListingButton.setText("Add Listing");
        addListingButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addListingButtonActionPerformed(evt);
            }
        });

        jLabel1.setText("Location:");

        jLabel2.setText("Login:");

        jLabel3.setText("Password:");

        loginDisplayLabel.setText("[login]");

        locationDisplayLabel.setText("[location]");

        editListingButton.setText("Edit Listing");
        editListingButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                editListingButtonActionPerformed(evt);
            }
        });

        dumpButton.setText("Dump Passwords To Text File");
        dumpButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                dumpButtonActionPerformed(evt);
            }
        });

        changeMasterPasswordButton.setText("Change Master Password");
        changeMasterPasswordButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                changeMasterPasswordButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(locationFilterTextField, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(locationNameLabel, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(removeListingButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(addListingButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(editListingButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(18, 18, 18)
                .addComponent(resultScrollPane, javax.swing.GroupLayout.PREFERRED_SIZE, 148, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(copyPasswordButton)
                        .addGap(46, 46, 46))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel3)
                                    .addComponent(jLabel2)
                                    .addComponent(jLabel1))
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(loginDisplayLabel, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(locationDisplayLabel, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(passwordDisplayLabel, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(dumpButton)
                                .addGap(0, 0, Short.MAX_VALUE))
                            .addComponent(changeMasterPasswordButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addContainerGap())))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel1)
                            .addComponent(locationDisplayLabel))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel2)
                            .addComponent(loginDisplayLabel))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel3)
                            .addComponent(passwordDisplayLabel))
                        .addGap(49, 49, 49)
                        .addComponent(copyPasswordButton)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(changeMasterPasswordButton)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(dumpButton))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(locationNameLabel)
                        .addGap(18, 18, 18)
                        .addComponent(locationFilterTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(35, 35, 35)
                        .addComponent(addListingButton)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(editListingButton)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 48, Short.MAX_VALUE)
                        .addComponent(removeListingButton))
                    .addComponent(resultScrollPane))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    /**
     * Clears the search filter.
     */
    private void clearFilter() {
        locationFilterTextField.setText("");
        ArrayList<Entry> results = pocket.searchPasswords("");
        generateListFromArrayList(results);
    }

    /**
     * Fills the model for the list with the contains of the passed ArrayList.
     *
     * @param entries an ArrayList of entries
     */
    private void generateListFromArrayList(ArrayList<Entry> entries) {
        listModel.clear();
        for (Entry e : entries) {
            listModel.add(0, e);
        }
        resultList.clearSelection();
    }

    private void resultListValueChanged(javax.swing.event.ListSelectionEvent evt) {//GEN-FIRST:event_resultListValueChanged
        Entry selectedValue = (Entry) resultList.getSelectedValue();
        //Display information for the currently selected entry
        if (selectedValue != null) {
            locationDisplayLabel.setText(selectedValue.getLocation());
            locationDisplayLabel.setVisible(true);
            loginDisplayLabel.setText(selectedValue.getLogin());
            loginDisplayLabel.setVisible(true);
            passwordDisplayLabel.setText(StringConverter.convertToString(selectedValue.getPassword()));
            passwordDisplayLabel.setVisible(true);
            editListingButton.setEnabled(true);
            removeListingButton.setEnabled(true);
        } else {
            locationDisplayLabel.setText("");
            loginDisplayLabel.setText("");
            passwordDisplayLabel.setText("");
            editListingButton.setEnabled(false);
            removeListingButton.setEnabled(false);
        }
        //If nothing is selected, disable the copy button
        if (resultList.isSelectionEmpty()) {
            copyPasswordButton.setEnabled(false);
        } else {
            copyPasswordButton.setEnabled(true);
        }
    }//GEN-LAST:event_resultListValueChanged

    private void copyPasswordButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_copyPasswordButtonActionPerformed
        Clipboard clipboard = Toolkit.getDefaultToolkit().getSystemClipboard();
        StringSelection stringSelection = new StringSelection(passwordDisplayLabel.getText());
        clipboard.setContents(stringSelection, null);
    }//GEN-LAST:event_copyPasswordButtonActionPerformed

    private void addListingButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addListingButtonActionPerformed
        EntryDialog ed = new EntryDialog(this, true);
        ed.setVisible(true);
        Entry createdEntry = ed.getCreatedEntry();
        if (createdEntry != null) {
            //Check to see if the entry already exists
            if (pocket.contains(createdEntry.getLogin(), createdEntry.getLocation())) {
                JOptionPane.showMessageDialog(this, "You already created an entry with this login at this location.", "Login already exists", JOptionPane.ERROR_MESSAGE);
                return;
            }
            pocket.addEntry(createdEntry);
            clearFilter();
        }
        pocket.savePasswords();
    }//GEN-LAST:event_addListingButtonActionPerformed

    private void removeListingButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_removeListingButtonActionPerformed
        Entry entry = (Entry) resultList.getSelectedValue();
        if (entry != null) {
            listModel.removeElement(entry);
            pocket.removeEntry(entry);
        }
        pocket.savePasswords();
    }//GEN-LAST:event_removeListingButtonActionPerformed

    private void editListingButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_editListingButtonActionPerformed
        Entry entry = (Entry) resultList.getSelectedValue();
        //Create a dialog prefilled with entry information
        EntryDialog ed = new EntryDialog(this, true, entry);
        ed.setVisible(true);
        Entry createdEntry = ed.getCreatedEntry();
        if (createdEntry != null) {
            removeListingButtonActionPerformed(evt);
            pocket.addEntry(createdEntry);
            clearFilter();
        }
        pocket.savePasswords();
    }//GEN-LAST:event_editListingButtonActionPerformed

    private void locationFilterTextFieldKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_locationFilterTextFieldKeyReleased
        String searchQuery = locationFilterTextField.getText();
        ArrayList<Entry> results = pocket.searchPasswords(searchQuery);
        generateListFromArrayList(results);
    }//GEN-LAST:event_locationFilterTextFieldKeyReleased

    /**
     * Dump the contents of the password list into a plaintext file.
     *
     * @param evt
     */
    private void dumpButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_dumpButtonActionPerformed
        try (PrintWriter writer = new PrintWriter("output.txt")) {
            ArrayList<Entry> passwords = pocket.getPasswords();
            for (Entry e : passwords) {
                writer.println(e.getLocation());
                writer.println(e.getLogin());
                writer.println(e.getPassword());
                writer.println();
            }
        } catch (FileNotFoundException ex) {
            Logger.getLogger(HomeFrame.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_dumpButtonActionPerformed

    /**
     * Change the master password.
     *
     * @param evt
     */
    private void changeMasterPasswordButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_changeMasterPasswordButtonActionPerformed
        ChangeMasterPasswordJDialog dialog = new ChangeMasterPasswordJDialog(this, true);
        dialog.setVisible(true);
        char[] newPassword = dialog.getInput();
        pocket.changeMasterPasswordKey(newPassword);
    }//GEN-LAST:event_changeMasterPasswordButtonActionPerformed
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton addListingButton;
    private javax.swing.JButton changeMasterPasswordButton;
    private javax.swing.JButton copyPasswordButton;
    private javax.swing.JButton dumpButton;
    private javax.swing.JButton editListingButton;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel locationDisplayLabel;
    private javax.swing.JTextField locationFilterTextField;
    private javax.swing.JLabel locationNameLabel;
    private javax.swing.JLabel loginDisplayLabel;
    private javax.swing.JLabel passwordDisplayLabel;
    private javax.swing.JButton removeListingButton;
    private javax.swing.JList resultList;
    private javax.swing.JScrollPane resultScrollPane;
    // End of variables declaration//GEN-END:variables
}

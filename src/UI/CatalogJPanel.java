/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package UI;

import Model.Application;
import Model.Medicine;
import Model.MedicineCatalog;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author HP
 */
public class CatalogJPanel extends javax.swing.JPanel {

    /**
     * Creates new form catalogJPanel
     */
    Application application;
    DefaultTableModel medTableModel;
   // MedicineCatalog catalog;
    public CatalogJPanel() {
        initComponents();
       
    }

    CatalogJPanel(Application application) {
        initComponents();
        this.application = application;
        this.medTableModel = (DefaultTableModel) medicineCatalog.getModel();
        displayCatalog();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        medicineCatalog = new javax.swing.JTable();
        fieldDosage = new javax.swing.JTextField();
        fieldName = new javax.swing.JTextField();
        addBtn = new javax.swing.JButton();
        deleteButton = new javax.swing.JButton();

        setBackground(new java.awt.Color(204, 204, 255));
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        medicineCatalog.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Name", "Dosage"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Object.class, java.lang.Double.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        jScrollPane1.setViewportView(medicineCatalog);

        add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 40, 170, 290));
        add(fieldDosage, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 130, 100, 30));

        fieldName.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                fieldNameFocusLost(evt);
            }
        });
        add(fieldName, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 70, 100, 30));

        addBtn.setBackground(new java.awt.Color(255, 204, 204));
        addBtn.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        addBtn.setText("ADD");
        addBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addBtnActionPerformed(evt);
            }
        });
        add(addBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 190, 60, 30));

        deleteButton.setBackground(new java.awt.Color(255, 204, 204));
        deleteButton.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        deleteButton.setText("DELETE");
        deleteButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                deleteButtonActionPerformed(evt);
            }
        });
        add(deleteButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 360, -1, -1));
    }// </editor-fold>//GEN-END:initComponents

    private void addBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addBtnActionPerformed
        // TODO add your handling code here:
        String name = fieldName.getText();
        String dosage = fieldDosage.getText();
        MedicineCatalog catalog = this.application.getCatalog();
        catalog.createMedicine(name, Double.valueOf(dosage));
        JOptionPane.showMessageDialog(null,"Medicine added successfully!!!");
        displayCatalog();
    }//GEN-LAST:event_addBtnActionPerformed

    private void fieldNameFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_fieldNameFocusLost
        // TODO add your handling code here:
        String name = fieldName.getText();
        Boolean isUnique = this.application.getCatalog().checkIfMedicineUnique(name);
        if(isUnique){
            
        }
        else
        {
            fieldName.setText("");
            JOptionPane.showMessageDialog(null,"The medicine entered already exists");
        }
    }//GEN-LAST:event_fieldNameFocusLost

    private void deleteButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_deleteButtonActionPerformed
        // TODO add your handling code here:
        int selectedRow = medicineCatalog.getSelectedRow();
        if(selectedRow >= 0){
            Medicine med = (Medicine) medicineCatalog.getValueAt(selectedRow,0);
            this.application.getCatalog().removeMedicine(med.getMedicineName());
            displayCatalog();
            
        }
        else {
            
        }
    }//GEN-LAST:event_deleteButtonActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton addBtn;
    private javax.swing.JButton deleteButton;
    private javax.swing.JTextField fieldDosage;
    private javax.swing.JTextField fieldName;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable medicineCatalog;
    // End of variables declaration//GEN-END:variables

    public void displayCatalog() {
        ArrayList<Medicine> medicines = this.application.getCatalog().getMedicineList();
        if(medicines.size() > 0 ){
            medTableModel.setRowCount(0);
            for(Medicine med: medicines){
                Object row[] = new Object[2];
                row[0] = med;
                row[1] = med.getDosage();
                 medTableModel.addRow(row);
            }
        }
    }
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mskalnik.gui;

import com.mskalnik.bl.PatientsHandler;
import com.mskalnik.model.Contact;
import com.mskalnik.model.NextOfKin;
import com.mskalnik.model.Patient;
import java.time.LocalDate;
import java.util.Date;
import javafx.scene.control.Alert;
import javax.swing.JOptionPane;

/**
 *
 * @author mskalnik
 */
public class PanelMiniForm extends javax.swing.JPanel {

    private static final PatientsHandler PATIENTS_HANDLER = new PatientsHandler();
    
    /**
     * Creates new form panelMiniForm
     */
    public PanelMiniForm() {
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

        panelMiniForm = new javax.swing.JPanel();
        jLabel12 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        txtPatientFirstName = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        txtPatientMiddleName = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        txtPatientLastName = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        cbYear = new javax.swing.JComboBox<>();
        jLabel7 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        taComplaint = new javax.swing.JTextArea();
        jLabel8 = new javax.swing.JLabel();
        txtTelephone = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        txtTelephone2 = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        txtKinFirstName = new javax.swing.JTextField();
        jLabel15 = new javax.swing.JLabel();
        txtKinMiddleName = new javax.swing.JTextField();
        jLabel16 = new javax.swing.JLabel();
        txtKinLastName = new javax.swing.JTextField();
        jLabel17 = new javax.swing.JLabel();
        txtKinRelationship = new javax.swing.JTextField();
        btnConfirm = new javax.swing.JButton();
        cbMonth = new javax.swing.JComboBox<>();
        cbDay = new javax.swing.JComboBox<>();
        jLabel18 = new javax.swing.JLabel();
        jLabel19 = new javax.swing.JLabel();
        jLabel20 = new javax.swing.JLabel();

        panelMiniForm.setLayout(null);
        panelMiniForm.add(jLabel12);
        jLabel12.setBounds(346, 5, 341, 29);

        jLabel1.setFont(new java.awt.Font("Ubuntu", 1, 24)); // NOI18N
        jLabel1.setText("Mini registration form");
        panelMiniForm.add(jLabel1);
        jLabel1.setBounds(10, 10, 341, 29);

        jLabel2.setFont(new java.awt.Font("Ubuntu", 1, 18)); // NOI18N
        jLabel2.setText("Patient");
        panelMiniForm.add(jLabel2);
        jLabel2.setBounds(10, 40, 70, 29);
        panelMiniForm.add(jLabel13);
        jLabel13.setBounds(346, 44, 341, 29);

        jLabel3.setText("First name:");
        panelMiniForm.add(jLabel3);
        jLabel3.setBounds(10, 70, 80, 29);

        txtPatientFirstName.setColumns(1);
        panelMiniForm.add(txtPatientFirstName);
        txtPatientFirstName.setBounds(130, 70, 550, 29);

        jLabel4.setText("Middle name:");
        panelMiniForm.add(jLabel4);
        jLabel4.setBounds(10, 100, 100, 29);

        txtPatientMiddleName.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtPatientMiddleNameActionPerformed(evt);
            }
        });
        panelMiniForm.add(txtPatientMiddleName);
        txtPatientMiddleName.setBounds(130, 100, 550, 29);

        jLabel5.setText("Last name:");
        panelMiniForm.add(jLabel5);
        jLabel5.setBounds(10, 130, 80, 29);
        panelMiniForm.add(txtPatientLastName);
        txtPatientLastName.setBounds(130, 130, 550, 29);

        jLabel6.setText("Date of birth:");
        panelMiniForm.add(jLabel6);
        jLabel6.setBounds(10, 160, 100, 29);

        cbYear.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        cbYear.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbYearActionPerformed(evt);
            }
        });
        panelMiniForm.add(cbYear);
        cbYear.setBounds(550, 160, 130, 29);

        jLabel7.setText("Complaint:");
        panelMiniForm.add(jLabel7);
        jLabel7.setBounds(10, 190, 80, 29);

        taComplaint.setColumns(40);
        taComplaint.setRows(5);
        jScrollPane1.setViewportView(taComplaint);

        panelMiniForm.add(jScrollPane1);
        jScrollPane1.setBounds(130, 190, 550, 120);

        jLabel8.setText("Telephone 1:");
        panelMiniForm.add(jLabel8);
        jLabel8.setBounds(10, 320, 90, 29);
        panelMiniForm.add(txtTelephone);
        txtTelephone.setBounds(130, 320, 550, 29);

        jLabel9.setText("Telephone  2:");
        panelMiniForm.add(jLabel9);
        jLabel9.setBounds(10, 350, 100, 29);
        panelMiniForm.add(txtTelephone2);
        txtTelephone2.setBounds(130, 350, 550, 29);

        jLabel10.setFont(new java.awt.Font("Ubuntu", 1, 18)); // NOI18N
        jLabel10.setText("Next of Kin");
        panelMiniForm.add(jLabel10);
        jLabel10.setBounds(10, 390, 110, 29);
        panelMiniForm.add(jLabel14);
        jLabel14.setBounds(346, 356, 341, 29);

        jLabel11.setText("First name:");
        panelMiniForm.add(jLabel11);
        jLabel11.setBounds(10, 420, 90, 29);
        panelMiniForm.add(txtKinFirstName);
        txtKinFirstName.setBounds(130, 420, 550, 29);

        jLabel15.setText("Middle name:");
        panelMiniForm.add(jLabel15);
        jLabel15.setBounds(10, 450, 100, 29);
        panelMiniForm.add(txtKinMiddleName);
        txtKinMiddleName.setBounds(130, 450, 550, 29);

        jLabel16.setText("Last name:");
        panelMiniForm.add(jLabel16);
        jLabel16.setBounds(10, 480, 80, 29);
        panelMiniForm.add(txtKinLastName);
        txtKinLastName.setBounds(130, 480, 550, 29);

        jLabel17.setText("Relationship:");
        panelMiniForm.add(jLabel17);
        jLabel17.setBounds(10, 510, 90, 29);
        panelMiniForm.add(txtKinRelationship);
        txtKinRelationship.setBounds(130, 510, 550, 29);

        btnConfirm.setText("Confirm");
        btnConfirm.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnConfirmActionPerformed(evt);
            }
        });
        panelMiniForm.add(btnConfirm);
        btnConfirm.setBounds(130, 540, 550, 32);

        cbMonth.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        panelMiniForm.add(cbMonth);
        cbMonth.setBounds(370, 160, 100, 26);

        cbDay.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        panelMiniForm.add(cbDay);
        cbDay.setBounds(170, 160, 120, 26);

        jLabel18.setText("Month:");
        panelMiniForm.add(jLabel18);
        jLabel18.setBounds(320, 160, 48, 30);

        jLabel19.setText("Day:");
        panelMiniForm.add(jLabel19);
        jLabel19.setBounds(130, 160, 48, 30);

        jLabel20.setText("Year:");
        panelMiniForm.add(jLabel20);
        jLabel20.setBounds(480, 160, 70, 30);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panelMiniForm, javax.swing.GroupLayout.PREFERRED_SIZE, 694, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panelMiniForm, javax.swing.GroupLayout.PREFERRED_SIZE, 581, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
    }// </editor-fold>//GEN-END:initComponents

    private void txtPatientMiddleNameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtPatientMiddleNameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtPatientMiddleNameActionPerformed

    private void cbYearActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbYearActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cbYearActionPerformed

    private void btnConfirmActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnConfirmActionPerformed
        // TODO add your handling code here:
        String firstName = txtPatientFirstName.getText();
        String lastName = txtPatientLastName.getText();
        NextOfKin nok = new NextOfKin(txtKinFirstName.getText(), txtKinMiddleName.getText(), txtKinLastName.getText(), txtKinRelationship.getText());
        Contact contact = new Contact(txtTelephone.getText(), txtTelephone2.getText());
        Patient p = new Patient(firstName, txtPatientMiddleName.getText(), lastName, new Date(1994, 4, 27), nok, taComplaint.getText(), contact);   
        try {
            PATIENTS_HANDLER.insertPatientMiniForm(p);            
            JOptionPane.showMessageDialog(null, "User " + firstName + " " + lastName + " added!\n");
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "WARNING: User " + firstName + " " + lastName + " not added!\n" + e.getMessage());
        }
        
    }//GEN-LAST:event_btnConfirmActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnConfirm;
    private javax.swing.JComboBox<String> cbDay;
    private javax.swing.JComboBox<String> cbMonth;
    private javax.swing.JComboBox<String> cbYear;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JPanel panelMiniForm;
    private javax.swing.JTextArea taComplaint;
    private javax.swing.JTextField txtKinFirstName;
    private javax.swing.JTextField txtKinLastName;
    private javax.swing.JTextField txtKinMiddleName;
    private javax.swing.JTextField txtKinRelationship;
    private javax.swing.JTextField txtPatientFirstName;
    private javax.swing.JTextField txtPatientLastName;
    private javax.swing.JTextField txtPatientMiddleName;
    private javax.swing.JTextField txtTelephone;
    private javax.swing.JTextField txtTelephone2;
    // End of variables declaration//GEN-END:variables

}

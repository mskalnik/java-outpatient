/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mskalnik.gui;

import com.mskalnik.bl.AppointmentsHandler;
import com.mskalnik.bl.DoctorsHandler;
import com.mskalnik.bl.PatientsHandler;
import com.mskalnik.model.Bill;
import com.mskalnik.model.Doctor;
import com.mskalnik.model.Medication;
import com.mskalnik.model.Patient;
import java.util.List;
import javax.swing.JOptionPane;

/**
 *
 * @author mskalnik
 */
public class DoctorPanel extends javax.swing.JPanel {

    private static final PatientsHandler PATIENTS_HANDLER = new PatientsHandler();
    private static final DoctorsHandler DOCTORS_HANDLER = new DoctorsHandler();
    private static final AppointmentsHandler APPOINTMENTS_HANDLER = new AppointmentsHandler();
    /**
     * Creates new form Doctor
     */
    public DoctorPanel() {
        initComponents();
        fillData();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        cbSpecialist = new javax.swing.JComboBox<>();
        jLabel3 = new javax.swing.JLabel();
        cbDoctor = new javax.swing.JComboBox<>();
        jLabel4 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        taDiagnosis = new javax.swing.JTextArea();
        btnSave = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
        cbPatient = new javax.swing.JComboBox<>();
        cbMedication = new javax.swing.JComboBox<>();
        jLabel6 = new javax.swing.JLabel();
        btnUpdate = new javax.swing.JButton();

        setLayout(null);

        jLabel1.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel1.setText("Doctor Panel");
        add(jLabel1);
        jLabel1.setBounds(6, 6, 110, 19);

        jLabel2.setText("Doctor:");
        add(jLabel2);
        jLabel2.setBounds(10, 30, 41, 30);

        add(cbSpecialist);
        cbSpecialist.setBounds(80, 240, 250, 26);

        jLabel3.setText("Patient:");
        add(jLabel3);
        jLabel3.setBounds(10, 70, 50, 16);

        cbDoctor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbDoctorActionPerformed(evt);
            }
        });
        add(cbDoctor);
        cbDoctor.setBounds(80, 30, 250, 26);

        jLabel4.setText("Diagnosis:");
        add(jLabel4);
        jLabel4.setBounds(10, 110, 60, 16);

        taDiagnosis.setColumns(20);
        taDiagnosis.setRows(5);
        jScrollPane1.setViewportView(taDiagnosis);

        add(jScrollPane1);
        jScrollPane1.setBounds(80, 110, 250, 83);

        btnSave.setText("Save");
        btnSave.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSaveActionPerformed(evt);
            }
        });
        add(btnSave);
        btnSave.setBounds(80, 270, 77, 32);

        jLabel5.setText("Specialist:");
        add(jLabel5);
        jLabel5.setBounds(10, 240, 70, 30);

        add(cbPatient);
        cbPatient.setBounds(80, 70, 250, 26);

        add(cbMedication);
        cbMedication.setBounds(80, 210, 250, 26);

        jLabel6.setText("Medication:");
        add(jLabel6);
        jLabel6.setBounds(10, 210, 70, 20);

        btnUpdate.setText("Update");
        btnUpdate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnUpdateActionPerformed(evt);
            }
        });
        add(btnUpdate);
        btnUpdate.setBounds(160, 270, 70, 32);
    }// </editor-fold>//GEN-END:initComponents

    private void btnSaveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSaveActionPerformed
        // TODO add your handling code here:
        String[] patients = cbPatient.getSelectedItem().toString().split(":");
        String[] medications = cbMedication.getSelectedItem().toString().split(":");
        
        Boolean payed = false;
        Patient patient = PATIENTS_HANDLER.getExistingPatient(Integer.parseInt(patients[0]));
        Medication medication = APPOINTMENTS_HANDLER.getMedication(Integer.parseInt(medications[0]));
        
        APPOINTMENTS_HANDLER.insertBill(new Bill(patient, medication, 200, payed)); 
        JOptionPane.showMessageDialog(null, "Diagnosis for " + cbPatient.getSelectedItem().toString() + " made!\n"); 
    }//GEN-LAST:event_btnSaveActionPerformed

    private void cbDoctorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbDoctorActionPerformed
        // TODO add your handling code here:        
        String[] list = cbDoctor.getSelectedItem().toString().split(":");
        int id = Integer.parseInt(list[0]);
        
        cbPatient.removeAllItems();
        for (Patient patient : PATIENTS_HANDLER.getAppointment(id)) {
            cbPatient.addItem(patient.getOpid() + ": " + patient.getFirstName() + " " + patient.getSurname());
        }
    }//GEN-LAST:event_cbDoctorActionPerformed

    private void btnUpdateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnUpdateActionPerformed
        // TODO add your handling code here:
        fillData();
    }//GEN-LAST:event_btnUpdateActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnSave;
    private javax.swing.JButton btnUpdate;
    private javax.swing.JComboBox<String> cbDoctor;
    private javax.swing.JComboBox<String> cbMedication;
    private javax.swing.JComboBox<String> cbPatient;
    private javax.swing.JComboBox<String> cbSpecialist;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextArea taDiagnosis;
    // End of variables declaration//GEN-END:variables

    private void fillData() {        
        List<Doctor> doctors = DOCTORS_HANDLER.getDoctors();
        doctors.forEach((doctor) -> {
            cbDoctor.addItem(doctor.getIdDoctor()+ ": " + doctor.getFirstName() + " " + doctor.getSurname());
        });
        
        doctors.forEach((doctor) -> {
            cbSpecialist.addItem(doctor.getIdDoctor()+ ": " + doctor.getFirstName() + " " + doctor.getSurname());
        });
        
        List<Medication> medications = APPOINTMENTS_HANDLER.getMedications();
        medications.forEach((medication) -> {
            cbMedication.addItem(medication.getMedicationId()+ ": " + medication.getName() + ", " + medication.getPrice() + " HRK");
        });        
        
        String[] list = cbDoctor.getSelectedItem().toString().split(":");
        int id = Integer.parseInt(list[0]);
        cbPatient.removeAllItems();
        for (Patient patient : PATIENTS_HANDLER.getAppointment(id)) {
            cbPatient.addItem(patient.getOpid() + ": " + patient.getFirstName() + " " + patient.getSurname());
        }
    }
}

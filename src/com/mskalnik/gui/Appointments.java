/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mskalnik.gui;

import com.mskalnik.bl.AppointmentsHandler;
import com.mskalnik.bl.DoctorsHandler;
import com.mskalnik.bl.PatientsHandler;
import com.mskalnik.model.Appointment;
import com.mskalnik.model.Doctor;
import com.mskalnik.model.Patient;
import java.time.LocalDate;
import java.util.List;
import javax.swing.DefaultListModel;
import javax.swing.JOptionPane;

/**
 *
 * @author mskalnik
 */
public class Appointments extends javax.swing.JPanel {

    private static final PatientsHandler PATIENTS_HANDLER = new PatientsHandler();
    private static final DoctorsHandler DOCTORS_HANDLER = new DoctorsHandler();
    private static final AppointmentsHandler APPOINTMENTS_HANDLER = new AppointmentsHandler();
    /**
     * Creates new form Appointments
     */
    public Appointments() {
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

        jLabel2 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        liAppointments = new javax.swing.JList<>();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        cbYear = new javax.swing.JComboBox<>();
        cbDoctor = new javax.swing.JComboBox<>();
        cbPatient = new javax.swing.JComboBox<>();
        cbDay = new javax.swing.JComboBox<>();
        cbMonth = new javax.swing.JComboBox<>();
        btnMake = new javax.swing.JButton();
        btnUpdate = new javax.swing.JButton();

        jLabel2.setText("jLabel2");

        setLayout(null);

        jLabel1.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel1.setText("All Appointments");
        add(jLabel1);
        jLabel1.setBounds(6, 6, 130, 19);

        jScrollPane1.setViewportView(liAppointments);

        add(jScrollPane1);
        jScrollPane1.setBounds(6, 31, 350, 131);

        jLabel3.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel3.setText("Make an Appointment");
        add(jLabel3);
        jLabel3.setBounds(10, 190, 170, 19);

        jLabel4.setText("Doctor:");
        add(jLabel4);
        jLabel4.setBounds(10, 220, 41, 16);

        jLabel5.setText("Patient:");
        add(jLabel5);
        jLabel5.setBounds(10, 250, 50, 16);

        jLabel6.setText("Date:");
        add(jLabel6);
        jLabel6.setBounds(10, 280, 29, 16);

        add(cbYear);
        cbYear.setBounds(270, 280, 90, 26);

        add(cbDoctor);
        cbDoctor.setBounds(110, 220, 250, 26);

        add(cbPatient);
        cbPatient.setBounds(110, 250, 250, 26);

        add(cbDay);
        cbDay.setBounds(110, 280, 70, 26);

        add(cbMonth);
        cbMonth.setBounds(190, 280, 70, 26);

        btnMake.setText("Make an appointment");
        btnMake.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnMakeActionPerformed(evt);
            }
        });
        add(btnMake);
        btnMake.setBounds(110, 310, 170, 32);

        btnUpdate.setText("Update");
        btnUpdate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnUpdateActionPerformed(evt);
            }
        });
        add(btnUpdate);
        btnUpdate.setBounds(290, 310, 70, 32);
    }// </editor-fold>//GEN-END:initComponents

    private void btnMakeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnMakeActionPerformed
        // TODO add your handling code here:
        String[] doctorList = cbDoctor.getSelectedItem().toString().split(":");        
        String[] patientList = cbPatient.getSelectedItem().toString().split(":");
        
        int doctorId = Integer.parseInt(doctorList[0]);
        int patientId = Integer.parseInt(patientList[0]);
        
        Doctor d = DOCTORS_HANDLER.getDoctor(doctorId);
        Patient p = PATIENTS_HANDLER.getExistingPatient(patientId);
        
        int day = Integer.parseInt(cbDay.getSelectedItem().toString());
        int month = Integer.parseInt(cbMonth.getSelectedItem().toString());
        int year = Integer.parseInt(cbYear.getSelectedItem().toString());
        LocalDate date = LocalDate.of(year, month, day);
        
        APPOINTMENTS_HANDLER.insertAppointments(new Appointment(d, p, date));
        JOptionPane.showMessageDialog(null, "Appointment for " + cbPatient.getSelectedItem().toString() + " made!\n"); 
        fillData();
    }//GEN-LAST:event_btnMakeActionPerformed

    private void btnUpdateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnUpdateActionPerformed
        // TODO add your handling code here:
        fillData();
    }//GEN-LAST:event_btnUpdateActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnMake;
    private javax.swing.JButton btnUpdate;
    private javax.swing.JComboBox<String> cbDay;
    private javax.swing.JComboBox<String> cbDoctor;
    private javax.swing.JComboBox<String> cbMonth;
    private javax.swing.JComboBox<String> cbPatient;
    private javax.swing.JComboBox<String> cbYear;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JList<String> liAppointments;
    // End of variables declaration//GEN-END:variables

    private void fillData() {
        cbDoctor.removeAllItems();
        cbPatient.removeAllItems();
        cbDay.removeAllItems();
        cbMonth.removeAllItems();
        cbYear.removeAllItems();
        
        List<Doctor> doctors = DOCTORS_HANDLER.getDoctors();
        doctors.forEach((doctor) -> {
            cbDoctor.addItem(doctor.getIdDoctor()+ ": " + doctor.getFirstName() + " " + doctor.getSurname());
        });
        
        List<Patient> patients = PATIENTS_HANDLER.getExistingPatients();
        patients.forEach((patient) -> {
            cbPatient.addItem(patient.getOpid() + ": " + patient.getFirstName() + " " + patient.getSurname());
        });
        
        for (int i = 1; i <= 31; i++) {
            cbDay.addItem(String.valueOf(i));
        }
        
        for (int i = 1; i <= 12; i++) {
            cbMonth.addItem(String.valueOf(i));
        }
        
        for (int i = 2019; i <= 2024; i++) {
            cbYear.addItem(String.valueOf(i));
        }
        
        List<Appointment> appointments = APPOINTMENTS_HANDLER.getAppointments();
        DefaultListModel model = new DefaultListModel();
        
        for (Appointment appointment : appointments) {
            model.addElement(appointment.getId() + ": Doctor " + appointment.getDoctor().getFirstName() + " " + appointment.getDoctor().getSurname() + ", Patient " + appointment.getPatient().getFirstName() + " " + appointment.getPatient().getSurname());
        }
        
        liAppointments.setModel(model);
    }
}

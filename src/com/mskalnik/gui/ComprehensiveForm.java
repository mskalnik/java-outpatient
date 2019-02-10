/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mskalnik.gui;

import com.mskalnik.bl.PatientsHandler;
import com.mskalnik.model.Patient;
import java.util.List;
import javax.swing.DefaultComboBoxModel;

/**
 *
 * @author mskalnik
 */
public class ComprehensiveForm extends javax.swing.JPanel {

    private static final PatientsHandler PATIENTS_HANDLER = new PatientsHandler();
    
    /**
     * Creates new form ComprehensiveFormPanel
     */
    public ComprehensiveForm() {
        initComponents();
        List<Patient> patients = PATIENTS_HANDLER.getExistingPatients();
        patients.forEach((patient) -> {
            cbExistingPersons.addItem(patient.getOpid() + ": " + patient.getFirstName() + " " + patient.getSurname());
        });
    }
    
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jMenuItem1 = new javax.swing.JMenuItem();
        jTabbedPane1 = new javax.swing.JTabbedPane();
        basicPanel = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        txtPatientFirstName = new javax.swing.JTextField();
        txtPatientMiddleName = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        txtPatientLastName1 = new javax.swing.JTextField();
        txtPatientLastName = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        cbYear = new javax.swing.JComboBox<>();
        cbDay = new javax.swing.JComboBox<>();
        cbMonth = new javax.swing.JComboBox<>();
        contactPanel = new javax.swing.JPanel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        txtPresentPincode = new javax.swing.JTextField();
        txtPatientEmail = new javax.swing.JTextField();
        txtPresentStreet = new javax.swing.JTextField();
        txtPresentArea = new javax.swing.JTextField();
        txtPresentCity = new javax.swing.JTextField();
        txtPresentState = new javax.swing.JTextField();
        jLabel14 = new javax.swing.JLabel();
        txtPermanentAddress = new javax.swing.JTextField();
        txtPermanentStreet = new javax.swing.JTextField();
        txtPermanentArea = new javax.swing.JTextField();
        txtPermanentCity = new javax.swing.JTextField();
        txtPermanentState = new javax.swing.JTextField();
        txtPermanentPincode = new javax.swing.JTextField();
        jLabel15 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        jLabel18 = new javax.swing.JLabel();
        jLabel19 = new javax.swing.JLabel();
        jLabel20 = new javax.swing.JLabel();
        jLabel21 = new javax.swing.JLabel();
        jLabel22 = new javax.swing.JLabel();
        jLabel23 = new javax.swing.JLabel();
        jLabel24 = new javax.swing.JLabel();
        jLabel25 = new javax.swing.JLabel();
        jLabel26 = new javax.swing.JLabel();
        txtPresentDoor = new javax.swing.JTextField();
        txtPatientTelephoneWork = new javax.swing.JTextField();
        txtPatientTelephoneHome = new javax.swing.JTextField();
        txtPatientPhone = new javax.swing.JTextField();
        txtPatientPager = new javax.swing.JTextField();
        txtPatientFax = new javax.swing.JTextField();
        jSeparator1 = new javax.swing.JSeparator();
        kinPanel = new javax.swing.JPanel();
        jLabel27 = new javax.swing.JLabel();
        jLabel28 = new javax.swing.JLabel();
        jLabel29 = new javax.swing.JLabel();
        jLabel30 = new javax.swing.JLabel();
        jLabel31 = new javax.swing.JLabel();
        jLabel32 = new javax.swing.JLabel();
        jLabel33 = new javax.swing.JLabel();
        jLabel34 = new javax.swing.JLabel();
        jLabel35 = new javax.swing.JLabel();
        jLabel36 = new javax.swing.JLabel();
        jLabel37 = new javax.swing.JLabel();
        jLabel38 = new javax.swing.JLabel();
        jLabel39 = new javax.swing.JLabel();
        jLabel40 = new javax.swing.JLabel();
        jLabel41 = new javax.swing.JLabel();
        jLabel42 = new javax.swing.JLabel();
        jLabel43 = new javax.swing.JLabel();
        txtKinPincode = new javax.swing.JTextField();
        txtKinEmail = new javax.swing.JTextField();
        txtKinStreet = new javax.swing.JTextField();
        txtKinArea = new javax.swing.JTextField();
        txtKinCity = new javax.swing.JTextField();
        txtKinState = new javax.swing.JTextField();
        txtKinDoor = new javax.swing.JTextField();
        txtKinFirstName = new javax.swing.JTextField();
        txtKinMiddleName = new javax.swing.JTextField();
        txtKinLastName = new javax.swing.JTextField();
        txtKinRelationship = new javax.swing.JTextField();
        txtKinTelephoneWork = new javax.swing.JTextField();
        txtKinTelephoneHome = new javax.swing.JTextField();
        txtKinMobile = new javax.swing.JTextField();
        txtKinPager = new javax.swing.JTextField();
        txtKinFax = new javax.swing.JTextField();
        personalPanel = new javax.swing.JPanel();
        jLabel44 = new javax.swing.JLabel();
        jLabel45 = new javax.swing.JLabel();
        jLabel46 = new javax.swing.JLabel();
        jLabel47 = new javax.swing.JLabel();
        jLabel48 = new javax.swing.JLabel();
        txtBloodType = new javax.swing.JTextField();
        txtNoOfDependents = new javax.swing.JTextField();
        txtHeight = new javax.swing.JTextField();
        txtWeight = new javax.swing.JTextField();
        jTextField40 = new javax.swing.JTextField();
        cbMartial = new javax.swing.JComboBox<>();
        professionPanel = new javax.swing.JPanel();
        jLabel49 = new javax.swing.JLabel();
        jLabel51 = new javax.swing.JLabel();
        txtGrossIncome = new javax.swing.JTextField();
        txtOccupation = new javax.swing.JTextField();
        lifestylePanel = new javax.swing.JPanel();
        jLabel50 = new javax.swing.JLabel();
        cbHomeFood = new javax.swing.JCheckBox();
        jLabel52 = new javax.swing.JLabel();
        jLabel53 = new javax.swing.JLabel();
        jLabel54 = new javax.swing.JLabel();
        jLabel55 = new javax.swing.JLabel();
        jLabel56 = new javax.swing.JLabel();
        jLabel57 = new javax.swing.JLabel();
        jLabel58 = new javax.swing.JLabel();
        cbVegeterian = new javax.swing.JCheckBox();
        txtNoOfCigarettes = new javax.swing.JTextField();
        txtNoOfDrinks = new javax.swing.JTextField();
        txtStimulans = new javax.swing.JTextField();
        txtCoffeTea = new javax.swing.JTextField();
        txtSoftDrinks = new javax.swing.JTextField();
        cbMeals = new javax.swing.JCheckBox();
        basicComplaintsPanel = new javax.swing.JPanel();
        jLabel59 = new javax.swing.JLabel();
        jLabel60 = new javax.swing.JLabel();
        jLabel62 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        txtPhysicianTreated = new javax.swing.JTextArea();
        jScrollPane2 = new javax.swing.JScrollPane();
        taComplaint = new javax.swing.JTextArea();
        jScrollPane3 = new javax.swing.JScrollPane();
        taPreviousTreatment = new javax.swing.JTextArea();
        medicalComplaintsPanel = new javax.swing.JPanel();
        jLabel61 = new javax.swing.JLabel();
        jLabel63 = new javax.swing.JLabel();
        jLabel64 = new javax.swing.JLabel();
        jLabel65 = new javax.swing.JLabel();
        jLabel66 = new javax.swing.JLabel();
        jLabel67 = new javax.swing.JLabel();
        jLabel68 = new javax.swing.JLabel();
        jLabel69 = new javax.swing.JLabel();
        jLabel70 = new javax.swing.JLabel();
        jLabel71 = new javax.swing.JLabel();
        jLabel72 = new javax.swing.JLabel();
        txtSurgeries = new javax.swing.JTextField();
        txtCardiac = new javax.swing.JTextField();
        txtRespiratory = new javax.swing.JTextField();
        txtDigestive = new javax.swing.JTextField();
        txtOrthopedic = new javax.swing.JTextField();
        txtMuscular = new javax.swing.JTextField();
        txtNeurological = new javax.swing.JTextField();
        txtAllergies = new javax.swing.JTextField();
        txtDrugs = new javax.swing.JTextField();
        cbDiabetic = new javax.swing.JCheckBox();
        cbHypertensive = new javax.swing.JCheckBox();
        jLabel1 = new javax.swing.JLabel();
        jLabel73 = new javax.swing.JLabel();
        cbExistingPersons = new javax.swing.JComboBox<>();

        jMenuItem1.setText("jMenuItem1");

        setLayout(null);

        basicPanel.setLayout(null);

        jLabel2.setText("First name:");
        basicPanel.add(jLabel2);
        jLabel2.setBounds(10, 10, 63, 16);
        basicPanel.add(txtPatientFirstName);
        txtPatientFirstName.setBounds(120, 10, 250, 24);
        basicPanel.add(txtPatientMiddleName);
        txtPatientMiddleName.setBounds(120, 40, 250, 24);

        jLabel3.setText("Middle name:");
        basicPanel.add(jLabel3);
        jLabel3.setBounds(10, 40, 75, 16);

        jLabel4.setText("Date of Birth:");
        basicPanel.add(jLabel4);
        jLabel4.setBounds(10, 130, 80, 16);

        jLabel5.setText("Last name:");
        basicPanel.add(jLabel5);
        jLabel5.setBounds(10, 70, 80, 16);
        basicPanel.add(txtPatientLastName1);
        txtPatientLastName1.setBounds(120, 70, 250, 24);
        basicPanel.add(txtPatientLastName);
        txtPatientLastName.setBounds(120, 100, 250, 24);

        jLabel6.setText("Sex:");
        basicPanel.add(jLabel6);
        jLabel6.setBounds(10, 100, 80, 16);

        cbYear.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        basicPanel.add(cbYear);
        cbYear.setBounds(260, 130, 110, 26);

        cbDay.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        basicPanel.add(cbDay);
        cbDay.setBounds(120, 130, 65, 26);

        cbMonth.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        basicPanel.add(cbMonth);
        cbMonth.setBounds(190, 130, 65, 26);

        jTabbedPane1.addTab("Basic", basicPanel);

        contactPanel.setLayout(null);

        jLabel7.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel7.setText("Present Address");
        contactPanel.add(jLabel7);
        jLabel7.setBounds(10, 10, 130, 19);

        jLabel8.setText("Pincode:");
        contactPanel.add(jLabel8);
        jLabel8.setBounds(10, 180, 80, 30);

        jLabel9.setText("Door No:");
        contactPanel.add(jLabel9);
        jLabel9.setBounds(10, 30, 80, 30);

        jLabel10.setText("Street:");
        contactPanel.add(jLabel10);
        jLabel10.setBounds(10, 50, 80, 40);

        jLabel11.setText("Area:");
        contactPanel.add(jLabel11);
        jLabel11.setBounds(10, 80, 80, 40);

        jLabel12.setText("City:");
        contactPanel.add(jLabel12);
        jLabel12.setBounds(10, 110, 80, 40);

        jLabel13.setText("State:");
        contactPanel.add(jLabel13);
        jLabel13.setBounds(10, 150, 80, 30);
        contactPanel.add(txtPresentPincode);
        txtPresentPincode.setBounds(130, 180, 250, 24);

        txtPatientEmail.setPreferredSize(new java.awt.Dimension(70, 24));
        contactPanel.add(txtPatientEmail);
        txtPatientEmail.setBounds(130, 390, 250, 24);
        contactPanel.add(txtPresentStreet);
        txtPresentStreet.setBounds(130, 60, 250, 24);
        contactPanel.add(txtPresentArea);
        txtPresentArea.setBounds(130, 90, 250, 24);
        contactPanel.add(txtPresentCity);
        txtPresentCity.setBounds(130, 120, 250, 24);
        contactPanel.add(txtPresentState);
        txtPresentState.setBounds(130, 150, 250, 24);

        jLabel14.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel14.setText("Permanent Address");
        contactPanel.add(jLabel14);
        jLabel14.setBounds(420, 10, 140, 19);

        txtPermanentAddress.setPreferredSize(new java.awt.Dimension(70, 24));
        contactPanel.add(txtPermanentAddress);
        txtPermanentAddress.setBounds(540, 30, 250, 24);
        contactPanel.add(txtPermanentStreet);
        txtPermanentStreet.setBounds(540, 60, 250, 24);

        txtPermanentArea.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtPermanentAreaActionPerformed(evt);
            }
        });
        contactPanel.add(txtPermanentArea);
        txtPermanentArea.setBounds(540, 90, 250, 24);
        contactPanel.add(txtPermanentCity);
        txtPermanentCity.setBounds(540, 120, 250, 24);
        contactPanel.add(txtPermanentState);
        txtPermanentState.setBounds(540, 150, 250, 24);

        txtPermanentPincode.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtPermanentPincodeActionPerformed(evt);
            }
        });
        contactPanel.add(txtPermanentPincode);
        txtPermanentPincode.setBounds(540, 180, 250, 24);

        jLabel15.setText("Door No:");
        contactPanel.add(jLabel15);
        jLabel15.setBounds(420, 30, 80, 30);

        jLabel16.setText("Street:");
        contactPanel.add(jLabel16);
        jLabel16.setBounds(420, 50, 80, 40);

        jLabel17.setText("Area:");
        contactPanel.add(jLabel17);
        jLabel17.setBounds(420, 80, 80, 40);

        jLabel18.setText("City:");
        contactPanel.add(jLabel18);
        jLabel18.setBounds(420, 110, 80, 40);

        jLabel19.setText("State:");
        contactPanel.add(jLabel19);
        jLabel19.setBounds(420, 150, 80, 30);

        jLabel20.setText("Pincode:");
        contactPanel.add(jLabel20);
        jLabel20.setBounds(420, 180, 80, 30);

        jLabel21.setText("Email:");
        contactPanel.add(jLabel21);
        jLabel21.setBounds(10, 390, 110, 20);

        jLabel22.setText("Telephone (Work):");
        contactPanel.add(jLabel22);
        jLabel22.setBounds(10, 240, 110, 16);

        jLabel23.setText("Telephone (Home):");
        contactPanel.add(jLabel23);
        jLabel23.setBounds(10, 260, 110, 40);

        jLabel24.setText("Mobile:");
        contactPanel.add(jLabel24);
        jLabel24.setBounds(10, 300, 110, 30);

        jLabel25.setText("Pager:");
        contactPanel.add(jLabel25);
        jLabel25.setBounds(10, 330, 110, 30);

        jLabel26.setText("Fax:");
        contactPanel.add(jLabel26);
        jLabel26.setBounds(10, 360, 110, 30);

        txtPresentDoor.setPreferredSize(new java.awt.Dimension(70, 24));
        contactPanel.add(txtPresentDoor);
        txtPresentDoor.setBounds(130, 30, 250, 24);

        txtPatientTelephoneWork.setPreferredSize(new java.awt.Dimension(70, 24));
        contactPanel.add(txtPatientTelephoneWork);
        txtPatientTelephoneWork.setBounds(130, 240, 250, 24);

        txtPatientTelephoneHome.setPreferredSize(new java.awt.Dimension(70, 24));
        contactPanel.add(txtPatientTelephoneHome);
        txtPatientTelephoneHome.setBounds(130, 270, 250, 24);

        txtPatientPhone.setPreferredSize(new java.awt.Dimension(70, 24));
        contactPanel.add(txtPatientPhone);
        txtPatientPhone.setBounds(130, 300, 250, 24);

        txtPatientPager.setPreferredSize(new java.awt.Dimension(70, 24));
        contactPanel.add(txtPatientPager);
        txtPatientPager.setBounds(130, 330, 250, 24);

        txtPatientFax.setPreferredSize(new java.awt.Dimension(70, 24));
        contactPanel.add(txtPatientFax);
        txtPatientFax.setBounds(130, 360, 250, 24);
        contactPanel.add(jSeparator1);
        jSeparator1.setBounds(-10, 220, 850, 10);

        jTabbedPane1.addTab("Contact", contactPanel);

        kinPanel.setLayout(null);

        jLabel27.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel27.setText("Address");
        kinPanel.add(jLabel27);
        jLabel27.setBounds(410, 10, 60, 19);

        jLabel28.setText("First name:");
        kinPanel.add(jLabel28);
        jLabel28.setBounds(20, 40, 70, 16);

        jLabel29.setText("Middle name:");
        kinPanel.add(jLabel29);
        jLabel29.setBounds(20, 70, 90, 16);

        jLabel30.setText("Last name:");
        kinPanel.add(jLabel30);
        jLabel30.setBounds(20, 100, 70, 16);

        jLabel31.setText("Relationship:");
        kinPanel.add(jLabel31);
        jLabel31.setBounds(20, 130, 80, 16);

        jLabel32.setText("PIN Code:");
        kinPanel.add(jLabel32);
        jLabel32.setBounds(410, 190, 60, 16);

        jLabel33.setText("Door No:");
        kinPanel.add(jLabel33);
        jLabel33.setBounds(410, 40, 48, 16);

        jLabel34.setText("Street:");
        kinPanel.add(jLabel34);
        jLabel34.setBounds(410, 70, 38, 16);

        jLabel35.setText("Area:");
        kinPanel.add(jLabel35);
        jLabel35.setBounds(410, 100, 48, 16);

        jLabel36.setText("City:");
        kinPanel.add(jLabel36);
        jLabel36.setBounds(410, 130, 48, 16);

        jLabel37.setText("State:");
        kinPanel.add(jLabel37);
        jLabel37.setBounds(410, 160, 48, 16);

        jLabel38.setText("Email:");
        kinPanel.add(jLabel38);
        jLabel38.setBounds(20, 310, 110, 16);

        jLabel39.setText("Telephone (Work):");
        kinPanel.add(jLabel39);
        jLabel39.setBounds(20, 160, 110, 16);

        jLabel40.setText("Telephone (Home):");
        kinPanel.add(jLabel40);
        jLabel40.setBounds(20, 190, 110, 16);

        jLabel41.setText("Mobile:");
        kinPanel.add(jLabel41);
        jLabel41.setBounds(20, 220, 110, 16);

        jLabel42.setText("Pager:");
        kinPanel.add(jLabel42);
        jLabel42.setBounds(20, 250, 110, 16);

        jLabel43.setText("Fax:");
        kinPanel.add(jLabel43);
        jLabel43.setBounds(20, 280, 110, 16);
        kinPanel.add(txtKinPincode);
        txtKinPincode.setBounds(530, 190, 250, 24);
        kinPanel.add(txtKinEmail);
        txtKinEmail.setBounds(140, 310, 250, 24);
        kinPanel.add(txtKinStreet);
        txtKinStreet.setBounds(530, 70, 250, 24);
        kinPanel.add(txtKinArea);
        txtKinArea.setBounds(530, 100, 250, 24);
        kinPanel.add(txtKinCity);
        txtKinCity.setBounds(530, 130, 250, 24);
        kinPanel.add(txtKinState);
        txtKinState.setBounds(530, 160, 250, 24);
        kinPanel.add(txtKinDoor);
        txtKinDoor.setBounds(530, 40, 250, 24);
        kinPanel.add(txtKinFirstName);
        txtKinFirstName.setBounds(140, 40, 250, 24);
        kinPanel.add(txtKinMiddleName);
        txtKinMiddleName.setBounds(140, 70, 250, 24);
        kinPanel.add(txtKinLastName);
        txtKinLastName.setBounds(140, 100, 250, 24);
        kinPanel.add(txtKinRelationship);
        txtKinRelationship.setBounds(140, 130, 250, 24);
        kinPanel.add(txtKinTelephoneWork);
        txtKinTelephoneWork.setBounds(140, 160, 250, 24);
        kinPanel.add(txtKinTelephoneHome);
        txtKinTelephoneHome.setBounds(140, 190, 250, 24);
        kinPanel.add(txtKinMobile);
        txtKinMobile.setBounds(140, 220, 250, 24);
        kinPanel.add(txtKinPager);
        txtKinPager.setBounds(140, 250, 250, 24);
        kinPanel.add(txtKinFax);
        txtKinFax.setBounds(140, 280, 250, 24);

        jTabbedPane1.addTab("Nex-of-Kin", kinPanel);

        personalPanel.setLayout(null);

        jLabel44.setText("Martial Status:");
        personalPanel.add(jLabel44);
        jLabel44.setBounds(20, 20, 90, 16);

        jLabel45.setText("Blood Type - RH:");
        personalPanel.add(jLabel45);
        jLabel45.setBounds(20, 140, 110, 16);

        jLabel46.setText("No. of Dependents:");
        personalPanel.add(jLabel46);
        jLabel46.setBounds(20, 50, 110, 16);

        jLabel47.setText("Height:");
        personalPanel.add(jLabel47);
        jLabel47.setBounds(20, 80, 110, 16);

        jLabel48.setText("Weight:");
        personalPanel.add(jLabel48);
        jLabel48.setBounds(20, 110, 110, 16);
        personalPanel.add(txtBloodType);
        txtBloodType.setBounds(160, 140, 250, 24);
        personalPanel.add(txtNoOfDependents);
        txtNoOfDependents.setBounds(160, 50, 250, 24);
        personalPanel.add(txtHeight);
        txtHeight.setBounds(160, 80, 250, 24);
        personalPanel.add(txtWeight);
        txtWeight.setBounds(160, 110, 250, 24);

        jTextField40.setText("jTextField35");
        personalPanel.add(jTextField40);
        jTextField40.setBounds(160, 140, 250, 24);

        cbMartial.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        personalPanel.add(cbMartial);
        cbMartial.setBounds(160, 20, 250, 26);

        jTabbedPane1.addTab("Personal", personalPanel);

        professionPanel.setLayout(null);

        jLabel49.setText("Occupation:");
        professionPanel.add(jLabel49);
        jLabel49.setBounds(30, 20, 80, 16);

        jLabel51.setText("Gross Annual Income:");
        professionPanel.add(jLabel51);
        jLabel51.setBounds(30, 50, 130, 16);
        professionPanel.add(txtGrossIncome);
        txtGrossIncome.setBounds(190, 50, 250, 24);
        professionPanel.add(txtOccupation);
        txtOccupation.setBounds(190, 20, 250, 24);

        jTabbedPane1.addTab("Profession", professionPanel);

        lifestylePanel.setLayout(null);

        jLabel50.setText("Vegeterian:");
        lifestylePanel.add(jLabel50);
        jLabel50.setBounds(30, 30, 80, 16);

        cbHomeFood.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbHomeFoodActionPerformed(evt);
            }
        });
        lifestylePanel.add(cbHomeFood);
        cbHomeFood.setBounds(230, 240, 49, 24);

        jLabel52.setText("Eat Home Food Predominantly:");
        lifestylePanel.add(jLabel52);
        jLabel52.setBounds(30, 240, 190, 16);

        jLabel53.setText("Average No. of Cigarettes/Day:");
        lifestylePanel.add(jLabel53);
        jLabel53.setBounds(30, 60, 180, 16);

        jLabel54.setText("Average No. of Drinks/Day:");
        lifestylePanel.add(jLabel54);
        jLabel54.setBounds(30, 90, 180, 16);

        jLabel55.setText("Use Stimulants (Specify):");
        lifestylePanel.add(jLabel55);
        jLabel55.setBounds(30, 120, 180, 16);

        jLabel56.setText("Consumption of Coffe-Tea/Day:");
        lifestylePanel.add(jLabel56);
        jLabel56.setBounds(30, 150, 180, 16);

        jLabel57.setText("Consumption of Soft Drinks/Day:");
        lifestylePanel.add(jLabel57);
        jLabel57.setBounds(30, 180, 190, 16);

        jLabel58.setText("Have Regular Meals:");
        lifestylePanel.add(jLabel58);
        jLabel58.setBounds(30, 210, 190, 16);

        cbVegeterian.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbVegeterianActionPerformed(evt);
            }
        });
        lifestylePanel.add(cbVegeterian);
        cbVegeterian.setBounds(230, 20, 49, 24);
        lifestylePanel.add(txtNoOfCigarettes);
        txtNoOfCigarettes.setBounds(230, 60, 250, 24);
        lifestylePanel.add(txtNoOfDrinks);
        txtNoOfDrinks.setBounds(230, 90, 250, 24);
        lifestylePanel.add(txtStimulans);
        txtStimulans.setBounds(230, 120, 250, 24);
        lifestylePanel.add(txtCoffeTea);
        txtCoffeTea.setBounds(230, 150, 250, 24);
        lifestylePanel.add(txtSoftDrinks);
        txtSoftDrinks.setBounds(230, 180, 250, 24);
        lifestylePanel.add(cbMeals);
        cbMeals.setBounds(230, 210, 24, 24);

        jTabbedPane1.addTab("Lifestyle", lifestylePanel);

        basicComplaintsPanel.setLayout(null);

        jLabel59.setText("Physician/Hospital Treated:");
        basicComplaintsPanel.add(jLabel59);
        jLabel59.setBounds(20, 230, 180, 16);

        jLabel60.setText("Statement of Complaint:");
        basicComplaintsPanel.add(jLabel60);
        jLabel60.setBounds(30, 30, 150, 16);

        jLabel62.setText("HIstory of Previous Treatment:");
        basicComplaintsPanel.add(jLabel62);
        jLabel62.setBounds(20, 130, 180, 16);

        txtPhysicianTreated.setColumns(20);
        txtPhysicianTreated.setRows(5);
        jScrollPane1.setViewportView(txtPhysicianTreated);

        basicComplaintsPanel.add(jScrollPane1);
        jScrollPane1.setBounds(200, 230, 223, 83);

        taComplaint.setColumns(20);
        taComplaint.setRows(5);
        jScrollPane2.setViewportView(taComplaint);

        basicComplaintsPanel.add(jScrollPane2);
        jScrollPane2.setBounds(200, 30, 223, 83);

        taPreviousTreatment.setColumns(20);
        taPreviousTreatment.setRows(5);
        jScrollPane3.setViewportView(taPreviousTreatment);

        basicComplaintsPanel.add(jScrollPane3);
        jScrollPane3.setBounds(200, 130, 223, 83);

        jTabbedPane1.addTab("Basic Complaints", basicComplaintsPanel);

        medicalComplaintsPanel.setLayout(null);

        jLabel61.setText("Major Surgeries (History):");
        medicalComplaintsPanel.add(jLabel61);
        jLabel61.setBounds(20, 320, 170, 16);

        jLabel63.setText("Diabetic:");
        medicalComplaintsPanel.add(jLabel63);
        jLabel63.setBounds(20, 20, 60, 16);

        jLabel64.setText("Hypertensive:");
        medicalComplaintsPanel.add(jLabel64);
        jLabel64.setBounds(20, 50, 100, 16);

        jLabel65.setText("Cardiac Condition:");
        medicalComplaintsPanel.add(jLabel65);
        jLabel65.setBounds(20, 80, 120, 16);

        jLabel66.setText("Respiratory Condition:");
        medicalComplaintsPanel.add(jLabel66);
        jLabel66.setBounds(20, 110, 130, 16);

        jLabel67.setText("Digestive Condition:");
        medicalComplaintsPanel.add(jLabel67);
        jLabel67.setBounds(20, 140, 130, 16);

        jLabel68.setText("Orthopedic Condition:");
        medicalComplaintsPanel.add(jLabel68);
        jLabel68.setBounds(20, 170, 130, 16);

        jLabel69.setText("Muscular Condition:");
        medicalComplaintsPanel.add(jLabel69);
        jLabel69.setBounds(20, 200, 130, 16);

        jLabel70.setText("Neurological Condition:");
        medicalComplaintsPanel.add(jLabel70);
        jLabel70.setBounds(20, 230, 130, 16);

        jLabel71.setText("Known Allergies:");
        medicalComplaintsPanel.add(jLabel71);
        jLabel71.setBounds(20, 260, 130, 16);

        jLabel72.setText("Known Reaction to Drugs:");
        medicalComplaintsPanel.add(jLabel72);
        jLabel72.setBounds(20, 290, 160, 16);
        medicalComplaintsPanel.add(txtSurgeries);
        txtSurgeries.setBounds(210, 310, 250, 24);
        medicalComplaintsPanel.add(txtCardiac);
        txtCardiac.setBounds(210, 70, 250, 24);
        medicalComplaintsPanel.add(txtRespiratory);
        txtRespiratory.setBounds(210, 100, 250, 24);
        medicalComplaintsPanel.add(txtDigestive);
        txtDigestive.setBounds(210, 130, 250, 24);
        medicalComplaintsPanel.add(txtOrthopedic);
        txtOrthopedic.setBounds(210, 160, 250, 24);
        medicalComplaintsPanel.add(txtMuscular);
        txtMuscular.setBounds(210, 190, 250, 24);
        medicalComplaintsPanel.add(txtNeurological);
        txtNeurological.setBounds(210, 220, 250, 24);
        medicalComplaintsPanel.add(txtAllergies);
        txtAllergies.setBounds(210, 250, 250, 24);
        medicalComplaintsPanel.add(txtDrugs);
        txtDrugs.setBounds(210, 280, 250, 24);
        medicalComplaintsPanel.add(cbDiabetic);
        cbDiabetic.setBounds(210, 10, 24, 24);
        medicalComplaintsPanel.add(cbHypertensive);
        cbHypertensive.setBounds(210, 40, 24, 24);

        jTabbedPane1.addTab("Medical Complaints", medicalComplaintsPanel);

        add(jTabbedPane1);
        jTabbedPane1.setBounds(0, 76, 824, 481);

        jLabel1.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel1.setText("Comprehensive registration form");
        add(jLabel1);
        jLabel1.setBounds(6, 6, 234, 19);

        jLabel73.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel73.setText("Select from an exsisting person:");
        add(jLabel73);
        jLabel73.setBounds(6, 47, 227, 19);

        cbExistingPersons.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "None" }));
        cbExistingPersons.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbExistingPersonsActionPerformed(evt);
            }
        });
        add(cbExistingPersons);
        cbExistingPersons.setBounds(239, 44, 229, 26);
    }// </editor-fold>//GEN-END:initComponents

    private void cbHomeFoodActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbHomeFoodActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cbHomeFoodActionPerformed

    private void cbVegeterianActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbVegeterianActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cbVegeterianActionPerformed

    private void txtPermanentAreaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtPermanentAreaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtPermanentAreaActionPerformed

    private void txtPermanentPincodeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtPermanentPincodeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtPermanentPincodeActionPerformed

    private void cbExistingPersonsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbExistingPersonsActionPerformed
        // TODO add your handling code here:
        String selected = cbExistingPersons.getSelectedItem().toString();
        if (selected != "None") {
            String[] list = selected.split(":");
            int id = Integer.parseInt(list[0]);
            System.out.println(id);
        }
    }//GEN-LAST:event_cbExistingPersonsActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel basicComplaintsPanel;
    private javax.swing.JPanel basicPanel;
    private javax.swing.JComboBox<String> cbDay;
    private javax.swing.JCheckBox cbDiabetic;
    private javax.swing.JComboBox<String> cbExistingPersons;
    private javax.swing.JCheckBox cbHomeFood;
    private javax.swing.JCheckBox cbHypertensive;
    private javax.swing.JComboBox<String> cbMartial;
    private javax.swing.JCheckBox cbMeals;
    private javax.swing.JComboBox<String> cbMonth;
    private javax.swing.JCheckBox cbVegeterian;
    private javax.swing.JComboBox<String> cbYear;
    private javax.swing.JPanel contactPanel;
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
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel23;
    private javax.swing.JLabel jLabel24;
    private javax.swing.JLabel jLabel25;
    private javax.swing.JLabel jLabel26;
    private javax.swing.JLabel jLabel27;
    private javax.swing.JLabel jLabel28;
    private javax.swing.JLabel jLabel29;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel30;
    private javax.swing.JLabel jLabel31;
    private javax.swing.JLabel jLabel32;
    private javax.swing.JLabel jLabel33;
    private javax.swing.JLabel jLabel34;
    private javax.swing.JLabel jLabel35;
    private javax.swing.JLabel jLabel36;
    private javax.swing.JLabel jLabel37;
    private javax.swing.JLabel jLabel38;
    private javax.swing.JLabel jLabel39;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel40;
    private javax.swing.JLabel jLabel41;
    private javax.swing.JLabel jLabel42;
    private javax.swing.JLabel jLabel43;
    private javax.swing.JLabel jLabel44;
    private javax.swing.JLabel jLabel45;
    private javax.swing.JLabel jLabel46;
    private javax.swing.JLabel jLabel47;
    private javax.swing.JLabel jLabel48;
    private javax.swing.JLabel jLabel49;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel50;
    private javax.swing.JLabel jLabel51;
    private javax.swing.JLabel jLabel52;
    private javax.swing.JLabel jLabel53;
    private javax.swing.JLabel jLabel54;
    private javax.swing.JLabel jLabel55;
    private javax.swing.JLabel jLabel56;
    private javax.swing.JLabel jLabel57;
    private javax.swing.JLabel jLabel58;
    private javax.swing.JLabel jLabel59;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel60;
    private javax.swing.JLabel jLabel61;
    private javax.swing.JLabel jLabel62;
    private javax.swing.JLabel jLabel63;
    private javax.swing.JLabel jLabel64;
    private javax.swing.JLabel jLabel65;
    private javax.swing.JLabel jLabel66;
    private javax.swing.JLabel jLabel67;
    private javax.swing.JLabel jLabel68;
    private javax.swing.JLabel jLabel69;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel70;
    private javax.swing.JLabel jLabel71;
    private javax.swing.JLabel jLabel72;
    private javax.swing.JLabel jLabel73;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JTextField jTextField40;
    private javax.swing.JPanel kinPanel;
    private javax.swing.JPanel lifestylePanel;
    private javax.swing.JPanel medicalComplaintsPanel;
    private javax.swing.JPanel personalPanel;
    private javax.swing.JPanel professionPanel;
    private javax.swing.JTextArea taComplaint;
    private javax.swing.JTextArea taPreviousTreatment;
    private javax.swing.JTextField txtAllergies;
    private javax.swing.JTextField txtBloodType;
    private javax.swing.JTextField txtCardiac;
    private javax.swing.JTextField txtCoffeTea;
    private javax.swing.JTextField txtDigestive;
    private javax.swing.JTextField txtDrugs;
    private javax.swing.JTextField txtGrossIncome;
    private javax.swing.JTextField txtHeight;
    private javax.swing.JTextField txtKinArea;
    private javax.swing.JTextField txtKinCity;
    private javax.swing.JTextField txtKinDoor;
    private javax.swing.JTextField txtKinEmail;
    private javax.swing.JTextField txtKinFax;
    private javax.swing.JTextField txtKinFirstName;
    private javax.swing.JTextField txtKinLastName;
    private javax.swing.JTextField txtKinMiddleName;
    private javax.swing.JTextField txtKinMobile;
    private javax.swing.JTextField txtKinPager;
    private javax.swing.JTextField txtKinPincode;
    private javax.swing.JTextField txtKinRelationship;
    private javax.swing.JTextField txtKinState;
    private javax.swing.JTextField txtKinStreet;
    private javax.swing.JTextField txtKinTelephoneHome;
    private javax.swing.JTextField txtKinTelephoneWork;
    private javax.swing.JTextField txtMuscular;
    private javax.swing.JTextField txtNeurological;
    private javax.swing.JTextField txtNoOfCigarettes;
    private javax.swing.JTextField txtNoOfDependents;
    private javax.swing.JTextField txtNoOfDrinks;
    private javax.swing.JTextField txtOccupation;
    private javax.swing.JTextField txtOrthopedic;
    private javax.swing.JTextField txtPatientEmail;
    private javax.swing.JTextField txtPatientFax;
    private javax.swing.JTextField txtPatientFirstName;
    private javax.swing.JTextField txtPatientLastName;
    private javax.swing.JTextField txtPatientLastName1;
    private javax.swing.JTextField txtPatientMiddleName;
    private javax.swing.JTextField txtPatientPager;
    private javax.swing.JTextField txtPatientPhone;
    private javax.swing.JTextField txtPatientTelephoneHome;
    private javax.swing.JTextField txtPatientTelephoneWork;
    private javax.swing.JTextField txtPermanentAddress;
    private javax.swing.JTextField txtPermanentArea;
    private javax.swing.JTextField txtPermanentCity;
    private javax.swing.JTextField txtPermanentPincode;
    private javax.swing.JTextField txtPermanentState;
    private javax.swing.JTextField txtPermanentStreet;
    private javax.swing.JTextArea txtPhysicianTreated;
    private javax.swing.JTextField txtPresentArea;
    private javax.swing.JTextField txtPresentCity;
    private javax.swing.JTextField txtPresentDoor;
    private javax.swing.JTextField txtPresentPincode;
    private javax.swing.JTextField txtPresentState;
    private javax.swing.JTextField txtPresentStreet;
    private javax.swing.JTextField txtRespiratory;
    private javax.swing.JTextField txtSoftDrinks;
    private javax.swing.JTextField txtStimulans;
    private javax.swing.JTextField txtSurgeries;
    private javax.swing.JTextField txtWeight;
    // End of variables declaration//GEN-END:variables
}

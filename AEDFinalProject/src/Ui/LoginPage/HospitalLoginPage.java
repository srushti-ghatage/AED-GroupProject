/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package Ui.LoginPage;

import Hospital.Doctor.Doctor;
import Hospital.Patient.Patient;
import System.Directories.DB4OUtil;
import System.Directories.MainSystem;
import Ui.Hospital.DoctorWorkspace;
import Ui.Hospital.HospitalAdminWorkspace;
import Ui.Hospital.PatientWorkspace;
import java.awt.CardLayout;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

/**
 *
 * @author megha
 */
public class HospitalLoginPage extends javax.swing.JPanel {

    /**
     * Creates new form HospitalLoginPage
     */
    private JPanel cardPanel;
    private MainSystem system;
    private DB4OUtil dB4OUtil;
    
    public HospitalLoginPage(JPanel cardPanel, MainSystem system, DB4OUtil dB4OUtil) {
        initComponents();
        this.cardPanel = cardPanel;
        this.system = system;
        this.dB4OUtil = dB4OUtil;
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btnBack = new javax.swing.JButton();
        lblTitle = new javax.swing.JLabel();
        txtUsername = new javax.swing.JTextField();
        lblUsername = new javax.swing.JLabel();
        lblPass = new javax.swing.JLabel();
        txtPass = new javax.swing.JPasswordField();
        lblRole = new javax.swing.JLabel();
        cmbRole = new javax.swing.JComboBox<>();
        btnLogin = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        btnBack.setBackground(new java.awt.Color(0, 51, 51));
        btnBack.setFont(new java.awt.Font("Rockwell", 1, 14)); // NOI18N
        btnBack.setForeground(new java.awt.Color(255, 255, 255));
        btnBack.setText("Back");
        btnBack.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBackActionPerformed(evt);
            }
        });
        add(btnBack, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 450, -1, -1));

        lblTitle.setFont(new java.awt.Font("Rockwell", 1, 36)); // NOI18N
        lblTitle.setForeground(new java.awt.Color(255, 255, 255));
        lblTitle.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblTitle.setText("Login Page");
        add(lblTitle, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 90, 310, 80));
        add(txtUsername, new org.netbeans.lib.awtextra.AbsoluteConstraints(282, 182, 230, 30));

        lblUsername.setFont(new java.awt.Font("Rockwell", 1, 14)); // NOI18N
        lblUsername.setText("Username:");
        add(lblUsername, new org.netbeans.lib.awtextra.AbsoluteConstraints(145, 178, 110, 30));

        lblPass.setFont(new java.awt.Font("Rockwell", 1, 14)); // NOI18N
        lblPass.setText("Password:");
        add(lblPass, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 230, 100, 30));
        add(txtPass, new org.netbeans.lib.awtextra.AbsoluteConstraints(286, 233, 230, 30));

        lblRole.setFont(new java.awt.Font("Rockwell", 1, 14)); // NOI18N
        lblRole.setText("Role:");
        add(lblRole, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 290, 70, 20));

        cmbRole.setBackground(new java.awt.Color(0, 255, 255));
        cmbRole.setFont(new java.awt.Font("Rockwell", 1, 12)); // NOI18N
        cmbRole.setForeground(new java.awt.Color(255, 255, 255));
        cmbRole.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Hospital Admin", "Doctor", "Patient" }));
        add(cmbRole, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 290, 224, -1));

        btnLogin.setBackground(new java.awt.Color(0, 51, 51));
        btnLogin.setFont(new java.awt.Font("Rockwell", 1, 14)); // NOI18N
        btnLogin.setForeground(new java.awt.Color(255, 255, 255));
        btnLogin.setText("Login");
        btnLogin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLoginActionPerformed(evt);
            }
        });
        add(btnLogin, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 390, 130, 40));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IMAGES/hospitallogin.gif"))); // NOI18N
        add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 30, 1160, 720));
    }// </editor-fold>//GEN-END:initComponents

    private void btnBackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBackActionPerformed
        // TODO add your handling code here:
        CardLayout cardLayout = (CardLayout) cardPanel.getLayout();
        cardPanel.remove(this);
        cardLayout.previous(cardPanel);
    }//GEN-LAST:event_btnBackActionPerformed

    private void btnLoginActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLoginActionPerformed
        // TODO add your handling code here:

        String username = txtUsername.getText();
        String password = txtPass.getText();
        String role = String.valueOf(cmbRole.getSelectedItem());
        Doctor doc = system.getDoctorList().findDoctor(username, password);
        Patient pat = system.getPatientList().findPatient(username, password);

//        try{
//            if(role.equals("Hospital Admin")){
            if(role.equals("Hospital Admin")&&(username.equals("Admin") && password.equals("pass"))){
                    HospitalAdminWorkspace adminJPanel = new HospitalAdminWorkspace(cardPanel, system, dB4OUtil);
                    CardLayout cardLayout = (CardLayout) cardPanel.getLayout();
                    cardPanel.add("adminJPanel",adminJPanel);
                    cardLayout.next(cardPanel);
                }
//            }
//            else if(role.equals("Doctor")){
            else if(role.equals("Doctor")&&(username.equals(doc.getUsername()) && password.equals(doc.getPassword()))){
                    DoctorWorkspace docJPanel = new DoctorWorkspace(doc,cardPanel, system, dB4OUtil);
                    CardLayout cardLayout = (CardLayout) cardPanel.getLayout();
                    cardPanel.add("docJPanel",docJPanel);
                    cardLayout.next(cardPanel);
                }
//            }
//            else if(role.equals("Patient")){
            else if(role.equals("Patient")&&(username.equals(pat.getUsername()) && password.equals(pat.getPassword()))){
                    PatientWorkspace patJPanel = new PatientWorkspace(pat,cardPanel, system, dB4OUtil);
                    CardLayout cardLayout = (CardLayout) cardPanel.getLayout();
                    cardPanel.add("patJPanel",patJPanel);
                    cardLayout.next(cardPanel);
                }
//            }
            else{
                JOptionPane.showMessageDialog(this, "Please enter the correct username and password and role.");
            }
//        }
//        catch(NullPointerException n){
//            JOptionPane.showMessageDialog(this, n.getMessage());
//        }
        txtUsername.setText("");
        txtPass.setText("");
    }//GEN-LAST:event_btnLoginActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnBack;
    private javax.swing.JButton btnLogin;
    private javax.swing.JComboBox<String> cmbRole;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel lblPass;
    private javax.swing.JLabel lblRole;
    private javax.swing.JLabel lblTitle;
    private javax.swing.JLabel lblUsername;
    private javax.swing.JPasswordField txtPass;
    private javax.swing.JTextField txtUsername;
    // End of variables declaration//GEN-END:variables
}

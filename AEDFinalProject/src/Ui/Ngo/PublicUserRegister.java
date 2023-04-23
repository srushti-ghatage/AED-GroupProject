/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package Ui.Ngo;

import Funding.FundManager.FundManager;
import Funding.PublicUser.PublicUser;
import System.Directories.DB4OUtil;
import System.Directories.DataValidation;
import System.Directories.MainSystem;
import java.awt.CardLayout;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

/**
 *
 * @author SrushtiGhatage
 */
public class PublicUserRegister extends javax.swing.JPanel {

    /**
     * Creates new form NewPublicUserRegister
     */
    private JPanel cardPanel;
    private MainSystem system;
    private DB4OUtil dB4OUtil;
    private final String FILENAME = "ProjectDataBank.db4o";
    private DataValidation data;
    
    public PublicUserRegister(JPanel cardPanel,MainSystem system,DB4OUtil dB4OUtil ) {
        initComponents();
        this.cardPanel = cardPanel;
        this.system = system;
        this.dB4OUtil = dB4OUtil;
        this.data = new DataValidation();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lblTitle = new javax.swing.JLabel();
        lblUsername = new javax.swing.JLabel();
        txtUsername = new javax.swing.JTextField();
        lblName = new javax.swing.JLabel();
        txtName = new javax.swing.JTextField();
        lblAge = new javax.swing.JLabel();
        txtAge = new javax.swing.JTextField();
        lblDOB = new javax.swing.JLabel();
        txtDOB = new javax.swing.JTextField();
        lblGender = new javax.swing.JLabel();
        cmbGender = new javax.swing.JComboBox<>();
        txtPassword = new javax.swing.JPasswordField();
        lblPassword = new javax.swing.JLabel();
        btnRegister = new javax.swing.JButton();
        lblRole = new javax.swing.JLabel();
        txtRole = new javax.swing.JTextField();
        btnBack = new javax.swing.JButton();
        lblEmailId = new javax.swing.JLabel();
        txtEmailId = new javax.swing.JTextField();
        lblPhno = new javax.swing.JLabel();
        txtPhno = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();

        setBackground(new java.awt.Color(204, 255, 255));
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lblTitle.setFont(new java.awt.Font("Rockwell", 1, 36)); // NOI18N
        lblTitle.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblTitle.setText("Public User Registration");
        add(lblTitle, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 20, 800, -1));

        lblUsername.setFont(new java.awt.Font("Rockwell", 1, 12)); // NOI18N
        lblUsername.setText("Username:");
        add(lblUsername, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 134, -1, -1));
        add(txtUsername, new org.netbeans.lib.awtextra.AbsoluteConstraints(161, 134, 238, -1));

        lblName.setFont(new java.awt.Font("Rockwell", 1, 12)); // NOI18N
        lblName.setText("Name:");
        add(lblName, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 177, -1, -1));
        add(txtName, new org.netbeans.lib.awtextra.AbsoluteConstraints(161, 174, 238, -1));

        lblAge.setFont(new java.awt.Font("Rockwell", 1, 12)); // NOI18N
        lblAge.setText("Age:");
        add(lblAge, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 217, -1, -1));
        add(txtAge, new org.netbeans.lib.awtextra.AbsoluteConstraints(161, 214, 238, -1));

        lblDOB.setFont(new java.awt.Font("Rockwell", 1, 12)); // NOI18N
        lblDOB.setText("DOB:");
        add(lblDOB, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 257, -1, -1));

        txtDOB.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtDOBActionPerformed(evt);
            }
        });
        add(txtDOB, new org.netbeans.lib.awtextra.AbsoluteConstraints(161, 254, 238, -1));

        lblGender.setFont(new java.awt.Font("Rockwell", 1, 12)); // NOI18N
        lblGender.setText("Gender:");
        add(lblGender, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 297, -1, -1));

        cmbGender.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Male", "Female", "Others" }));
        add(cmbGender, new org.netbeans.lib.awtextra.AbsoluteConstraints(161, 294, 238, -1));
        add(txtPassword, new org.netbeans.lib.awtextra.AbsoluteConstraints(161, 414, 238, -1));

        lblPassword.setFont(new java.awt.Font("Rockwell", 1, 12)); // NOI18N
        lblPassword.setText("Password:");
        add(lblPassword, new org.netbeans.lib.awtextra.AbsoluteConstraints(52, 417, -1, -1));

        btnRegister.setBackground(new java.awt.Color(0, 51, 51));
        btnRegister.setFont(new java.awt.Font("Rockwell", 1, 12)); // NOI18N
        btnRegister.setForeground(new java.awt.Color(255, 255, 255));
        btnRegister.setText("Register");
        btnRegister.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRegisterActionPerformed(evt);
            }
        });
        add(btnRegister, new org.netbeans.lib.awtextra.AbsoluteConstraints(198, 531, 100, 30));

        lblRole.setFont(new java.awt.Font("Rockwell", 1, 12)); // NOI18N
        lblRole.setText("Role:");
        add(lblRole, new org.netbeans.lib.awtextra.AbsoluteConstraints(52, 457, -1, -1));

        txtRole.setEditable(false);
        txtRole.setText("Public User");
        add(txtRole, new org.netbeans.lib.awtextra.AbsoluteConstraints(161, 454, 238, -1));

        btnBack.setBackground(new java.awt.Color(0, 51, 51));
        btnBack.setFont(new java.awt.Font("Rockwell", 1, 12)); // NOI18N
        btnBack.setForeground(new java.awt.Color(255, 255, 255));
        btnBack.setText("Back");
        btnBack.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBackActionPerformed(evt);
            }
        });
        add(btnBack, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 71, -1, -1));

        lblEmailId.setFont(new java.awt.Font("Rockwell", 1, 12)); // NOI18N
        lblEmailId.setText("Email-Id:");
        add(lblEmailId, new org.netbeans.lib.awtextra.AbsoluteConstraints(52, 337, -1, -1));
        add(txtEmailId, new org.netbeans.lib.awtextra.AbsoluteConstraints(161, 334, 238, -1));

        lblPhno.setFont(new java.awt.Font("Rockwell", 1, 12)); // NOI18N
        lblPhno.setText("Phone No:");
        add(lblPhno, new org.netbeans.lib.awtextra.AbsoluteConstraints(52, 377, -1, -1));
        add(txtPhno, new org.netbeans.lib.awtextra.AbsoluteConstraints(161, 374, 238, -1));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IMAGES/publicuserregister.gif"))); // NOI18N
        add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 60, 820, 600));
    }// </editor-fold>//GEN-END:initComponents

    private void btnBackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBackActionPerformed
        // TODO add your handling code here:
        CardLayout cardLayout = (CardLayout) cardPanel.getLayout();
        cardPanel.remove(this);
        cardLayout.previous(cardPanel);
    }//GEN-LAST:event_btnBackActionPerformed

    private void btnRegisterActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRegisterActionPerformed
        // TODO add your handling code here:
        
        String username = txtUsername.getText();
        if(username.isEmpty()){
            JOptionPane.showMessageDialog(this, "Enter username");
            return;
        }
        else if(system.getPublicUserList().uniquePublicUserUsername(username) == false){
            JOptionPane.showMessageDialog(this, "Username already exist");
            return;
        }
        
        
        String name = txtName.getText();
        if(name.isEmpty()){
            JOptionPane.showMessageDialog(this, "Enter the name");
        }
        
        
        if(data.numcheck(txtAge.getText())==false){
            JOptionPane.showMessageDialog(this, "Enter valid age");
            return;
        }
        Integer age = Integer.valueOf(txtAge.getText());
        
        
        String dob = txtDOB.getText();
        if(!data.dateCheck(dob)){
            JOptionPane.showMessageDialog(this, "Please enter correct date in format mm/dd/yyyy");
            return;
        }
        
        String gender = String.valueOf(cmbGender.getSelectedItem());
        
        
        String emailid= txtEmailId.getText();
        if(!data.emailCheck(emailid)){
            JOptionPane.showMessageDialog(this, "Enter valid email id");
            return;
        }
        
        
        if(!data.phnocheck(txtPhno.getText())){
            JOptionPane.showMessageDialog(this, "Enter valid phone no");
            return;
        }
        Long phno = Long.valueOf(txtPhno.getText());
        
        
        String pass = txtPassword.getText();
        if(pass.isEmpty()){
            JOptionPane.showMessageDialog(this, "Enter valid password");
            return;
        }
        
        String role = txtRole.getText();
        
        
        PublicUser newUser = system.getPublicUserList().addUser();
        
        
        newUser.setName(name);
        newUser.setUsername(username);
        newUser.setAge(age);
        newUser.setDob(dob);
        newUser.setGender(gender);
        newUser.setRole(role);
        newUser.setEmailId(emailid);
        newUser.setPhno(phno);
        newUser.setPassword(pass);
        
        JOptionPane.showMessageDialog(this, "Public User created successfully");
        
      
        txtName.setText("");
        txtUsername.setText("");
        txtAge.setText("");
        txtDOB.setText("");
        txtEmailId.setText("");
        txtPhno.setText("");
        txtPassword.setText("");
        
        dB4OUtil.storeSystem(system);
    }//GEN-LAST:event_btnRegisterActionPerformed

    private void txtDOBActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtDOBActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtDOBActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnBack;
    private javax.swing.JButton btnRegister;
    private javax.swing.JComboBox<String> cmbGender;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel lblAge;
    private javax.swing.JLabel lblDOB;
    private javax.swing.JLabel lblEmailId;
    private javax.swing.JLabel lblGender;
    private javax.swing.JLabel lblName;
    private javax.swing.JLabel lblPassword;
    private javax.swing.JLabel lblPhno;
    private javax.swing.JLabel lblRole;
    private javax.swing.JLabel lblTitle;
    private javax.swing.JLabel lblUsername;
    private javax.swing.JTextField txtAge;
    private javax.swing.JTextField txtDOB;
    private javax.swing.JTextField txtEmailId;
    private javax.swing.JTextField txtName;
    private javax.swing.JPasswordField txtPassword;
    private javax.swing.JTextField txtPhno;
    private javax.swing.JTextField txtRole;
    private javax.swing.JTextField txtUsername;
    // End of variables declaration//GEN-END:variables
}

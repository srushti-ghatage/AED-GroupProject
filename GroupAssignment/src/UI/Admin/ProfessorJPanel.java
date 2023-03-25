/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package UI.Admin;

import Business.Business;
import Business.UserAccount;
import Business.UserAccountDirectory;
import Courses.Course;
import Professor.Professor;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import Professor.ProfessorDirectory;
import java.util.ArrayList;

/**
 *
 * @author SrushtiGhatage
 */
public class ProfessorJPanel extends javax.swing.JPanel {

    /**
     * Creates new form ProfessorJPanel
     */
    public ProfessorJPanel() {
        initComponents();
    }
 private Business business;
     private UserAccount useraccount;
     DefaultTableModel tableModel;
     
     
     public ProfessorJPanel(Business business, UserAccount useraccount) {
        initComponents();
        this.business = business;
        this.useraccount = useraccount;
        this.tableModel= (DefaultTableModel) jTable1.getModel();
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
        jTable1 = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        btnaddP = new javax.swing.JButton();
        txtPname = new javax.swing.JTextField();
        txtPemail = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        txtPpwd = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        txtPid = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        txtPusername = new javax.swing.JTextField();

        setBackground(new java.awt.Color(204, 255, 204));

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null},
                {null, null},
                {null, null},
                {null, null}
            },
            new String [] {
                "Professor Name", "Professor Email"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        jScrollPane1.setViewportView(jTable1);

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel1.setText("Professor Name");

        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel2.setText("Professor Email");

        btnaddP.setBackground(new java.awt.Color(102, 102, 102));
        btnaddP.setForeground(new java.awt.Color(255, 255, 255));
        btnaddP.setText("ADD PROFESSOR");
        btnaddP.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        btnaddP.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnaddPActionPerformed(evt);
            }
        });

        txtPname.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N

        txtPemail.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N

        jLabel4.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel4.setText("Professor password");

        txtPpwd.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N

        jLabel5.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel5.setText("Professor ID");

        txtPid.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N

        jLabel3.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel3.setText("Professor Username");

        txtPusername.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(42, 42, 42)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel1)
                            .addComponent(jLabel2)
                            .addComponent(jLabel4)
                            .addComponent(jLabel5)
                            .addComponent(jLabel3))
                        .addGap(58, 58, 58)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtPid, javax.swing.GroupLayout.PREFERRED_SIZE, 107, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addComponent(txtPname, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 105, Short.MAX_VALUE)
                                .addComponent(txtPpwd, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 105, Short.MAX_VALUE)
                                .addComponent(txtPemail, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 105, Short.MAX_VALUE)
                                .addComponent(txtPusername, javax.swing.GroupLayout.Alignment.LEADING))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(110, 110, 110)
                        .addComponent(btnaddP)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 375, Short.MAX_VALUE)
                .addGap(15, 15, 15))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(40, 40, 40)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 387, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel5)
                            .addComponent(txtPid, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(20, 20, 20)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel1)
                            .addComponent(txtPname, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(20, 20, 20)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtPemail, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel2))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtPpwd, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel4))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel3)
                            .addComponent(txtPusername, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(41, 41, 41)
                        .addComponent(btnaddP)))
                .addContainerGap(18, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void btnaddPActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnaddPActionPerformed
        // TODO add your handling code here:
        if(validateInput()){
            String userName = txtPusername.getText();
        String name = txtPname.getText();
        Professor p = new Professor();
        p.setProfessorId(Integer.parseInt(txtPid.getText()));
        p.setProfessorName(name);
        p.setUserName(txtPusername.getText());
        p.setProfessorCourses(new ArrayList<Course>());
        p.setReputationIndex(10);
        ProfessorDirectory pd = this.business.getProfessorDirectory();
        pd.addProf(p);
        
         UserAccountDirectory ua= this.business.getUserAccountDirectory();

        if(ua.accountExists(txtPusername.getText().trim(), txtPpwd.getText().trim(),"professor")){
            JOptionPane.showMessageDialog(null,"Sorry credentials are taken");
        }
        else{
            //UserAccount user=this.business.getUserAccountDirectory().createUserAccount(txtPname.getText(), txtPpwd.getText(), "Professor");
            UserAccount user = this.business.getUserAccountDirectory().createUserAccount(txtPusername.getText(), txtPpwd.getText(),"professor");
 
            System.out.println(user.getUsername());
          System.out.println(user.getRole());
                  System.out.println(user.getPassword());
            populate();
        }
        }  
    }//GEN-LAST:event_btnaddPActionPerformed
public void populate(){
        tableModel.setRowCount(0);
        
        for(Professor p: this.business.getProfessorDirectory().getProfessorList()){
            
            Object[] row= new Object[2];
            
            row[0]= p.getProfessorId();
            row[1]= p.getProfessorName();
           
            
            tableModel.addRow(row);
        }
    
    }
 boolean validateInput(){
    if( txtPname.getText().equals("")){
        JOptionPane.showMessageDialog(null,"Professor name should not be empty");
        return false;
    }
     if( txtPemail.getText().equals("")){
         JOptionPane.showMessageDialog(null,"Professor email id should not be empty");
        return false;
    }
      if( txtPid.getText().equals("")){
          JOptionPane.showMessageDialog(null,"Professor ID should not be empty");
        return false;
    }
       if( txtPusername.getText().equals("")){
           JOptionPane.showMessageDialog(null,"Professor Username should not be empty");
        return false;
    }
        if( txtPpwd.getText().equals("")){
            JOptionPane.showMessageDialog(null,"Professor Password should not be empty");
        return false;
    }
    return true;
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnaddP;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    private javax.swing.JTextField txtPemail;
    private javax.swing.JTextField txtPid;
    private javax.swing.JTextField txtPname;
    private javax.swing.JTextField txtPpwd;
    private javax.swing.JTextField txtPusername;
    // End of variables declaration//GEN-END:variables
}

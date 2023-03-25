/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package UI.Admin;

import Business.Business;
import Business.UserAccount;
import Business.UserAccountDirectory;
import CertificationAuthority.CertificationAuthority;
import CertificationAuthority.CertificationAuthorityDirectory;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author SrushtiGhatage
 */
public class CertificationAuthorityJPanel extends javax.swing.JPanel {

    /**
     * Creates new form CertificationAuthority
     */
    public CertificationAuthorityJPanel() {
        initComponents();
    }
     private Business business;
     private UserAccount useraccount;
     DefaultTableModel tableModel;
     
     
     public CertificationAuthorityJPanel(Business business, UserAccount useraccount) {
        initComponents();
        this.business = business;
        this.useraccount = useraccount;
        this.tableModel= (DefaultTableModel) tblcertification.getModel();
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
        btnaddCA = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblcertification = new javax.swing.JTable();
        txtCAname = new javax.swing.JTextField();
        txtCAid = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        txtCApwd = new javax.swing.JTextField();

        setBackground(new java.awt.Color(153, 255, 255));

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel1.setText("Certification Authority Name");

        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel2.setText("Certification Authority ID");

        btnaddCA.setBackground(new java.awt.Color(102, 102, 102));
        btnaddCA.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        btnaddCA.setForeground(new java.awt.Color(255, 255, 255));
        btnaddCA.setText("ADD CERTIFICATION AUTHORITY");
        btnaddCA.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        btnaddCA.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnaddCAActionPerformed(evt);
            }
        });

        tblcertification.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null},
                {null, null},
                {null, null},
                {null, null}
            },
            new String [] {
                "Certification Authority Name", "Certification Authority ID"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        jScrollPane1.setViewportView(tblcertification);

        txtCAname.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N

        txtCAid.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N

        jLabel3.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel3.setText("Certification Authority Password");

        txtCApwd.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(28, 28, 28)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel1)
                            .addComponent(jLabel2)
                            .addComponent(jLabel3))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(42, 42, 42)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(txtCAid, javax.swing.GroupLayout.DEFAULT_SIZE, 108, Short.MAX_VALUE)
                                    .addComponent(txtCApwd))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 36, Short.MAX_VALUE)
                                .addComponent(txtCAname, javax.swing.GroupLayout.PREFERRED_SIZE, 108, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED))))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(btnaddCA, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGap(68, 68, 68)))
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 277, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(52, 52, 52)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel1)
                            .addComponent(txtCAname, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel2)
                            .addComponent(txtCAid, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(16, 16, 16)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtCApwd, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel3))
                        .addGap(31, 31, 31)
                        .addComponent(btnaddCA, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 395, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(76, Short.MAX_VALUE))))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void btnaddCAActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnaddCAActionPerformed
        // TODO add your handling code here:
        if(validateInput()){
         String name = txtCAname.getText();
        CertificationAuthority c = new CertificationAuthority();
        c.setCaId(Integer.parseInt(txtCAid.getText()));
        c.setCaName(name);
        CertificationAuthorityDirectory ca = this.business.getCaDirectory();
        ca.addCA(c);
        UserAccountDirectory ua= this.business.getUserAccountDirectory();
         if(ua.accountExists(txtCAname.getText(), txtCApwd.getText(),"certificationauthority")){
            JOptionPane.showMessageDialog(null,"Sorry credentials are taken");
        }
        else{
            //UserAccount user=this.business.getUserAccountDirectory().createUserAccount(txtPname.getText(), txtPpwd.getText(), "Professor");
            UserAccount user = this.business.getUserAccountDirectory().createUserAccount(txtCAname.getText(), txtCApwd.getText(),"certificationauthority");
            populate();
        }
    
        }
        
        
    }//GEN-LAST:event_btnaddCAActionPerformed
public void populate(){
        tableModel.setRowCount(0);
        
        for(CertificationAuthority ca: this.business.getCaDirectory().getCaList()){
            
            Object[] row= new Object[2];
            
            row[0]= ca.getCaId();
            row[1]= ca.getCaName();
           
        
            tableModel.addRow(row);
        }
    
    }
boolean validateInput(){
    if( txtCAid.getText().equals("")){
        JOptionPane.showMessageDialog(null,"Certification Authority id should not be empty");
        return false;
    }
     if( txtCAname.getText().equals("")){
         JOptionPane.showMessageDialog(null,"Certification Authority name should not be empty");
        return false;
    }
        if( txtCApwd.getText().equals("")){
            JOptionPane.showMessageDialog(null,"Professor Password should not be empty");
        return false;
    }
    return true;
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnaddCA;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tblcertification;
    private javax.swing.JTextField txtCAid;
    private javax.swing.JTextField txtCAname;
    private javax.swing.JTextField txtCApwd;
    // End of variables declaration//GEN-END:variables
}

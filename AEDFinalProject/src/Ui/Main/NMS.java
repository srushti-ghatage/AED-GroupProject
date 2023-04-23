/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package Ui.Main;

import System.Directories.DB4OUtil;
import System.Directories.MainSystem;
import Ui.LoginPage.FundingLoginPage;
import Ui.LoginPage.NgoLoginPage;
import java.awt.CardLayout;
import javax.swing.JPanel;

/**
 *
 * @author megha
 */
public class NMS extends javax.swing.JPanel {

    /**
     * Creates new form NMS
     */
//    private NgoManagerDirectory ngoManagerList;
    private MainSystem system;
    private JPanel cardPanel;
    private DB4OUtil dB4OUtil;
    
    public NMS(JPanel cardPanel, MainSystem system, DB4OUtil dB4OUtil) {
        initComponents();
        this.cardPanel=cardPanel;
        this.system = system;
        this.dB4OUtil = dB4OUtil;
//        this.ngoManagerList = ngoManagerList;
        

        
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
        jTabbedPane1 = new javax.swing.JTabbedPane();
        btnNgo = new javax.swing.JButton();
        btnFunding = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();

        setBackground(new java.awt.Color(255, 255, 255));
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        btnBack.setBackground(new java.awt.Color(0, 51, 51));
        btnBack.setFont(new java.awt.Font("Rockwell", 1, 14)); // NOI18N
        btnBack.setForeground(new java.awt.Color(255, 255, 255));
        btnBack.setText("Back");
        btnBack.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(204, 204, 204), 2, true));
        btnBack.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBackActionPerformed(evt);
            }
        });
        add(btnBack, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 30, 60, 20));

        jTabbedPane1.setBackground(new java.awt.Color(204, 255, 255));
        jTabbedPane1.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(255, 255, 255), 3, true));
        jTabbedPane1.setForeground(new java.awt.Color(0, 153, 153));
        jTabbedPane1.setFont(new java.awt.Font("Rockwell", 1, 14)); // NOI18N

        btnNgo.setBackground(new java.awt.Color(0, 51, 51));
        btnNgo.setFont(new java.awt.Font("Rockwell", 1, 14)); // NOI18N
        btnNgo.setForeground(new java.awt.Color(255, 255, 255));
        btnNgo.setText("NGOs");
        btnNgo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNgoActionPerformed(evt);
            }
        });
        jTabbedPane1.addTab("NGOs", btnNgo);

        btnFunding.setBackground(new java.awt.Color(0, 51, 51));
        btnFunding.setFont(new java.awt.Font("Rockwell", 1, 14)); // NOI18N
        btnFunding.setForeground(new java.awt.Color(255, 255, 255));
        btnFunding.setText("Funding");
        btnFunding.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnFundingActionPerformed(evt);
            }
        });
        jTabbedPane1.addTab("Funding", btnFunding);

        add(jTabbedPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 60, 610, 60));

        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IMAGES/cutehands.jpg"))); // NOI18N
        add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(-70, 0, 1540, 850));
    }// </editor-fold>//GEN-END:initComponents

    private void btnBackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBackActionPerformed
        // TODO add your handling code here:
        CardLayout cardLayout = (CardLayout) cardPanel.getLayout();
        cardPanel.remove(this);
        cardLayout.previous(cardPanel);
        
        
        
    }//GEN-LAST:event_btnBackActionPerformed

    private void btnNgoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNgoActionPerformed
        // TODO add your handling code here:
         NgoLoginPage ngologinJPanel = new NgoLoginPage(cardPanel, system, dB4OUtil);
         CardLayout cardLayout = (CardLayout) cardPanel.getLayout();
         cardPanel.add("loginJPanel",ngologinJPanel);
         cardLayout.next(cardPanel);
    }//GEN-LAST:event_btnNgoActionPerformed

    private void btnFundingActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnFundingActionPerformed
        // TODO add your handling code here:
         FundingLoginPage fundloginJPanel = new FundingLoginPage(cardPanel, system, dB4OUtil);
         CardLayout cardLayout = (CardLayout) cardPanel.getLayout();
         cardPanel.add("loginJPanel",fundloginJPanel);
         cardLayout.next(cardPanel);
    }//GEN-LAST:event_btnFundingActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnBack;
    private javax.swing.JButton btnFunding;
    private javax.swing.JButton btnNgo;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JTabbedPane jTabbedPane1;
    // End of variables declaration//GEN-END:variables
}

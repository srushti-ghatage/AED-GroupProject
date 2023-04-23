/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package Ui.Hospital;

import Hospital.Encounter.Encounter;
import Hospital.Patient.Patient;
import Ngo.NgoManager.NgoManager;
import System.Directories.DB4OUtil;
import System.Directories.MainSystem;
import java.awt.CardLayout;
import static java.time.Clock.system;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author SrushtiGhatage
 */


public class PatientWorkspace extends javax.swing.JPanel {

    /**
     * Creates new form PatientWorkspace
     */
    private JPanel cardPanel;
    private NgoManager ngoManager;
    private MainSystem system;
    private DB4OUtil dB4OUtil;
    private Patient pat;
    private final String FILENAME = "ProjectDataBank.db4o";
    
    public PatientWorkspace(Patient pat,JPanel cardPanel,MainSystem system,DB4OUtil dB4OUtil) {
        initComponents();
        this.pat = pat;
        this.cardPanel = cardPanel;
        this.system = system;
        this.dB4OUtil = dB4OUtil;
        
        populateHospitalEncounterTable();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jSplitPane1 = new javax.swing.JSplitPane();
        panelControl = new javax.swing.JPanel();
        btnHome = new javax.swing.JButton();
        btnEncounter = new javax.swing.JButton();
        panelWork = new javax.swing.JPanel();
        panelEncounter = new javax.swing.JPanel();
        lblTitleEncounter = new javax.swing.JLabel();
        jScrollPane3 = new javax.swing.JScrollPane();
        tableEncounter = new javax.swing.JTable();
        btnEncounterView = new javax.swing.JButton();
        lblEncounterNo = new javax.swing.JLabel();
        lblEncounterHospital = new javax.swing.JLabel();
        lblDoctorEncounterUsername = new javax.swing.JLabel();
        lblEncounterPatientUsername = new javax.swing.JLabel();
        lblEncounterDate = new javax.swing.JLabel();
        txtEncounterNo = new javax.swing.JTextField();
        txtEncounterHospital = new javax.swing.JTextField();
        txtEncounterDoctorUsername = new javax.swing.JTextField();
        txtEncounterPatientUsername = new javax.swing.JTextField();
        txtEncounterDate = new javax.swing.JTextField();
        lblEncounterBP = new javax.swing.JLabel();
        txtEncounterBP = new javax.swing.JTextField();
        lblEncounterTemperature = new javax.swing.JLabel();
        txtEncounterTemperature = new javax.swing.JTextField();
        lblEncounterMedicine = new javax.swing.JLabel();
        txtEncounterMedicine = new javax.swing.JTextField();
        lblEncounterMedicineQuantity = new javax.swing.JLabel();
        txtMedicineQuantity = new javax.swing.JTextField();
        panelHome = new javax.swing.JPanel();
        lblRole = new javax.swing.JLabel();
        btnLogOut = new javax.swing.JButton();
        lblTitleHospital = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();

        panelControl.setBackground(new java.awt.Color(51, 51, 51));

        btnHome.setText("Home");
        btnHome.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnHomeActionPerformed(evt);
            }
        });

        btnEncounter.setText("Encounter");
        btnEncounter.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEncounterActionPerformed(evt);
            }
        });

        panelEncounter.setBackground(new java.awt.Color(255, 255, 255));

        lblTitleEncounter.setFont(new java.awt.Font("Rockwell", 0, 36)); // NOI18N
        lblTitleEncounter.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblTitleEncounter.setText("ENCOUNTER");

        tableEncounter.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null}
            },
            new String [] {
                "Encounter No", "Doctor UserName", "Patient Username", "BP", "Temperature"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.Integer.class, java.lang.Integer.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        jScrollPane3.setViewportView(tableEncounter);

        btnEncounterView.setText("View");
        btnEncounterView.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEncounterViewActionPerformed(evt);
            }
        });

        lblEncounterNo.setText("Encounter No");

        lblEncounterHospital.setText("Hospital");

        lblDoctorEncounterUsername.setText("Doctor Username");

        lblEncounterPatientUsername.setText("Patient Username");

        lblEncounterDate.setText("Date");

        txtEncounterHospital.setEditable(false);
        txtEncounterHospital.setText("Hospital");

        lblEncounterBP.setText("BP");

        lblEncounterTemperature.setText("Temperature");

        lblEncounterMedicine.setText("Medicine");

        lblEncounterMedicineQuantity.setText("Medicine Quantity");

        txtMedicineQuantity.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtMedicineQuantityActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout panelEncounterLayout = new javax.swing.GroupLayout(panelEncounter);
        panelEncounter.setLayout(panelEncounterLayout);
        panelEncounterLayout.setHorizontalGroup(
            panelEncounterLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelEncounterLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblTitleEncounter, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
            .addGroup(panelEncounterLayout.createSequentialGroup()
                .addGap(131, 131, 131)
                .addGroup(panelEncounterLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panelEncounterLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(lblEncounterHospital)
                        .addComponent(lblEncounterNo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(lblDoctorEncounterUsername, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(lblEncounterPatientUsername, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addComponent(lblEncounterDate))
                .addGap(18, 18, 18)
                .addGroup(panelEncounterLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(txtEncounterDate)
                    .addComponent(txtEncounterNo, javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtEncounterHospital, javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtEncounterDoctorUsername, javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtEncounterPatientUsername, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 97, Short.MAX_VALUE))
                .addGap(81, 81, 81)
                .addGroup(panelEncounterLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblEncounterBP)
                    .addComponent(lblEncounterTemperature)
                    .addComponent(lblEncounterMedicine)
                    .addComponent(lblEncounterMedicineQuantity))
                .addGap(39, 39, 39)
                .addGroup(panelEncounterLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtEncounterBP)
                    .addComponent(txtEncounterTemperature)
                    .addComponent(txtEncounterMedicine)
                    .addComponent(txtMedicineQuantity))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelEncounterLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnEncounterView)
                .addGap(570, 570, 570))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelEncounterLayout.createSequentialGroup()
                .addContainerGap(328, Short.MAX_VALUE)
                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 644, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(328, Short.MAX_VALUE))
        );
        panelEncounterLayout.setVerticalGroup(
            panelEncounterLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelEncounterLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblTitleEncounter, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(58, 58, 58)
                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 111, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(24, 24, 24)
                .addComponent(btnEncounterView)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 119, Short.MAX_VALUE)
                .addGroup(panelEncounterLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panelEncounterLayout.createSequentialGroup()
                        .addGroup(panelEncounterLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblEncounterNo)
                            .addComponent(txtEncounterNo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(26, 26, 26)
                        .addGroup(panelEncounterLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblEncounterHospital)
                            .addComponent(txtEncounterHospital, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(panelEncounterLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(panelEncounterLayout.createSequentialGroup()
                                .addComponent(lblDoctorEncounterUsername)
                                .addGap(29, 29, 29)
                                .addGroup(panelEncounterLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(lblEncounterPatientUsername)
                                    .addComponent(txtEncounterPatientUsername, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(34, 34, 34)
                                .addGroup(panelEncounterLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(lblEncounterDate)
                                    .addComponent(txtEncounterDate, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addComponent(txtEncounterDoctorUsername, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(panelEncounterLayout.createSequentialGroup()
                        .addGroup(panelEncounterLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblEncounterBP)
                            .addComponent(txtEncounterBP, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(panelEncounterLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblEncounterTemperature)
                            .addComponent(txtEncounterTemperature, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(21, 21, 21)
                        .addGroup(panelEncounterLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblEncounterMedicine)
                            .addComponent(txtEncounterMedicine, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(panelEncounterLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblEncounterMedicineQuantity)
                            .addComponent(txtMedicineQuantity, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(139, 139, 139))
        );

        panelHome.setBackground(new java.awt.Color(255, 255, 255));

        lblRole.setFont(new java.awt.Font("Rockwell", 1, 18)); // NOI18N
        lblRole.setText("Role:  Patient");

        btnLogOut.setText("Logout");
        btnLogOut.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLogOutActionPerformed(evt);
            }
        });

        lblTitleHospital.setFont(new java.awt.Font("Rockwell", 1, 36)); // NOI18N
        lblTitleHospital.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblTitleHospital.setText("Hospital Management System");

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IMAGES/patientworkspace.gif"))); // NOI18N

        javax.swing.GroupLayout panelHomeLayout = new javax.swing.GroupLayout(panelHome);
        panelHome.setLayout(panelHomeLayout);
        panelHomeLayout.setHorizontalGroup(
            panelHomeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(lblTitleHospital, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 1329, Short.MAX_VALUE)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelHomeLayout.createSequentialGroup()
                .addGap(34, 34, 34)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 135, Short.MAX_VALUE)
                .addGroup(panelHomeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnLogOut, javax.swing.GroupLayout.PREFERRED_SIZE, 123, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblRole, javax.swing.GroupLayout.PREFERRED_SIZE, 123, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(237, 237, 237))
        );
        panelHomeLayout.setVerticalGroup(
            panelHomeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelHomeLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblTitleHospital)
                .addGroup(panelHomeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panelHomeLayout.createSequentialGroup()
                        .addGap(55, 55, 55)
                        .addComponent(lblRole, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnLogOut))
                    .addGroup(panelHomeLayout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(jLabel1)))
                .addContainerGap(134, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout panelWorkLayout = new javax.swing.GroupLayout(panelWork);
        panelWork.setLayout(panelWorkLayout);
        panelWorkLayout.setHorizontalGroup(
            panelWorkLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1329, Short.MAX_VALUE)
            .addGroup(panelWorkLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(panelWorkLayout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(panelEncounter, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
            .addGroup(panelWorkLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(panelWorkLayout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(panelHome, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );
        panelWorkLayout.setVerticalGroup(
            panelWorkLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 801, Short.MAX_VALUE)
            .addGroup(panelWorkLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(panelWorkLayout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(panelEncounter, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
            .addGroup(panelWorkLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(panelWorkLayout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(panelHome, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );

        javax.swing.GroupLayout panelControlLayout = new javax.swing.GroupLayout(panelControl);
        panelControl.setLayout(panelControlLayout);
        panelControlLayout.setHorizontalGroup(
            panelControlLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelControlLayout.createSequentialGroup()
                .addGap(29, 29, 29)
                .addGroup(panelControlLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(btnEncounter, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnHome, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(panelWork, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        panelControlLayout.setVerticalGroup(
            panelControlLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelControlLayout.createSequentialGroup()
                .addGroup(panelControlLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panelControlLayout.createSequentialGroup()
                        .addGap(144, 144, 144)
                        .addComponent(btnHome)
                        .addGap(18, 18, 18)
                        .addComponent(btnEncounter))
                    .addGroup(panelControlLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(panelWork, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jSplitPane1.setLeftComponent(panelControl);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jSplitPane1)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jSplitPane1)
        );
    }// </editor-fold>//GEN-END:initComponents

    private void btnHomeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnHomeActionPerformed
        // TODO add your handling code here:
        panelWork.removeAll();
        panelWork.add(panelHome);
        panelWork.repaint();
        panelWork.revalidate();
    }//GEN-LAST:event_btnHomeActionPerformed

    private void btnEncounterActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEncounterActionPerformed
        // TODO add your handling code here:
        panelWork.removeAll();
        panelWork.add(panelEncounter);
        panelWork.repaint();
        panelWork.revalidate();
    }//GEN-LAST:event_btnEncounterActionPerformed

    private void btnEncounterViewActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEncounterViewActionPerformed
        // TODO add your handling code here:
        Integer selectedRowIndex = tableEncounter.getSelectedRow();

        if (selectedRowIndex<0){

            JOptionPane.showMessageDialog(this, "Please select a row to view.");
            return;
        }
        else{

            DefaultTableModel model = (DefaultTableModel) tableEncounter.getModel();
            Encounter enc = (Encounter) model.getValueAt(selectedRowIndex,0);

            txtEncounterNo.setText(enc.getEncounterNo());
            txtEncounterHospital.setText(enc.getHospital());
            txtEncounterDoctorUsername.setText(enc.getDoctorUserName());
            txtEncounterPatientUsername.setText(enc.getPatientUsername());
            txtEncounterDate.setText(enc.getDate());

            txtEncounterBP.setText(enc.getBP());
            txtEncounterTemperature.setText(enc.getTemperature());
            txtEncounterMedicine.setText(enc.getMedicine());
            txtMedicineQuantity.setText(enc.getMedicineQuantity());

        }

    }//GEN-LAST:event_btnEncounterViewActionPerformed

    private void txtMedicineQuantityActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtMedicineQuantityActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtMedicineQuantityActionPerformed

    private void btnLogOutActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLogOutActionPerformed
        // TODO add your handling code here:
        dB4OUtil.storeSystem(system);
        CardLayout cardLayout = (CardLayout) cardPanel.getLayout();
        cardPanel.remove(this);
        cardLayout.previous(cardPanel);
    }//GEN-LAST:event_btnLogOutActionPerformed

    private void populateHospitalEncounterTable(){
        DefaultTableModel model = (DefaultTableModel) tableEncounter.getModel();
        model.setRowCount(0);
        
            for(Encounter e: system.getEncounterlist().getHospitalEncounterList()){
                 if (e.getPatientUsername().equals(pat.getUsername())){ 
                        Object[] row = new Object[6];
                        row[0] = e;
                        row[1] = e.getDoctorUserName();
                        row[2] = e.getPatientUsername(); 
                        row[3] = e.getBP();
                        row[4] = e.getTemperature();
                        row[5] = e.getStatus();

                        model.addRow(row);
                 }
            }
    }    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnEncounter;
    private javax.swing.JButton btnEncounterView;
    private javax.swing.JButton btnHome;
    private javax.swing.JButton btnLogOut;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JSplitPane jSplitPane1;
    private javax.swing.JLabel lblDoctorEncounterUsername;
    private javax.swing.JLabel lblEncounterBP;
    private javax.swing.JLabel lblEncounterDate;
    private javax.swing.JLabel lblEncounterHospital;
    private javax.swing.JLabel lblEncounterMedicine;
    private javax.swing.JLabel lblEncounterMedicineQuantity;
    private javax.swing.JLabel lblEncounterNo;
    private javax.swing.JLabel lblEncounterPatientUsername;
    private javax.swing.JLabel lblEncounterTemperature;
    private javax.swing.JLabel lblRole;
    private javax.swing.JLabel lblTitleEncounter;
    private javax.swing.JLabel lblTitleHospital;
    private javax.swing.JPanel panelControl;
    private javax.swing.JPanel panelEncounter;
    private javax.swing.JPanel panelHome;
    private javax.swing.JPanel panelWork;
    private javax.swing.JTable tableEncounter;
    private javax.swing.JTextField txtEncounterBP;
    private javax.swing.JTextField txtEncounterDate;
    private javax.swing.JTextField txtEncounterDoctorUsername;
    private javax.swing.JTextField txtEncounterHospital;
    private javax.swing.JTextField txtEncounterMedicine;
    private javax.swing.JTextField txtEncounterNo;
    private javax.swing.JTextField txtEncounterPatientUsername;
    private javax.swing.JTextField txtEncounterTemperature;
    private javax.swing.JTextField txtMedicineQuantity;
    // End of variables declaration//GEN-END:variables
}

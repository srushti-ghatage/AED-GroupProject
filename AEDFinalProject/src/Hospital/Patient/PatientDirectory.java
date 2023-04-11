/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Hospital.Patient;

import java.util.ArrayList;

/**
 *
 * @author SrushtiGhatage
 */
public class PatientDirectory {
    private ArrayList<Patient> patientList;
    
    public PatientDirectory() {
        patientList = new ArrayList<Patient>();   
    }
     public ArrayList<Patient> getPatientList() {
        return patientList;
    }

    public void setPatientList(ArrayList<Patient> patientList) {
        this.patientList = patientList;
    }
    public Patient addPatient(){
        Patient newpatient = new Patient();
        patientList.add(newpatient);
        return newpatient;
    }
}

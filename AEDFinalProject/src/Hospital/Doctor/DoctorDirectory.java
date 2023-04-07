/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Hospital.Doctor;

import java.util.ArrayList;

/**
 *
 * @author SrushtiGhatage
 */
public class DoctorDirectory {
      
    private ArrayList<Doctor> doctorList;
    
    public DoctorDirectory() {
        doctorList = new ArrayList<Doctor>();   
    }

    public ArrayList<Doctor> getDoctorList() {
        return doctorList;
    }

    public void setDoctorList(ArrayList<Doctor> doctorList) {
        this.doctorList = doctorList;
    }
    
    public Doctor addDoctor(){
        Doctor newdoctor = new Doctor();
        doctorList.add(newdoctor);
        return newdoctor;
    }
    
    public void deleteDoctor(Doctor m){
        doctorList.remove(m);
    }
}

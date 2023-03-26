/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Student;

import java.util.ArrayList;
import Courses.Course;
/**
 *
 * @author SrushtiGhatage
 */
public class Student {

    public String getStudentname() {
        return studentname;
    }

    public void setStudentname(String studentname) {
        this.studentname = studentname;
    }

    public int getStudentPersonId() {
        return studentPersonId;
    }

    public void setStudentPersonId(int studentPersonId) {
        this.studentPersonId = studentPersonId;
    }

    public String getStudentemail() {
        return studentemail;
    }

    public void setStudentemail(String studentemail) {
        this.studentemail = studentemail;
    }

    public int getCreditsEarned() {
        return creditsEarned;
    }

    public void setCreditsEarned(int creditsEarned) {
        this.creditsEarned = creditsEarned;
    }
    public ArrayList<Course> getCoursesTaken() {
        return coursesTaken;
    }

    public void setCoursesTaken(ArrayList<Course> coursesTaken) {
        this.coursesTaken = coursesTaken;
    }
    public boolean isIsApprovedForGraduation() {
        return isApprovedForGraduation;
    }

    public void setIsApprovedForGraduation(boolean isApprovedForGraduation) {
        this.isApprovedForGraduation = isApprovedForGraduation;
    }
    
    public boolean isIsReadyToGraduate() {
        return isReadyToGraduate;
    }

    public void setIsReadyToGraduate(boolean isReadyToGraduate) {
        this.isReadyToGraduate = isReadyToGraduate;
    }
     public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    String studentname;
    int studentPersonId;
    String studentemail;
    int creditsEarned;
    ArrayList<Course> coursesTaken;   
    boolean isApprovedForGraduation; 
    boolean isReadyToGraduate;
    String userName;
}

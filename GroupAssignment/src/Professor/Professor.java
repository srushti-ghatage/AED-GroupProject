/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Professor;

import java.util.ArrayList;
import Courses.Course;
/**
 *
 * @author SrushtiGhatage
 */
public class Professor {

    public ArrayList<Course> getProfessorCourses() {
        return professorCourses;
    }

    public void setProfessorCourses(ArrayList<Course> professorCourses) {
        this.professorCourses = professorCourses;
    }

    public String getProfessorName() {
        return professorName;
    }

    public void setProfessorName(String professorName) {
        this.professorName = professorName;
    }

    public int getReputationIndex() {
        return reputationIndex;
    }

    public void setReputationIndex(int reputationIndex) {
        this.reputationIndex = reputationIndex;
    }
    
    public int getProfessorId() {
        return professorId;
    }

    public void setProfessorId(int professorId) {
        this.professorId = professorId;
    }
    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }


    public Professor() {
        
    }
     ArrayList <Course> professorCourses;
     String professorName;
     int reputationIndex;
     int professorId;
     String userName;

    
     
 
}

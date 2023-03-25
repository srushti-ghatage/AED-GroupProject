/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Professor;

import java.util.ArrayList;
import Courses.Course;
/**
 *
 * @author 18573
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

    public Professor() {
        
    }
     ArrayList <Course> professorCourses;
     String professorName;
     int reputationIndex;
     int professorId;

    public int getProfessorId() {
        return professorId;
    }

    public void setProfessorId(int professorId) {
        this.professorId = professorId;
    }
     
    
}

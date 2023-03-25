/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Professor;

import Courses.Course;
import java.util.ArrayList;

/**
 *
 * @author 18573
 */
public class ProfessorDirectory {

    public ProfessorDirectory() {
        this.professorList = new ArrayList<Professor>();
    }

    public ArrayList<Professor> getProfessorList() {
        return professorList;
    }

    public void setProfessorList(ArrayList<Professor> professorList) {
        this.professorList = professorList;
    }
    
    ArrayList<Professor> professorList;
    
    public Professor createProfessor(ArrayList <Course> professorCourses, String professorName, int reputationIndex)
    {
        Professor p = new Professor();
        p.setProfessorCourses(professorCourses);
        p.setProfessorName(professorName);
        p.setReputationIndex(reputationIndex);
        this.professorList.add(p);
        return p;
    }
    
    public Professor findProfessorByID(int id){
       for(Professor p:this.professorList)
       {
           if(p.getProfessorId()== id)
           {
               return p;
           }
       }
        return null;
        
    }
}
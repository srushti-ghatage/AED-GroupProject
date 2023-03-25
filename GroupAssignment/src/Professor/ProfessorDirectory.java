/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Professor;

import Courses.Course;
import java.util.ArrayList;

/**
 *
 * @author SrushtiGhatage
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
    public void addProf(Professor p)
    {
       this.professorList.add(p);
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
     public Professor findProfessorByUsername(String uname){
         System.out.println("findProfessorByUsername"+uname);
       for(Professor p:this.professorList)
       {
           System.out.println("findProfessorByUsername for"+p.getUserName());
           if(p.getUserName().equalsIgnoreCase(uname))
           {
               System.out.println("found"+p.getUserName());
               return p;
           }
       }
        return null;
        
    }
      public Professor findProfessorByCourse(Course course){
       for(Professor p:this.professorList)
       {
           for(Course c: p.getProfessorCourses()){
         
           
           if(c.getCourseNumber()== course.getCourseNumber())
           {
               return p;
           }
       }
       }
        return null;
        
    }
  
}
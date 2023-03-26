/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Student;

import Courses.Course;
import Professor.Professor;
import java.util.ArrayList;

/**
 *
 * @author SrushtiGhatage
 */
public class StudentDirectory {

    public StudentDirectory() {
        this.studentList = new ArrayList<Student>();
    }

    public ArrayList<Student> getStudentList() {
        return studentList;
    }

    public void setStudentList(ArrayList<Student> studentList) {
        this.studentList = studentList;
    }
    
    ArrayList<Student> studentList;
    
    
    public void addStud(Student s)
    {
       this.studentList.add(s);
    }
    public Student findStudentByID(int id){
       for(Student s:this.studentList)
       {
           if(s.getStudentPersonId()== id)
           {
               return s;
           }
       }
        return null;
        
    }
        public Student findStudentByUsername(String uname){
       for(Student s:this.studentList)
       {
           if(s.getUserName().equalsIgnoreCase(uname));
           {
               return s;
           }
       }
        return null;
        
    }
}

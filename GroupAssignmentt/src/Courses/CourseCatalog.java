/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Courses;

import java.util.ArrayList;

/**
 *
 * @author megha
 */
public class CourseCatalog {
    
    ArrayList<Course> courseList;
    
    public CourseCatalog() {
        this.courseList = new ArrayList<Course>();
    }

    public ArrayList<Course> getCourseList() {
        return courseList;
    }

    public void setCourseList(ArrayList<Course> courseList) {
        this.courseList = courseList;
    }
  public void addCourse(Course c)
    {
       this.courseList.add(c);
    }
  
  public Course findCourseByName(String name){
      for(Course c:this.courseList)
       {
           if(c.getCourseName()== name)
           {
               return c;
           }
       }
        return null;
  }
    
}

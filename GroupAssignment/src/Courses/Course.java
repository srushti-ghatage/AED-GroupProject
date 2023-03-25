/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Courses;

import Professor.Professor;
import java.util.ArrayList;

/**
 *
 * @author megha
 */
public class Course {

    public Course() {
    }

    public String getCourseRegion() {
        return courseRegion;
    }

    public void setCourseRegion(String courseRegion) {
        this.courseRegion = courseRegion;
    }

    public String getCourseLanguage() {
        return courseLanguage;
    }

    public void setCourseLanguage(String courseLanguage) {
        this.courseLanguage = courseLanguage;
    }

    public String getCourseTopic() {
        return courseTopic;
    }

    public void setCourseTopic(String courseTopic) {
        this.courseTopic = courseTopic;
    }

    public String getCourseNumber() {
        return courseNumber;
    }

    public void setCourseNumber(String courseNumber) {
        this.courseNumber = courseNumber;
    }

    public String getCourseNumberOfCredits() {
        return courseNumberOfCredits;
    }

    public void setCourseNumberOfCredits(String courseNumberOfCredits) {
        this.courseNumberOfCredits = courseNumberOfCredits;
    }

    public String getCoursePrice() {
        return coursePrice;
    }

    public void setCoursePrice(String coursePrice) {
        this.coursePrice = coursePrice;
    }
     public ArrayList<Course> getCourses() {
        return courses;
    }

    public void setCourses(ArrayList<Course> courses) {
        this.courses = courses;
    }


      public String getCourseName() {
        return courseName;
    }

    public void setCourseName(String courseName) {
        this.courseName = courseName;
    }
       public String getCourseTerm() {
        return courseTerm;
    }

    public void setCourseTerm(String courseTerm) {
        this.courseTerm = courseTerm;
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
     public String getCourseSchedule() {
        return courseSchedule;
    }

    public void setCourseSchedule(String courseSchedule) {
        this.courseSchedule = courseSchedule;
    }
      public String getCourseLocation() {
        return courseLocation;
    }

    public void setCourseLocation(String courseLocation) {
        this.courseLocation = courseLocation;
    }
    
    public Course (String courseRegion, String courseLanguage, String courseTopic, String courseNumber, String courseNumberOfCredits, String coursePrice) {
        this.courseRegion = courseRegion;
        this.courseLanguage = courseLanguage;
        this.courseTopic = courseTopic;
        this.courseNumber = courseNumber;
        this.courseNumberOfCredits = courseNumberOfCredits;
        this.coursePrice = coursePrice;
    }
    String courseRegion;
    String courseLanguage;
    String courseTopic;
    String courseNumber;
    String courseNumberOfCredits;
    String coursePrice;
    ArrayList <Course> courses;
    String professorName;
    String courseName;
    String courseTerm;
    int reputationIndex;
    String courseSchedule;
    String courseLocation;
    
}
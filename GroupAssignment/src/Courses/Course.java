/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Courses;

/**
 *
 * @author 18573
 */
public class Course {

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
}
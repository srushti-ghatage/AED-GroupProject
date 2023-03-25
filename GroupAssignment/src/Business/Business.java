/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Business;

import Courses.CourseCatalog;
import Professor.ProfessorDirectory;
import Student.StudentDirectory;

/**
 *
 * @author 18573
 */
public class Business {

    public Business() {
        this.courseDirectory = new CourseCatalog();
        this.professorDirectory = new ProfessorDirectory();
        this.studentDirectory = new StudentDirectory();
        this.userAccountDirectory = new UserAccountDirectory();
        UserAccount user = this.userAccountDirectory.createUserAccount("admin","admin","admin");
        System.out.println(user.getUsername());
    }

    public CourseCatalog getCourseDirectory() {
        return courseDirectory;
    }

    public void setCourseDirectory(CourseCatalog courseDirectory) {
        this.courseDirectory = courseDirectory;
    }

    public ProfessorDirectory getProfessorDirectory() {
        return professorDirectory;
    }

    public void setProfessorDirectory(ProfessorDirectory professorDirectory) {
        this.professorDirectory = professorDirectory;
    }

    public StudentDirectory getStudentDirectory() {
        return studentDirectory;
    }

    public void setStudentDirectory(StudentDirectory studentDirectory) {
        this.studentDirectory = studentDirectory;
    }
    public static Business getBusinessInstance(){
        return new Business();
    }

    public UserAccountDirectory getUserAccountDirectory() {
        return userAccountDirectory;
    }
    private CourseCatalog courseDirectory;
    private ProfessorDirectory professorDirectory;
    private StudentDirectory studentDirectory;
    private UserAccountDirectory userAccountDirectory;
   
    
}

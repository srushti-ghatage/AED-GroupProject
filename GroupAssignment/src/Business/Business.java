/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Business;

import CertificationAuthority.CertificationAuthorityDirectory;
import Courses.CourseCatalog;
import Professor.ProfessorDirectory;
import Student.StudentDirectory;

/**
 *
 * @author SrushtiGhatage
 */
public class Business {

    public Business() {
        this.courseDirectory = new CourseCatalog();
        this.professorDirectory = new ProfessorDirectory();
        this.studentDirectory = new StudentDirectory();
        this.userAccountDirectory = new UserAccountDirectory();
        this.caDirectory = new CertificationAuthorityDirectory();
        UserAccount user = this.userAccountDirectory.createUserAccount("admin","admin","admin");
         UserAccount user2 = this.userAccountDirectory.createUserAccount("P1","P1","professor");
         UserAccount user3 = this.userAccountDirectory.createUserAccount("S1","S1","student");
         UserAccount user4 = this.userAccountDirectory.createUserAccount("CA1","CA1","certificationauthority");
        System.out.println("Business constructor called");
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
     public CertificationAuthorityDirectory getCaDirectory() {
        return caDirectory;
    }

    public void setCaDirectory(CertificationAuthorityDirectory caDirectory) {
        this.caDirectory = caDirectory;
    }
    private CourseCatalog courseDirectory;
    private ProfessorDirectory professorDirectory;
    private StudentDirectory studentDirectory;
    private UserAccountDirectory userAccountDirectory;
   
    private CertificationAuthorityDirectory caDirectory;

   
}

//business

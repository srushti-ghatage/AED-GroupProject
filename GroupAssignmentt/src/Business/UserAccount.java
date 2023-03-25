/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Business;

import UI.Admin.AdminJFrame;
import UI.CertificationAuthority.CertificationAuthorityJFrame;
import UI.ProfessorActions.ProfessorJFrame;
import UI.StudentActions.StudentJFrame;
import java.awt.Frame;
import javax.swing.JFrame;

/**
 *
 * @author 18573
 */
public class UserAccount {

    public UserAccount(String accountId, String username, String password, String role) {
        this.accountId = accountId;
        this.username = username;
        this.password = password;
        this.role = role;
    }

    public static int getCount() {
        return count;
    }

    public static void setCount(int count) {
        UserAccount.count = count;
    }

    public String getAccountId() {
        return accountId;
    }

    public void setAccountId(String accountId) {
        this.accountId = accountId;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getRole() {
        return role;
    }

    public void setRole(String role) {
        this.role = role;
    }
    private static int count = 0;
    private String accountId;
    private String username;
    private String password;
    
    private String role;
    
    public UserAccount(){
        this.accountId = "ACC" + count++;
        this.username = username;
        this.password= password;
        this.role= role;
        
    }
    public JFrame getWorkArea(String role, Business business, UserAccount useraccount){
        if(role.equals("admin")){
            System.out.println("LOL");
            return new AdminJFrame(business,useraccount);
        }
        if(role.equals("student")){
            return new StudentJFrame(business,useraccount);
        }
        if(role.equals("professor")){
            return new ProfessorJFrame(business,useraccount);
        }
         if(role.equals("certificationauthority")){
            return new CertificationAuthorityJFrame(business,useraccount);
        }
        return null;
    }
}

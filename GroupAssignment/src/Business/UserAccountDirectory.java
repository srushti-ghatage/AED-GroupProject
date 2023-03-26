/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Business;

import java.util.ArrayList;

/**
 *
 * @author SrushtiGhatage
 */
public class UserAccountDirectory {
    ArrayList <UserAccount> userAccountList;
   
    public UserAccountDirectory(){
       this.userAccountList= new ArrayList<UserAccount>();

    }  
    public UserAccount createUserAccount(String username, String password, String role){
        UserAccount user= new UserAccount("",username, password, role);
       
        userAccountList.add(user);
        for(UserAccount u: userAccountList){
            System.out.println("createUserAccountADDED"+u.getUsername());
                System.out.println("createUserAccountADDED"+u.getRole());    System.out.println("createUserAccountADDED"+u.getPassword());
                
        }
        return user;
    }
   
    public UserAccount findById(String id){
        for(UserAccount u: this.userAccountList){
               if(u.getAccountId().equals(id)){
                   return u;
               }
        }
        return null;
    }
   
    public UserAccount getUserAccount(String username, String password, String role){
        for(UserAccount u: this.userAccountList){
            if(u.getUsername().equals(username) && u.getPassword().equals(password) && u.getRole().equals(role)){
                   return u;
               }
        }
        return null;
    }
   
    public Boolean accountExists(String username, String password, String role){
         System.out.println("fouaccountExistsnd"+username);
             System.out.println("fouaccountExistsnd"+password);
                 System.out.println("fouaccountExistsnd"+role);
        for(UserAccount u: this.userAccountList){
                    System.out.println("inlist"+u.getUsername());
             System.out.println("inlist"+u.getPassword());
                         System.out.println("inlist"+u.getRole());
                 System.out.println("fouaccountExistsnd"+role);
            if(u.getUsername().equals(username) && u.getPassword().equals(password) && u.getRole().equals(role)){
                 
                   System.out.println("found"+u.getUsername());
                     return true;
               }
        }
        return false;

    }
}

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package System.Directories;

/**
 *
 * @author SrushtiGhatage
 */
public class DataValidation {
    
     public boolean lengthCheck(String val){
        if(val.length()<=0||val.length()>30){
            return false;
        }
        return true;
    }
}

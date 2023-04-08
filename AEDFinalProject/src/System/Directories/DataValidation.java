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
      public boolean numcheck(String val){
        try{
            int temp = Integer.parseInt(val);
            if(Integer.valueOf(val)<0){
                return false;
            }
        }catch(Exception err){
            return false;
        }
        return true;
    }
     
     public boolean phnocheck(String val){
        try{
            long temp = Long.parseLong(val);
        }catch(Exception err){
            return false;
        }
        
        if(val.length()!=10){
            return false;
        }
        return true;
    }
}

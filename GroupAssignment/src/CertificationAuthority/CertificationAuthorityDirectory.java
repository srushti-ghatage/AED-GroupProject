/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package CertificationAuthority;

import java.util.ArrayList;

/**
 *
 * @SrushtiGhatage
 */
public class CertificationAuthorityDirectory {

    public CertificationAuthorityDirectory() {
        this.caList = new ArrayList<CertificationAuthority>();
    }

    public ArrayList<CertificationAuthority> getCaList() {
        return caList;
    }

    public void setCaList(ArrayList<CertificationAuthority> caList) {
        this.caList = caList;
    }
    
    ArrayList<CertificationAuthority> caList;
    
    
      public void addCA(CertificationAuthority c)
    {
       this.caList.add(c);
    }
    
}

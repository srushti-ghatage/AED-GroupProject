/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Funding.FundManager;

import java.util.ArrayList;

/**
 *
 * @author SrushtiGhatage
 */
public class FundManagerDirectory {
      private ArrayList<FundManager> fundManagerList;

    public FundManagerDirectory() {
        fundManagerList = new ArrayList<FundManager>();
        
    }

    public ArrayList<FundManager> getFundManagerList() {
        return fundManagerList;
    }

    public void setFundManagerList(ArrayList<FundManager> fundManagerList) {
        this.fundManagerList = fundManagerList;
    }
}

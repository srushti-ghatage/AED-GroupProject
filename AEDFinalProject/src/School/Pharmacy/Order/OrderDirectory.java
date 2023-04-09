/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Pharmacy.Order;

import java.util.ArrayList;

/**
 *
 * @author megha
 */
public class OrderDirectory {
    
   private ArrayList<Order> orderList;

    public OrderDirectory() {
        orderList = new ArrayList<Order>();
        
    }

    public ArrayList<Order> getOrderList() {
        return orderList;
    }

   
    
}

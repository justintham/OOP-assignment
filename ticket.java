/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ASG;

/**
 *
 * @author user10
 */

import java.util.Date;
public class ticket {
   
    private String id;
   // private double price;
  
  
//    private Date dateCreated;
//
    public ticket() {
//        dateCreated=new Date();
    }

    public ticket(String id) {
        this.id = id;
        //this.price = price;
         //something count++
    }
    
    
    

    public String getId() {
        return id;
    }

//    public void setId(String id) {
//        this.id = id;
//    }

   
    
//
//    public double getPrice() {
//        return price;
//    }
//
//    public void setPrice(double price) {
//        this.price = price;
//    }

  

    


//    public Date getDateCreated() {
//        return dateCreated;
//    }
    
    //    public double getTotalPrice(){
//        return
//    
//    }

    @Override
    public String toString() {
        return "Information{" + "id=" + id  + '}';
    }
    
}

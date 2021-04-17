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
public class test {
    
    public static void main(String[] args){
            java.util.Date date =new java.util.Date();//#1   
            System.out.println(date.toString());//#1
            
       //ticket a1 = new ticket("123");
        
   
       
       
       
       //System.out.println(a1.id);
       //System.out.println(a1.price);            
             
//             adult ad1=new adult("456");//2
//             System.out.println(ad1.getDateCreated());//2
                
                
                 adult ad1=new adult("ad1","place1");
                 adult ad2=new adult("ad2","place2");
                 //adult ad3=new adult("ad3");
                 //adult ad4=new adult("ad4");
                 //adult ad5=new adult("ad5");
                 //System.out.println("Total Adult :"+adult.getAdultCount());
               //System.out.println(ad1.getTicketadultType());
//              System.out.println(ad1.getId());
                    
                 
                        child ch1=new child("ch1","childplace1");
                        child ch2=new child("ch2","childplace2");
                        child ch3=new child("ch3","childplace3");
                        //child ch4=new child("ch4");
                        //child ch5=new child("ch5");
                     //System.out.println(ch1.getId());    
               //System.out.println(ch1.getTicketchildType());
                        
                        
                        
                     
//                    System.out.println("");
//                    System.out.println("Total Adult :"+adult.getAdultCount());
//                    System.out.println("Adult per fees :"+ adult.getPriceAdult());
//                    System.out.println("Total Adult Price :"+adult.getAdultCount()*adult.getPriceAdult());
                    
                     
//                   
//                    System.out.println("");
//                    System.out.println("Total Child :"+child.getChildCount());
//                    System.out.println("Child per fees :"+ child.getPriceChild());
//                    System.out.println("Total Child Price :"+child.getChildCount()*child.getPriceChild());
                   
                
                    
           
                    
                    
                    
                 
                    
                    
                    
                    
                    
//                    ad1.display();
//                    System.out.println("");
//                    ch1.display();
//                    
//                    
//                     System.out.println("");
//                      System.out.println(ch1.getId());
//                    System.out.println(ad1.toString());
//                    System.out.println(ch1.toString());


                    ad1.display();
                    System.out.println(ad1.toString());
                    
                    ch1.display();
                    System.out.println(ch1.toString());
                  
                    System.out.println("");
                    System.out.println(adult.getAdultCount() + " Adult with " + child.getChildCount()+" Children.");
                    System.out.println("Total Price :" +(adult.getAdultCount()*adult.getPriceAdult()+child.getChildCount()*child.getPriceChild()));

    }
//    public static void m(Object x){
//        System.out.println(x.toString());
//    
//    
//    }
}

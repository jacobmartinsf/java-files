/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package inventorymanagement;

import java.util.Scanner;

/**
 *
 * @author jacobmartin
 */
public class InventoryManagement {

    /**
     * @param args the command line arguments
     */
    @SuppressWarnings("empty-statement")
    
    
    
    
    
    
    
    public static void main(String[] args) {
        
        
        // TODO code application logic here
   boolean flag = true;
    while (flag) {
       
        String [] items = {"notepad", "pen", "eraser", "stapler", 
              "pencil", "ruler", "binder", "jacket", "shirt", "handbook"};
          
          int [] quantity = {100, 500, 1000, 50, 1000, 50, 100, 25, 25, 1500};
          
             double [] price = {4, 0.5, 0.25, 2, 0.5, 1, 2.5, 30, 25, 15};
             
      Scanner input = new Scanner(System.in);
      
         System.out.println("Choose an option");
              
             String uI = input.next();
             
                switch (uI) {
                        
                    case "p":
                        int j;
                               for(int i = 0; i < items.length; i++) {
                                  // System.out.print(items[i] + " "); }
                               
                               for(int x = 0; x < quantity.length; x++) {
                               //    System.out.println(quantity[x] + " ");
                               //}
                               
                               for(j = 0; j < price.length; j++); {
                                   
                                    //System.out.print(price[j] + " "); 
                  //  }
                               
                               System.out.printf("%d. %s \t\t$%.2f\n", 
                                       i + 1, items[i], price[i]);
                               }
                               }
                               
                               }
                               break;
                   /* case "c": 
                               for(int x = 0; x <quantity.length; x++); 
                            
                                 // if(quantity[x] < 5)
                                         //System.out.print();
                                   
                                //  else if(item[x] > 5) {
                        System.out.println("There are no shortage in items"); 
                               
                }
                     */   
                   /* I don't know why the program is not finding i when i'm
                        declaring it right there.
                        */
                    case "v":
                        
                             for(int i = 0; (i < quantity.length) && 
                               (i < price.length); i++); {
                        
                               
                               System.out.println("quantity[" + i + "]=" + 
                                       quantity[i]);
                               System.out.println("price[" + i + "]=" + 
                                       price[i]);
                               
                               
                        
                              for(int i = 0; (i < quantity.length) && 
                               (i < price.length); i++);
                               {
                               quantity[i]*=price[i];
                               }
                               for(int i = 0; i < quantity.length; i++);
                               {
                               System.out.println("quantity[" + i + "]=" 
                               + quantity[i]);
                         
                               }
                               }
                               
                        break;
                    case "e":
                               flag = false;
                              break;
                        
                    default: System.out.println("Error Message");
                        
                        
                
          }
                  
           
    }
    
                               }
                }

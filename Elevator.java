/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package elevator;

/**
 *
 * @author jacobmartin
 */
//Scanner so we can get input from the user
import java.util.Scanner;
public class Elevator {

    /**
     * @param args the command line arguments
     */
 
    public static void main(String[] args) {
        // TODO code application logic here
        //Implementing scanner into the system
        Scanner sc = new Scanner(System.in);
        //asking the user for input
    
            System.out.println("What floor are you at?");
            //storing the input into a variable
               int currentFloor = sc.nextInt();  
               
    //To make sure they only input up to 9 floors, gotta use loops
    
               if(currentFloor > 9)  {
                   System.out.println("Floor does not exist");
               
                 }
                 else
                 {  
                    System.out.println("Closest Elevator is Approaching...");
                 }
             
      //Finding a way to store their input without using arrays
                  
       int e1 = 1;
       int e2 = 2;
       int e3 = 5;
       int e4 = 9;
      
      
     /*trying to use logic I used minDifference to find which elevator is the 
       closest*/
       
    
       int elevatorIndex = 0;
       int minDifference = Math.abs(currentFloor - e1);
       int minDifference2 = Math.abs(currentFloor - e2);
       int minDifference3 = Math.abs(currentFloor - e3);
       int minDifference4 = Math.abs(currentFloor - e4);
          if(minDifference <= 2){
              
          
               
          }
    
          else if(minDifference2 <= 2) {
              
          }
            
             else if(minDifference3 <= 2) {
                  
              }
              
              else if(minDifference4 <= 2) {
                     
                 }
         
          for( int i = 1; i > 9; i++)
           
            
            
           {
               int mindiff = Math.abs(currentFloor - i);
               elevatorIndex = i;
             
           
        
         for(int j = 0; j < mindiff; j++)
         {
             System.out.println(elevatorIndex - j);
             
        
                         
                     }
         
   /*With the prompt given, I don't think it's possible to complete the task
       provided. We would need to use an array so that elevatorIndex can be
           manipulated and that way can be used to print each floor as we
            use a for loop for another variable that increments but has to be
              less than minDiff*/
          
       //Getting more input from the user 
     System.out.println("Please enter your destination floor");
          
       
       
       
       
       
     
       
            
    }   
    }
}

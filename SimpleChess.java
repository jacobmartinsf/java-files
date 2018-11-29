/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package simplechess;
import java.util.Scanner;
/**
 *
 * @author jacobmartin
 */
public class SimpleChess {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        boolean flag = true;
    while (flag) {
        // TODO code application logic here
    // Using a scanner for userinput
        Scanner input = new Scanner(System.in);
            int [][] grid = new int[8][8];
             for(int i =0; i < 8; i++) {
                for (int j=0; j < 8 ;j++) {
                  grid [i][j] = (i * grid[0].length) + j + 1;
                   
             }
             }
             //Asking the user what color they want to be
                System.out.println("Choose your color: white(1) or black(2)");
     
                    String uI = input.nextLine();
                   
                       
                       switch (uI) {
                           case "1": 
                               
                                System.out.println("You've chosen white!");
                       break;
                          
                           case "2":
                               
                                    System.out.println("You've chosen black!");
                               break;
                               
                                default: System.out.println("Error Message");
                       }
           //  Splitting up the row and column so the user can manipulate    
                 /* System.out.println("Make your first move entering row first);
                     int uII = input.nextInt();
                        grid[i] = uII;
                           System.out.println("Enter the column")
                              int uII2 = input.nextInt();
                                   grid[j] = uII2;         */
          // Checking if the square is available
                       boolean empty;  
                       if(empty) {
                            System.out.println("The move you are attempting"
                                    + "is possible");
                       }
                       else
                       {  System.out.println("Move cannot be completed, "
                                   + "please pick a different destination");
                                   }     
                       
            //Switching their colors
              
                System.out.println("If you are white, make a move for black");
                System.out.println("If you are black, make a move for white");
              //Letting them decide if they still want to play  
                     System.out.println("Do you want to continue playing?:  "
                             + "Yes(1) or No(2)");
                        String uIII = input.nextLine();
                           
                            switch (uIII) {
                                case "1":
                                            System.out.println("You are now"
                                                    + "playing for black")
                                                    break;
                                case "2":
                                              flag = false;
                              break;
                                  default: System.out.println("Error Message");
                            }
                           
                        
                     
                        
                                    
                              
                        
          
             
             
            
    }
  }   
}

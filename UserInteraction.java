/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package userinteraction;
import java.util.Scanner;
/**
 *
 * @author jacobmartin
 */
public class UserInteraction {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc= new Scanner (System.in);
        int age; 
        System.out.println("Enter Your Age: ");
        age = sc. nextInt();
        System.out.println(age);
        
     String name;
        System.out.println("Enter Your Name: ");
        name = sc. nextLine();
        System.out.println("Enter Your Second Name: ");
     String name2;
        name2 = sc. nextLine();
        System.out.println(name+ " " +name2);
        
        System.out.println("Enter Your Weight");
        double weight= sc. nextDouble();
        System.out.println(age*weight + name + weight);
        
        
                
                
               
        // TODO code application logic here
    }
    
}

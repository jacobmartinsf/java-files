package quadraticequationsolver;
import java.util.Scanner;


/**
 *
 * @author jacobmartin
 */
public class QuadraticEquationSolver {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
   // Using exp to display the exponent as wanted
        char exp = 178;
   
      // Implementing scanner so we can get input
        Scanner sc = new Scanner (System.in);
        int a;
          System.out.println("Enter your input for a: ");
        a = sc. nextInt();
          System.out.println('a' + " is " + a);
      
          int b;
            System.out.println("Enter your input for b: ");
        b = sc. nextInt();
            System.out.println('b' + " is " + b);
         
            int c;
               System.out.println("Enter your input for c: ");
           c = sc. nextInt();
               System.out.println('c' + " is " + c);
         // After receiving input now we can solve!!   
        // Displaying the equation for the user
        System.out.println("ax"+ exp + "+ bx + c");
        // Assigning memory for x and y to use later for two equations
  // Using double now since I want the solution to display in decimal form
        
        double d = b*b -4 * a * c;
if (d < 0){
   System.out.println("Discriminant < 0, no real solutions" );
   return;
}
double x1 = (-b  -Math.sqrt(d))/(2*a);
double x2 = (-b +Math.sqrt(d))/(2*a);
System.out.format("The roots of your quadratic formula are %5.3f and %5.3f\n"
        ,x1,x2);
// By: Jacob Martin
    }
    
}

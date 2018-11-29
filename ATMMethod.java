/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package atmmethod;

import java.util.Scanner;

/**
 *
 * @author jacobmartin
 */
public class ATMMethod {

    
    public static void BankInterface() {
         System.out.println("Welcome to Gator Bank!");
            System.out.println("Checkings: ");
             System.out.println("Savings: ");
               System.out.println("| [1]  Check Balance   |");
                System.out.println("| [2]  Deposit      |");
                 System.out.println("| [3]  Withdraw         |");
                  System.out.println("========================");
    }
    
    public static void checkingbalance() {
        System.out.println("Checking Balance: $500");
    }
    
    public static void savingbalance() {
        System.out.println("Savings Balance : $1000");
    }
    
    public static void deposit() {
        System.out.println("Which account "
                    + "would you like the deposit to go to?");
            System.out.println("Checking (Press 1)\n" + "Savings(Press 2)\n");
            
    }
    
        
    
    
    
    
    
    public static void main(String[] args) {
        // TODO code application logic here
    Scanner sc = new Scanner(System.in);
        // TODO code application logic here
        
        int cb = 500;
        int s = 1000;
          BankInterface();
        
        
        
           //Ask user to choose an action whether they 
                     //want to check their balance, deposit, or withdraw.
        System.out.println("Select an action:");
        System.out.println("Check Balance (Press 1)\n" + "Deposit(Press 2)\n"
                + "Withdrawal(Press 3)\n");
        int user = sc.nextInt();
           
        int selection = sc.nextInt();  
         if (user == 1) {
switch (selection){
    case 1:
        checkingbalance();
        break;
    case 2:
        savingbalance();
        break;
  
}
 } else if (user == 2) {

     System.out.println("How much money are you willing to deposit?");
    int selection1 = sc.nextInt();
switch (selection1){
    case 1:
        double deposit = sc.nextDouble();
           deposit();
            int account = sc.nextInt();
            if (account == 1) {
                System.out.println("New Checking Balance = $" + 
                        (500 + deposit));
            } else { System.out.println("New Savings Balance = $" 
                    + (1000 + deposit));
        break;
       
           
            } 
}
 } else if (user == 3) {
     System.out.println("How much money are you willing to withdraw?");
            //user input of withdrawal amount
     int selection2 = sc.nextInt();
 switch (selection2){
    
     case 1: 
         double withdraw = sc.nextDouble();
         System.out.println("Which account would you "
                    + "like to withdraw from?");
            System.out.println("Checking (Press 1)\n" + "Savings(Press 2)\n");
            int account = sc.nextInt();

            if (account == 1) {
                if (withdraw > 450) {
                    System.out.println("You will exceed you "
                            + "minimum amount for this account."
                            + "Please start over and choose a "
                            + "different withdrawal amount.");
                } else {
                    System.out.println("New Checking Balance = $" 
                            + (500 - withdraw));
                }
            }
            if (account == 2) {
                if (withdraw > 900) {
                    System.out.println("You will exceed you "
                            + "minimum amount for this account."
                            + "Please start over and " +
                           
                            "choose a different withdrawal amount.");
                } else {
                    System.out.println("New Savings Balance = $" 
                            + (1000 - withdraw));
                }

            }

        } 
 } else {
            System.out.println("Invalid input please "
                    + "start over and choose a valid input.");
        }
    }
}
         
         
         
         
         
         
 



       
    
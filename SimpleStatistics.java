/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package simplestatistics;
import java.util.Scanner;
import java.io.*;
/**
 *
 * @author jacobmartin
 */
public class SimpleStatistics {
// making a method in order to get the users input
   public static double[] getUserInput()
{
            double [] array;
                Scanner input = new Scanner(System.in);
                            System.out.println("Enter the how many numbers:");
                int num = input.nextInt();
                    array = new double[num];
                        if (num < 0){
                 
          throw new ArithmeticException("value cannot be less than one");
}

                try {
                        for(int i=0; i < num ;i++){
                            System.out.println("Enter number:");
                                double userfinalinput = input.nextDouble();
                                    array [i] = userfinalinput;
                                                                        }
  
}
                        catch(ArithmeticException ex){
          System.out.println("Exception:the value"+"cannot be less than one");
}
                        System.out.println("Execution continues...");
                                return array;
}
   // making method for the arithmeticmean 
   public static double arithmeticMean(double []array)
{
                double mean = 0;
                        for(int i=0; i < array.length;i++){
                            mean += array[i];
}
                    mean = mean / array.length;

                if (mean < 0){
            throw new ArithmeticException("value cannot be negative number");
  
   }
                try {
                        for(int i=0; i < array.length;i++){
                                mean += array[i];
  
}
                        mean= mean/ array.length;
                System.out.println("the arithmetic mean value is"+mean);
   }
  
                    catch(ArithmeticException ex){
     System.out.println("Exception:the mean value"+"cannot be negative number");
}
                System.out.println("Execution continues...");
                
                        return mean;
      
   }
   
           public static double geometricMean (double[]array)
{
                            double geo_mean = 1;
                                for(int i=0; i< array.length;i++){
                                geo_mean *= array[i];
  
}
          try { 
              for(int i=0; i< array.length;i++)   
                   
                                geo_mean *= array[i];
            geo_mean = Math.pow(geo_mean,1/array.length);   
                    System.out.println("the geometric mean value is"+geo_mean);
}
           catch(ArithmeticException ex) {
     System.out.println("Exception:the mean value"+"cannot be negative number");
                        return geo_mean;
                   }
}
    
          public static double[] minAndmax(double[] nums) {      
             Scanner sc = new Scanner(System.in);
        double min = nums[0];
        
              for (int i = 0; i < nums.length; i++) {
                
            if (min > nums[i]) {
                min = nums[i];
            }
            double max = nums[0];
            if (max < nums[i]) {
                max = nums[i];
                
            }
          
        }
       return null;
                   
    }
           
             public static void main(String[] args) {
                    getUserInput();
                       System.out.println
                               ("Press 1 for arithmeticMean"
                               + "         Press 2 for geometricMean"
                               + "         Press 3 for minAndMax"
                       + "                 Press 4 for scaleup"
                                  + "        Press 5 for scaledown");
                  Scanner sc= new Scanner(System.in);
                   switch(sc) {   
                       case 1: arithmeticMean(double[] array);
                           
                       case 2: geometricMean();
                           
     // Continuing for Files
           Scanner input = new Scanner(System.in);

        System.out.println("Opening file... ");
        System.out.println("Obtaining contents in file... ");
        System.out.println();

        // initiate inputFile
        File inputFile = new File("SimpleStatisticsFile.txt");

        // obtain file information by calling getInput method
        System.out.println("FILE NAME: " + args[0]);
        System.out.println("LOCATION: " + args[1]);
        getInput(inputFile);
        System.out.println();
                               
                           
                   } }

  
    public static void scaleUp(double[] nums, int factor) {
       

        for (int i = 0; i < nums.length; i++) {
            nums[i] = (nums[i]) * factor;
            System.out.print("[" + nums[i] + "] ");
        }
    } // end scaleUp method

        // continuing for files
                   }  
// I don't know why it won't recognize as a class
    public static void getInput(String inputFile) {
       

      
        ArrayList<Integer> list = new ArrayList<Integer>();
        BufferedReader reader = null;

        try {
            reader = new BufferedReader(new FileReader(inputFile));
            String text = null;

            while ((text = reader.readLine()) != null) {
                list.add(Integer.parseInt(text));
            }
        } 
        catch (FileNotFoundException e) {
            e.printStackTrace();
        } 
  

        finally {
            try {
                if (reader != null) {
                    reader.close();
                }
            } 
            catch (IOException e) {
            }
        }

public static void writeOutput(String outputFile, double[] numsScaledup) {
    
        
    }
    
}

//Travis Smith
//CSE2
//hw06 program 2 - RunFactorial.java
//Use a while loop to tell the user the factorial of a number between 9 and 16 inclusive
//
import java.util.Scanner;

public class RunFactorial{
    public static void main( String[]args ){
        
        //import Scanner
        Scanner myScanner;
        myScanner = new Scanner( System.in );
        
        //Prompts user to enter an integer between 9 and 16 inclusive
        System.out.print("Please enter an integer that is between 9 and 16: ");
        
        //Defines variables
        int counter=0;
        int factorial=1;
        
        //If the user enters an integer
        if(myScanner.hasNextInt()){
            int input=myScanner.nextInt();
            
            //User will have to re enter the integer until the input is between 9 and 16
            while(input<9 || input>16){
                System.out.println("Try again. Int must be between 9 and 16 inclusive:");
                myScanner.hasNextInt();
                input=myScanner.nextInt();
            }
            //Once the user enters a correct input, the factorial value will be calculated
            while(counter<input){
                factorial*=(input-counter);
                counter++;
            }
            //System prints factorial value
            System.out.println(input+"!= "+factorial); //13 14 15 AND 16 FACTORIAL ARE UNACCURATE
        }
        
        //If the user does not enter an integer, he will need to try again
        else{
            System.out.println("Try again. You must enter an int."); //PROGRAM ENDS AFTER ELSE STATEMENT. FIX.
        }
        
    }
}
//Travis Smith
//CSE2
//hw06 program 1 - GetIntegers.java
//Ask the user for five positive integers
//If an entry is not a positive integer tell the user and have them enter again
//Sum the numbers together and print the result
//
import java.util.Scanner;

public class GetIntegers{
    public static void main( String[]args ){
    
    //define Scanner
    Scanner myScanner;
    myScanner = new Scanner( System.in );
    
    //Prompts user to enter 5 non-negative integers
    System.out.println("Please enter 5 non-negative integers:");
    
    //Defines initial variables
    int input=0;
    int sum=0;
        
        //Loop statement
        for(int counter=0; counter<5; counter++){
            
            //If the user enters an Integer
            if(myScanner.hasNextInt()){
                input=myScanner.nextInt();
                //If the integer is non-negative, the entry will be added to the sum
                if(input>=0){
                    sum+=input;
                }
                //If the integer is negative, the user is prompted to enter another integer and the counter goes down by 1
                else{
                    System.out.println("Your integer must be non-negative, enter again");
                    counter=counter-1; 
                }
            continue;
            }
            
            //If the user does not enter an integer, the program will ask the user to enter an integer and counter decrements by 1
            if(!myScanner.hasNextInt()){
                System.out.println("That is not an integer, enter again");
                counter-=1;
                myScanner.next();
            }
            
        }
        //Program prints the sum
        System.out.println("Sum is "+sum);
    }
}
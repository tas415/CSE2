//Travis Smith
//cse002
//hw04 - WhichNumber.java
//User thinks of a number 1-10 inclusive, and the program guesses the number after a series of questions
//
import java.util.Scanner;
//
//define class
public class WhichNumber{
    public static void main (String[]args){
    
    //define scanner
    Scanner myScanner;
    myScanner = new Scanner (System.in);
    
    //define variables
    char even;
    
    char divisibleBy3;
    char divisibleBy4;
    char greaterThan1;
    char divisibleBy5;
    
    char divisibleBy3again;
    char greaterThan1again;
    char greaterThan6;
    char lessThan3;
    
    char guess;
    
    //Prompt
    System.out.println("Think of a number between 1 and 10 inclusive.");
    
    //first question
    System.out.print("Is the number even? ");
    even = myScanner.next(".").charAt(0);
    switch (even){
        // Number is even
        case'y':
        case'Y':
            System.out.print("Is it divisible by 3? ");
            divisibleBy3 = myScanner.next(".").charAt(0);
            switch (divisibleBy3){
                //number is even and divisible by 3
                case'y':
                case'Y':
                    System.out.print("Is your number 6? ");
                    guess = myScanner.next(".").charAt(0);
                    switch (guess){
                        case'y':
                        case'Y':
                            System.out.println("Yay!");
                            break;
                        case'n':
                        case'N':
                            System.out.println("Liar!");
                            break;
                    }
                    break;
                //number is even and NOT divisible by 3
                case'N':
                case'n':
                    System.out.print("Is the number divisible by 4? ");
                    divisibleBy4 = myScanner.next(".").charAt(0);
                    switch (divisibleBy4){
                        //number is even, NOT divisible by 3, but divisible by 4
                        case'y':
                        case'Y':
                            System.out.print("Is the number divided by 4 greater than 1? ");
                            greaterThan1 = myScanner.next(".").charAt(0);
                            switch (greaterThan1){
                                //number is even, NOT divisible by 3, divisible by 4, and greater than 1
                                case'y':
                                case'Y':
                                    System.out.print("Is your number 8? ");
                                    guess = myScanner.next(".").charAt(0);
                                    switch (guess){
                                        //outputs Yay! for getting the guess correct
                                        case'y':
                                        case'Y':
                                            System.out.println("Yay!");
                                            break;
                                        //outputs Liar! for getting the guess wrong
                                        case'n':
                                        case'N':
                                            System.out.println("Liar!");
                                            break;
                                    }
                                    break;
                                //number is even, NOT divisible by 3, divisible by 4, and NOT greater than 1
                                case'n':
                                case'N':
                                    //Program guesses the user's number
                                    System.out.print("Is your number 4? ");
                                    guess = myScanner.next(".").charAt(0);
                                    switch (guess){
                                        //outputs Yay! for getting the guess correct
                                        case'y':
                                        case'Y':
                                            System.out.println("Yay!");
                                            break;
                                        //outputs Liar! for getting the guess wrong
                                        case'n':
                                        case'N':
                                            System.out.println("Liar!");
                                            break;
                                    }
                                    break;           
                            }
                            break;
                        //number is even, NOT divisible by 3, NOT divisible by 4
                        case'n':
                        case'N':
                            System.out.print("Is it divisible by 5? ");
                            divisibleBy5 = myScanner.next(".").charAt(0);
                            switch (divisibleBy5){
                                //number is even, NOT divisible by 3, NOT divisible by 4, but is divisible by 5
                                case'y':
                                case'Y':
                                    System.out.print("Is your number 10? ");
                                    guess = myScanner.next(".").charAt(0);
                                    switch (guess){
                                        //outputs Yay! for getting the guess correct
                                        case'y':
                                        case'Y':
                                            System.out.println("Yay!");
                                            break;
                                        //outputs Liar! for getting the guess wrong
                                        case'n':
                                        case'N':
                                            System.out.println("Liar!");
                                            break;
                                    }
                                    break; 
                                //number is even, NOT divisible by 3, NOT divisible by 4, NOT divisible by 5
                                case'n':
                                case'N':
                                    System.out.print("Is your number 2? ");
                                    guess = myScanner.next(".").charAt(0);
                                    switch (guess){
                                        //outputs Yay! for getting the guess correct
                                        case'y':
                                        case'Y':
                                            System.out.println("Yay!");
                                            break;
                                        //outputs Liar! for getting the guess wrong
                                        case'n':
                                        case'N':
                                            System.out.println("Liar!");
                                            break;
                                    }
                                    break; 
                            }
                            break;
                    }
                    break;
            }
            break;
        //number is odd
        case 'n':
        case 'N':
            System.out.print("Is it divisible by 3? ");
            divisibleBy3again = myScanner.next(".").charAt(0);
            switch (divisibleBy3again){
                //number is odd and divisible by 3
                case'y':
                case'Y':
                    System.out.print("When divided by 3 is the result greater than 1? ");
                    greaterThan1again = myScanner.next(".").charAt(0);
                    switch (greaterThan1again){
                        //number is odd, divisible by 3 with a result greater than 1
                        case'y':
                        case'Y':
                            System.out.print("Is your number 9? ");
                            guess = myScanner.next(".").charAt(0);
                            switch (guess){
                                case'y':
                                case'Y':
                                    System.out.println("Yay!");
                                    break;
                                case'n':
                                case'N':
                                    System.out.println("Liar!");
                                    break;
                            }
                            break;
                        //number is odd, divisible by 3 with a result NOT greater than 1
                        case'n':
                        case'N':
                            System.out.print("Is your number 3? ");
                            guess = myScanner.next(".").charAt(0);
                            switch (guess){
                                case'y':
                                case'Y':
                                    System.out.println("Yay!");
                                    break;
                                case'n':
                                case'N':
                                    System.out.println("Liar!");
                                    break;
                            }
                            break;
                    }
                    break;
                //number is odd and NOT divisible by 3
                case'n':
                case'N':
                    System.out.print("Is it greater than 6? ");
                    greaterThan6 = myScanner.next(".").charAt(0);
                    switch(greaterThan6){
                        //number is odd, NOT divisible by 3, and greater than 6
                        case'y':
                        case'Y':
                            System.out.print("Is your number 7? ");
                            guess = myScanner.next(".").charAt(0);
                            switch (guess){
                                case'y':
                                case'Y':
                                    System.out.println("Yay!");
                                    break;
                                case'n':
                                case'N':
                                    System.out.println("Liar!");
                                    break;
                            }
                            break;
                        //number is odd, NOT divisible by 3, and less than 6
                        case'n':
                        case'N':
                            System.out.print("Is it less than 3? ");
                            lessThan3 = myScanner.next(".").charAt(0);
                            switch(lessThan3){
                                //number is odd, NOT divisible by 3, less than 6, and less than 3
                                case'y':
                                case'Y':
                                    System.out.print("Is your number 1? ");
                                    
                                    guess = myScanner.next(".").charAt(0);
                                    switch (guess){
                                        case'y':
                                        case'Y':
                                            System.out.println("Yay!");
                                            break;
                                        case'n':
                                        case'N':
                                            System.out.println("Liar!");
                                            break;
                                    }
                                    break;
                                //number is odd, NOT divisible by 3, less than 6, and NOT less than 3
                                case'n':
                                case'N':
                                    System.out.print("Is your number 5? ");
                                    guess = myScanner.next(".").charAt(0);
                                    switch (guess){
                                        case'y':
                                        case'Y':
                                            System.out.println("Yay!");
                                            break;
                                        case'n':
                                        case'N':
                                            System.out.println("Liar!");
                                            break;
                                    }
                                    break;
                            }
                            break;
                    }
                    break;
            }
            break;
        //user entered an invalid input 
        default:
            System.out.println("Sorry, that is not a valid input. Input 'y' for yes or 'n' for no.");
            break;
    }
    
    }
}
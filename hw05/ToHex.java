//Travis Smith
//CSE2
//hw05 - ToHex.java
//User inputs three numbers and the program converts them into hexadecimal form
//
//import the Scanner utility
import java.util.Scanner;
//
//define the class
public class ToHex{
    public static void main(String[]args){
        //
        //import the scanner
        Scanner myScanner;
        myScanner = new Scanner(System.in);
        //
        //define input variables
        int firstNumber=0;
        int secondNumber=0;
        int thirdNumber=0;
        //
        //variables used to make sure the user's response if valid
        int r1Hex;
        int r2Hex;
        int g1Hex;
        int g2Hex;
        int b1Hex;
        int b2Hex;
        //
        //string variables used to get the hexadecimal values for red, green, and blue
        String r1;
        String r2;
        String g1;
        String g2;
        String b1;
        String b2;
        //
        //print instructions for user
        System.out.print("Please enter three numbers representing RBG values: ");
        //
        //if statements make sure user inputs integers
        if(myScanner.hasNextInt()){
            firstNumber = myScanner.nextInt();
            if(myScanner.hasNextInt()){
                secondNumber = myScanner.nextInt(); 
                if(myScanner.hasNextInt()){
                    thirdNumber = myScanner.nextInt();
                    //
                    //if any of the integers are out of the 0-255 range, the program will end
                    if(firstNumber>255||secondNumber>255||thirdNumber>255||firstNumber<0||secondNumber<0||thirdNumber<0){
                        System.out.println("Sorry, your integers must be between 0-255 inclusive");
                        return;
                    }
                    //
                    //calculations for conversions
                    r1Hex = firstNumber/16;
                    r2Hex = firstNumber%16;
                    g1Hex = secondNumber/16;
                    g2Hex = secondNumber%16;
                    b1Hex = thirdNumber/16;
                    b2Hex = thirdNumber%16;
                    //
                    //conversion into hexidecimal for each digit
                    r1=Integer.toHexString(r1Hex);
                    r2=Integer.toHexString(r2Hex);
                    g1=Integer.toHexString(g1Hex);
                    g2=Integer.toHexString(g2Hex);
                    b1=Integer.toHexString(b1Hex);
                    b2=Integer.toHexString(b2Hex);
                    //
                    //combines all six digit strings into one string
                    String hex = r1+r2+g1+g2+b1+b2;
                    //
                    //system prints the result and converts the final string into capitalized letters
                    System.out.println(
                        "The decimal numbers R:"
                        +firstNumber+", G:"
                        +secondNumber+", B:"
                        +thirdNumber+", is represented in hexadecimal as "
                        +hex.toUpperCase() );
                }
                //if user did not enter an integer for the third input, program ends
                else{
                System.out.println("Sorry, your input must consist of integers");
                }
            }
            //if user did not enter an integer for the second input, program ends
            else{
            System.out.println("Sorry, your input must consist of integers");
            }
        }
        //if user did not enter an integer for the first input, program ends
        else{
            System.out.println("Sorry, your input must consist of integers");
        }
    }
}
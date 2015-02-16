//Travis Smith
//cse002
//hw04 - Banking.java
//The user can deposit money into, withdraw money from, or view the balance of their account
//
import java.util.Scanner;
//
//define class
public class Banking{
    public static void main (String[]args){
        //
        //define Scanner
        Scanner myScanner;
        myScanner = new Scanner(System.in);
        //
        //define and initilize variables
        double randomNumber=1000+(double)(Math.random()*4000);
        int answer;
        double deposit=0;
        double newBalance;
        double withdraw=0;
        //
        //User gets their initial account balance        
        System.out.printf("The balance in your account is $%4.2f\n",randomNumber);
        System.out.println("Enter 1 if you would like to deposit money");
        System.out.println("Enter 2 if you would like to withdraw money");
        System.out.println("Enter 3 if you would like to view your balance");
        //
        System.out.print("What would you like to do? ");
        //
        myScanner.hasNextInt();
        answer = myScanner.nextInt();
        //
        switch(answer){
            //output if user wants to deposit money
            case 1:
                System.out.print("How much would you like to deposit? $");
                myScanner.hasNextDouble();
                deposit = myScanner.nextDouble();
                newBalance = deposit+randomNumber;
                //the amount deposited is added to the current account balance
                if (deposit >= 0){
                    System.out.printf("Your account balance is now $%4.2f \n",newBalance);
                }
                //the user did not enter a non-negative number
                else{
                    System.out.println("Invalid response. Enter a non-negative number.");
                }
                break;
            //output if user wants to withdraw money
            case 2:
                System.out.print("How much would you like to witdraw? ");
                myScanner.hasNextDouble();
                withdraw = myScanner.nextDouble();
                newBalance = randomNumber-withdraw;
                //the amount withdrawn is subtraced from the current account balance
                if (withdraw >= 0){
                    System.out.printf("Your account balance is now $%4.2f\n",newBalance);
                }
                //the user did not enter a non-negative number
                else{
                    System.out.println("Invalid response. Enter a non-negative number.");
                }
                break;
            //output if user wants to view their account balance
            case 3:
                System.out.printf("Your account balance is $%4.2f\n",randomNumber);
                break;
            //output if user enters an invalid response
            default:
                System.out.println("Invalid response. Enter 1, 2, or 3");
                break;
        }
    }
    
}
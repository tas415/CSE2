//Travis Smith
//cse002
//lab04
//
import java.util.Scanner;

//define class
public class Cookies{
    public static void main( String[]args ){
     
    Scanner myScanner;
    myScanner = new Scanner (System.in);
    
    //define variables
    int nPeople;
    int nCookies;
    int nEach;
    
    //have user enter the number of people
    System.out.print(
        "Enter the number of people: ");
        if (myScanner.hasNextInt()){
            //next int will be stored in the nPeople variable
            nPeople = myScanner.nextInt();
            //user did not enter an int >0 so program ends
            if (nPeople<=0){
                System.out.println("You did not enter an int >0");
                return;
            }
        }
        //user did not enter an int so program ends
        else{
            System.out.println("You did not enter an int");
            return;
        }
    
    //user inputs the number of cookies
    System.out.print(
        "Enter the number of cookies you are planning to buy: ");
        //net int will be stored in variable nCookies
        if (myScanner.hasNextInt()){
            nCookies = myScanner.nextInt();
            //user did not enter an int>0 so program ends
            if (nCookies<=0){
                System.out.println("You did not enter an int >0");
                return;
            }
        }
        //user did not enter an int so program ends
        else{
            System.out.println("You did not enter an int");
            return;
        }
    
    //user enters the number he wants each person to get
    System.out.print(
        "How many do you want each person to get? ");
        //next int is stored in variable nEach
        if ( myScanner.hasNextInt() ){
            nEach = myScanner.nextInt();
            //user did not enter an int >0 so program ends
            if (nEach<=0){
                System.out.println("You did not enter an int >0");
                return;
            }
            //user does not have enough cookies for everyone to get the amount he wants everyone to have
            else if (nEach*nPeople>nCookies){
                System.out.println("You will not have enough cookies. You will need to buy "+(nEach*nPeople-nCookies)+" more.");
            }
            //user has enough cookies and they will divide evenly
            else if (nEach*nPeople<=nCookies && nCookies%(nEach*nPeople)==0){
                System.out.println("You have enough cookies and they will divide evenly");
            }
            //user has enough cookies but they will not divide evenly
            else if (nEach*nPeople<nCookies && nCookies%(nEach*nPeople)!=0){
                System.out.println("You have enough cookies but they will not divide evenly");
            }
            return;
        }
        //user did not enter an int so program ends
        else{
            System.out.println("You did not enter an int");
            return;
        }    
    
    }
}
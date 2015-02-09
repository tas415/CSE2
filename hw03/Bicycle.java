import java.util.Scanner;

public class Bicycle{
    public static void main(String[]args){
        
        Scanner myScanner;
        myScanner = new Scanner (System.in);
        
        System.out.print(
            "Enter the number of seconds ");
            int nSeconds = myScanner.nextInt(); //user enters the number of seconds the trip took
        
        System.out.print(
            "Enter the number of counts ");
            int nCounts = myScanner.nextInt(); //user enters the number of times the bike wheels rotated
        
        double wheelDiameter=27.0; //Diameter of wheel
        double PI=3.14159; //value of pi
        int feetPerMile=5280; //Number of feet in a mile
        int inchesPerFoot=12; //Number of inches in a foot
        int secondsPerMinute=60; //Number of seconds in a minute
        
        double nMiles=((int)(nCounts*wheelDiameter*PI/inchesPerFoot/feetPerMile*100))/100.0; //Calculates the number of miles
        double nMinutes=((int)(nSeconds/secondsPerMinute*100))/100.0; //Calculates the number of minutes
        
        double mph=((int)((nMiles/(nMinutes/60))*100))/100.0; //Calculates the average mph
        
        System.out.println(
            "The distance was "+nMiles+" miles and took "+nMinutes+" minutes.");
        
        System.out.println(
            "The average mph was "+mph);
        
    }
    
}
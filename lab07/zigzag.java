//Travis Smith
//cse2
//lab07 - zigzag.java
//User enters the number of stars he wants to print
//
import java.util.Scanner;

public class zigzag{
    public static void main( String[]args ){
        
        //defines Scanner
        Scanner myScanner;
        myScanner = new Scanner( System.in );
        
        //defines variables
        String star="*";
        int nStars=-1;
        String goAgain="y";
        
        while(goAgain.equals("y") || goAgain.equals("Y")){
            
            //loop runs at least once because int nStars is initialized to -1, loop runs while nStars is out of [3,33] range
            while(nStars>33 || nStars<3){
                //prompts user to enter a value for the number of stars he wants
                System.out.print("Enter an int between 3 and 33: ");
                
                //if the entry is not an integer, this loop will run
                while(!myScanner.hasNextInt()){
                    System.out.println("That is not an int.");
                    System.out.print("Enter an int between 3 and 33: ");
                    myScanner.next();
                }
                ///if the loop is an int, the entry equals nStars
                if(myScanner.hasNextInt()){
                    nStars=myScanner.nextInt();
                }
            }
            
            //prints top line of stars
            for(int i=0; i<nStars; i++){
                System.out.print(star);
            }  
            System.out.println();
            
            //prints diagonal of stars
            for(int j=0; j<nStars; j++){
                System.out.println(star);
                star=" "+star;
            }
            
            //prints bottom line of stars
            for(int k=0; k<nStars; k++){
                star="*";
                System.out.print(star);
            }  
            System.out.println();        
        
        //prompts user to go again, if user enters anything but y or Y the infinite while loop will break
        System.out.print("Enter y or Y to go again: ");
        goAgain=myScanner.next();
        //Re-initalizes nStars so that the nested loops will run
        nStars=-1;
        
        }
        
    }
}
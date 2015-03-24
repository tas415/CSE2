//Travis Smith
//cse2
//hw08 - HW8.java
//Use methods to create a video game
//
import java.util.Scanner;

public class HW8{
    
    //main method was given, not allowed to alter it for this assignment
    public static void main(String[] args) {
        char option;
        Scanner scan = new Scanner(System.in);
        System.out.println("Welcome to MG's adventure world. Now your journey begins. Good luck!");
        System.out.println("Please hit 'C' or 'c' to continue, anything else to quit-");
        String input = getInput(scan, "Cc");
        System.out.println("You are in a dead valley.");
        System.out.println("Please hit 'C' or 'c' to continue, anything else to quit-");
        input = getInput(scan, "Cc");
        System.out.println("You walked and walked and walked and you saw a cave!");
        cave();
        System.out.println("Please hit 'C' or 'c' to continue, anything else to quit-");
        input = getInput(scan, "Cc");
        System.out.println("You entered a cave!");
        System.out.println("Please hit 'C' or 'c' to continue, anything else to quit-");
        input = getInput(scan, "Cc");
        System.out.println("Unfortunately, you ran into a GIANT!");
        giant();
        System.out.println("Enter 'A' or 'a' to Attack, 'E' or 'E' to Escape, ANYTHING else is to YIELD");
        input = getInput(scan, "AaEe", 10);
        System.out.println("Congratulations! You SURVIVED! Get your REWARD!");
        System.out.println("There are three 3 tressure box in front of you! Enter the box number you want to open!");
        box();
        input = getInput(scan);
        System.out.println("Hero! Have a good day!");
    }
    
    //method that asks the user to continue 
    public static String getInput(Scanner scan, String string) {
        string=scan.next();
        String s;
        //program continues if user enters C or c
        if(string.equals("C")||string.equals("c")){
            s="";
        }
        //program exits if user enters anything else
        else{
            System.out.println("Yea right LOSER!");
            System.exit(0);
            s = "Yea right LOSER!";
        }
        return s;
    }
    
    //method for picking a move i.e. attack, escape, or yield
    public static String getInput(Scanner scan, String string, int trial) {
        string=scan.next();
        String s;
        
        //the user must attack the giant 10 time in order to kill it
        for(int i=0; i<trial; ){
            System.out.println("Enter 'A' or 'a' to Attack, 'E' or 'e' to Escape, ANYTHING else is to YIELD");
            
            //if user chooses to attack
            if(string.equals("A")||string.equals("a")){
                //Generates the % accuracy of the hits
                int x=(Math.random()<0.5)?0:1;
                //50% of the attacks hit it
                if(x==0){
                    System.out.println("Critical Hit!");
                    i++;
                }
                //and 50% of the attacks miss it
                else if(x==1){
                    System.out.println("Gosh! How can you miss it!");
                }
            } 
            
            //if user chooses to escape
            else if(string.equals("E")||string.equals("e")){
                //generates a random number 1-10
                int y=(int)(Math.random()*10+1);
                //1 out of 10 times the user escapes the giant i.e. if the number is 10
                if(y==10){
                    System.out.println("Congrats! You successfully escaped the giant!");
                    System.exit(0);
                }
                //9 out of 10 times the giant stops the user from escaping i.e. if the number is not 10
                else{
                    System.out.println("Can't escape! The giant stopped you!");
                }
            }
            
            //if the user chooses to yield
            else{
                System.out.println("Executed by the GIANT! Game Over!");
                System.exit(0);
            }
            
            //allows the user to enter a new move after one has been made
            string=scan.next();
            
        }
        s="";
        return s;
    }
    
    //method after user defeats the giant
    public static String getInput(Scanner scan) {
        System.out.print("Box ");
        String s;
        String box=scan.next();
        
        //user picks the box he wants, the prize depends on the box
        switch(box){
            case "1":
                System.out.println("It is a 4.00 GPA!");
                break;
            case "2":
                System.out.println("It is a pat on the back!");
                break;
            case "3":
                System.out.println("It is $1,000,000!");
                break;
            default:
                System.out.println("A Wrong Number! You get nothing! Better restart the game LOL");
                System.exit(0);
                break;
        }
        return s="";
    }
    
    //giant method
    public static void giant() {
        System.out.println("                                 ---------                    ");
        System.out.println("                                |  /    \\|                   ");
        System.out.println("                      ZZZZZH    |    O    |    HZZZZZ             ");
        System.out.println("                           H     -----------   H              ");
        System.out.println("                      ZZZZZHHHHHHHHHHHHHHHHHHHHHZZZZZ                   ");
        System.out.println("                           H    HHHHHHHHHHH    H                      ");
        System.out.println("                      ZZZZZH    HHHHHHHHHHH    HZZZZZ               ");
        System.out.println("                                HHHHHHHHHHH                   ");
        System.out.println("                                HHH     HHH                   ");
        System.out.println("                               HHH       HHH                   ");
    }

    //cave method
    public static void cave() {
        System.out.println("                              *****   * * * * * * * *        ");
        System.out.println("                         ***         ***                      ");
        System.out.println("                      ***               ***                   ");
        System.out.println("                 |    ***               ***                   ");
        System.out.println("                 |    ***               ***                   ");
        System.out.println("             O __|__  ***               ***                   ");
        System.out.println("           ******l    ***               ***                   ");
        System.out.println("            * *       ***               ***                   ");
        System.out.println("           *   *      ********************* * * * * * *       ");
    }
    
    //box method
    public static void box() {
        System.out.println("                     *********************     *********************    *********************       ");
        System.out.println("                     ***               ***     ***               ***    ***               ***       ");
        System.out.println("                     ***       1       ***     ***       2       ***    ***       3       ***       ");
        System.out.println("                     ***               ***     ***               ***    ***               ***       ");
        System.out.println("                     *********************     *********************    *********************       "); 
    }
    
}
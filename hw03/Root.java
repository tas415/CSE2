import java.util.Scanner;

public class Root{
    
    public static void main(String[]args){
     
    Scanner myScanner;
    myScanner = new Scanner(System.in);
    
    System.out.print(
        "Enter a double and I print its cubed root: ");
        double x = myScanner.nextDouble(); //user inputs their double
        double guess1 = x/3; //a rough estimate of its cubed root is calculated
        double guess2 = (2*guess1*guess1*guess1+x)/(3*guess1*guess1); //the cubed root gets more precise
        double guess3 = (2*guess2*guess2*guess2+x)/(3*guess2*guess2);
        double guess4 = (2*guess3*guess3*guess3+x)/(3*guess3*guess3);
        double guess5 = (2*guess4*guess4*guess4+x)/(3*guess4*guess4);
        double guess6 = (2*guess5*guess5*guess5+x)/(3*guess5*guess5);
    
    System.out.println("The cubed root is "+guess6+" because "+guess6+"*"+guess6+"*"+guess6+"="+(guess6*guess6*guess6)); //the results are printed
    
    }
}
import java.util.Scanner;

public class FourDigits{
    public static void main(String[]args){
        
        Scanner myScanner;
        myScanner = new Scanner(System.in);
        
        System.out.print(
            "Enter a double and I display the four digits to the right of the decimal point: ");
            double input = myScanner.nextDouble(); //user inputs their double

            double decimals = input%1;
           
            int digit1=(int)(decimals*10); //the individual digits to the right of the decimal point are found
            int digit2=(int)(decimals*100%10); 
            int digit3=(int)(decimals*1000%10);
            int digit4=(int)(decimals*10000%10);
           
        System.out.println(
            "The four digits are "+digit1+digit2+digit3+digit4); //results are printed
            
    }
}
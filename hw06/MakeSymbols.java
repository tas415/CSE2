//Travis Smith
//CSE2
//hw06 program 3 - MakeSymbols.java
//Generate a random integer between 0 and 100
//If the number is even print that number of * symbols
//If the number is ood print that number of & symbols
//
public class MakeSymbols{
    public static void main( String[]args ){
        
        //Defines the variables, randomInt stores the random number between 0 and 100
        int randomInt=(int)(Math.random()*99+1);
        int counter=0;
        
        //Prints the random integer between 0 and 100
        System.out.println("Random number generated: "+randomInt);
        
        //this loop will concatenate strings until the number of symbols equals randomInt 
        do{
            //if the number is even
            if(randomInt%2==0){
                String a="*";
                String b="*";
                System.out.print(a);
                a+=b;
                counter++;
            }
            //if the number is odd
            if(randomInt%2==1){
                String c="&";
                String d="&";
                System.out.print(c);
                c+=d;
                counter++;
            }
        }while(counter<randomInt); //Program continues while the counter variable is less than the sentinel variable, randomInt
        System.out.println();
        
    }
}
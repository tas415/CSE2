//Travis Smith
//cse2
//hw07 - waves.java
//User enters an int, program uses for, while, and do while loops to print waves of numbers
//
import java.util.Scanner;

public class waves{
    public static void main( String[] args ){
        
        Scanner myScanner = new Scanner( System.in );

        int x=0;
        int y=-1;
        

        while(y<=0 || y>=30){ //this while loop insures that the input is an int within the vaild range
            System.out.print("Enter an int between 0 and 30: ");
            
            while(!myScanner.hasNextInt()){ //if the entry is not an integer, user will have to input again
                System.out.println("That is not an int.");
                System.out.print("Enter an int between 0 and 30: ");
                myScanner.next();
            }
            if(myScanner.hasNextInt()){ //if the loop is an int, the entry equals y
                y=myScanner.nextInt();
            }
        }        

        //gets the correct number of waves
        int g=((y+1)/2)+1;
        
        
        //FOR LOOP
        System.out.println();
        System.out.print("For Loop");
        
        for(int i=1;i<g;i++){ //outer loop controls actual number being printed, and new line
            for(int k=1;k<x+1;k++){ //this starts one numbers triangle
            System.out.println();
                for(int j=1;j<k+1;j++){
                    System.out.print(x);
                } //controls number of numbers on each line
            }
            x++;

            int z=x;
            
            for(int k=z;k>0;k--){ //this starts one numbers triangle
            System.out.println();
                for(int j=1;j<k+1;j++){
                    System.out.print(z);
                } //controls number of numbers on each line
            }
            x++;
        }
       
       
        //WHILE LOOP
        System.out.println();
        System.out.println();
        System.out.print("While Loop");
        
        x=0;
        int i=1;
        
        while(i<g){ //outer loop controls actual number being printed, and new line
            int k=1;
            while(k<x+1){ //this starts one numbers triangle
                System.out.println();
                int j=1;
                while(j<k+1){ //controls number of numbers on each line
                    System.out.print(x);
                    j++;
                }
                k++;
            }
            i++;
            x++;

            int z=x;            
            int a=z;
            
            while(a>0){ //this starts one numbers triangle
                System.out.println();
                int j=1;
                while(j<a+1){ //controls number of numbers on each line
                    System.out.print(z);
                    j++;
                }
                a--;
            }
            x++;
        }


        //DO WHILE LOOP
        System.out.println();
        System.out.println();
        System.out.print("Do While Loop");
        
        x=0;    
        i=1;
        
        if(i<g){
            do{ //outer loop controls actual number being printed, and new line
                int e=1;
                if(e<x+1){
                    do{ //this starts one numbers triangle
                        System.out.println();
                        int j=1;
                        if(j<e+1){
                            do{ //controls number of numbers on each line
                                System.out.print(x);
                                j++;    
                            } while(j<e+1);
                        }
                        e++;    
                    } while(e<x+1);
                }
                x++;
                
                int z=x;
                int v=z;
                
                if(v>0){
                    do{ //this starts one numbers triangle
                        System.out.println();
                        int j=1;
                        if(j<v+1){
                            do{ //controls number of numbers on each line
                                System.out.print(z);
                                j++;
                            } while(j<v+1);
                        }
                        v--;
                    } while(v>0);
                }
                x++;
                
                i++;
            } while(i<g);
        }

        System.out.println();

    }
}
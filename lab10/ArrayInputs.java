//Travis Smith
//cse2
//lab10 - ArrayInputs.java
//Declare, allocate, and initalize one dimensional arrays

import java.util.Scanner;

public class ArrayInputs{
    
    public static void main( String[]args ){
        
        Scanner scan=new Scanner( System.in );
        
        int length=0;
        System.out.print("Please enter an integer for the size of an array: ");
        
        while(length<1){
            
            while(!scan.hasNextInt()){
                System.out.println("Sorry, you didn't enter an integer.");
                System.out.print("Please enter a positive integer: ");
                scan.next();
            }
            while(scan.hasNextInt()){
                length=scan.nextInt();
                
                if(length>0){
                    break;
                }
                else{
                    System.out.println("Sorry, the number you entered is not positive.");
                    System.out.print("Please enter a positive integer: ");
                }
            }
        }
        
        System.out.print("Please enter "+length+" positive integers: ");
        
        //initalization and allocation
        int[] list1=new int[length];
        
        //initalization of the array
        int i = 0;
        for(i = 0; i < length; i++){
        	scan.hasNextInt();
        	list1[i] = scan.nextInt();
        }
        
        //displays/prints the array
        System.out.println("The array is:");
        for(i=0; i< length; i++){
            System.out.println(list1[i]); 
        }


    }
    
}
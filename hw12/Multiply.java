//Travis Smith
//CSE2
//hw12 - Multiply.java
//Multidimensional arrays
//
import java.util.Scanner;

public class Multiply{
    
    //Main method
    public static void main(String[]args){
        
        //define scanner
        Scanner scan=new Scanner(System.in);
        
        //initialize variables
        int w1=0;
        int h1=0;
        int w2=0;
        int h2=0;
        
        do{
            
            //Height of 1st matrix
            System.out.print("Height of 1st matrix: ");
            while(!scan.hasNextInt()){
                System.out.println("That is not an int.");
                System.out.print("Enter an int: ");
                scan.next();
            }
            h1=scan.nextInt();
            if(h1<=0){
                while(h1<=0){
                    System.out.println("Your int must be positive.");
                    System.out.print("Enter a non negative int: ");
                    h1=scan.nextInt();
                } 
            }
            
            //Width of 1st matrix
            System.out.print("Width of 1st matrix: ");
            while(!scan.hasNextInt()){
                System.out.println("That is not an int.");
                System.out.print("Enter an int: ");
                scan.next();
            }
            w1=scan.nextInt();
            if(w1<=0){
                while(w1<=0){
                    System.out.println("Your int must be positive.");
                    System.out.print("Enter a non negative int: ");
                    w1=scan.nextInt();
                } 
            }
            
            //Height of 2nd matrix
            System.out.print("Height of 2nd matrix: ");
            while(!scan.hasNextInt()){
                System.out.println("That is not an int.");
                System.out.print("Enter an int: ");
                scan.next();
            }
            h2=scan.nextInt();
            if(h2<=0){
                while(h2<=0){
                    System.out.println("Your int must be positive.");
                    System.out.print("Enter a non negative int: ");
                    h2=scan.nextInt();
                } 
            }    
            
            //Width of 2nd matrix
            System.out.print("Width of 2nd matrix: ");
            while(!scan.hasNextInt()){
                System.out.println("That is not an int.");
                System.out.print("Enter an int: ");
                scan.next();
            }
            w2=scan.nextInt();
            if(w2<=0){
                while(w2<=0){
                    System.out.println("Your int must be positive.");
                    System.out.print("Enter a non negative int: ");
                    w2=scan.nextInt();
                } 
            }
            
            //Tells user to enter new dimensions if the dimensions entered are not compatible for matrix multiplciation
            if(h1!=w2){
                System.out.println("These dimensions are not compatible for matrix multiplication.");
                System.out.println("Try again and enter dimensions that are compatible");
            }
        }while(h1!=w2); //loop repeats until the dimendions are compatible for matrix multiplication

        //declares and initalizes first matrix
        int[][] first=new int[w1][h1];
        
        //declares and initalizes second matrix
        int[][] second=new int[w2][h2];        
        
        //prints the first matrix
        System.out.println();
        System.out.println("The 1st matrix");
        first=randomMatrix(w1,h1);
        printMatrix(first);  
        
        //prints the second matrix
        System.out.println();
        System.out.println("The 2nd matrix");
        second=randomMatrix(w2,h2);
        printMatrix(second);  
        
        //prints the product of the matricies
        System.out.println();
        System.out.println("The product of the matricies is");
        printMatrix(matrixMultiply(first,second));

    }
    
    //Method used to generate random ints
    public static int[][] randomMatrix(int width, int height){
        int[][] array=new int[height][width];

        for(int row = 0; row < height; row++){
            for(int col = 0; col < width; col++){
                array[row][col]=(int)(Math.random()*19)-9;
            }
        }
        return array;
    }
    
    //Method used to print matricies
    public static void printMatrix(int[][] array){
        //If the array contains all zeros
        if(array==null){
            System.out.println("The array was empty!");
        }
        
        //If the array has values
        for(int row = 0; row < array.length; row++){
            for(int col = 0; col < array[row].length; col++){
                System.out.printf("%5d ", array[row][col]);
            }
            System.out.println();
        }
        return;
    }
    
    //Method used to multiply the matricies together
    public static int[][] matrixMultiply(int[][] a, int[][] b){
        
        int[][] result = new int[a.length][b[0].length];
        
        //the user did not enter dimensions that are capable of matrix multiplication
        if(a.length!=b[0].length){
            System.out.println("Multiplication is not possible.");
            return null;
        }
        
        //multiplies the matricies together
        else{
            for (int i = 0; i < a.length; i++) { 
                for (int j = 0; j < b[0].length; j++) { 
                    for (int k = 0; k < a[0].length; k++) { 
                        result[i][j]+=a[i][k]*b[k][j];
                    }
                }
            }
            return result;
        }
    }
    
}
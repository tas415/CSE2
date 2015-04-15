//Travis Smith
//cse2
//hw11 - CSE2Linear.java
//arrays and searches
//
import java.util.Scanner;
import java.util.Random;

public class CSE2Linear{
    
    public static void main(String[]args){
        
        //defines variables
        Scanner scan = new Scanner(System.in);
        int[] array = new int[15];
        int entry=0;
        int key=0;
        
        //prompts user
        System.out.print("Enter 15 ints for final grades in CSE2: ");
        
        //checks to make sure the user enters an int and that it's between 0 and 100
        for(int i=0;i<15;i++){
            //int component
            while(!scan.hasNextInt()){
                System.out.println("Error. That is not an int.");
                System.out.print("Enter an int: ");
                scan.next();
            }
            entry=scan.nextInt();
            //Between 0 and 100 component
            while(entry<0 || entry>100){
                System.out.println("Error. Your int must be between 0 and 100");
                System.out.print("Enter an int between 0-100: ");
                scan.hasNextInt();
                entry=scan.nextInt();
            }
            
            //initalizes the array
            array[i]=entry;
            
        }
        
        //SORTS THE ARRAY
        System.out.print("The grades, sorted, are: ");
        java.util.Arrays.sort(array);
        for(int i=0;i<15;i++){
            System.out.print(array[i]+" ");
        }
        System.out.println();
        
        //CALLS THE BINARY SEARCH METHOD
        System.out.print("Enter a grade to search for: ");
        scan.hasNextInt();
        key=scan.nextInt();
        binarySearch(array,key);
        
        //CALLS THE RANDOM SCRAMBLING
        randomScrambling(array);
        System.out.print("The grades, scrambled, are: ");
        for(int i=0;i<15;i++){
            System.out.print(array[i]+" ");
        }
        System.out.println();
        
        //CALLS THE LINEAR SEARCH METHOD
        System.out.print("Enter a grade to search for: ");
        scan.hasNextInt();
        key=scan.nextInt();
        linearSearch(array,key);
        
    }
    
    //BINARY SEARCH
    public static int binarySearch(int[] array, int key){
        int low=0;
        int high=array.length-1;
        
        int i=0;
        while(high>=low){
            int mid=(low+high)/2;
            if(key<array[mid]){ //changes the lower bound
                high=mid-1;
            }
            else if(key==array[mid]){ //checks the middle value AND/OR the key has been found int the array
                System.out.println(key+" was found in the list with "+(i+1)+" iterations");
                return mid;
            }
            else{ //changes the upper bound
                low=mid+1;
            }
            i++;
        }
        System.out.println(key+" was NOT found in the list with "+i+" iterations"); //key was not found in the array
        return 0;
    }
    
    //RANDOM SCRAMBLING
    public static int[] randomScrambling(int[] array){
        
        for(int i=array.length-1; i>0; i--){
            int index = (int)(Math.random()*(array.length-i));
            
            //loop repeats an additional time if the arrat at the random index number has already been assigned a value
            if(i==index){
                i++;
            }
            //otherwise the array at the random index gets assigned a value
            else{
                int a=array[index];
                array[index]=array[i];
                array[i]=a;
            }
            
        }
        return array;
    }
    
    //LINEAR SEARCH
    public static int linearSearch(int[] array, int key){

        int i=0;
        while(i<array.length){
            if(key==array[i]){ //key has been found in the array
                System.out.println(key+" was found in the list with "+(i+1)+" iterations");
                return 1;
            }
            i++;
        }
        System.out.println(key+" was NOT found in the list with "+i+" iterations"); //key has not been found in the array
        return 0;
    }
    
}
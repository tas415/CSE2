//Travis Smith
//cse2
//hw13
//four dimensional arrays
//
import java.util.Scanner;

public class FourDwin{
    
    public static void statArray(double[][][][] fourDArray){
        
        double sum=0;
        int count=0;
        
        //determines the number of members in the array as well as the accumulating sum
        for(int i=0; i<fourDArray.length; i++){
            for(int j=0; j<fourDArray[0].length; j++){
                for(int k=0; k<fourDArray[0][0].length; k++){
                    for(int l=0; l<fourDArray[0][0][0].length; l++){
                        sum+=fourDArray[i][j][k][l];
                        count++;
                    }
                }
            }
        }
        
        sum=((int)(sum*10))/10.0;
        double mean=((double)((int)((sum/count)*10)))/10;
        
        System.out.println();
        System.out.println("Members: "+count);
        System.out.println("Sum: "+sum);
        System.out.println("Mean: "+mean);
        System.out.println();
        
    }
    
    //Method uses inseration sort to sort the 4D array
    public static double[][][][] sort4DArray(double[][][][] fourDArray){
        
        for(int i=1; i<fourDArray.length; i++){
            double[][][] currentElement=fourDArray[i];
            int k;
            for(k=i-1; k>=0 && fourDArray[k].length>currentElement.length; k--){
                fourDArray[k+1]=fourDArray[k];
            }
            //inserts the current element into fourDArray[k+1]
            fourDArray[k+1]=currentElement;
        }
        return fourDArray;
        
    }
    
    //method uses selection sort to sort the 3D arrays
    public static double[][][][] sort3DArray(double[][][][] fourDArray){
        
        //finds the minimum in the list
        for(int i=0; i<fourDArray.length-1; i++){
            double[][][] currentMin=fourDArray[i];
            int currentMinIndex=i;
            
            for(int j=i+1; j<fourDArray.length; j++){
                if(currentMin.length>fourDArray[j].length){
                    currentMin=fourDArray[j];
                    currentMinIndex=j;
                }
            }
            
            //swaps fourDArray[i] with fourDArray[currentMinIndex] if necessary
            if(currentMinIndex!=i){
                fourDArray[currentMinIndex]=fourDArray[i];
                fourDArray[i]=currentMin;
            }
            
        }
        return fourDArray;
        
    }
    

    public static void printArray(double[][][][] fourDArray){
    
        //If the array doesn't have values
        if(fourDArray==null){
            System.out.println("The array was empty!");
        }
        
        //If the array has values
        System.out.print("{");
        for(int i=0; i<fourDArray.length; i++){
            //System.out.println("fourDArray["+i+"][][][]=");
            System.out.println();
            System.out.print("{");
            for(int j=0; j<fourDArray[0].length; j++){
                System.out.print("{");
                for(int k=0; k<fourDArray[0][0].length; k++){
                    System.out.print("{");
                    for(int l=0; l<fourDArray[0][0][0].length; l++){
                        System.out.print(" "+fourDArray[i][j][k][l]+",");
                    }
                    System.out.print("}");
                }
                System.out.print("}");
            }
            System.out.print("}");
        }
        System.out.println();
        System.out.print("}");
        return;
    
    }
    
    
    public static void main(String[]args){
        Scanner scan = new Scanner(System.in);
        
        //inputs int X
        int x=0;
        System.out.print("Enter an integer X: ");        
        while(!scan.hasNextInt()){
            System.out.println("Error. That is not an int.");
            System.out.print("Enter an int: ");
            scan.next();
        }
        x=scan.nextInt();
        while(x<=0){
            System.out.println("Error. Your int must be > 0.");
            System.out.print("Enter an integer X: ");
            scan.hasNextInt();
            x=scan.nextInt();
        }

        //inputs int Y
        int y=0;
        System.out.print("Enter an integer Y > "+x+": ");        
        while(!scan.hasNextInt()){
            System.out.println("Error. That is not an int.");
            System.out.print("Enter an int: ");
            scan.next();
        }
        y=scan.nextInt();
        while(y<=x){
            System.out.println("Error. Your int must be > "+x+".");
            System.out.print("Enter an integer Y: ");
            scan.hasNextInt();
            y=scan.nextInt();
        }
        
        //declares and initalizes 4D array
        int randomSize = x+(int)(Math.random()*y);
        int randomSize2 = x+(int)(Math.random()*y); 
        int randomSize3 = x+(int)(Math.random()*y);
        double[][][][] fourDArray = new double[3][randomSize][randomSize2][randomSize3];
        
        //allocates 4D array
        for(int i=0; i<fourDArray.length; i++){
            for(int j=0; j<fourDArray[0].length; j++){
                for(int k=0; k<fourDArray[0][0].length; k++){
                    for(int l=0; l<fourDArray[0][0][0].length; l++){
                        fourDArray[i][j][k][l]=((int)(Math.random()*300))/10.0;
                    }
                }
            }
        }
        
        //prints array
        System.out.println();
        System.out.println("INITIAL ARRAY");
        printArray(fourDArray);
        
        //stats of array
        statArray(fourDArray);
        
        //prints sorted array
        System.out.println("SORTED ARRAY");
        printArray(sort3DArray(sort4DArray(fourDArray)));
        
        //stats of array
        statArray(fourDArray);
    
    }
    
}
//Travis Smith
//cse2
//hw10 - RemoveElements.java
//Single dimensional arrays
//
import java.util.Scanner;

public class RemoveElements{
   
  //MAIN METHOD (given) 
  public static void main(String [] arg){
	Scanner scan=new Scanner(System.in);
    int num[]=new int[10];
    int newArray1[];
    int newArray2[];
    int index,target;
    String answer="";
    do{
      	System.out.print("Random input 10 ints [0-9]");
      	num = randomInput();
      	String out = "The original array is:";
      	out += listArray(num);
      	System.out.println(out);
     
      	System.out.print("Enter the index ");
      	index = scan.nextInt();
      	newArray1 = delete(num,index);
      	String out1="The output array is ";
      	out1+=listArray(newArray1); //return a string of the form "{2, 3, -9}"  
      	System.out.println(out1);
     
        System.out.print("Enter the target value ");
      	target = scan.nextInt();
      	newArray2 = remove(num,target);
      	String out2="The output array is ";
      	out2+=listArray(newArray2); //return a string of the form "{2, 3, -9}"  
      	System.out.println(out2);
      	 
      	System.out.print("Go again? Enter 'y' or 'Y', anything else to quit-");
      	answer=scan.next();
    	}while(answer.equals("Y") || answer.equals("y"));
    }
    
    //LISTARRAY METHOD (given)
    public static String listArray(int num[]){
    	String out="{";
    	for(int j=0;j<num.length;j++){
      	if(j>0){
        	out+=", ";
      	}
      	out+=num[j];
    	}
    	out+="} ";
    	return out;
    }
    
    //RANDOMINPUT METHOD 
    public static int[] randomInput(){
        int[] array=new int[10];
        
        for(int i=0; i<10; i++){  //generates random input for a specified array
            array[i]=(int)(Math.random()*10);
        }
        return array;
        
    }

    //DELETE METHOD - 
    public static int[] delete(int[] list,int pos){
        int[] array=new int[9]; //eliminating one element shrinks the size of the array from 10 to 9

        for(int i=0; i<9; i++){ //copies array elemets that are smaller than the delete index value
            if(i<pos){
                array[i]=list[i];  
            }
            if(i>=pos){ //copies the array elements that are larger than the delete index value
                array[i]=list[i+1];
            }
        }
        return array;
        
    }
    
    //REMOVE METHOD - 
    public static int[] remove(int[] list,int target){
        
        int j=0;
        int count=0;
        int host=0;
        
        for(int x=0;x<10;x++){ //to get number of matches
            if(list[x]==target){
                count++;
            }
        }
        
        int[] temp = new int[10-count]; //gives the appropriate size of the array
        
        for(int i=0; i<temp.length; i++){ //copies non-matches to new array
            if(list[j]!=target){
                temp[i]=list[j];
            }
            else{
                i--;
            }
            j++;
        }
        return temp;
        
    }

}
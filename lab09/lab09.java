//Travis Smith
//cse2
//lab09
//
import java.util.Scanner;
import java.util.Random;

public class lab09{
    
    public static void main( String[]args ){
        
        Scanner scan = new Scanner( System.in );
        
        int x=0;
        String again="y";
        
        if(again.equals("y") || again.equals("Y")){
            do{
                
                for(int i=0; i<6; i++){
                    switch(i){
                        case 0:
                            System.out.print("The "+adjective(x)+" ");
                            break;
                        case 1:
                            System.out.print(adjective(x)+" ");
                            break;
                        case 2:
                            System.out.print(noun1(x)+" ");
                            break;
                        case 3:
                            System.out.print(verb(x)+" ");
                            break;
                        case 4:
                            System.out.print("the "+adjective(x)+" ");
                            break;
                        case 5:
                            System.out.print(noun2(x)+".");
                            break;
                    }
                }
                System.out.println();
                
                System.out.print("Enter 'y' or 'Y' to contruct another sentence, anthing else to quit: ");
                scan.hasNext();
                again=scan.next();
                
            }while(again.equals("y") || again.equals("Y"));
        
        }
        
    }
    
    public static String adjective(int x){
        
        Random randomGenerator = new Random();
        int randomInt = randomGenerator.nextInt(10);  
        
        String word="";
        switch(randomInt){
            case 0:
                word="red";
                break;
            case 1:
                word="hot";
                break;
            case 2:
                word="firery";
                break;
            case 3:
                word="cool";
                break;
            case 4:
                word="chill";
                break;
            case 5:
                word="bad";
                break;
            case 6:
                word="noble";
                break;
            case 7:
                word="bold";
                break;
            case 8:
                word="ambitious";
                break;
            case 9:
                word="holy";
                break;
        }
        return word;
    }
    
    public static String noun1(int x){
        Random randomGenerator = new Random();
        int randomInt = randomGenerator.nextInt(10);  
        
        String word="";
        switch(randomInt){
            case 0:
                word="fox";
                break;
            case 1:
                word="bird";
                break;
            case 2:
                word="plane";
                break;
            case 3:
                word="child";
                break;
            case 4:
                word="blanket";
                break;
            case 5:
                word="blimp";
                break;
            case 6:
                word="wizard";
                break;
            case 7:
                word="knight";
                break;
            case 8:
                word="ninja";
                break;
            case 9:
                word="marine";
                break;
        }
        return word;
    } 

    public static String verb(int x){
        Random randomGenerator = new Random();
        int randomInt = randomGenerator.nextInt(10);  
        
        String word="";
        switch(randomInt){
            case 0:
                word="jumped";
                break;
            case 1:
                word="ran";
                break;
            case 2:
                word="attacked";
                break;
            case 3:
                word="murdered";
                break;
            case 4:
                word="ate";
                break;
            case 5:
                word="bit";
                break;
            case 6:
                word="hugged";
                break;
            case 7:
                word="defended";
                break;
            case 8:
                word="healed";
                break;
            case 9:
                word="licked";
                break;
        }
        return word;
    } 
    
    public static String noun2(int x){
        Random randomGenerator = new Random();
        int randomInt = randomGenerator.nextInt(10);  
        
        String word="";
        switch(randomInt){
            case 0:
                word="forrest";
                break;
            case 1:
                word="lake";
                break;
            case 2:
                word="pickle";
                break;
            case 3:
                word="pig";
                break;
            case 4:
                word="gimp";
                break;
            case 5:
                word="coon";
                break;
            case 6:
                word="hero";
                break;
            case 7:
                word="villan";
                break;
            case 8:
                word="house";
                break;
            case 9:
                word="school";
                break;
        }
        return word;
    } 

}


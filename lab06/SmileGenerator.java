//Travis Smith
//cse2
//lab06 - smile generator
//purpose it to get familiar with loops, probram generates smiley faces
//
public class SmileGenerator{
    public static void main( String[]args ){
        
        //generates a random number of smiles from 1 to 100 inclusive
        int nSmilies=(int)(Math.random()*100+1);
        int counter=0;
        
        //STEP 1
        System.out.println("STEP 1:");
        //the while loop will run five times and thus print five smilies
        while(counter<5){
            System.out.print(":)");
            counter++;
        }
        
        //STEP 1
        System.out.println();
        System.out.println("STEP 1:");
        counter=0;
        //the for loop will run five times and thus print five smilies
        for(counter=0; counter<5; counter++){
            System.out.print(":)");
        }
        
        //STEP 1
        System.out.println();
        System.out.println("STEP 1:");
        //the do while loop will run five times and thus print five smilies
        counter=0;
        do{
            System.out.print(":)");
            counter++;
        }while(counter<5);
        
        
        //STEP 2
        System.out.println();
        System.out.println();
        System.out.println("STEP 2:");        
        //the while loop will run until the random number of smilies have been met
        while(counter<nSmilies){
            System.out.print(":)");
            counter++;
        }
        
        //STEP 3
        System.out.println();
        System.out.println();
        System.out.println("STEP 3:");
        int counter3=0;
        while(counter3<nSmilies){
            //when the number of smilies reaches 30 60 or 90 the program will print a new line
            if(counter3==30 || counter3==60 || counter3==90){
                System.out.println();
            }
            System.out.print(":)");
            counter3++;
        }

        //STEP 4
        System.out.println();
        System.out.println();
        System.out.println("STEP 4:");
        int counter4=0;
            String s = ":)";
            String a = ":)";
        //String s gets another smily everytime the while loop runs
        while(counter4<nSmilies){
            System.out.println(s);
            s+=a;
            counter4++;
        }

    }
}
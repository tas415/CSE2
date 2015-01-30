public class Arithmetic{
    public static void main(String[] args){
        
        //Number of pairs of socks
        int nSocks=3;
        //Cost per pair of socks
        //(‘$’ is part of the variable name)
        double sockCost$=2.58;
        
        //Number of drinking glasses
        int nGlasses=6;
        //Cost per glass
        double glassCost$=2.29;
        
        //Number of boxes of envelopes
        int nEnvelopes=1;
        //cost per box of envelopes
        double envelopeCost$=3.25;
        
        double taxPercent=0.06;
        
        //total cost of socks
        double totalSockCost$=(nSocks*sockCost$);
        //total cost of drinking glasses
        double totalGlassCost$=(nGlasses*glassCost$);
        //total cost of envelopes
        double totalEnvelopeCost$=(nEnvelopes*envelopeCost$);
        
        //total cost of all purchases before tax
        double totalBeforeTax$=(totalSockCost$+totalGlassCost$+totalEnvelopeCost$);
        
        //total cost of all purchases after tax
        double totalAfterTax$=(totalBeforeTax$*taxPercent+totalBeforeTax$);
        
        //rounds totalAfterTax to two decimal places
        double roundOff$=Math.round(totalAfterTax$*100)/100.0;
        
        //prints out results
        System.out.println("My socks cost $"+totalSockCost$);
        System.out.println("My glasses cost $"+totalGlassCost$);
        System.out.println("My envelopes cost $"+totalEnvelopeCost$);
        System.out.println("My total cost before taxes is $"+totalBeforeTax$);
        System.out.println("My total cost after taxes is $"+roundOff$);
    }
}
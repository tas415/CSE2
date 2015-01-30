public class Cyclometer{
    public static void main(String [] args){
        
    	int secsTrip1=480;  // Time trip one took
    	int secsTrip2=3220;  // Time trip two took
    	int countsTrip1=1561;  // Rotation count of trip one
    	int countsTrip2=9037; // Rotation count of trip two
    	double wheelDiameter=27.0; // Diameter of wheel
        double PI=3.14159; // Value of pi
        int feetPerMile=5280;  // Number of feet in a mile
        int inchesPerFoot=12;   // Number of inches in a foot
        int secondsPerMinute=60;  // Number of seconds in a minute
	    double distanceTrip1, distanceTrip2, totalDistance; // Defined output variables
 
    	System.out.println("Trip 1 took "+
           	(secsTrip1/secondsPerMinute)+" minutes and had "+
           	countsTrip1+" counts."); // Outputs results for trip one
    	System.out.println("Trip 2 took "+
           	(secsTrip2/secondsPerMinute)+" minutes and had "+
           	countsTrip2+" counts."); // Outputs results for trip two
    	distanceTrip1=countsTrip1*wheelDiameter*PI;
        	// Above gives distance in inches
        	//(for each count, a rotation of the wheel travels
        	//the diameter in inches times PI)
    	distanceTrip1/=inchesPerFoot*feetPerMile; // Converts to distance in miles
    	distanceTrip2=countsTrip2*wheelDiameter*PI/inchesPerFoot/feetPerMile;
    	totalDistance=distanceTrip1+distanceTrip2;
    	System.out.println("Trip 1 was "+distanceTrip1+" miles");
    	System.out.println("Trip 2 was "+distanceTrip2+" miles");
    	System.out.println("The total distance was "+totalDistance+" miles");
    	
	}  //end of main method   
} //end of class
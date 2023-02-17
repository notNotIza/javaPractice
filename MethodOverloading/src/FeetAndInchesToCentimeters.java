
public class FeetAndInchesToCentimeters {

	// method overloading 
	public static void main(String[] args) {
		calcFeetAndInchesToCentimeters(6,0);
		calcFeetAndInchesToCentimeters(7,5);
		calcFeetAndInchesToCentimeters(-1,1);
		calcFeetAndInchesToCentimeters(0,1);
		calcFeetAndInchesToCentimeters(0,-19);
		calcFeetAndInchesToCentimeters(0,13);
		calcFeetAndInchesToCentimeters(156);
		calcFeetAndInchesToCentimeters(157);
	}

	
	public static double calcFeetAndInchesToCentimeters(double feet, double inches) {
		if(feet>=0 && (inches>=0 && inches<=12)) {
			double centimeters = ((feet*12) + inches)*2.54;
			System.out.println(feet + " feet, " + inches + " inches= " + centimeters + 
					" centimeters");
			return centimeters;
		}
		else {
			System.out.println("Invalid prameter(s)");
			return -1;
		}
	}
	
	
	public static void calcFeetAndInchesToCentimeters(double inches) {
			double inchesToFeet = (int)inches/12;
			double inchesLeft = (int)inches%12;
			calcFeetAndInchesToCentimeters(inchesToFeet, inchesLeft);	
	}
}

import static java.lang.Math.round;
public class SpeedConverter {

	
	public static long toMilesPerHour(double kilometersPerHour) {
		
		double mph;
		long roundedmph;
		if(kilometersPerHour <0){
			roundedmph=-1;
		}
		else {
			mph = (kilometersPerHour/1.60934);
			//System.out.println(mph);
			//System.out.println((mph*100)+0.5);
			//System.out.println(round((mph*100)+0.5));
			//System.out.println(round((mph+0.5)*100)/100);
			roundedmph = round((mph+0.5)*100)/100;
			
		}
		return (roundedmph);
	}
	
	public static void printConversion(double kilometersPerHour) {
		
		if(kilometersPerHour <0){
			System.out.println("Invalid Value");
		}
		else {
			System.out.println(kilometersPerHour + " km/h = " +  
					toMilesPerHour(kilometersPerHour) + " mi/h");
		}
		
		
	}
	
	// test
	public static void main(String[] args) {
	
		//printConversion(1.5);
		//printConversion(10.25);
		//printConversion(-10.25);
		//printConversion(95.75);
		//printConversion(-1.0);
		//System.out.println(toMilesPerHour(-1.0));
	}
}//end of SpeedConverter

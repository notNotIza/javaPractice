
public class MinutesToYearsDaysCalculator {

	public static void main(String[] args) {
		printYearsAndDays(525600);
		printYearsAndDays(1051200);
		printYearsAndDays(561600);
	}
	
	
	public static void printYearsAndDays(long minutes) {
		if(minutes<0) {
			System.out.println("Invalid Value");
		}
		else {
			long numOfMinutesInAYear = 525600;
			long numOfMinutesInADay = 1440;
			long years = minutes/numOfMinutesInAYear;
			long days = (minutes%numOfMinutesInAYear)/numOfMinutesInADay;
			
			System.out.println(minutes + " min" + " = " +
			years + " y and " + days + " d " );
		}
	}
	
	

	
}//end of class

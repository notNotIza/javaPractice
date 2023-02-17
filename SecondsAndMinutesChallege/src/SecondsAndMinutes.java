
public class SecondsAndMinutes {

	
	
	public static void main(String[] args){
		System.out.println(getDurationString(65,45));
		System.out.println(getDurationString(100,30));
		System.out.println(getDurationString(4000));
	}
	
	
	public static String getDurationString(int minutes, int seconds){
		if (minutes >= 0 && (seconds>=0 && seconds<=59)) {
			int hours = minutes/60;
			int minutesRem = minutes%60;
			
			
			//add leading zeros if there is only one digit;
			String hoursString = hours + "h";
			String minutesRemString = minutesRem + "m";
			String secondsString = seconds + "s";
			
			if(hours<10) {
				hoursString = "0" + hoursString;
			}
			if(minutesRem<10) {
				minutesRemString = "0" + minutesRemString;
			}
			if(seconds<10) {
				secondsString = "0" + secondsString;
			}
			//
			
			return hoursString  + " " + minutesRemString + " " 
			+ secondsString;
		}
		else {
			return "invalid value";
		}
	}
	
	
	public static String getDurationString(int seconds) {
		if (seconds>=0) {
			int minutes = seconds/60;
			int secondsRem = seconds%60;
			return getDurationString(minutes, secondsRem);
		}
		else {
			return "invalid value";
		}
	}
	
	
}


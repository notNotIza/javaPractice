
public class LeapYear {
	
	public static boolean isLeapYear(int year) {
		boolean ans=false;
		if (year >= 1 && year <=9999) {
			if(year%4==0) {
				if(year%100==0) {
					if(year%400==0) {
						ans = true;
					}	
				}
				else {
					ans=true;
				}
				
			}
			
		}
		return ans;
	}
	
	
	
	
	public static void main(String[] args) {
		System.out.println(isLeapYear(2000));
		System.out.println(isLeapYear(1999));
		System.out.println(isLeapYear(2004));
		System.out.println(isLeapYear(2008));
		System.out.println(isLeapYear(2012));
		System.out.println(isLeapYear(2024));
	}

}

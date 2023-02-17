
public class DecimalComparator {

	
	public static boolean areEqualByThreeDecimalPlaces(double numberA, double numberB) {
		
		int intA = (int)(numberA*1000);
		int intB = (int)(numberB*1000);
		
		if(intA==intB){
			return true;
		}
		else {
			return false;
		}	
		
	}
	
	
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println(areEqualByThreeDecimalPlaces(-3.1756, -3.175));
		System.out.println(areEqualByThreeDecimalPlaces(3.176, -3.175));
		System.out.println(areEqualByThreeDecimalPlaces(-3.0, -3.0));
		System.out.println(areEqualByThreeDecimalPlaces(-3.126, 3.126));
		//System.out.println();
		
	}

}

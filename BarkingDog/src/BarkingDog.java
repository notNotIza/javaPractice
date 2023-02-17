
public class BarkingDog {


	public static boolean shouldWakeUp(boolean barking, int hourOfDay){
		if (barking) {
			if(hourOfDay<0 || hourOfDay>23) {
				//System.out.println("f");
				return false;
			}else if(hourOfDay<8 || hourOfDay>22){
				//System.out.println("t");
				return true;
			}else {
				//System.out.println("f");
				return false;
			}
		}else {
			//System.out.println("f, dog not barking");
			return false;
		}
	}
	
	
	public static void main(String[] args) {
		shouldWakeUp(true,-1);
		shouldWakeUp(true,2);
		shouldWakeUp(false,2);
		shouldWakeUp(true,22);
		 
		
		

	}

}

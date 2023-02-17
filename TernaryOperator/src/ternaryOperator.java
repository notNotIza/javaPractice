
public class ternaryOperator {

	public static void main(String[] args) {
		System.out.println("what are ternary operators?");
		// ternary operator: a shortcut to assigning one of two values to a variable 
		//                   depending on a given condition
	
	// recall:
	boolean isCar= false;
	if(isCar){
		System.out.println("this is not supposed to happen");
	}
	else {
		System.out.println("is car is false");
	}
	
	// ternary operator demo:
	String gender = "non-binary";
	boolean isFemale= gender=="female"?  true:false;
	
	if(isFemale) {
		System.out.println("the female washroom is on the left");
	}
	
	}//end of main
	
	
	
	

}

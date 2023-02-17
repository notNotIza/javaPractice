import static java.lang.Math.PI;;
public class AreaCalculatorChallege {

	public static void main(String[] args) {
		System.out.println(area(-1.0));
		System.out.println(area(5.0));
		System.out.println(area(5.0,4.0));
		System.out.println(area(5.0,-1.0));

	}
	
	//computes area of a circle
	public static double area(double radius) {
		if(radius<0) {
			return -1.0;
		}
		return radius*radius*PI;
	}
	
	public static double area(double length, double width) {
		if(length<0 || width<0) {
			return -1.0;
		}
		return length*width;
	}

}//end of class

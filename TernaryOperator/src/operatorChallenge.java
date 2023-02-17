
public class operatorChallenge {

	public static void main(String[] args) {
		double var1 = 20.00;
		double var2 = 80.00;
		double var3 = (var1+var2)*100.00;
		// System.out.println(var3);
		double var4 = var3 % 40.00;
		boolean var5 = var4==0 ? true:false;
	
		System.out.println(var5);
		if(!(var5)) {
			System.out.println("Got some remainder");
		}
	}

}

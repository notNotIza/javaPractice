
public class ifThenstatements {

	public static void main(String[] args) {
		boolean isAlien = true;
		if(isAlien == false) {
			System.out.println("not an alien");
		}
		else {
			System.out.println("is alien");
		}
		
		int topScore = 0;
		if(topScore ==100){
			System.out.println("you got the high score!");
		}
		else if(topScore>100){
			System.out.println("you got way above the highscore?!");
		}
		
		int secondTopScore = 90;
		if(topScore>secondTopScore && topScore<100) {
			System.out.println("your score is greater than the second top score and less than 100");
		}
		else if(topScore<secondTopScore && topScore>=50) {
			System.out.println("your score is less than the second top score but you passed");
		}
		else if(topScore< 50 || topScore==0){
			System.out.println("you score is low...");
		}
		else {
			System.out.println("your score is?!...");
		}

	}
}


public class methods {

	public static void main(String[] args) {
		determineWinner(100,200);
	}

	//method that figures out who wins
	
	public static void determineWinner(int playerOneScore,int playerTwoScore) {
		if(playerOneScore>playerTwoScore) {
			System.out.println("Congratulations, player 1 you won!");
		}
		else if(playerTwoScore>playerOneScore) {
			System.out.println("Congratulations, player 2 you won!");
		}
		else if (playerTwoScore==playerOneScore) {
			System.out.println("Wow, its a tie!");
		}
		else {
			System.out.println("none of you two won?");
		}
	}
}

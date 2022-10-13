import java.util.ArrayList;
import java.util.Scanner; 

//now have to draw the next card for the winner while keeping track of 

public class App {

	public static void main(String[] args) {
		
		Deck deck = new Deck();
		
		Player player1 = new Player();
		
		Player player2 = new Player();
		
		deck.shuffle();
		
		player1.setName("Tom");
		player2.setName("Ethan");
		
		for(int i = 0; i < 52; i++) {
			if(i %2 == 0) {
				player1.draw(deck);
				
			}
			else {
				player2.draw(deck);
			}
		}
		player1.describe();
		player2.describe();
		
		for(int n = 0; n < 26; n++) {
			int p1Value = player1.flip();
			int p2Value = player2.flip();
			System.out.print("Round " + (n+1));
			
			if( p1Value> p2Value) {
				player1.incrementScore();
				System.out.println(" :WOO Player 1 won the draw! The score is: P1: " + player1.getScore() + " vs P2: " + player2.getScore());
			}
			else if ( p2Value > p1Value) {
				
				player2.incrementScore();
				System.out.println(" :WOW Player 2 won the draw! the score is: P1: " + player1.getScore() + " vs P2: " + player2.getScore());
			}
			else
				System.out.println(" Tie! ");
		}
		
		System.out.println("\n****** END OF GAME ******");
		if(player1.getScore() > player2.getScore())
			System.out.println("Player 1, "+player1.getName() + ", won. Total score: " + player1.getScore());
		else if(player2.getScore() > player1.getScore())
			System.out.println("Player 2, " + player2.getName() + ", won. Total score: " + player2.getScore());
		else
			System.out.println("it's a tie");
		/*
		Cards cards1 = new Cards();
		ArrayList<Integer> playerCardDeck1 = cards1.initializeDeck();
		cards1.printDeck();
		
		Cards cards2 = new Cards();
		ArrayList<Integer> playerCardDeck2 = cards2.initializeDeck();
		cards2.printDeck();
		
		boolean keepPlaying = true;
		
		while(keepPlaying) {
			int winningNumber = cards1.whoWon(cards1.drawCard(), cards2.drawCard());
			if( winningNumber == cards1.drawCard()){
				cards1.addToWinner(cards2.drawCard());
				cards1.printDeck();	
			
				cards2.removeFromLoser();
				cards2.printDeck();
			}
			if(winningNumber == cards2.drawCard()){
				cards2.addToWinner(cards1.drawCard());
				cards2.printDeck();	
			
				cards1.removeFromLoser();
				cards1.printDeck();
			}
			if(cards1.cardsInDeck() == 0) {
				System.out.println("Play 1 ran out of cards. Game Over");
				break;
			}
			
			if(cards2.cardsInDeck() == 0) {
				System.out.println("Play 2 ran out of cards. Game Over");
				break;
			}
			System.out.println("\n\nTo exit press 2 \nTo keep playing press any key");
			Scanner myObj = new Scanner(System.in);  // Create a Scanner object
			int keepPlayingInput = myObj.nextInt();  // Read user input
			if(keepPlayingInput == 2)
				break;
		}
		
		*/
	}

}

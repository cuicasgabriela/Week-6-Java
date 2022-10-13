/*import java.util.ArrayList;
import java.util.Arrays;
import java.util.Random;
import java.util.*;  

public class Cards {
	
	private ArrayList<Integer> cardDeck = new ArrayList<Integer>();
	
	public ArrayList<Integer> initializeDeck() {
		//number of cards in a deck including jokers = 54 
		//to fill both players hands I will use a loop for 54/2 = 27
		
		
		//Below are the numerical values that the cards could have.
		//These are all the possible values to add
		//11 = ace, 12 = j, 13 = queen, 14=king , 15 = joker cards
		ArrayList<Integer> cards = new ArrayList<Integer>(Arrays.asList(2,3,4,5,6,7,8,9,10,11,12,13,14,15));
		
		//add to card deck do
		Random random =  new Random();
		
		while( cardDeck.size()< 27) {
			//check there's not more than 4 of each numerical value for normal and not more than 2 jokers
			for(int i = 0; i < cardDeck.size(); i++) {
				if(Collections.frequency(cardDeck, 15) == 2) {
					cards.remove(cards.size()-1);
					//System.out.println("Removed Joker from possible list");
				}
				if( Collections.frequency(cardDeck, cardDeck.get(i)) == 4) {
					//System.out.println("Removed card from possible list " + cardDeck.get(i));
					cards.remove(cardDeck.get(i));
				}			
			}

			cardDeck.add(random.nextInt(cards.get(cards.size()-1) - cards.get(0)) + cards.get(0));
		}

		
		return cardDeck;
	
	}
	
	public static int whoWon(int player1, int player2) {
		if(player1 > player2) {
			System.out.println("\n Player 1 won " + player1 + " > " + player2);
			return player1;
			}
		else if(player1 < player2) {
			System.out.println("\n Player 2 won " + player2 + " > " + player1);
			return player2;
		}
			
		else {
			System.out.println("\n Tie " + player1 + " = " + player2);
			return 0;
			}
	}
	
	public int cardsInDeck() {
		return cardDeck.size();
	}
	
	// draw card and check which player won
	public int drawCard() {
		return cardDeck.get(0);
	}
	
	// then add the winner card to the end
	
	public void addToWinner(int value){
		cardDeck.add(value);
	}
	// then remove the losing card
	public void removeFromLoser(){
		cardDeck.remove(0);
	}
	
	public void printDeck() {
		System.out.println("\nThe size of the card deck is: " + cardDeck.size());
		for(int n: cardDeck) {
			System.out.print(n + " ");
		}
	}
	
}
*/

import cardgame.Card;
import cardgame.Deck;
import java.util.Queue;
import java.util.LinkedList;

/*
1. If exactly one player’s pile is empty, the other player adds all the cards in the discard pile
of his or her pile without changing the order. The round ends.
2. If both players’ piles are empty at the same time, both players’ piles remain empty. The round ends.
3. Each player turns over the top card from his/her pile.
4. If the cards match in value, both cards are added to the discard pile in either order and play
5. If the cards do not match in value, the player whose card has the greater value adds any
pile to the bottom of his/her pile without changing the order of the cards in the discard pile.
both cards just played to the bottom of his/her pile in either order. The round ends.
*/

///import java.util.Queue;
import java.util.LinkedList;

public class CardGame
{
   // postcondition: all cards have been removed from source
   //                and added to destination in the same order
   public void appendQueue(Queue<Card> destination, Queue<Card> source) {
      /* Write the code for part (a) here */
   }
   
   // precondition:  pile1.length() > 0; pile2.length() > 0
   // postcondition: pile1 and pile2 have been updated according to the
   //                rules of the game   
   public void oneRound(Queue<Card> pile1, Queue<Card> pile2) {
      /* Write the code for part (b) here */
   }

   /**************** Other Fields and Methods ****************/
	
	public static void main (String[] args) {
      new CardGame();
   }
    
   public CardGame() {
      deal(player1);
      deal(player2);
      System.out.println("Original Hands:");
      showHand("Player one: ", player1);
      showHand("Player two: ", player2);
    	
    	for (int i = 1; i < 4; i++)
    	{
    		System.out.println("\n--------------------\nRound " + i + ":");
    		oneRound(player1, player2);
    		showHand("Player one: ", player1);
    		showHand("Player two: ", player2);
    	}
   }
 
	public void deal(Queue<Card> pile) {
		for (int i = 0; i < 6; i++)
			pile.offer(deck.deal());
	}
	
	public void showHand(String player, Queue<Card> pile) {
		System.out.println("\n" + player);
		System.out.print("  ");
		System.out.println(pile);
	}
	
   private Deck deck = new Deck();
   private Queue<Card> player1 = new LinkedList<Card>();
   private Queue<Card> player2 = new LinkedList<Card>();
}

public class Card implements Comparable<Card>
{
	private static final String[] suit = {"Clubs", "Diamonds", "Hearts", "Spades"};
	private static final String[] rank = {"Ace", "2", "3", "4", "5", "6", "7", "8", "9", "10", "Jack", "Queen", "King" };
	private int cardValue;
	private int suitIndex;
	
	public Card(int value) {
		cardValue = value % 13;
		suitIndex = value / 13;	
	}
	
	public int value() {
		return cardValue;
	}
	
	public int compareTo(Card otherCard) {
		return cardValue - otherCard.cardValue;
	}
	
	public boolean equals(Object o) {
		Card c = (Card) o;
		return cardValue == c.cardValue;
	}
	
	public String toString() {
		return rank[cardValue] + " of " + suit[suitIndex];
	}
}

public class Deck
{
	private boolean[] played;
	private int cardsUsed;

	/**
	* Initializes a newly created DeckOfCards object.
	**/
	public Deck() {
		cardsUsed = 0;
		played = new boolean[52];
	}

	/**
	* Deals a single card.
	* @returns A Card object representing the current card being dealt.
	* @throws OutOfCardException if all the cards have been dealt.
	**/
	public Card deal() {
		if (cardsUsed > 51)
			throw new OutOfCardsException();

		return new Card(getRandomCardNumber());
	}

	/**
	* Shuffles the deck of cards.
	**/
	public void shuffle() {
		for (int i = 0; i < 52; i++)
			played[i] = false;
		cardsUsed = 0;
	}

	private int getRandomCardNumber() {
		int card = 0;
		do
		{
		 	card = (int)(Math.random() * 52);
		}
		while (played[card]);
		played[card] = true;
		cardsUsed++;
		return card;
	}
}

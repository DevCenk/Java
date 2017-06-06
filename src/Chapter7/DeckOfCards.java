package Chapter7;

import java.security.SecureRandom;

public class DeckOfCards
{
	private Card[] deck;
	private static final int NUMBER_OF_CARDS = 52;
	private int currentCard;
	
	private static final SecureRandom randomNumbers = new SecureRandom();
	
	public DeckOfCards()
	{
		String[] faces = { "Ace", "Deuce", "Three", "Four", "Five", "Six",
				 "Seven", "Eight", "Nine", "Ten", "Jack", "Queen", "King" }; 
		String[] suits = { "Hearts", "Diamonds", "Clubs", "Spades" }; 
	
		deck = new Card[NUMBER_OF_CARDS];
		currentCard = 0;
	
		for (int cardNum = 0; cardNum < deck.length; cardNum++)
			deck[cardNum] = new Card(faces[cardNum % 13], suits[cardNum / 13]);			
	}
	
	public void shuffle()
	{
		currentCard = 0;
		
		for(int first = 0; first < deck.length; first++)
		{
			int second = randomNumbers.nextInt(NUMBER_OF_CARDS);
			
		    Card temp = deck[first];
		    deck[first] = deck[second];
		    deck[second] = temp;			
		}		
	}
	
	// deal one Card
	public Card dealCard()
	{
		if(currentCard < deck.length)
			return deck[currentCard++];
		else
			return null;
	}

}

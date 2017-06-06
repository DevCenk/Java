package Chapter7;

public class Card
{ 
	private final String suit;
	private final String face;
	
	public Card(String cardFace, String cardSuit)
	{
		this.face = cardFace;
		this.suit = cardSuit;		
	}
	
public String toSting()
	{
		return face + "of" + suit;
	}
	
}

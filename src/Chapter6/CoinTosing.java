package Chapter6;

import java.security.SecureRandom;

public class CoinTosing 
{
	private static final SecureRandom randomNumbers = new SecureRandom();
	
	private enum Coin {HEADS, TAILS};

	public static void main(String[] args) 
	{
		Coin side;
		int head = 0;
		int tail = 0;
		
		int a = flip();
		
		if(a==0) 
		{
			side = Coin.HEADS;
			++head;
		}			
		else
		{
			side = Coin.TAILS;
			++tail;
			
		}
				

	}
	
	public static int flip()
	{
		int binary = randomNumbers.nextInt(2);
		
		return binary;
	} 
	

}

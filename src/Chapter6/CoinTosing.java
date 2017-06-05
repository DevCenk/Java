package Chapter6;

/** ANMERKUNG :// soruda buradan bisey dönmesini istiyor ben öyle yapmadým
 * @author cenks BU PROGRAM BÝTMEDÝ ENUM FALN YAPADIM TEKRAR YAP
 *
 */

import java.security.SecureRandom;
import java.util.Scanner;

public class CoinTosing 
{
	private static final SecureRandom randomNumbers = new SecureRandom();
	
	private enum Coin {HEADS, TAILS};
	
	private static Coin side;

	public static void main(String[] args) 
	{	
		int heads = 0;
		int tail = 0;
		boolean flag = true;
		
		Scanner input = new Scanner(System.in);
		
		System.out.println("Play the game");
		System.out.printf("%nenter 1 for play OR 0 for exit:");
		
		while(flag) 
		{
			int decide = input.nextInt();
			
			if (decide == 0)
			{
				System.out.println();
				System.out.println("--------------------------------------");
				System.out.printf("total Heads: %d%ntotal Tails: %d%n",
						heads, tail);
				System.out.println("--------------------------------------");
				flag =false;	
			}				
			else 				
			{
				flip();
				
				if(side == Coin .HEADS) 
				{
					++heads;
					System.out.printf("it is heads%n");
				}			
				else
				{
					++tail;
					System.out.printf("it is tail%n");
				}
				
				System.out.printf("%nenter 1 to continue OR 0 for exit:");
			}
		}
		
		System.out.printf("%nyou left the game!!!");
	}
	
	public static void flip() // soruda buradan bisey dönmesini istiyor ben öyle yapmadým
	{
		int binary = randomNumbers.nextInt(2);
	
		if(binary ==0)	
			side = Coin.HEADS;

		if(binary ==1)
			 side = Coin.TAILS;

	}
}

package Chapter6;
import java.security.SecureRandom; 

/**
 * @author cenks
 * // Roll a six-sided die 6,000,000 times
 * To show that the numbers produced by nextInt occur with approximately equal likelihood
 *
 */
public class RollDie 
{
	public static void main(String[] args) 
	{
		// randomNumbers object will produce secure random numbers
		SecureRandom randomNumbers = new SecureRandom();
		
		int frequency1 = 0;
		int frequency2 = 0;
		int frequency3 = 0;
		int frequency4 = 0;
		int frequency5 = 0;
		int frequency6 = 0;
		
		for (int roll = 1; roll <=6000000; roll++)
		{
			int face = 1 + randomNumbers.nextInt(6);
						
			switch (face) 
			{		
			case 1:				
				 ++frequency1; 
				break;
			case 2:
				++frequency2; 
				break;
			case 3:
				++frequency3; 
				break;
			case 4:
				++frequency4; 
				break;
			case 5:
				++frequency5; 
				break;
			case 6:
				++frequency6; 
				break;
			}						
		}
		
		System.out.println("Face\tFrequenz"); // output headers
		System.out.printf("1:\t%d%n2:\t%d%n3:\t%d%n4:\t%d%n5:\t%d%n6:\t%d%n",
				frequency1,frequency2,frequency3,frequency4,frequency5,frequency6);				
	}
}


/**
 * int number = shiftingValue + differenceBetweenValues * randomNumbers.nextInt(scalingFactor);
 * 
 * A Note About Performance:
	Using SecureRandom instead of Random to achieve higher levels of security incurs a significant
	performance penalty. For �casual� applications, you might want to use class Random
	from package java.util�simply replace SecureRandom with Random
 *
 */


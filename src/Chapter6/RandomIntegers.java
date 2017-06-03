package Chapter6;

import java.security.SecureRandom; 
// program uses class SecureRandom
// Rolling a Six-Sided Die 20 times
public class RandomIntegers
{
	
	public static void main(String[] args) 
	{
		SecureRandom randomNumbers = new SecureRandom();
		
		for(int counter = 1; counter <= 20; counter++)
		{
			int face = 1 + randomNumbers.nextInt(6);
			
			System.out.printf("%d ",face);
			
			// if counter is divisible by 5, start a new line of output
			if(counter %5 == 0)
				System.out.println();
		}		
	}
}

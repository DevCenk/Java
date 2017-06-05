package Chapter7;

//Anmerkung:  The single statement in line 14 of this program replaces lines 22–45(switch case) of RollDie example at chapter 6 

import java.security.SecureRandom; 

public class RollDie1
{
	public static void main(String[] args) 
	{
		// randomNumbers object will produce secure random numbers
		SecureRandom randomNumbers = new SecureRandom();
		int[] frequency = { 0, 0, 0, 0, 0, 0, 0 }; // oder int[] frequency = new int[7];
		
		for (int roll = 1; roll <=6000000; roll++)		
			++frequency[1+randomNumbers.nextInt(6)];
			// The single statement in line 14 of this program replaces lines 22–45(switch case) of RollDie example at chapter 6 
			
		System.out.println("Face\tFrequenz"); // output headers
		
		for(int face =1; face < frequency.length ; face++)
			System.out.printf("%4d:\t %d%n", face, frequency[face]);
		
		
	}

}


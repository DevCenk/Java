package Chapter6;
// a game of change; introducing enum(Enumeration) types(like class; reference type)

/**
 * You roll two dice. Each die has six faces, which contain one, two, three, four, five and
	six spots, respectively. After the dice have come to rest, the sum of the spots on the two
	upward faces is calculated. if the sum is 7 or 11 on the first throw, you win. if the sum
	is 2, 3 or 12 on the first throw (called “craps”), you lose (i.e., the “house” wins). if the
	sum is 4, 5, 6, 8, 9 or 10 on the first throw, that sum becomes your “point.” To win,
	you must continue rolling the dice until you “make your point” (i.e., roll that same
	point value). You lose by rolling a 7 before making your point. 
 */

import java.security.SecureRandom;
import java.util.Scanner;

// Craps class simulates the dice game craps.
public class CrapsGameModification
{
	private static final SecureRandom randomNumbers = new SecureRandom();
	// This enables us ;
	// to create one SecureRandom object that’s reused in each call to rollDice. If there
	// were a program that contained multiple instances of class Craps, they’d all share this one
	// SecureRandom object
	
	// enum type with constants that represent the game status
	private enum Status { CONTINUE, WON, LOST };
	// Status is a type called an enum type, which, in its simplest form, declares
	// a set of constants represented by identifiers.
	// inside the braces is a comma-separated list of
	// enum constants, each representing a unique value
	
	private static final int SNAKE_EYES = 2;
	private static final int TREY = 3;
	private static final int SEVEN = 7;
	private static final int YO_LEVEN = 11;
	private static final int BOX_CARS = 12; 

	// plays one game of craps
	public static void main(String[] args)
	{
		Scanner input = new Scanner(System.in);
		
		int myPoint = 0;  // point if no win or loss on first roll
		// if you do not initialize myPoint, the compiler
		// issues an error, because myPoint is not assigned a value in every case of the switch
		// statement, and thus the program could try to use myPoint before it’s assigned a value.
		
		Status gameStatus; // enum type status // can only contain CONTINUE, WON or LOST
		// assigned in each of the switch statement so I don t need to assign here
		
		int bankBalance = 1000;
		int wager = 0;
		boolean flag = true;
		
		System.out.printf("your bank balance is: %d%n", bankBalance);
	
		while(flag)
		{
			System.out.printf("%n---------------------------------------------------------%n");
			System.out.printf("%nenter a wager: ");
			wager = input.nextInt();
		
			if(wager <= bankBalance) 
			{
				int sumOfDice = rollDice();
				
				switch (sumOfDice) 
				{
				
				case SEVEN:	// win with 7 on first roll		
				case YO_LEVEN:  // win with 11 on first roll
					gameStatus = Status.WON;		
					break;
				case SNAKE_EYES: // lose with 2 on first roll
				case TREY: // lose with 3 on first roll
				case BOX_CARS: // lose with 12 on first roll 
					gameStatus = Status.LOST;	
					break;
				default: // did not win or lose, so remember point
					gameStatus = Status.CONTINUE;
					myPoint = sumOfDice; // remember the point 
					System.out.printf("your point: %d%n ", myPoint);
					break;
				}
				
				while(gameStatus == Status.CONTINUE)
				{
					sumOfDice = rollDice();  // roll dice again
					
					if(sumOfDice == myPoint) // win by making point
						gameStatus = Status.WON;				
					if(sumOfDice == SEVEN) // lose by rolling 7 before point
						gameStatus = Status.LOST;				
				}
				
				// display won or lost message
				if(gameStatus == Status.WON) 
				{
					System.out.printf("%nPlayer wins%n");
					bankBalance += wager;
					System.out.printf("%nyou new Bank Balance: %d%n", bankBalance);
					chatter();
				}			
				else
				{
					System.out.printf("%nPlayer loses%n");
			    	bankBalance -= wager;
			    	System.out.printf("%nyou new Bank Balance: %d%n", bankBalance);
			    
			    	if (bankBalance != 0) 
					{
						chatter();					
					}
					else
						flag = false;		    		    	
				}			
			}	
		}	
		System.out.printf("Sorry. You busted!");
		
	}
	
	// roll dice, calculate sum and display results	
	public static int rollDice()
	{
		// pick random die values
		int die1 = 1 + randomNumbers.nextInt(6);
		int die2 = 1 + randomNumbers.nextInt(6);
		
		int sum = die1 + die2;
		
		// display results of this roll
		System.out.printf("%nPlayer rolled %d + %d = %d%n",
				die1 ,die2 ,sum);
	
		return sum;
	}
	
	public static void chatter()
	{
		int random = randomNumbers.nextInt(3);
		
		if(random == 0)
		System.out.println("Oh, you're going for broke, huh?");
		else if(random == 1 )
			System.out.println("Aw c'mon, take a chance!");
		else 
			System.out.println("You're up big."+ 
		"Now's the time to cash in your chips!");
	}	
}

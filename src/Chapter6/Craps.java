package Chapter6;
// a game of change; introducing enum(Enumeration) types(like class; reference type)

/**
 * You roll two dice. Each die has six faces, which contain one, two, three, four, five and
	six spots, respectively. After the dice have come to rest, the sum of the spots on the two
	upward faces is calculated. If the sum is 7 or 11 on the first throw, you win. If the sum
	is 2, 3 or 12 on the first throw (called “craps”), you lose (i.e., the “house” wins). If the
	sum is 4, 5, 6, 8, 9 or 10 on the first throw, that sum becomes your “point.” To win,
	you must continue rolling the dice until you “make your point” (i.e., roll that same
	point value). You lose by rolling a 7 before making your point. 
 */

import java.security.SecureRandom;

// Craps class simulates the dice game craps.
public class Craps
{
	private static final SecureRandom randomNumbers = new SecureRandom();
	// This enables
	// us to create one SecureRandom object that’s reused in each call to rollDice. If there
	// were a program that contained multiple instances of class Craps, they’d all share this one
	// SecureRandom object
	
	// enum type with constants that represent the game status
	private enum Status { CONTINUE, WON, LOST };
	
	private static final int SNAKE_EYES = 2;
	private static final int TREY = 3;
	private static final int SEVEN = 7;
	private static final int YO_LEVEN = 11;
	private static final int BOX_CARS = 12; 

	// plays one game of craps
	public static void main(String[] args)
	{
		int myPoint = 0;  // point if no win or loss on first roll
		Status gameStatus; // can contain CONTINUE, WON or LOST
		
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
			System.out.printf("Poin is %d%n ", myPoint);
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
			System.out.println("Player wins");
		else
			System.out.println("Player loses");			
	}
	
	// roll dice, calculate sum and display results	
	public static int rollDice()
	{
		// pick random die values
		int die1 = 1 + randomNumbers.nextInt(6);
		int die2 = 1 + randomNumbers.nextInt(6);
		
		int sum = die1 + die2;
		
		// display results of this roll
		System.out.printf("Player rolled %d + %d = %d%n",
				die1 ,die2 ,sum);
	
		return sum;
	}	
}

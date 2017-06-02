package Chapter6;

import java.util.Scanner;

// executed and tried git.
//Programmer-declared method maximum with three double parameters.
// deneme
//deneme1
public class MaximumFinder
{

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		
		Scanner input = new Scanner(System.in);
		
		System.out.println(
				"Enter three floating-point values separated by spaces: ");
		System.out.print(
				"Make the decimal side with ',' (not with'.'):");
		double number1 = input.nextDouble();
		double number2 = input.nextDouble();
		double number3 = input.nextDouble();
		
		// determine the max value
		double result1 = maximum1(number1, number2, number3);
		double result2 = maximum1(number1, number2, number3);
		
		// display maximum value
		System.out.print("Maximum is: " + result1);
		System.out.println();
		System.out.print("Maximum is: " + result2);
	}
	
	
	static double maximum1(double a, double b, double c)	
	{
		double maxNum = a;
		
		if(b>maxNum)
			maxNum = b;
		if(c>maxNum)
			maxNum = c;

		return maxNum;
	}	
	
	static double maximum2(double a, double b, double c)	
	{
		return Math.max(a, Math.max(b, c));
	}
}

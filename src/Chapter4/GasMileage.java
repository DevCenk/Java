package Chapter4;

import java.util.Scanner;

public class GasMileage
{

	
	public static void main(String[] args)
	{
		Scanner input = new Scanner(System.in);
		
		int miles = 0, galons = 0; 
		int answer = 0;
	    double average = 0.0, totalAverage = 0.0;
	
		System.out.print("enter 1 for calculation 0 for exit: ");
		answer = input.nextInt();
		
		while(answer == 1)		
		{
			System.out.printf("%nenter miles: ");
			miles = input.nextInt();
			System.out.printf("enter galons: ");
			galons = input.nextInt();
			
			average =(double)galons / miles;
			
			/**
			 * 
			 * // cast operator : This enables you to “take control” from the compiler.
			            You essentially say, “I know this conversion might cause
			          	loss of information, but
				    	for my purposes here, that’s fine.”
			 * @param args
			 */
			
			totalAverage += average;
			
			System.out.printf("average galon per mile: %.2f%n",average);
			System.out.printf("Total average galon per mile: %.2f%n%n",totalAverage);
			System.out.println("--------------------------------------------------");
			
			System.out.printf("enter 1 for calculation 0 for exit: ");
			answer = input.nextInt();
						
		}
		
		System.out.printf("%nXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXX");
		System.out.printf("%nend result: total %.2f galon per mile", totalAverage);
													
	}


}

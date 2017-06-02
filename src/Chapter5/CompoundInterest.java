package Chapter5;

public class CompoundInterest {

	public static void main(String[] args) 
	{
		double p = 1000;  // the original amount invested (i.e., the principal)
		double r = 0.05; //  the annual interest rate (e.g., use 0.05 for 5%)
		double a = 0;   //   the amount on deposit at the end of the nth year   
		
		System.out.printf("%s%25s%n","Year","Amount of Deposit");
		
		for(int years = 1; years <=10; years++ )
		{
			a = p* Math.pow(1+r,years);
			System.out.printf("%4d%,25.2f%n",years, a);
			
		}
	}

}

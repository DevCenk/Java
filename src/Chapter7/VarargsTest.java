package Chapter7;


// variable-length argument lists  // ellipsis (...)

/**
 * 	variable-length argument lists, you can create methods that receive an unspecified
	number of arguments.
 *
 *	 A type followed by an ellipsis (...) in a method’s parameter list
	indicates that the method receives a variable number of arguments of that particular type.
	
	 Java treats the variable-length argument list as an array whose elements are all of the same type

 */


public class VarargsTest
{
	// calculate average
		public static double average(double... numbers) // ellipsis (...) : variable-length argument list
														// ellipsis (...) :means average method receives a variable length sequence of double		
		{
			double total = 0.0;
					
			for(double d : numbers)
				total += d;
			
			//Java treats the variable-length argument list as an array whose elements are all of the same type
			return total / numbers.length; 
		}
	
	public static void main(String[] args)
	{
		double d1 = 10.0;
		double d2 = 20.0;
		double d3 = 30.0;
		double d4 = 40.0;
		
		System.out.printf("d1 = %.1f%nd2 = %.1f%nd3 = %.1f%nd4 = %.1f%n%n",
				d1, d2, d3, d4);
		
		System.out.printf("Average of d1 and d2         is: %.1f%n", average(d1, d2));
		System.out.printf("Average of d1, d2 and d3     is: %.1f%n",average(d1, d2, d3));
		System.out.printf("Average of d1, d2, d3 and d4 is: %.1f%n", average(d1, d2, d3, d4));
		

	}
}

package Chapter7;

public class InitArray2 
{
	
	public static void main(String[] args)
	{ 	
		//  Constant variables must be initialized before they’re used and cannot be modified
		// thereafter. If you attempt to modify a final variable after it’s initialized 		
		// in its declaration, the compiler issues an error message
		
		// Constant variables also are called named constants. They often make programs more
		// readable than programs that use literal values (e.g., 10)—a named constant such as
		// ARRAY_LENGTH clearly indicates its purpose, whereas a literal value could have different
		// meanings based on its context
		
		// Multiword named constants should have each word separated from the next with an underscore
		// (_) as in ARRAY_LENGTH
		
		final int ARRAY_LENGTH = 30;
		int[] array = new int[ARRAY_LENGTH];
		
		//  assigns to each element one of the even integers from 2 to 20	
		for(int counter = 0; counter <array.length; counter++)
			array[counter] = 2 + 2 * counter ;
		
		System.out.printf("%s%8s%n", "Index", "Value"); // column headings
		
		// output each array element's value 
		for (int counter =0; counter < array.length; counter++)
		System.out.printf("%5d%8d%n", counter, array[counter]);

	}
}

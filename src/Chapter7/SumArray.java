package Chapter7;

/**
 *	The values supplied as array initializers are often read into a program rather
	than specified in an initializer list. For example, an application could input the values from
	a user or from a file on disk 
	
    Reading the data into a program (rather than “hand coding” it into the program)
	makes the program more reusable, because it can be used with different sets of data.
 *
 */

//Computing the sum of the elements of an array.
public class SumArray 
{
	public static void main(String[] args) 
	{
		int[] array = { 10, 11, 12, 13 };
		int totalA = 0;
		int totalB = 0;
		
		for(int counter = 0 ; counter < array.length; counter++ )
			totalA += array[counter];
		
		for(int element : array)
			totalB += element;
		
		// Ehanced for’s header (e.g., int element) indicates that for each iteration, the int variable
		// element takes on a value in the array. 
		
		System.out.printf("sum of array elemts with normal for : %11d%n", totalA);
		System.out.printf("sum of array elemts with normal Enhanced-for : %d", totalB);
	}
}

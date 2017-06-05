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
		int[] array = { 10, 11, 12, 13};
		int total = 0;
		
		for(int counter = 0 ; counter < array.length; counter++ )
			total += array[counter];
		
		System.out.printf("total of array elemts are: %d", total);								
	}
}

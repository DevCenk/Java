package Chapter7;
//Initializing the elements of an array with an array initializer.

public class InitArray1 
{
	public static void main(String[] args) 
	{
		int[] array = { 32, 27, 64, 18, 95, 14, 90, 70, 60, 37 };  // array initializer and  
																   // initializer list
		//  the array length is determined by the number of elements in the initializer list
		
		// compiler  counts the number of initializers in the list to determine the size
		// of the array, then sets up the appropriate new operation “behind the scenes.”
		
		System.out.printf("%s%8s%n", "Index", "Value"); // column headings
	
		// output each array element's value
		for (int counter = 0; counter < array.length; counter++)
		System.out.printf("%5d%8d%n", counter, array[counter]);
	}
}

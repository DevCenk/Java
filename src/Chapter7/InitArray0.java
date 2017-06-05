package Chapter7;
//Initializing the elements of an array to default values of zero.

public class InitArray0
{
	public static void main(String[] args) 
	{
		// declare variable array and initialize it with an array object
		int[] array = new int[10]; // create the array object 
								  //  array-creation expression that uses keyword new
		
		System.out.printf("%s%8s%n", "index", "value");
		
		for(int counter = 0; counter < array.length; counter++)
		{
			System.out.printf("%5d%8d%n", counter, array[counter]);
		}
	}
}

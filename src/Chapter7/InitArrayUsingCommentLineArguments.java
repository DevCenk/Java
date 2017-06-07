package Chapter7;
// initializing an array using command-line arguments

public class InitArrayUsingCommentLineArguments
{
	public static void main(String[] args)
	{
		// check number of command-line arguments
		if(args.length != 3)
			System.out.printf(
					"%nError: Please re-enter the entire command, including%n" +
					"an array size, initial value and increment.%n");
		else
		{
			// get array size from first command-line argument
			int arrayLength = Integer.parseInt(args[0]);
			int[] array = new int[arrayLength];
			
			// get initial value and increment from command-line arguments
			int initialValue = Integer.parseInt(args[2]);
			int increment = Integer.parseInt(args[2]);
			
			// calculate value for each array element 
			for(int counter = 0; counter <  arrayLength; counter++)
				array[counter] = initialValue + increment * counter; 
			
			System.out.printf("%s%8s%n", "Index", "Value");
			
			// display array index and value
			for(int index = 0; index < arrayLength; index++ )
				System.out.printf("%d%8d%n", index, array[index]);
			
		}

	}
}

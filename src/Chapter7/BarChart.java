package Chapter7;
//for each array element, output a bar of the chart

public class BarChart 
{
	public static void main(String[] args)
	{
		int[] array = { 0, 0, 0, 0, 0, 0, 1, 2, 4, 2, 1 };
		
		System.out.println("Grade distribution:");
		
		// for each array element, output a bar of the chart
		for(int counter = 0; counter < array.length; counter++)
		{
			// output bar label ("00-09: ", ..., "90-99: ", "100: ")
			if(counter == 10)
				System.out.printf("%n%5d: ",100); // field width of 5
			else 
 				System.out.printf("%n%02d-%02d: ",  // 0 flag
						counter*10, counter *10 + 9);
			// The 0 flag in the format specifier displays a
			//leading 0 for values with fewer digits than the field width (2).
			
			// print bar of asterisks 
			for(int star = 0; star < array[counter]; ++star) 
				System.out.print("*");
					
		} 
	}
}

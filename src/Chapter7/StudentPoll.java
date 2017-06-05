package Chapter7;
//Poll analysis program.

/**
 * Twenty students were asked to rate on a scale of 1 to 5 the quality of the food in the
	student cafeteria, with 1 being “awful” and 5 being “excellent.” Place the 20 responses
	in an integer array and determine the frequency of each rating.
 */

	//Java’s exception-handling mechanism, which can be used to detect and
	//handle an ArrayIndexOutOfBoundsException.

	// Exception handling helps you create fault-tolerant programs that can resolve (or handle) exceptions


public class StudentPoll 
{
	public static void main(String[] args)
	{
		// student response array (more typically, input at runtime)
		int[] responses = { 1, 2, 5, 4, 3, 5, 2, 1, 3, 3, 1, 4, 3, 3, 3,
				2, 3, 3, 2, 14 };
		
		int[] frequency = new int[6];  // array of frequency counters // 5 i görebilmek için 6 ya kadar uzatýyor.
		// better than switch
		//  Each element is used as a counter for one of the possible types of survey responses—
		
		for(int answer =0; answer < responses.length; answer++)
		{
			try
			{
				++frequency[responses[answer]];	 //  that line throws an
												//  ArrayIndexOutOfBoundsException to notify 
												// the program of this problem and that catch handles that
			}
			catch (ArrayIndexOutOfBoundsException e) 
			{
				System.out.println(e); // invokes toString method // implicitly calls the exception object’s toString method
				System.out.printf(" responses[%d] = %d%n%n",
						 answer, responses[answer]); 
			}	
			
			// To handle an exception, place any code that might throw an exception in a try statement.
			// The try block contains the code that might throw an exception,
			// and the catch block contains the code that handles the exception if one occurs.	
			
			// When " ++frequency[responses[answer]]; "correctly increments an element
			// of the frequency array, then catch block is ignored
			
			// implicitly calls the exception object’s toString method to
			// get the error message that’s implicitly stored in the exception object and display it. Once
			// the message is displayed in this example, the exception is considered handled and the program
			// continues with the next statement after the catch block’s closing brace
		}
		
		System.out.printf("%s%10s%n", "Rating", "Frequency");
		
		// output each array element's value
		for(int rating =1; rating < frequency.length; rating++)
			System.out.printf("%d%10d%n", rating, frequency[rating] );	
	}
}

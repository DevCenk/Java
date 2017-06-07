package Chapter7;
//Arrays class methods and System.arraycopy

//this class uses Arrays methods sort, binarySearch, equals and fill, and shows
//how to copy arrays with class System’s static arraycopy method

import java.util.Arrays;

/**
 * 	Class Arrays helps you avoid generating basic algorithms by providing static methods for
	common array manipulations.
	
 * 	These methods include sort for sorting an array (i.e., arranging
	elements into ascending order), binarySearch for searching a sorted array (i.e., determining
	whether an array contains a specific value and, if so, where the value is located),
	equals for comparing arrays and fill for placing values into an array.
 */

public class ArrayManipulations 
{
	
	public static void main(String[] args)
	{
		// sort doubleArray into ascending order
		double[] doubleArray = { 8.4 , 9.3, 1.2, 7.9, 3.4 };
		
		//The static method sort of class Arrays orders the array’s elements in ascending order by default
		Arrays.sort(doubleArray);
		System.out.printf("%ndoubleArray: ");
		
		for(double element : doubleArray)
			System.out.printf("%.1f  ", element);
		
		// fill 10-element array with 7s
		int[] filledIntArray = new int[10];
		Arrays.fill(filledIntArray, 7);
		displayArray(filledIntArray, "filledIntArray");
		
		// copy array intArray into array intArrayCopy
		int[] intArray = {1, 2, 3, 4, 5, 6 };
		int[] intArrayCopy = new int[intArray.length];
		
		// static method of System copies the elements of intArray into intArrayCopy
		System.arraycopy(intArray, 0, intArrayCopy, 0, intArray.length);
		displayArray(intArray, "intArray");
		displayArray(intArrayCopy, "intArrayCopy");
		
		// compare intArray and intArrayCopy for equality
		// call static method equals of class Arrays to determine whether all the elements of two arrays are equivalent
		// if the arrays contain the same elements in the same order, the method returns true; otherwise, it returns false. 
		boolean b = Arrays.equals(intArray, intArrayCopy);
		System.out.printf("%n%nintArray %s intArrayCopy%n",
				(b ? "==" : "!=" ));
		
		// compare intArray and filledIntArray for equality
		b = Arrays.equals(intArray, filledIntArray);
		System.out.printf("intArray %s filledIntArray%n",
				(b ? "==" : "!="));
		
		// search intArray for the value 5
		// if value is found, binarySearch returns the index of the element; otherwise, binarySearch returns a negative value
		int location = Arrays.binarySearch(intArray, 5);
		
		if(location >= 0)
			System.out.printf(
					 "Found 5 at element %d in intArray%n", location); 
		else
			System.out.println("5 not found in intArray");
		
		// search intArray for the value 444
		location = Arrays.binarySearch(intArray, 444);
		
		// index of the search key, if it is contained in the array; otherwise, (-(insertion point) – 1).
		// The insertion point is defined as the point at which the key would be inserted into the array: 
		// the index of the first element greater than the key, or a.length if all elements in the array are less than the specified key.
		//  Note that this guarantees that the return value will be >= 0 if and only if the key is found.
			
		// For example, in preceding, the insertion point for the value 444 is the element with index 6 in the array.
		// Method binarySearch changes the insertion point to –6, subtracts 1 from it and returns
		// the value –7. Subtracting 1 from the insertion point guarantees that method binarySearch
		// returns positive values (>= 0) if and only if the key is found. This return value is useful for
		// inserting elements in a sorted array. 
		
		//Common Programming Error !!
		// Passing an unsorted array to binarySearch is a logic error—the value returned is undefined.

		if(location >= 0)
			System.out.printf(
					 "Found 444 at element %d in intArray%n", location); 
		else
			System.out.println("444 not found in intArray");
		
		// output values in each array
	}
	
	public static void displayArray(int[] array, String description)
	{
		System.out.printf("%n%s: ", description);
		for(int element : array)
			System.out.printf("%d ", element);		
	}
}

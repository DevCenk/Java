package Chapter7;

// demonstrates  pass-by-value and pass-by-reference for arrays
// IMPORTANCE OF REFERENCES

/**
 * 
 * When an argument is passed by value, a copy of the argument’s value is
	passed to the called method. The called method works exclusively with the copy. Changes
	to the called method’s copy do not affect the original variable’s value in the caller.
	When an argument is passed by reference, the called method can access the argument’s
	value in the caller directly and modify that data, if necessary. Pass-by-reference
	improves performance by eliminating the need to copy possibly large amounts of data.
 *
 */


/**
 * When an argument is passed by value, a copy of the argument’s value is
	passed to the called method. The called method works exclusively with the copy. Changes
	to the called method’s copy do not affect the original variable’s value in the caller.
	When an argument is passed by reference, the called method can access the argument’s
	value in the caller directly and modify that data, if necessary. Pass-by-reference
	improves performance by eliminating the need to copy possibly large amounts of data.
 *
 */


/**
 * Although an object’s reference is passed by value, a method can still interact with the
	referenced object by calling its public methods using the copy of the object’s reference.
	Since the reference stored in the parameter is a copy of the reference that was passed as an
	argument, the parameter in the called method and the argument in the calling method
	refer to the same object in memory. For example, in this App., both parameter modifyArray in
	method modifyArray and variable array in main refer to the same array object in memory.
	Any changes made using the parameter array2 are carried out on the object that array
	references in the calling method. In this App., the changes made in modifyArray using
	modifyArray affect the contents of the array object referenced by array in main. Thus, with a
	reference to an object, the called method can manipulate the caller’s object directly.
 *
 */
public class PassArray 
{
	public static void main(String[] args)
	{
		int[] array = { 1, 2, 3, 4, 5};
		
		System.out.printf("Effects of passing reference to entire array:%n" +
				 "The values of the original array are:%n");
		
		// output original array elements
		for(int elements : array)
			System.out.printf("   %d", elements);
		
		modifyArray(array);
		System.out.printf("%n%nThe values of the modified array are:%n");
		
		// output modified array elements 
		for(int elements : array)
			System.out.printf("   %d", elements);
		
		System.out.printf("%n%nEffects of passing array element value:%n" +
				"array[3] before modifyElement: %d%n", array[3]);
		
		modifyElement(array[3]); // attempt to modify array[3]
		System.out.printf("array[3] after modifyElement: %d%n", array[3]);
	}
	
	public static void modifyArray(int[] modified)
	{
			for(int a = 0; a < modified.length; a++ )
				modified[a] *=2;		
	}
	
	public static void modifyElement(int element)
	{
		element *= 2;
		System.out.printf("Value of element in modifyElement: %d%n", element);			 
	}	
}

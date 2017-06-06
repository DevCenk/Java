package Chapter7;

public class InitArrayTwoDimensional
{
	public static void main(String[] args)
	{
		int[][] array1 = {{ 1, 2, 3}, {1, 2}};
		int[][] array2 = {{2,3},{6,7,0,1}};
		
		System.out.println("Values in array1 by row are");
		outputArray(array1); // displays array1 by row
		
		System.out.printf("%nValues in array2 by row are%n");
		outputArray(array2); // displays array2 by row;
	}
	
	public static void outputArray(int[][] array)
	{
		for(int row = 0; row < array.length; row++) 
		{
			for(int coloumn = 0; coloumn < array[row].length; coloumn++ ) 
				System.out.printf("%d ", array[row][coloumn]);
			System.out.println();	
		}	
	}
}

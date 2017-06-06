package Chapter7;

public class BarChartEnhanced
{
	public static void main(String[] args)
	{
		// takes the grades 
		int[] grades ={ 11, 2, 3, 9, 10, 12, 22, 33, 44, 55, 67, 33, 44, 12, 99, 100, 100 };
		
		// we have 11 Note-Scale; included 0 and 100
		int[] starArray = new int[11]; 
		
		// scans the grades list and define Star(*) for each Note-Scale
		for(int element : grades)
			++starArray[element/10];

		for(int scale = 0; scale < starArray.length; scale++)
		{
			if(scale == 10)
				System.out.printf("%n%7d:", 100);
			else
				System.out.printf("%n%02d - %02d: ", scale*10,scale*10+9);
				
			for(int a=1; a <= starArray[scale]; a++)
					System.out.print("*");				
		}
	}
}

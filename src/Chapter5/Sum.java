package Chapter5;

public class Sum {

	public static void main(String[] args)
	{
	    int total= 0;
		
		for(int number = 2; number<=20; number += 2)
			total += number;
		
		System.out.printf("Sum of even numbers are %d",total);

	}

}
package Chapter4;

import java.util.Scanner;

// determine the class average for the quiz
//Solving the class-average problem using sentinel-controlled repetition
public class ClassAverage {

	public static void main(String[] args) 
	{
		Scanner input = new Scanner(System.in);
		
		int total = 0;
		int gradeCounter = 0;
		
		System.out.println("Enter a grade or(-1 to quit): ");
		int grade = input.nextInt();
		
		while(grade != -1)
		{
			total += grade;
			gradeCounter++;
			
			System.out.println("Enter grade-1 to quit: ");
			grade = input.nextInt();
			
		}
		
		if(gradeCounter != 0)
		{
			double average = (double)total / gradeCounter;
			
			System.out.printf("%ntotal of the %d Numbers are: %d%n", 
					gradeCounter, total);
			System.out.printf("class average is %.2f", average); 
					
		}
		else
			System.out.println("No grades were entered");
		

	}

}

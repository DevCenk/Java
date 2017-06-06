package Chapter7;

public class GradeBook 
{ 
	// Array grades is declared as an instance variable, so each GradeBook object
	// maintains its own set of grades. 	
	private int[] grades;
	private String courseName;
	
	// constructor
	GradeBook(String courseName, int[] grades)
	{
		this.courseName = courseName;
		this.grades = grades;		
	}
	
	// method to set the course name
	public void setCourseName(String courseName)
	{
		this.courseName = courseName;
	}
	
	// method to retrieve the course name
	public String getCourseName()
	{
		return courseName;
	}
	
	// perform various operations on the data
	public void processGrades()
	{
		// output grades array
		outputGrades();
		
		// call method getAverage to calculate the average grade
		System.out.printf("%nClass average is %.2f%n", getAverage());
		
		// call methods getMinimum and getMaximum
		System.out.printf("Lowest grade is %d%nHighest grade is %d%n%n",
				getMinimum(), getMaximum());
		
		// call outputBarChart to print grade distribution chart
		outputBarChart();	
	}
	
	// find minimum grade
	public int getMinimum()
	{ 
		int lowGrade = grades[0];
		
		for(int grade : grades) 
		{
			if(grade < lowGrade)
				lowGrade = grade;
		}
		
		return lowGrade ;
	}
	
	// find maximum grade
	public int getMaximum()
	{ 
		int highGrade = grades[0];
		
		for(int grade : grades) 
		{
			if(grade > highGrade)
				highGrade = grade;
		}
		
		return highGrade ;
	}
	
	// determine average grade for test
	public double getAverage()
	{
		int total = 0;
		
		for(int grade : grades)
			total += grade; 

		return (double)total / grades.length;		
	}
	
	// output the contents of the grades array
	public void outputGrades() 
	{
		System.out.printf("The grades are:%n%n");
		
		for(int student = 0; student < grades.length; student++)
		{
			System.out.printf("%d Student: %d%n",
					student + 1, grades[student]);
		}	
	}
	
	// output bar chart displaying grade distribution 	
	public void outputBarChart()
	{
		
		System.out.println("Grade distribution:");

		// for each array element, output a bar of the chart

		// we have 11 Note-Scale; included 0 and 100
		int[] starFrequency = new int[11]; 
		
		// scans the grades list and define Star(*) for each Note-Scale
		for(int element : grades)
			++starFrequency[element/10];

		for(int scale = 0; scale < starFrequency.length; scale++)
		{
			if(scale == 10)
				System.out.printf("%n%7d:", 100);
			else
				System.out.printf("%n%02d - %02d: ", scale*10,scale*10+9);
				
			for(int a=1; a <= starFrequency[scale]; a++)
					System.out.print("*");				
		}
	}
}

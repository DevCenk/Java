package Chapter7;

public class GradeBookMulti
{
	private String[] courseName;
	private int[][] grades;
	
	public GradeBookMulti(String[] courseName, int[][] grades)
	{
		this.grades = grades;
		this.courseName = courseName;
	}
	
	public void setCourseName(String[] courseName)
	{
		this.courseName = courseName;	
	}
	
	// perform various operations on the data
	public String[] getCourseName()
	{
		return courseName;
	}
	
	public void processGrades()
	{
		// output grades array
		outputGrades();
		
		// call method getAverage to calculate the average grade
		System.out.printf("%nClass average is %.2f%n", getAverageOfStudent(grades[0]));
		
		// call method getAverage to calculate the average grade
		//		System.out.printf("%nClass average is %.2f%n", getAverageOfExam());
				
		// call methods getMinimum and getMaximum
		System.out.printf("Lowest grade is %d%nHighest grade is %d%n%n",
						getMinimum(), getMaximum());
				
		// call outputBarChart to print grade distribution chart
		outputBarChart();
	}
	
	// find minimum grade with Enhanced-for : Does not(can not) manipulate the elements; just step throw them!
	public int getMinimum()
	{ 
		int minimum = grades[0][0];
		
		for(int[] row : grades )
			for(int column : row)
			{	
				if(column < minimum)
					minimum = column;
			}			
		return minimum;
	}
	
	// find maximum grade with Enhanced-for : Does not(can not) manipulate the elements; just step throw them!
		public int getMaximum()
		{ 
			int maximum = grades[0][0];
			
			for(int[] row : grades )
				for(int column : row)
				{	
					if(column < maximum)
						maximum = column;
				}			
			return maximum;
		}
		
		// shows the GPA of a particular student  : student’s semester average
		public double getAverageOfStudent(int[] setOfGrades)
		{ 
			int total = 0;
			
			for(int grade : setOfGrades)
				total += grade;
			
			// return average of grades
			return (double)total / setOfGrades.length;
			
		}
		
		public void outputGrades() 
		{
			System.out.printf("The grades are:%n%n");
			
			for(int student = 0; student < grades.length; student++)
			{
				System.out.printf("%d Student: %d%n",
						student + 1, grades[student],getAverageOfStudent(grades[student]));
			}	
		}

		
		

}

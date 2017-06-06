package Chapter7;


public class GradeBookTest 
{
	public static void main(String[] args)
	{
		int[] gradesOfExam = { 10, 11, 23, 44, 55, 66, 77, 88, 100, 102};
		GradeBook myGradeBook =  new GradeBook("JAVA-101", gradesOfExam);
		
		System.out.printf("Welcome to the grade book for%n%s%n%n",
				myGradeBook.getCourseName());
		myGradeBook.processGrades();

	}
}

/** Software Engineering Observation 7.2
 * 
 *	A test harness (or test application) is responsible for creating an object of the class being
	tested and providing it with data. This data could come from any of several sources. Test
	data can be placed directly into an array with an array initializer, it can come from the
	user at the keyboard, from a file (as you’ll see in Chapter 15), from a database (as you’ll
	see in Chapter 24) or from a network (as you’ll see in online Chapter 28). After passing
	this data to the class’s constructor to instantiate the object, the test harness should call upon
	the object to test its methods and manipulate its data. Gathering data in the test harness
	like this allows the class to be more reusable, able to manipulate data from several sources.
 *
 */



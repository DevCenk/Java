package Chapter4;


public class StudentTest {

	public static void main(String[] args) {
		
		Student account1 = new Student("Cenk",92);
		Student account2 = new Student("Kazým",70);
		
		System.out.printf("%s 's letter grade is: %s%n%n",
				account1.getName(), account1.getLetterGrade());
		System.out.printf("%s 's letter grade is: %s%n%n",
				account2.getName(), account2.getLetterGrade());

	}

}

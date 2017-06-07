package Chapter7;

import java.util.ArrayList;

// Store user-defined objects in arraylist 
public class BookJavatPointListTest 
{
	public static void main(String[] args)
	{
		ArrayList<BookJavatPointList> books = new ArrayList<>();
		
		BookJavatPointList book1 = new BookJavatPointList(101, "JAVA 4 Beginner", "Deitel", "SPRINGER");
		BookJavatPointList book2 = new BookJavatPointList(102, "JAVA 4 INTERMED", "Deitel", "PEARSON");
		BookJavatPointList book3 = new BookJavatPointList(103, "JAVA 4 EXPERTS", "Deitel", "PEGASUS");
		
		books.add(book1);
		books.add(book2);
		books.add(book3);
		
		for(BookJavatPointList book : books)
			System.out.printf("%d %s %s %s%n",
					book.getId(), book.getName(), book.getAuthor(), book.getPublischer());
	}
}

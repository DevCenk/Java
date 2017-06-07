package Chapter7;

import java.util.ArrayList;

public class ArrayListCollectionRepeat
{
	public static void main(String[] args)
	{
		ArrayList<String> items = new ArrayList<>();
		
		items.add("yellow");
		items.add("red");
		
		System.out.printf("Display list contents with counter-controlled loop: ");
		// Display list contents with counter-controlled loop
		for(int counter = 0; counter < items.size(); counter++)
			System.out.printf("%s ",items.get(counter));
		
		// Display list contents with enhanced for statement
		display(items, "%nDisplay list contents with enhanced for statement: ");
		
		// List with two new elements: yellow red green yellow
		items.add("green"); //added yellow to the end of the collection(list)
		items.add(3, "yellow");
		display(items,"%nList with two new elements: ");
		
		// Remove first instance of yellow: red green yellow
		items.remove("yellow");
		display(items,"%nRemove first instance of yellow: ");
		
		// Remove second list element (green): red yellow
		items.remove(1);
		display(items,"%nRemove second list element (green): ");
		
		// "red" is in the list
		System.out.printf("%n\"red\" is%sin the list", (items.contains("red") ? " " : " NOT "));
		
		//show the collection size
		System.out.printf("%nSize: %d",items.size());

	}
	
	public static void display(ArrayList<String> items , String header)
	{
		System.out.printf(header);
		
		for(String item : items)
			System.out.printf(" %s", item);		
	}	
}

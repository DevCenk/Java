package Chapter7;

import java.util.ArrayList; //  ArrayList is a  GENERÝC COLLECTÝON CLASS : IT IS A PREDEFINED-DATA-STRUCTURE(oder COLLECTIONS)

/**
 *  The Java API provides several predefined data structures, called collections, used to store
	groups of related objects in memory. These classes provide efficient methods that organize,
	store and retrieve your data without requiring knowledge of how the data is being stored.
  
 *	You’ve used arrays to store sequences of objects. Arrays do not automatically change
	their size at execution time to accommodate additional elements.
	
 *	The collection class ArrayList<T> (package java.util) provides a convenient solution to this problem—it
   	can dynamically change its size to accommodate more elements
   
 *	The T (by convention) is a placeholder—when declaring a new ArrayList, replace it with the type of elements 
   	that you want the ArrayList to hold; for example ArrayList<String> list declares list as an ArrayList collection that can store only Strings. 
   
 * 	Classes with this
	kind of placeholder that can be used with any type, are called "generic classes"
	
 *  Only nonprimitive types can be used to declare variables and create objects of generic classes.
 	However,Java provides a mechanism—known as boxing—that allows primitive values to be
	wrapped as objects for use with generic classes.  So, for example, ArrayList<Integer> integers; declares integers as an ArrayList
  	that can store only Integers
	
 *  When you place an int value into an ArrayList<Integer>, the int value is boxed (wrapped) as an Integer object,
	and when you get an Integer object from an ArrayList<Integer>, then assign the object
	to an int variable, the int value inside the object is unboxed (unwrapped).
	
 *  Diamond (<>) Notation for Creating an Object of a Generic Class: *
 
    ArrayList<String> items = new ArrayList<String>();
    Notice that ArrayList<String> appears in the variable declaration(ArrayList<String> items) and 
    in the class instance creation expression(new ArrayList<String>()).
	
	Java SE 7 introduced the diamond (<>) notation to simplify statements like this.
	Using <> in a class instance creation expression for an object of a generic class tells
	the compiler to determine what belongs in the angle brackets.
	
	In Java SE 7 and higher, the preceding statement can be written as: ArrayList<String> items = new ArrayList<>();
	
	When the compiler encounters the diamond (<>) in the class instance creation expression,
	it uses the declaration of variable items to determine the ArrayList’s element type
	(String)—this is known as inferring the element type
	
	                                         -------------
	
	The issue with arrays is that they are of fixed length so if it is full we cannot add any more elements to it, 
	likewise if there are number of elements gets removed from it the memory consumption would be the same as it 
	doesn’t shrink. On the other ArrayList can dynamically grow and shrink as per the need. Apart from these benefits 
	ArrayList class enables us to use predefined methods of it which makes our task easy.
 
 */

public class ArrayListCollection 
{
	public static void main(String[] args) 
	{
		ArrayList<String> items = new ArrayList<>(); // creates a new empty ArrayList of Strings with a default initial capacity of 10 elements
		
		items.add("red");
		items.add(0,"yellow");
		
		// header
		System.out.print("Display list contents with counter-controlled loop: ");
		
		// display the colors in the list
		for(int i = 0; i < items.size(); i++ )
			System.out.printf("%s ", items.get(i));  // Method get (line 21) obtains the element at a specified index
	 
		// display colors using enhanced for in the display method
		display(items, "%nDisplay list contents with enhanced for statement:");
		
		// The add method with one argument appends its argument to the end of the ArrayList		
		// The add method with two arguments inserts a new element at the specified position. The first argument is an index.
		// As with arrays, collection indices start at zero. The second argument is the value to insert
		// at that index. The indices of all subsequent elements are incremented by one. Inserting an
		// element is usually slower than adding an element to the end of the ArrayList 
		
		items.add("green");  // items.add("yellow");  add "green" to the end of the list
		items.add("yellow"); // add "yellow" to the end of the list
		display(items, "List with two new elements:"); 	
		
		// The remove method is used to remove an element with a specific value (line 31). It
		// removes only the first such element. If no such element is in the ArrayList, remove does
		// nothing. An overloaded version of the method removes the element at the specified index
		
		items.remove("yellow");  // remove the first "yellow"
		display(items, "Remove first instance of yellow:");
		
		// overloaded version of the method removes the element at the specified index
		items.remove(1);  // remove item at index 1
		display(items, "Remove second list element (green):"); 
		
		 // contains method to check if an item is in the ArrayList. The contains
		 // method returns true if the element is found in the ArrayList, and false otherwise.
		 // The method compares its argument to each element of the ArrayList in order, so using
		 // contains on a large ArrayList can be inefficient. 
		
		// check if a value is in the List
		System.out.printf("\"red\" is %sin the list%n ", (items.contains("red") ? "" : "NOT"));
		
		// display number of elements in the List
		System.out.printf("size: %s%n", items.size());
	}
	
	public static void display(ArrayList<String> items, String header)
	{
		System.out.printf(header);  // display header
		
		// display each element in items
		for(String item : items)
			System.out.printf(" %s", item);	
		System.out.println(); 
	}
}

package Chapter7;

public class BookJavatPointList 
{
	private int id;
	private String name;
	private String author;
	private String publischer;
	
	public BookJavatPointList(int id, String name, String author, String publischer )
	{
		this.id = id;
		this.name = name;
		this.author = author;
		this.publischer = publischer;	
	}
	
	public int getId()
	{
		return id;
	}
	
	public String getName()
	{
		return name;
	}
	
	public String getAuthor()
	{
		return author;
	}
	
	public String getPublischer()
	{
		return publischer;
	}
}

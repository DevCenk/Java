package Chapter3;

public class Account
{
	
	private String name; // instance variable
	private double balance; // instance variable
	
	// account constructor receives 2 parameters
	Account(String name, double balance)
	{
		
		this.name = name; //assign name to the instance variable name 
		
		// validate that the balance is greater that 0.0; if it is not,
		// instance variable balance keeps its default value 0.0
		if(balance > 0.0) // if balance is valid
			this.balance = balance; // assign balance to the instance variable balance					
	}
	
	// method that only deposits(add) only valid amount to the balance
	public void deposit(double depositAmmount)
	{
		if(depositAmmount > 0.0) // it the deposit is valid
			balance = balance + depositAmmount; // add it to the balance
	}
	
	// method that returns the amount of the balance
	public double getBalance()
	{
		return balance;		
	}
	
	// method that sets the name
	public void setName(String name)
	{		
		this.name = name;
	}
	
	// method that returns the name
	public String getName()
	{
		return name; // gives the value of the name to the caller
	}	
}

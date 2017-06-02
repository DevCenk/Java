package Chapter5;

import java.util.Scanner;

// Class that represents an auto insurance policy.
public class AutoPolicy 
{
	Scanner input = new Scanner(System.in);
	
	private int accountNumber;  // policy account number
	private String makeAndModel; // car that the policy applies to
	private String state; // two-letter state abbreviation
	
	// constructor
	AutoPolicy(int accountNumber, String makeAndModel, String state)
	{		
		this.accountNumber = accountNumber;
		this.makeAndModel = makeAndModel;
		this.state = state;
	}
	
	public void setAccountNumber(int accountNumber)
	{
		this.accountNumber = accountNumber;
	}
	
	public int getAccountNumber()
	{
		return accountNumber;
	}
	
	public void setMakeAndModel(String makeAndModel)
	{
		this.makeAndModel = makeAndModel;
	}
	
	public String getMakeAndModel()
	{
		return makeAndModel;
	}
	
	public void setState(String state)
	{	
		boolean flag;
		String newState;
		
		if(state == "CT" || state == "MA" || state == "ME" || state == "NH" || state == "NJ" 
				|| state == "NY" || state == "PA" || state == "VT")
			this.state = state;
			
		else
		{
			do
			{
				System.out.printf("ERROR: %s is not a valid state;%n%n",state);
				System.out.printf("Enter Please;%n");
				System.out.printf(" %s%n %s%n %s%n %s%n %s%n %s%n %s%n %s%n%n",
						"CT for Connecticut", "MA for Massachusetts", 
						"ME for Maine", "NH for New Hampshire", "NJ for New Jersey", 
						"NY for New York", "PA for Pennsylvania", "VT for Vermont");
				System.out.printf("Write State abbreviation: ");			
				newState = input.nextLine();
				
				// String Comparison methods equals or equalsIgnoreCase to compare the user input
				if(newState.equalsIgnoreCase("CT") || newState.equalsIgnoreCase("MA")|| newState.equalsIgnoreCase("ME") ||
						newState.equalsIgnoreCase("NH")|| newState.equalsIgnoreCase("NJ")|| newState.equalsIgnoreCase("NY") ||
						newState.equalsIgnoreCase("PA")|| newState.equalsIgnoreCase("VT") )
				{
					this.state = newState;
					flag = false;
				}
			
				else			
				{
					flag = true;
					state = newState;
					System.out.printf("%nAgain Wrong%n");
				}						
			}while(flag);		
		} 		    			
	}
	
	public String getState()
	{
		return state;
	}
	
	// predicate method returns whether the state has no-fault insurance	
	public boolean isNoFaultState() 
	{
		boolean noFaultState;
		
		// determine whether state has no-fault auto insurance 
		switch(getState())  // get AutoPolicy object's state abbreviation
		{
		case "MA": case "NJ": case "NY": case "PA":
			noFaultState = true;
			break;
		default:
			noFaultState = false;
			break;
		}
		
		return noFaultState;	 
	}
	
}

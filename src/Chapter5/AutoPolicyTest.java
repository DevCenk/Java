package Chapter5;

 /*You’ve been hired by an auto insurance company that serves these northeast states—
 Connecticut, Maine, Massachusetts, New Hampshire, New Jersey, New York, Pennsylvania,
 Rhode Island and Vermont. The company would like you to create a program
 that produces a report indicating for each of their auto insurance policies whether the
 policy is held in a state with “no-fault” auto insurance—Massachusetts, New Jersey,
 New York and Pennsylvania */

//Demonstrating Strings in switch.
public class AutoPolicyTest 
{
	public static void main(String[] args) 
	{		
		AutoPolicy account1 = new AutoPolicy(11111111, "Toyota Camry","");
		AutoPolicy account2 = new AutoPolicy(22222222, "Ford Fusion", "");
		
		account1.setState("PP");
		policyInNoFaultState(account1);
		
		account2.setState("KK");
		policyInNoFaultState(account2);
	}
	
	public static void policyInNoFaultState(AutoPolicy account) 
	{
		System.out.printf("%n-----------------------------------%n");
		System.out.printf("The auto policy:%n");
		System.out.printf("Account #: %d; Car: %s;%n",
				account.getAccountNumber(), account.getMakeAndModel());
		System.out.printf("State %s %s a No-fault state%n%n",
				account.getState(),(account.isNoFaultState() ? "is" : "is not"));
		System.out.printf("XXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXX%n%n");
		
	} 
}

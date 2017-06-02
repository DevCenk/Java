package Chapter3;

import java.util.Scanner;

public class AccountTest 
{
	public static void main(String[] args) 
	{
		Account account1  = new Account("Cenk", 15.00);
		Account account2 = new Account("Kazým", -1.00);
		
		Scanner input = new Scanner(System.in);
		
		displayAccount(account1);
		displayAccount(account2);
	
		System.out.printf("%nEnter deposit ammount for account1:");
		double depositAmmount = input.nextDouble();
		System.out.printf("%nadding $%.2f to account balance1%n%n",
				depositAmmount);
		account1.deposit(depositAmmount); // add to account1 s balance
		
		displayAccount(account1);
		displayAccount(account2);
				
		System.out.printf("%nEnter deposit ammount for account2:");
		depositAmmount = input.nextDouble();
		System.out.printf("%nadding %.2f to account2 balance%n%n",
				depositAmmount);
		account2.deposit(depositAmmount); // add to account1 s balance
		
		displayAccount(account1);
		displayAccount(account2);
	
	}
	
	public static void displayAccount(Account accountToDisplay)
	{
		// display initial balance of the each object
		System.out.printf("%s Balance: $%.2f%n",
		accountToDisplay.getName(), accountToDisplay.getBalance());		
	}
}

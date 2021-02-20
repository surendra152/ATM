package atmproject;
import java.io.IOException;
import java.text.DecimalFormat;
import java.util.HashMap;
import java.util.Map.Entry;
import java.util.Scanner;

public class optionMenu extends Account
{
	Scanner menuInput = new Scanner(System.in);
	DecimalFormat moneyFormat = new DecimalFormat("'$'###,##0.00");
	
	HashMap<Integer, Integer> data = new HashMap<Integer,Integer>();
	
	// Validate Login information customer number and pin number
	
	public void getLogin() throws IOException
	{
		int x=1;
		do {
			try {
				data.put(833799071, 4040);
				data.put(833799072, 4050);
				
				System.out.println("Welcome to the ATM project");
				
				System.out.println("Enter your customer number: ");
				setCustomerNumber(menuInput.nextInt());
				
				System.out.println("Enter your pin number: ");
				setPinNumber(menuInput.nextInt());
				
			}
			catch(Exception e)
			{
				System.out.println("\n"+"Invalid charactor(s). Only numbers."+"\n");
				x = 2;
			}
			for(Entry<Integer, Integer> entry : data.entrySet())
			{
				if(entry.getKey() == getCustomerNumber() && entry.getValue() == getPinNumber())
				{
			   getAccountType();
				
			}
		}
		System.out.println("\n"+"Wrong Customer number or Pin number."+"\n");
	}while(x==1);
}

//Display account type menu with selection

public void getAccountType()
{
	System.out.println("select the account you want to access: ");
	System.out.println("Type 1 - Checking Account ");
	System.out.println("Type 2 - saving Account");
	System.out.println("Type 3 - Exit");
	System.out.print("Choice: ");
	
	selection = menuInput.nextInt();
	
	switch(selection)
	{
	case 1:
		getChecking();
		break;
		
	case 2:
		getSaving();
		break;
		
	case 3:
		System.out.println("Thanks for using this ATM, bye.");
		break;
		
	default:
		System.out.println("\n"+"Invalid choice."+"\n");
		getAccountType();
	
	}
}

//Display checking account menu with selection
public void getChecking()
{
	System.out.println("Checking account: ");
	System.out.println("Type 1 - view Balance ");
	System.out.println("Type 2 - Withdraw funds ");
	System.out.println("Type 3 - Deposite Funds ");
	System.out.println("Type 4 - Exit");
	System.out.println("Choice: ");
	
	selection = menuInput.nextInt();
	
	switch(selection)
	{
	case 1:
		System.out.println("Checking account balance: "+moneyFormat.format(getCheckingBalance()));
		getAccountType();
		break;
		
	case 2:
		getCheckingWithdrawInput();
		getAccountType();
		break;
		
	case 3:
		getCheckingDepositeInput();
		getAccountType();
		break;
		
	case 4:
		System.out.println("Thanks for using this ATM, bye");
		break;
		
	default :
		System.out.println("\n"+"Invalid choice."+"\n");
		getChecking();
	}
}

//Display saving account menu with selection

public void getSaving()
{
	System.out.println("Saving Account:");
	System.out.println("Type 1 - View Balance ");
	System.out.println("Type 2 - Withdraw Funds ");
	System.out.println("Type 3 - Deposite Funds");
	System.out.println("Type 4 - Exit");
	System.out.println("Choice: ");
	
	selection = menuInput.nextInt();
	
	switch(selection)
	{
	case 1:
		System.out.println("Checking account balance: "+moneyFormat.format(getSavingBalance()));
		getAccountType();
		break;
		
	case 2:
		getSavingWithdrawInput();
		getAccountType();
		break;
		
	case 3:
		getSavingDepositeInput();
		getAccountType();
		break;
		
	case 4:
		System.out.println("Thanks for using this ATM, bye");
		break;
		
	default :
		System.out.println("\n"+"Invalid choice."+"\n");
		getSaving();
	}
}
int selection;
}


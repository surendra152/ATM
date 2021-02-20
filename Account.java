package atmproject;

import java.text.DecimalFormat;
import java.util.Scanner;

public class Account
{
	Scanner input=new Scanner(System.in);
	DecimalFormat moneyFormat= new DecimalFormat("'$'###,##0.00");
	
	//set the customer number
	
	public int setCustomerNumber(int customerNumber)
	{
		this.customerNumber = customerNumber;
		return customerNumber;
	}
	
	//Get the customer number
	
	public int getCustomerNumber()
	{
		return customerNumber;
	}
	
	//set the pin number
	public int setPinNumber(int pinNumber)
	{
		this.pinNumber = pinNumber;
		return pinNumber;
	}
	
	//Get the pin number
	
	public int getPinNumber()
	{
		return pinNumber;
	}
	
	//Get checking account balance
	public double getCheckingBalance()
	{
		return checkingBalance;
	}
	
	//Get saving account balance
	public double getSavingBalance()
	{
		return savingBalance;
	}
	
	
	//calculate checking account withdrawal
	public double calcCheckingWithdraw(double amount)
	{
		checkingBalance = (checkingBalance - amount);
		return checkingBalance;
	}
	
	//calculate saving account withdrawal
	
	public double calcSavingWithdraw(double amount)
	{
		savingBalance = (savingBalance - amount);
		return savingBalance;
	}
	//calculate checking account deposite
	public double calcCheckingDeposite(double amount)
	{
		checkingBalance = (checkingBalance + amount);
		return checkingBalance;
	}
	
	//calculate saving account deposit
	
	public double calcSavingDeposite(double amount)
	{
		savingBalance = (savingBalance + amount);
		return savingBalance;
	}
	
	//customer checking account withdraw input
	
	public void getCheckingWithdrawInput()
	{
		System.out.println("Checking account Balance: "+ moneyFormat.format(checkingBalance));
		System.out.println("Amount you want to withdraw from checking account: ");
		double amount = input.nextDouble();
		
		if((checkingBalance - amount)>=0)
		{
			calcCheckingWithdraw(amount);
			System.out.println("New checking account balance : "+ moneyFormat.format(checkingBalance));
		}
		else
		{
			System.out.println("Balance can not be negative: "+"\n");
		}
	}
	
	//customer saving account withdraw input
	
	public void getSavingWithdrawInput()
	{
		System.out.println("saving account Balance: "+ moneyFormat.format(savingBalance));
		System.out.println("Amount you want to withdraw from saving account: ");
		double amount = input.nextDouble();
		
		if((savingBalance - amount)>=0)
		{
			calcSavingWithdraw(amount);
			System.out.println("New Saving account balance: "+ savingBalance +"\n");
		}
		else
		{
			System.out.println("Balance can not be negative: "+"\n");
		}
	}
	
	//Customer checking account deposite input
	
	public void getCheckingDepositeInput()
	{
		System.out.println("Checking account Balance: "+ moneyFormat.format(checkingBalance));
		System.out.println("Amount you want to Deposite from checking account: ");
		double amount = input.nextDouble();
		
		if((checkingBalance+amount)>=0)
		{
			calcCheckingDeposite(amount);
			System.out.println("New checking amount balance: "+ moneyFormat.format(checkingBalance));
		}
		else
		{
			System.out.println("Balance can not be negative: "+"\n");
		}
	}
	
	//customer saving account deposite input
	
	public void getSavingDepositeInput()
	{
		System.out.println("Saving account Balance: "+ moneyFormat.format(savingBalance));
		System.out.println("Amount you want to Deposite from saving account: ");
		double amount = input.nextDouble();
		
		if((savingBalance + amount)>=0)
		{
			calcSavingDeposite(amount);
			System.out.println("New saving account balance: "+ moneyFormat.format(savingBalance));
			
		}
		else
		{
			System.out.println("Balance can not be negative: "+"\n");
		}
	}
	
	private int customerNumber;
	private int pinNumber;
	private double checkingBalance = 0;
	private double savingBalance = 0;
}
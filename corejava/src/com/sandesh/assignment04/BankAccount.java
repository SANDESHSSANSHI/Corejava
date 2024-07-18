package com.sandesh.assignment04;
import java.util.Scanner;

public class BankAccount {
	private static  int accountNumber;
	private static double balance=0;
	
	
	public static void main(String[] args) {
		BankAccount b=new BankAccount(987456123,10000);
		
		depositException();
		withdrawlException();		
	}	
	
		public static void depositException() {
		try {
			deposit();
		}
		catch(InsufficientFundException e) {
			System.out.println("fund is insufficient: "+e.getMessage());
		}
		finally {
			System.out.println("With or Without deposit, your balance for the account number:"+accountNumber+" is:"+balance);
		}
	}
		public static void withdrawlException() {
			try {
				withdrawl();
			}
			catch(InsufficientAmountException e) {
				System.out.println("fund is insufficient: "+e.getMessage());
			}
			finally {
				System.out.println("With or Without deposit, your balance for the account number:"+accountNumber+" is:"+balance);
			}
		}
//		
	
	public BankAccount(int accountNumber, double balance) {
		super();
		this.accountNumber = accountNumber;
		this.balance = balance;
		System.out.println("Initial balance amount:"+balance);
	}
	
	public static void deposit() throws InsufficientFundException{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the amount to be deposited in your bank account:");
		double deposit=sc.nextDouble();
		if(deposit<100 || deposit>100000) {
			throw new InsufficientFundException("Fund is insufficient to deposit");
		}
		else {
			balance=balance+deposit;
		}
		
	}
	public static void withdrawl() throws InsufficientAmountException{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the amount to be withdawn from your bank account");
		double withdrawn=sc.nextDouble();
		if(balance==0 || withdrawn==0 || withdrawn>100000) {
			throw new InsufficientAmountException("Withdrawl amount is not possible for this account number"+accountNumber);
		}
		balance-=withdrawn;
	}
	public void display() {
		System.out.println("The balance of account is:"+balance);
	}
	
	
}
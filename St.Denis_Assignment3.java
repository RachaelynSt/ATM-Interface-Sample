//Name: Rachaelyn St. Denis
//File: St.Denis_Assignment3.java
//Description: ATM MidFirst Bank Menu


import java.util.Scanner;
import java.util.Date;

public class SavingsAccountRunner {
	
	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		int idHolder = 0;
		double balanceHolder = 0.0;
		double annualIntRateHolder = 0.0;
		
		System.out.println("\nWelcome to your Savings Account App!");
		System.out.println("\nEnter your account number: ");
		idHolder = input.nextInt();
		System.out.println("\nEnter your initial balance: ");
		balanceHolder = input.nextDouble();
		System.out.println("\nEnter your annual interest rate: ");
		annualIntRateHolder = input.nextDouble();
		
		SavingsAccount account = new SavingsAccount(idHolder, balanceHolder);
		account.setAnnualIntRate(annualIntRateHolder);
		
		boolean loop = true;
		while(loop) {
			int choice = 0;
			System.out.println("\n1. Deposit");
			System.out.println("2. View Weekly Interest Rate");
			System.out.println("3. View Account Details");
			System.out.println("4. Exit");
			choice = input.nextInt();
			while (choice < 1 || choice > 4) {
				System.out.println("INVALID SELECTION - TRY AGAIN!");
				choice = input.nextInt();
			}
			if (choice == 1) {
				int deposit = 0;
				System.out.println("Enter your deposit amount: ");
				deposit = input.nextInt();
				account.deposit(deposit);
				System.out.println("New Balance : " + account.getBalance());
			}
			else if (choice == 2) {
				System.out.printf("Your Weekly Interest Amount is \n$ " + "%.2f", account.getWeeklyIntRate());
				System.out.println();
			}
			
			else if (choice == 3) {
				System.out.println("Account ID: " + account.getId());
				System.out.println("Account Creation Date/Time: " + account.getDateEstablished());
				System.out.println("Balance: " + account.getBalance());
				System.out.printf("Weekly Interest Amount: " + "$ " + "%.2f", account.getWeeklyIntRate());
				System.out.println();
			}
			else if (choice == 4) {
				System.out.println("Thank you - Goodbye!");
				loop = false;
			}
		}
	}
}



class SavingsAccount {

	private int id = 0;
	private double balance = 0.0;
	private double annualIntRate = 0.0;
	Date dateEstablished;
	
	public SavingsAccount() {
		dateEstablished = new Date();
	}
	
	public SavingsAccount(int id, double balance) {
		this();
		this.id = id;
		this.balance = balance;
	}
	
	public int getId() {
		return this.id;
	}
	
	public double getBalance() {
		return this.balance;
	}
	
	public void setAnnualIntRate(double annualIntRate) {
		this.annualIntRate = annualIntRate;
	}
	
	public double getAnnualIntRate() {
		return annualIntRate;
	}
	
	public String getDateEstablished() {
		return this.dateEstablished.toString();
	}
	
	public double getWeeklyIntRate() {
		return balance * ((annualIntRate / 100) / 52);
	}
	
	public void deposit(double amount) {
		this.balance += amount;
	}
}
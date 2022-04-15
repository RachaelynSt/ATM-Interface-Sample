
//Name: Rachaelyn St. Denis
//File: Assignment2.java
//Description: Library Daily Book Inventory Program


import java.util.Scanner;

public class Assignment2 {
	
	public static void main(String[] args)
	{
		Scanner input = new Scanner(System.in);
		String isbn;
		int returnCount = 0;
		int checkoutCount = 0;
		int processCount = 0;
		char returnOrCheckout;
		char repeatYN = 'Y';
		
		System.out.println("Welcome to the Daily Book Inventory Program!");
		
		while (repeatYN == 'Y')
		{
			int isbn13 = 0;
			
			System.out.println("\nEnter the first 12 digits of an ISBN-13 as a String:");
			isbn = input.next();
			while (isbn.length() != 12)
			{
				System.out.println("Invalid ISBN-13 number! Try again.");
				System.out.println("Enter the first 12 digits of an ISBN-13 as a String:");
				isbn = input.next();
			}
			for (int i = 0; i < isbn.length(); i++)
			{
				if ((i + 1) % 2 == 0)
				{
					isbn13 += (isbn.charAt(i) - '0') * 3;
				}
				else 
				{
					isbn13 += isbn.charAt(i) - '0';
				}
			}
			isbn13 %= 10;
			if (isbn13 == 0)
				isbn += "0";
			else
			{
				isbn13 = 10 - isbn13;
				isbn += isbn13;
			}
			System.out.println("The ISBN-13 number is " + isbn + "\n\n");
			System.out.println("Enter 'R' for return or 'C' for check out:");
			returnOrCheckout = input.next().charAt(0);
			if (returnOrCheckout == 'R')
				returnCount++;
			if (returnOrCheckout == 'C')
				checkoutCount++;
			if (returnOrCheckout == 'R' || returnOrCheckout == 'C')
				processCount++;
			for (int i = 0; i < 45; i++)
				System.out.print("*");
			System.out.println("\nDaily Book Inventory\n");
			System.out.println("Number of books returned: " + returnCount);
			System.out.println("Number of books checked out: " + checkoutCount);
			System.out.println("The total of books processed: " + processCount + "\n");
			for (int i = 0; i < 45; i++)
				System.out.print("*");
			System.out.println("\nEnter 'Y' to continue, 'N' to quit: ");
			repeatYN = input.next().charAt(0);
		}
		for (int i = 0; i < 45; i++)
			System.out.print("*");
		System.out.println("\nDaily Book Inventory\n");
		System.out.println("Number of books returned: " + returnCount);
		System.out.println("Number of books checked out: " + checkoutCount);
		System.out.println("The total of books processed: " + processCount + "\n");
		for (int i = 0; i < 45; i++)
			System.out.print("*");
	}
}

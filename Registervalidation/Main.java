package Registervalidation;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		int balance = 1000,withdraw,deposit;
		Scanner scanner = new Scanner(System.in);
		while(true) {
			System.out.println("Automated Teller Machine");
			System.out.println("Choose  for Withdraw");
			System.out.println("Choose 2 for Deposit");
			System.out.println("Choose 3 for Check Balance");
			System.out.println("Choose 4 for EXIT");
			System.out.println("Choose the operation you want to perform:");
			
			int choice = scanner.nextInt();
			switch(choice) {
			case 1:
				System.out.println("enter money to wthdraw");
				withdraw=scanner.nextInt();
				
				if(balance >= withdraw) {
					balance = balance - withdraw;
					System.out.println("pls collect ur cash");
				}
				else {
					System.out.println("insuffecient bakance");
				}
				break;
				
			case 2:
				System.out.println("enter money to deposit");
				deposit = scanner.nextInt();
				balance = balance + deposit;
				System.out.println("your money added");
				
			}
		}

	}
}

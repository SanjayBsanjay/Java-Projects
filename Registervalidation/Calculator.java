package Registervalidation;
import java.util.Scanner;


public class Calculator {

	    public static void main(String[] args) {
	        Scanner scanner = new Scanner(System.in);

	        while (true) {
	            System.out.println("Java Calculator App");
	            System.out.println("1. Addition");
	            System.out.println("2. Subtraction");
	            System.out.println("3. Multiplication");
	            System.out.println("4. Division");
	            System.out.println("5. Exit");
	            System.out.print("Enter your choice (1-5): ");

	            int choice = scanner.nextInt();

	            if (choice == 5) {
	                System.out.println("Exiting the calculator. Goodbye!");
	                break; // Exit the loop if the user chooses 5 (Exit)
	            }

	            System.out.print("Enter the first number: ");
	            int num1 = scanner.nextInt();

	            System.out.print("Enter the second number: ");
	            int num2 = scanner.nextInt();

	            switch (choice) {
	                case 1:
	                    System.out.printf("Result: %d%n", (int)(num1 + num2));
	                    System.out.println("");
	                    break;
	                case 2:
	                    System.out.printf("Result: %d%n", (int)(num1 - num2));
	                    System.out.println("");
	                    break;
	                case 3:
	                    System.out.printf("Result: %d%n", (int)(num1 * num2));
	                    System.out.println("");
	                    break;
	                case 4:
	                    if (num2 != 0) {
	                        System.out.printf("Result: %d%n", (int)(num1 / num2));
	                        
	                    } else {
	                        System.out.println("Error: Division by zero is not allowed.");
	                    }
	                    break;
	                default:
	                    System.out.println("Invalid choice. Please enter a number between 1 and 5.");
	            }
	        }

	        scanner.close();
	    }
	}




package Loops;

import java.util.Scanner;

public class dynamicApplication {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int ch;
		do {
			displayname();
			ch = Integer.parseInt(sc.next());
			voting(ch);
		}while(ch>0);
	}

	private static void voting(int ch) {
		switch(ch){
		case 1:
			addition();
			break;
		case 2:
			subtraction();
			break;
		case 3:
			multiplication();
			break;
		case 4:
			division(0);
			break;
		case 5 :
			System.exit(0);
		default:
			System.out.println("Invalid option !!");
		}
		
	}

	private static void division(int i) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter first number:");
		int a = sc.nextInt();
		System.out.println("Enter second number:");
		int b = sc.nextInt();
		int c = a/b;
		System.out.println("Your result is " +c);	
	}

	private static void multiplication() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter first number:");
		int a = sc.nextInt();
		System.out.println("Enter second number:");
		int b = sc.nextInt();
		int c = a*b;
		System.out.println("Your result is " +c);		
	}

	private static void subtraction() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter first number:");
		int a = sc.nextInt();
		System.out.println("Enter second number:");
		int b = sc.nextInt();
		int c = a-b;
		System.out.println("Your result is " +c);		
	}

	private static void addition() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter first number:");
		int a = sc.nextInt();
		System.out.println("Enter second number:");
		int b = sc.nextInt();
		int c = a + b;
		System.out.println("Your result is " +c);
	}

	private static void displayname() {
		System.out.println("Enter your choice : ");
		System.out.println("1.Addition");
		System.out.println("2.Subtraction");
		System.out.println("3.Multiplication");
		System.out.println("4.Division");
		System.out.println("5.Exit");
	}
}

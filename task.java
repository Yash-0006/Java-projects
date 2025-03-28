package Loops;

import java.util.Scanner;

public class task{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int ch;
		System.out.println("enter money in account");
		int balance = sc.nextInt();
		do {
			displayname();
			ch = Integer.parseInt(sc.next());
			balance  = voting(ch,balance);
		}while(ch>0);
	}

	private static int voting(int ch, int balance) {
		switch(ch){
		case 1:
			balance = withdraw(balance);
			break;
		case 2:
			balance = deposit(balance);
			break;
		case 3:
			balanceEnquiry(balance);
			break;
		case 4:
			balance = transfer(balance);
			break;
		case 5 :
			System.exit(0);
		default:
			System.out.println("Invalid option !!");
		}
		return balance;
	}

	private static int transfer(int balance) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter account number to transfer:");
		long ac = sc.nextLong();
		System.out.println("Enter amount to tranfer");
		int a = sc.nextInt();
		if(a<=balance) {
			balance -= a;
			System.out.println("succesfully transfered "+a+ " rupees to "+ac);
		}else {
			System.out.println("Insufficient balance");
		}
		return balance;
			
	}

	private static void balanceEnquiry(int balance) {
		System.out.println("your balance is "+balance+ " rupees");		
	}

	private static int deposit(int balance) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter amount to deposit");
		int a = sc.nextInt();
		balance += a;
		System.out.println("Succesfullt deposited "+a+" rupees");
		return balance;
	}

	private static int withdraw(int balance) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter amount to withdraw");
		int a = sc.nextInt();
		if(a<=balance) {
			balance -= a;
			System.out.println("succesfully withdrawed "+a+ " rupees");
		}else {
			System.out.println("Insufficient balance");
		}
		return balance;
	}

	private static void displayname() {
		System.out.println("Enter your choice : ");
		System.out.println("1.Withdraw");
		System.out.println("2.Deposit");
		System.out.println("3.Balance check");
		System.out.println("4.Transfer");
		System.out.println("5.Exit");
	}
}

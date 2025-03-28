package IfelseExample;

import java.util.Scanner;

public class keyboard {
	private static void displayMenu() {
		System.out.println("Select a number to vote:");
		System.out.println("\t1.TDP");
		System.out.println("\t2.JSP");
		System.out.println("\t3.YCP");
		System.out.println("\t4.BJP");
		System.out.println("\t5.NOTA");
	}
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		displayMenu();
		int keyword = sc.nextInt();
		switch(keyword) {
		case 1:
			System.out.println("TDP");
			break;
		case 2:
			System.out.println("JSP");
			break;
		case 3:
			System.out.println("YCP");
			break;
		case 4 : 
			System.out.println("BJP");
			break;
		case 5 : 
			System.out.println("NOTA");
			break;
		default : 
			System.out.println("Invalid Option");
			break;
		}
		sc.close();
	}
}

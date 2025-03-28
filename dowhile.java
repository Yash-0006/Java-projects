package Loops;

import java.util.Scanner;

public class dowhile {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter your name:");
		String name = sc.nextLine();
		System.out.println("Enter number of tiime to print:");
		int num = sc.nextInt();
		do {
			System.out.println(name);
			num--;
		}while(num>0);
	}
}

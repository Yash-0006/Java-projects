package Loops;

import java.util.Scanner;

public class whileloop {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter your name:");
		String name = sc.nextLine();
		System.out.println("Enter number of time to print:");
		int num = sc.nextInt();
		while(num>0) {
			System.out.println(name);
			num--;
		}
	}
}

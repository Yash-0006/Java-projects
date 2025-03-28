package Loops;

import java.util.Scanner;

public class forloop {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter your name : ");
		String name = sc.nextLine();
		System.out.println("Enter number of times to print");
		int num = sc.nextInt();
		
		for(int i=0;i<num;i++) {
			System.out.println(name);
		}
	}
}

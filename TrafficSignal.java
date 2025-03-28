package IfelseExample;
import java.util.Scanner;

public class TrafficSignal {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Traffic Signal infront of you :");
		String color = sc.next();
		color = color.toLowerCase();
		if("red".equals(color)) {
			System.out.print("Stop!!");
		}else if("yellow".equals(color)) {
			System.out.print("Wait!!");
		}else if("green".equals(color)) {
			System.out.print("Go!!");
		}else {
			System.out.print("Invalid input!!");
		}
		sc.close();
	}
}

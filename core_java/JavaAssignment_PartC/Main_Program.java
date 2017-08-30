package javaAssignment_PartC;

import java.util.Scanner;

public class Main_Program {
	public static void main(String args[]) throws InterruptedException {
		System.out.println("Enter range of numbers (start, end): ");

		Scanner sc = new Scanner(System.in);
		int start = sc.nextInt();
		int end = sc.nextInt();
		sc.close();
		
		//creating two objects, one for even and one for odd
		Number_Program T1 = new Number_Program(start,end, "Even");
		T1.start();
		Number_Program T2 = new Number_Program(start,end, "Odd");
		T2.start();
		T1.join();
		T2.join();
		T1.display();
		T2.display();
		
		
	}
}

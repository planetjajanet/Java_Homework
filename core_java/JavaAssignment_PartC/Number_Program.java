package javaAssignment_PartC;

import java.util.*;

public class Number_Program extends Thread {
	int start;
	int end;
	String NumberType = null;
	List<Integer> numberList = new ArrayList<Integer>();
	
	//constructor
	Number_Program(int s, int e, String t){
		this.start = s;
		this.end = e;
		this.NumberType = t;
	}
	
	@Override
	public void run() {
		//add all even numbers to the list
		if (NumberType == "Even") {
			for(int i = start; i<=end; i++) {
				if (i%2==0) {
					numberList.add(i);
				}
			}
		}
		
		//add all odd numbers to the list
		if (NumberType == "Odd") {
			for(int i = start; i<=end; i++) {
				if (i%2==1) {
					numberList.add(i);
				}
			}
		}
	}
	
	public void display() {
		System.out.println(NumberType + " numbers in given range: ");
		for(int i =0; i<numberList.size(); i++) {
			System.out.print(numberList.get(i) + " ");
		}
		//print new line
		System.out.println();
	}
}


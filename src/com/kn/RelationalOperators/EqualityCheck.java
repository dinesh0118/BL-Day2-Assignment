package com.kn.RelationalOperators;

import java.util.Scanner;

public class EqualityCheck {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the first input : ");
		String input1 = scan.nextLine();
		System.out.println("Enter the second input : ");
		String input2 = scan.nextLine();
		
		if(input1.equalsIgnoreCase(input2)) {
			System.out.println("Both inputs are equal.");
		}
		else {
			System.out.println("Both inputs are not equal.");
		}
		scan.close();
	}

}

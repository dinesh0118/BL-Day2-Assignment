package com.kn.LogicalOperators;

import java.util.Scanner;

public class DivisibilityCheck {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the number : ");
		int num = scan.nextInt();
		if(num % 5==0 && num % 7==0) {
			System.out.println("The given number is divisible.");
		}
		else {
			System.out.println("The given number is Not-divisible.");
		}
		scan.close();
	}

}

package com.kn.BitwiseOperators;

import java.util.Scanner;

public class BitwiseANDORXOR {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the first number : ");
		int num1 = scan.nextInt();
		System.out.println("Enter the second number : ");
		int num2 = scan.nextInt();
		
		if(num1 %2 ==0 && num2 %2 ==0) {
			System.out.println("Even number.");
		}
		else if(num1 %2 !=0 || num2 %2 !=0) {
			System.out.println("ODD number.");
		}
		System.out.println("The XOR Operation is : ");
		System.out.println(num1 ^ num2);
		scan.close();
	}

}

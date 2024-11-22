package com.kn.ArthematicOperators;

import java.util.Scanner;

public class AverageCalculation {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the first number : ");
		int num1 = scan.nextInt();
		System.out.println("Enter the second number : ");
		int num2 = scan.nextInt();
		System.out.println("Enter the third number : ");
		int num3 = scan.nextInt();
		System.out.println("Enter the fourth number : ");
		int num4 = scan.nextInt();
		System.out.println("Enter the fifth number : ");
		int num5 = scan.nextInt();
		
		int result = (num1 + num2 + num3 + num4 + num5) / 5;
		System.out.println("Average of Three Numbers : "+result);
		scan.close();

	}

}

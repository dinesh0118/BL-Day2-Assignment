package com.kn.ArthematicOperators;

import java.util.Scanner;

public class AdditionAndSubtraction {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Enter the two values : ");
		int num1 = scan.nextInt();
		int num2 = scan.nextInt();
		
		int sum =num1 + num2;
		System.out.println("sum :"+sum);
		
		int difference = num1 - num2;
		System.out.println("difference : "+ difference);
		scan.close();

	}

}

package com.kn.BitwiseOperators;

import java.util.Scanner;

public class OddorEven {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the number1 : ");
		int num1 = scan.nextInt();
		System.out.println("Enter the number1 : ");
		int num2 = scan.nextInt();
		
		int result = num1 & num2;
		System.out.println("result : " +result);
		scan.close();

	}

}

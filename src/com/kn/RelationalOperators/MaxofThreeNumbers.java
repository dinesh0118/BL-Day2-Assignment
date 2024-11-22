package com.kn.RelationalOperators;

import java.util.Scanner;

public class MaxofThreeNumbers {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the first number : ");
		int num1 = scan.nextInt();
		System.out.println("Enter the second number : ");
		int num2 = scan.nextInt();
		System.out.println("Enter the third number : ");
		int num3 = scan.nextInt();
		
		if(num1>=num2 && num1>=num3) {
			System.out.println("MaxofThreeNumbers :"+num1);
		}
		if(num2>=num1 && num2>=num3) {
			System.out.println("MaxofThreeNumbers :"+num2);
		}
		if(num3>=num1 && num3>=num2) {
			System.out.println("MaxofThreeNumbers :"+num3);
		}	
		scan.close();
	}

}

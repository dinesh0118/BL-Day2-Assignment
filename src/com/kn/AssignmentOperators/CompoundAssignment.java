package com.kn.AssignmentOperators;

import java.util.Scanner;

public class CompoundAssignment {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the first number : ");
		int num1 = scan.nextInt();
		System.out.println("Enter the second number : ");
		int num2 = scan.nextInt();
		
		int sum =1;
		if(num2>num1 || num1> num2) {
			sum += num2;
			System.out.println("CompoundAssignment : "+sum);
		}
		if(num2>num1 || num1> num2) {
			sum -= num2;
			System.out.println("CompoundAssignment : "+sum);
		}
		if(num2>num1 || num1> num2) {
			sum *= num2;
			System.out.println("CompoundAssignment : "+sum);
		}
		if(num2 !=0) {
			if(num2>num1 || num1> num2) {
				sum /= num2;
				System.out.println("CompoundAssignment : "+sum);
			}
		}
		if(num2%num1 != 0) {
			sum = num2;
			System.out.println("CompoundAssignment : "+sum);
		}
		
		
		scan.close();
	}

}

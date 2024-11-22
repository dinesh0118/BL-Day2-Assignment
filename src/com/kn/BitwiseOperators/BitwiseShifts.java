package com.kn.BitwiseOperators;

import java.util.Scanner;

public class BitwiseShifts {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the number : ");
		int num = scan.nextInt();
		
		int result1 = num << 1;
		System.out.println(result1);
		int result2 = num>>1;
		System.out.println(result2);
		scan.close();
		
	}

}

package com.kn.LogicalOperators;

import java.util.Scanner;

public class LeapYearCheck {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the year : ");
		int year = scan.nextInt();
		boolean isLeapYear = (year % 4 == 0) && ((year % 100 != 0) || (year % 400 == 0));
		
		System.out.println(isLeapYear);
		scan.close();

	}

}

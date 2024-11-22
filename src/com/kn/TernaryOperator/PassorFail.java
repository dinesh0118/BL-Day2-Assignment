package com.kn.TernaryOperator;

import java.util.Scanner;

public class PassorFail {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the marks of the student in english : ");
		double english = scan.nextDouble();
		System.out.println("Enter the marks of the student in biology : ");
		double biology = scan.nextDouble();
		System.out.println("Enter the marks of the student in chemistry : ");
		double chemistry = scan.nextDouble();
		System.out.println("Enter the marks of the student in science : ");
		double science = scan.nextDouble();
		
		double averagemarks = 250;
		double totalmarks = 400;
		double studentMarks = english + biology + chemistry + science;
		
		boolean result = (studentMarks >= averagemarks || studentMarks == totalmarks ? true : false);
		System.out.println(result);
		scan.close();
	}

}

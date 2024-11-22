package com.kn.ArthematicOperators;

import java.util.Scanner;

public class CircleMeasurements {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the value : ");
		double radius = scan.nextInt();
		double area = (3.14) * (radius) * radius;
		
		System.out.println("Area : "+area);
		scan.close();

	}

}

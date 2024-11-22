package com.kn.UnaryOperators;

import java.util.Scanner;

public class PostIncrementandPreIncrement {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the number : ");
		int n = scan.nextInt();
		
		int result = n++;
		System.out.println(result+ " " +n); 
		result = ++n;
		System.out.println(result+ " " +n);
		scan.close();

	}

}

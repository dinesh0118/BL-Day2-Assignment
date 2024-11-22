package com.kn.UnaryOperators;

import java.util.Scanner;

public class ToggleBoolean {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the true or false!");
		boolean toogle = scan.hasNext();
		toogle = !toogle;
		System.out.println(toogle);
		toogle = !toogle;
		System.out.println();
		System.out.println(toogle);
		scan.close();

	}

}

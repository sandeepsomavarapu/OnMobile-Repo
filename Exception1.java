package com.onmobile.exceptions;

import java.util.Scanner;

class Exception1 {
	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter first number division :");
		int a = scanner.nextInt();
		System.out.println("Enter second number division :");
		int b = scanner.nextInt();
		try {
			System.out.println("division two numbers : " + (a / b));
		} catch (ArithmeticException e) {
			System.out.println("dont enter zero as denominator");
		}

		System.out.println("remaining  100 lines code ");

		scanner.close();

	}
}
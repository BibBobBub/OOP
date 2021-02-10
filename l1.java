package com.oop.lab1;

import java.util.Scanner;

/*
 * created by Ladonia Yurii
 * OOP Lab1
 * Номер заліковки: 515
 * С1 = 1 --> '+'
 * C3 = 2
 * C5 = 0 --> '*'
 * C7 = 4 --> 'char'
 *
 */

public class l1 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		double total = 0;
		final int c = 2;

		System.out.print("Enter A: ");
		char a = (char) scanner.nextInt();

		System.out.print("Enter B: ");
		char b = (char) scanner.nextInt();

		System.out.print("Enter N: ");
		char n = (char) scanner.nextInt();

		System.out.print("Enter M: ");
		char m = (char) scanner.nextInt();

		// Division by zero check, not needed if c is more then 0
		if ( (a + c) == 0 || (n + c) == 0) {
			System.out.println("Division by zero!");
			return;
		}

		for ( char i = a; i <= n; i++ ) {
			for ( char j = b; j <= m; j++ ) {
				total += ((double) (i + j)) / ((double) (i + c));
			}
		}

		System.out.printf("Result: %.2f", total);
	}

}

package com.nit.cj_exception_handling;

public class Debug_Demo {

	public static void main(String[] args) {

		int x = 10;

		x = x++ + --x + x++ - --x + ++x;

		if (x>=30) {
			System.out.println("x value is less than 30");
		} else {
			System.out.println("x value is greater than 30");

		}

	}

}

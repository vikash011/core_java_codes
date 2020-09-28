package com.nit.cj_exception_handling;

public class Try_Catch_Finally_Case2 {

	public static void main(String[] args) {

		try {
			System.out.println("In try");
			System.out.println(10/0);
		} catch (ArithmeticException ae) {
			System.out.println("In catch");

		} finally {
			System.out.println("In finally");
		}
		System.out.println("after try/catch/finally");

	}

}

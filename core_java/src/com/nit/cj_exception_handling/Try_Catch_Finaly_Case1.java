package com.nit.cj_exception_handling;

public class Try_Catch_Finaly_Case1 {

	public static void main(String[] args) {

		try {
			System.out.println("In try");
		} catch (ArithmeticException ae) {
			System.out.println("In catch");

		} finally {
			System.out.println("In finally");

		}
		System.out.println("after try/catch/finally");
	}

}

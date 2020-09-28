package com.nit.cj_exception_handling;

public class Try_Catch_Finally_Case3 {

	public static void main(String[] args) {

		try {
			System.out.println("In try");
			System.out.println(10 / 0);

		} catch (NullPointerException npe) {
			System.out.println("In catch");

		} finally {
			System.out.println("In finally");
		}
		System.out.println("After try/catch/finally");

	}

}

package com.nit.cj_exception_handling;

public class Inner_Try_Demo_7 {

	public static void main(String[] args) {

		try {
			System.out.println("In Outer Try");
			try {
				System.out.println("In inner try");
				System.out.println(10/0);
			}catch(ArithmeticException ae) {
				System.out.println("In inner catch");
				System.out.println(10/0);
			}
			System.out.println("after inner try/catch");
		}catch(NumberFormatException nfe) {
			System.out.println("In outer catch");
		}
		System.out.println("after outer Try/catch");
	}
}

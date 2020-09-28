package com.nit.cj_exception_handling;

public class Try_With_Return_Stmt_with_Value {

	public static void main(String[] args) {

		System.out.println(m1());
	}

	static int m1() {

		try {
			System.out.println("In try");
			return 10;
			
		} finally {
			System.out.println("In finally");

		}
//        unreachable stmt		
//		System.out.println("After try/finally");
//		return 20;

	}

}

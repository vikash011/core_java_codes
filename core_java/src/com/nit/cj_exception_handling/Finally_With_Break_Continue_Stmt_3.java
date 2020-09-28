package com.nit.cj_exception_handling;

public class Finally_With_Break_Continue_Stmt_3 {

/**	public static void main(String[] args) {

		System.out.println("main starts");
		System.out.println("Result:" + m1());
		System.out.println("main end");

	}

	static int m1() {

		System.out.println("m1 starts");
		int i = 0;
		while (++i <= 5) {

			System.out.println("While start i:" + i);
			try {

				System.out.println("In try" + i);
				return 10;

			} finally {
				System.out.println("In finally");
				System.out.println("break executed");
				break;
			}
		}
		System.out.println("After while loop");
		System.out.println("m1 end");

		return 20;

	}
*/
}

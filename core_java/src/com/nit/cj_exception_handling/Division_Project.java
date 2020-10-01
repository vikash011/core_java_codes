package com.nit.cj_exception_handling;

import java.util.Scanner;

public class Division_Project {

	public static void main(String[] args) {
		System.out.println("main starts");

		@SuppressWarnings("resource")
		Scanner scn = new Scanner(System.in);

		System.out.println("Enter num1");
		int num1 = scn.nextInt();

		System.out.println("Enter num2");
		int num2 = scn.nextInt();

		int Result = div(num1, num2);
		System.out.println("Result::" + Result);

		System.out.println("main ends");

	}

	static int div(int num11, int num22) {
        int result=0;
		try {

			if (num11 < 0 || num22 < 0) {
                 
				throw new NumberFormatException("enter valid number");
			}else {
				result = num11/num22;
			}

				// System.out.println("Result is:"+result);
		

		} catch (ArithmeticException ae) {
			ae.printStackTrace();

		} catch (NumberFormatException nfe) {
			nfe.printStackTrace();
		}
		return result;

	}
}

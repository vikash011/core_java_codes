package com.nit.cj_exception_handling;

public class Try_Catch_Finally_Case5 {

	public static void main(String[] args) {

		try {
			System.out.println("In try");
			System.out.println(10 / 0);
			
		} finally {
			System.out.println("In Finally");
		}
		System.out.println("After try/Catch");
	}

}

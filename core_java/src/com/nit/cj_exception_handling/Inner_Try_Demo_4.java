package com.nit.cj_exception_handling;

public class Inner_Try_Demo_4 {

	public static void main(String[] args) {
	
		try {
			System.out.println("In Outer try");
			System.out.println(10/0);
			
			try {
				System.out.println("In Inner Try");
		
			}catch(ArithmeticException ae) {
				System.out.println("In Inner Catch");
			}
			System.out.println("In Inner Catch");
		
		}catch(ArithmeticException ae) {
			System.out.println("In Outer Catch");
		}
		System.out.println("After Outer try/catch");
	}
}

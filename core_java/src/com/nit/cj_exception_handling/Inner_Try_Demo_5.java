package com.nit.cj_exception_handling;

public class Inner_Try_Demo_5 {

	public static void main(String[] args) {
		
		try {
			  System.out.println("In outer Catch");
			  try {
				  System.out.println("In inner try");
				  System.out.println(10/0);
				  
			  }catch(NumberFormatException ae) {
				  System.out.println("In Inner Catch");
			  }
			  System.out.println("after inner try/catch");
			  
		}catch(ArithmeticException ae) {
			System.out.println("In outer catch");
		}
		System.out.println("after outer try/catch");
	}

}

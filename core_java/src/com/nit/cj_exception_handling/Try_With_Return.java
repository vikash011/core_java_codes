package com.nit.cj_exception_handling;

public class Try_With_Return {

	public static void main(String[] args) {
	
		
		  try {
			  System.out.println("In try");
			  return;
			  
		  }finally {
			  System.out.println("In Finally");
			  
		  }
//		  unreachable stmt
//		  System.out.println("After try/Catch");


	}

}

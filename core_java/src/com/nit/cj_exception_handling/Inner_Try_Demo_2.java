package com.nit.cj_exception_handling;

public class Inner_Try_Demo_2 {

	public static void main(String[] args) {
		
		
		try{
			
			   System.out.println("In Outer Try");
			   
			   try {
				     System.out.println("In Inner Try");
			   }
			   catch(ArithmeticException ae) {
				     System.out.println("In Inner Catch");
			   }
			    System.out.println("After Inner try/catch");
			
		}
        catch(ArithmeticException ae) {
        	System.out.println("In Outer Catch");	
        }
		System.out.println("After outer try/catch");
	}

}

package com.nit.cj_exception_handling;
/**
public class Finally_With_ReturnStmt_Cond_True_False {

	  	public static void main(String[] args) {
		
		System.out.println(m1());
	}
      static int m1(){
        	
        	try {
        		System.out.println("In try");
        		return 10;
        		
        	}catch(ArithmeticException ae) {
        		
        		System.out.println("In catch");
        		
        	}finally {
        		System.out.println("In finally");
        		if(true) {
        		return 30; 
        		}
        		
        	}
        	System.out.println("After try/catch/finally");
		
        	
        }
}
*/
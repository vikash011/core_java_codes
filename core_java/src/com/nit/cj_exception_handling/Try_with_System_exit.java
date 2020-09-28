package com.nit.cj_exception_handling;

public class Try_with_System_exit {

	public static void main(String[] args) {
	      
		try {
			System.out.println("In try");
			System.exit(0);
			
		}finally {
			System.out.println("In finally");
		}
        System.out.println("After try/Finally");
	}

}

package com.nit.cj_exception_handling;

public class Finally_With_Break {

	public static void main(String[] args) {
	       	
		for(int i=1;i<=10;i++) {
			
			System.out.println("\nIn Loop:"+i);
			try {
				System.out.println("In try");
				if(i==5) {
					break;		
				}
			}finally {
				System.out.println("In finally");
			}
			System.out.println("After try/Finally");
		}
		System.out.println("\n After Loop");
	}

}

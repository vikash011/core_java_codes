package com.nit.cj_exception_handling;

public class Inner_Try_Demo_6 {

	public static void main(String[] args) {
		
		
		try {
			System.out.println("in outer try");
			try {
				System.out.println("In inner try");
				System.out.println(10/0);
			}catch(NumberFormatException nfe) {
               System.out.println("in inner catch");				
			}
			System.out.println("after inner try/catch");
			
		}catch(NumberFormatException nfe) {
			System.out.println("In outer catch");
		}
         System.out.println("after outer try/catch");
	}

}

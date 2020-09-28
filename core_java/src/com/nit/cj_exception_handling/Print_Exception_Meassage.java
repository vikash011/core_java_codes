package com.nit.cj_exception_handling;

public class Print_Exception_Meassage {
	/**
	*Throwable class methods to print exception messages from catch blocks
	*methods {getMessage(),toString(),printStackTrace()}
	*/
	
	       public static void main(String[] args){


			   try{
	             System.out.println(10/0);
			   }
		   catch(ArithmeticException ae){
				   System.out.println("getMeassage() method output");
				  System.out.println(ae.getMessage()); 
				   System.out.println("==============================================");
			   

			   System.out.println("toString() method output");
				  System.out.println( ae.toString());
				   System.out.println("==============================================");

			   System.out.println("printStackTrace() method output");
				  ae.printStackTrace(); 
				   System.out.println("===============================================");

			   System.out.println("JVM default output");
				   throw ae;
		 
			   }
		   }
	}



package com.nit.cj_exception_handling;

public class Inner_Try_Demo_3 {

	public static void main(String[] args) {
      
          try {
        	  System.out.println("In Outer Try");
        	
        	  try {
        		  System.out.println("In Inner Try");
        		  
        		  System.out.println(10/0);
        		  
        	  }catch(ArithmeticException ae) {
        		  System.out.println("Inner Catch");
 
        	  }
              System.out.println("After Inner try/catch");  
              
          }catch(ArithmeticException ae) {
        	  
        	  System.out.println("In Outer Catch");
        	  
          }
          System.out.println("After Outer Try/Catch");
	}

}

package com.nit.cj_multithreading;



public class Multiple_Thread_With_Different_Logic {
	
	public static void main(String[] args) {
		
		System.out.println("main start");
		
		MyThread_06 mt1 = new MyThread_06();
		MyThread_07 mt2 = new MyThread_07();
		
		mt1.start();
		mt2.start();
		
		for (int i = 30; i <= 50; i++) {
			System.out.println(" main" + i);
		}
		
		System.out.println("main ends");
	}

}

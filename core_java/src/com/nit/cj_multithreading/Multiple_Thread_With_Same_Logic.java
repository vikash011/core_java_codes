package com.nit.cj_multithreading;

public class Multiple_Thread_With_Same_Logic {

	public static void main(String[] args) {
		
	System.out.println("main starts");
		
		MyThread_05 mt1 = new MyThread_05(5);
		MyThread_05 mt2 = new MyThread_05(10);
		MyThread_05 mt3 = new MyThread_05(20);
		
		mt1.start();
		mt2.start();
		mt3.start();
		
		for(int i=0;i<20;i++) {
			System.out.println("main "+i);
		}
		
		System.out.println("main ends");
		

	}

}

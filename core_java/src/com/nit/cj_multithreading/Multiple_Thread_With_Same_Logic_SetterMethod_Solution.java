package com.nit.cj_multithreading;

/*Application shows creating multiple user defined Thread 
 * to execute same Logic Concurrently with 
 * different state Initializing object with setter method(Solution)   
 * */
public class Multiple_Thread_With_Same_Logic_SetterMethod_Solution {

	public static void main(String[] args) {

		System.out.println("main starts");

		MyThread_09 mt1 = new MyThread_09();
		// mt1.setX(15);
		mt1.start();

		MyThread_09 mt2 = new MyThread_09();
		mt2.setX(20);
		mt2.start();

		for (int i = 0; i <= 20; i++) {
			System.out.println("main " + i);

		}

		System.out.println("main ends");
	}
}

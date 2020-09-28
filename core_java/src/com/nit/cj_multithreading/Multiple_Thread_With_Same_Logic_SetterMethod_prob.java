package com.nit.cj_multithreading;

/*
Application shows creating multiple user defined Threads to execute same Logic concurrently
with different state Initializing object with Setter method(Problem)

*/
public class Multiple_Thread_With_Same_Logic_SetterMethod_prob {

	public static void main(String[] args) {

		System.out.println("main starts");

		MyThread_08 mt1 = new MyThread_08();
		mt1.setX(10);
		mt1.start();

		MyThread_08 mt2 = new MyThread_08();
		mt2.start();

		for (int i = 0; i <= 10; i++) {

			System.out.println("main " + i);

		}

		System.out.println("main ends");

	}
}

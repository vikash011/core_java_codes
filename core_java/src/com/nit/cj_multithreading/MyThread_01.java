package com.nit.cj_multithreading;


//creating custom Thread=> by extending from Thread class
public class MyThread_01 extends Thread {

	@Override
	public void run() {
		System.out.println("run executed");
	}

	public static void main(String[] args) {

		//creating instance of sub class thread class
		MyThread_01 mt1 = new MyThread_01();
		
		//thread is ready to run state
		mt1.start();                          
		
		System.out.println("main executed");
	}
}

package com.nit.cj_multithreading;

//creating custom Thread=> by implementing Runnable Interface 
public class MyRunnable_01 implements Runnable {

	@Override
	public void run() {
		System.out.println("run excecuted");
	}

	public static void main(String[] args) {

		MyRunnable_01 mr1 = new MyRunnable_01();
		// start() is not present in Runnale
		// mr1.start();

		Thread th = new Thread(mr1);
		th.start();

		System.out.println("main executed");

	}
}

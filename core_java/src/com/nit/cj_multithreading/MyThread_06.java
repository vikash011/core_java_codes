package com.nit.cj_multithreading;

public class MyThread_06 extends Thread {
	
	@Override
	public void run() {

		System.out.println("run starts");
		for (int i = 0; i <= 10; i++) {
			System.out.println(getName() + " Run" + i);
		}
		System.out.println("run ends");
	}
}

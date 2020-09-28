package com.nit.cj_multithreading;

public class MyThread_07 extends Thread {

	@Override
	public void run() {

		System.out.println("run starts");
		for (int i = 10; i <= 20; i++) {
			System.out.println(getName() + " Run" + i);
		}
		System.out.println("run ends");
	}
}


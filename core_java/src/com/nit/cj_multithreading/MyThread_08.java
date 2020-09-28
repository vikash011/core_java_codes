package com.nit.cj_multithreading;

public class MyThread_08 extends Thread {

	int x;

	// x value initialization through setter method
	public void setX(int x) {
		this.x = x;
	}

	public void run() {
		for (int i = 0; i <=this.x; i++) {
			System.out.println(getName() + " Run " + i);
		}

	}

}

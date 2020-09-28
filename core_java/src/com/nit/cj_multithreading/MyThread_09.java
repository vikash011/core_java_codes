package com.nit.cj_multithreading;

public class MyThread_09 extends Thread {

	int x;
	boolean xInitialized = false;

	public void setX(int x) {
		this.x = x;
		xInitialized = true;
	}

	@Override
	public void run() {
		if (!xInitialized) {
			throw new IllegalStateException("Error:x is not Initialized for" + "Thread name[" + getName() + "]");

		}

		for (int i = 0; i <= this.x; i++) {
			System.out.println(getName() + "  Run " + i);

		}
	}

}

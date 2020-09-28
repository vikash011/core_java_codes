package com.nit.cj_multithreading;

public class SubThread extends Thread {

	int sub = 0;

	@Override
	public void run() {

		for (int i = 50; i >= 0; i--) {

			sub = sub - i; // sub -=i;
			System.out.println("The Substraction:" + sub);

		}
	}

}

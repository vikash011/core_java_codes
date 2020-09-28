package com.nit.cj_multithreading;

public class AddThread extends Thread {

	int sum = 0;

	@Override
	public void run() {

		for (int i = 1; i <= 50; i++) {

			sum = sum + i; // sum +=i;
			System.out.println("The Summation:" + sum);
		}
	}

}

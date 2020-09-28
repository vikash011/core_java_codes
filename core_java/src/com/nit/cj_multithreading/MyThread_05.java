package com.nit.cj_multithreading;

public class MyThread_05 extends Thread{

	int x=0;
	
	
	public MyThread_05(int x) {
		this.x=x;	
	}
	
	
	@Override
	public void run() {
		for(int i=1;i<=this.x;i++) {
			System.out.println(getName()+"Run::"+i);
		}
	}
	
	
}

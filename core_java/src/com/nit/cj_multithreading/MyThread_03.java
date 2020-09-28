package com.nit.cj_multithreading;

public class MyThread_03 extends Thread{

	@Override
	public void run() {
		System.out.println("run started");
		
		for(int i=0;i<=10;i++) {
			System.out.println(getName()+"i value::"+i);	
		}

		System.out.println("run end");
		
	}
	public static void main(String[] args) {
		System.out.println("main starts");
		
		MyThread_02 mt2 = new MyThread_02();
		mt2.start();
		
		for(int i=0;i<=10;i++) {
			System.out.println("i value::"+i);	
		}

		System.out.println("main ends");
	}
}

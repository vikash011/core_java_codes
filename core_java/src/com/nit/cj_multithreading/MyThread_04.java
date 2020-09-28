package com.nit.cj_multithreading;

public class MyThread_04 extends Thread {

	
	@Override
	public void run() {
	     System.out.println("run executed");
	     
	     for(int i=0;i<=10;i++) {
	    	 System.out.println(getName()+" i value "+i);	 
	     }
	  
	     System.out.println("run ends");
	}
	
	
	public static void main(String[] args) {
		
		System.out.println("main starts");
		
		MyThread_04 mt1 = new MyThread_04();
		MyThread_04 mt2 = new MyThread_04();
		MyThread_04 mt3 = new MyThread_04();
		
		mt1.start();
		mt2.start();
		mt3.start();
		
		System.out.println("main ends");
		
		
	}
}

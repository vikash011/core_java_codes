package com.nit.cj_multithreading;

public class Multiple_Thread_With_ADD_SUB_Logic {

	public static void main(String[] args) {
		
		System.out.println("main starts");
		
		AddThread add = new AddThread();
		add.start();
		
		SubThread sub = new SubThread();
		sub.start();
		
		System.out.println("main ends");
	}
	
}

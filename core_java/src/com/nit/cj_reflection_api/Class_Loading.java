package com.nit.cj_reflection_api;

import java.util.Scanner;

public class Class_Loading {

	public static void main(String[] args) throws ClassNotFoundException {

		Scanner scn = new Scanner(System.in);

		System.out.println("enter class name");
		 String cls = scn.next();
          
		//loading class by class.forName(); 
		@SuppressWarnings("rawtypes")
		Class classs = Class.forName(cls);
		
		System.out.println(classs + " is loaded");
		

		scn.close();

	}

}

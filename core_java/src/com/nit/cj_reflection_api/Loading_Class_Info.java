package com.nit.cj_reflection_api;

import java.lang.reflect.Field;
import java.lang.reflect.Modifier;
import java.util.Scanner;

public class Loading_Class_Info {
	
	public static void main(String[] args) throws ClassNotFoundException {
		
		Scanner scn = new Scanner(System.in);
		
	//	System.out.println("Enter class name");
	//	String clsname = scn.next();
		
		Class cls = Class.forName("java.lang.String"); 
		System.out.println(cls+" is loaded");
		
		System.out.println("=========================================================================");
		System.out.println(" modifiers::"+Modifier.toString(cls.getModifiers()));
		System.out.println(" modifiers::"+cls.getModifiers());
		System.out.println("name::"+cls.getName());
		System.out.println("simple name::"+cls.getSimpleName());
		System.out.println("type name::"+cls.getTypeName());
		System.out.println("pakage name::"+cls.getPackage());
		System.out.println("pakage name::"+cls.getSuperclass());
		
		System.out.println("class type::"+(cls.isInterface()?"interface":"class"));
		System.out.println("class type::"+cls.getInterfaces());
		System.out.println("class type::"+java.util.Arrays.toString(cls.getInterfaces()));
		System.out.println("============================================================================");
		System.out.println();
		
		System.out.println("class Field Information");
	    Field[] fa =cls.getDeclaredFields();
	    
		System.out.println("field length"+fa.length);
	    for(int i=0;i<=fa.length;i++) {
	    	Field field = fa[i];
	    	
	    	System.out.println("Field   "+(i)+"  information");
	    	System.out.println("modifier  "+Modifier.toString(field.getModifiers()));
	    	System.out.println("data type  "+field.getType());
	    	System.out.println("name  "+field.getName());
	 
	    }
		
		
		
	
		
	}
	
	}
	

	/*
	 * class A { private static int a = 10; private int x = 20; static {
	 * System.out.println("class A SB  is executed"); } private A(){
	 * System.out.println("class A NPC is executed"); } public A(int x, int y)
	 * throws InterruptedException{ System.out.println("class A IPC is executed"); }
	 * public static void main(String[] args) {
	 * System.out.println("class A main method is executed"); } public static class
	 * X{ } public class Y{ } }
	 * 
	 * 
	 * }
	 */

package com.myjavaintro;

public class MethodCreation {
	
	 static void method1(){
		System.out.println("method1");
		MethodCreation c1=new MethodCreation();
		c1.method4();
	 }
	public static void main(String[] args) {
		method1();	
		}
	static void method2() {
		System.out.println("method2");
		MethodCreation c2=new MethodCreation();
		c2.method5();
	}
	void method4() {
	System.out.println("method4");
	method2();
	}
	void method5() {
		System.out.println("method5");
		MethodCreation c3=new MethodCreation();
		c3.method6();
	}
	void method6() {
		System.out.println("method6");
		method3();
	}
	static void method3(){
		System.out.println("method3");
		
	}
	
}
		// TODO Auto-generated method stub



package com.ruby.java.ch06;

public class StaticMethodTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		StaticMethodTest.print1();
		StaticMethodTest smt = new StaticMethodTest();
		smt.print2();
	}
	public static void print1() { //클래스 메소드
		System.out.println("hello");
	}
	public void print2() {
		System.out.println("good"); //인스턴스 메소드
	}

}

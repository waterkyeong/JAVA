package com.ruby.java.ch06;

public class Member {
	private String name;
	private int age;

	public Member() {
		this("guest");
//		name = "gest";
//		age = 0;
	}

	public Member(String name) {
		this(name, 0); // 이 함수는 Member(name, age)호춮
		
//		this.name = name;
//		age = 0;
	}

	public Member(String name, int age) {
		this.name = name;
		this.age = age;
	}
	
	public String toString() {
		return name + ":" + age;
	}

	public void setName(String name) {
	}

	public static void main(String[] args) {
		System.out.println("main() 메서드 실행");
		Member m1 = new Member();
		Member m2 = new Member("Amy");
		Member m3 = new Member("Amy", 23);
		System.out.println(m3.toString());
	}
}

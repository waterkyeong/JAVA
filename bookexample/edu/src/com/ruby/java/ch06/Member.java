package com.ruby.java.ch06;

public class Member {
	private String name;
	private int age;

	public Member() {
		System.out.println("Member() 积己磊 角青");
	}

	public Member(String name) {
		System.out.print("Member(String) 积己磊 角青 : ");
		System.out.println(name);
	}

	public Member(String name, int age) {
		System.out.print("Member(String, int) 积己磊 角青 : ");
		System.out.println(name + " : " + age);
	}

	public void setName(String name) {
	}

	public static void main(String[] args) {
		System.out.println("main() 皋辑靛 角青");
		new Member();
		new Member("Amy");
		new Member("Amy", 23);
	}
}
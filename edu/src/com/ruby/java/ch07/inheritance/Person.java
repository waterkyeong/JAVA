package com.ruby.java.ch07.inheritance;

public class Person {
	protected String name;
	protected int age;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String toString() {
		//return name + ":" + age + ":" + dept;
		return name + "," + age;
	}
}
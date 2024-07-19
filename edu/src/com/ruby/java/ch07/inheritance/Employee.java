package com.ruby.java.ch07.inheritance;

public class Employee extends Person{ // extends가 상속을 의미.
//	private String name;
//	private int age;
	private String dept;
	public Employee() {}
	public Employee(String name, int age, String dept) {
		this.name=name;
		this.age=age;
		this.dept=dept;
	}
	
//	private String getName() {
//		return name;
//	}
//	public void setName(String name) {
//		this.name = name;
//	}
//	public int getAge() {
//		return age;
//	}
//	public void setAge(int age) {
//		this.age = age;
//	}

	public String getDept() {
		return dept;
	}

	public void setDept(String dept) {
		this.dept = dept;
	}
	public String toString() {
//		return name + "," + age + "," + dept;
		return super.toString()+","+dept;
	}
}
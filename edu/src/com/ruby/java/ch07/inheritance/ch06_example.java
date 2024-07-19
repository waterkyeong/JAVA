package com.ruby.java.ch07.inheritance;

//6장 실습 구현 - this 사용 생성자 구현 

class Employee2 {
	int pid;
	String name;
	int age;
	int eno;
	String dept;
	float salary;
	public Employee2(int pid, String name, int age, int eno, String dept, float salary) {
		this.pid = pid;
		this.name = name;
		this.age = age;
		this.eno = eno;
		this.dept = dept;
		this.salary = salary;
	}
	public Employee2(int pid, String name, int age, int eno) {
		this(pid, name, age, eno, null, 0.0f);

	}
	
	public Employee2(int pid, String name) {
		this(pid, name, 0, 0);

	}
	
	public Employee2() {

	}
	@Override
	
	
	public String toString( ) {
		return pid + " : " + name + "," + age + "," + eno + "," + dept + "," + salary;
		
	}

}
public class ch06_example {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	  Employee2[]arr = new Employee2[5];
	  arr[0] = new Employee2();
	  arr[1] = new Employee2(3, "Park");
	  arr[2] = new Employee2(3, "Park", 30, 2001);
	  arr[3] = new Employee2(4, "Choi", 35, 2002, "Engineering", 4000);
	  arr[4] = new Employee2(5, "Kang", 22, 1003, "Physics", 4);
		for(Employee2 p : arr) {
			System.out.println(p.toString());
		}

	}

}

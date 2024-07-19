package com.ruby.java.ch07.inheritance;
//7장 실습 구현 
abstract class Person2 {
	int pid;
	String name;
	int age;
	public abstract String toString(); 
}
class Student2 extends Person2 {
	//sid, dept, year
	//super 사용
	
	
	@Override
	public String toString() {
		super.toString();
		return sid+ "," + dept + "'" + year;
	}
}
class Employee extends Person2 {
	int sid;
	String dept;
	int year;
	
	//eno, dept, salary
	//super 사용
	super(sid, dept, year);
	
	public Student2(int pid, String name, int age, ,int sid, String dept, int year) 
		super(pid, name, age);
		this.sid = sid;
		
}
public class ch07_example {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Person arr[] = new Person2[5];
        arr[0] = new Student2(1, "Kim", 20, 1001, "Computer Science", 3);
        arr[1] = new Student2(2, "Lee", 21, 1002, "Mathematics", 2);
        arr[2] = new Employee(3, "Park", 30, 2001, "HR", 3000);
        arr[3] = new Employee(4, "Choi", 35, 2002, "Engineering", 4000);
        arr[4] = new Student2(5, "Kang", 22, 1003, "Physics", 4);
		for(Person p : arr) {
			System.out.println(p.toString());
		}

	}

}

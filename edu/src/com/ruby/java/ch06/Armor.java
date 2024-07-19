package com.ruby.java.ch06;

class Student{
	
	private String sname;
	private int age;
}


public class Armor {
	
	private String name;
	private int height;
	
	public String getName(){ //게터
		return name;
	}
	
	public void setName(String value) { //세터
		name = value;
	}

	public int getHeight() {
		return height;
	}	
	
	public void setHeight(int value) {
		height = value;
	}
	
	public static void main(String[] args) {
		
		Armor a[] = new Armor[10]; // 배열생성자
		int []arr = new int [10];
		for ( int i = 0; i < a.length; i++) {
			a[i] = new Armor();
		}
		int n = 10;
		Armor c = new Armor(); // 생성자
	
//		a.name ="Kim"; // 접근불가능
//		a.getName();
//		a.setName("Kim");
//		
//		System.out.println(a.getName());
		
		Student s = new Student();
//		s.sname = "hong";
	

	}

}

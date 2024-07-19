package com.ruby.java.ch07.abstraction;
/*
 * 7장 실습 코드로 구현한다 
 */

interface Shape {
	public double perimeter(); //둘레길이
	public float area();
}

class Triangle implements Shape {
	private int x1,y1,x2,y2,x3,y3;
	public Triangle(int x1, int x2, int x3, int y1, int y2, int y3){
		this.x1=x1;
		this.x2=x2;
		this.x3=x3;
		this.y1=y1;
		this.y2=y2;
		this.y3=y3;
		
	}
	@Override
	public double perimeter() { //구글링으로 계산식 찾아서 구현
		double sum = x1 + x2 + x3;
		return sum;}
	@Override
	public float area() {
		
		
		System.out.println();
	}
}
class Rectangle implements Shape {
	
	int x1,y1,x2,y2;
	
	public Rectangle(int x1, int x2, int y1, int y2) {
		this.x1=x1;
		this.x2=x2;
		this.y1=y1;
		this.y2=y2;
		
	}
	
	public double perimeter() {
		
		double sum = 0;
		return sum;
		
	}
	public float area() {
		
	}
}
class Square extends Rectangle implements Shape {
	int x1, y1;
	int side;
	
	public Square() {
		
		this.x1=x1;
		this.y1=y1;
		this.side=side;
		
	}
	
	public double perimeter() {
		
		double sum = x;
		return sum;
		
	}
	public float area() {
		
	}
}
public class ch07_test_인터페이스작성연습 {
	Shape t = new Triangle(1,2,3,4,5,6);
	shape r = new Rectangle(1,2,3,4);
	shape s = new Square(1,2,3);
	System.out.println("삼각형 둘레 길이 = " + t.perimeter());
	System.out.println("삼각형 면적 = " + t.area());
	System.out.println("사각형 둘레 길이 = " + r.perimeter());
	System.out.println("사각형 면적 = " + r.area());
}


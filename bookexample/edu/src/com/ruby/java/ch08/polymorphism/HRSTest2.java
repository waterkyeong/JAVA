package com.ruby.java.ch08.polymorphism;

public class HRSTest2 {

	public static void calcTax(Employee e) {
		if (e instanceof Salesman) {
			System.out.println("Salesman �Դϴ�.");
		} else if (e instanceof Manager) {
			System.out.println("Manager �Դϴ�.");
		} else if (e instanceof Consultant) {
			System.out.println("Consultant �Դϴ�.");
		} else {
			System.out.println("Employee �Դϴ�.");
		}
	}

	public static void main(String[] args) {
		Salesman s = new Salesman();
		Manager m = new Manager();
		Consultant c = new Consultant();

		calcTax(s);
		calcTax(m);
		calcTax(c);
	}
}

package com.ruby.java.ch08.polymorophism;
abstract class Employee {
	String name;
	int salary;

	public abstract void calcSalary();
	

	public abstract void calcBonus();
}

class Salesman extends Employee {
	int annual_sales;
	public void calcSalary() {
		System.out.println("Salesman 급여 = 기본급 + 판매수당");
	}

	public void calcBonus() {
		System.out.println("Salesman 보너스 = 기본급 * 12 * 4");
	}
}

class Consultant extends Employee {
	int num_project;
	public void calcSalary() {
		System.out.println("Consultant 급여  = 기본급 + 컨설팅 특별 수당 ");
	}

	public void calcBonus() {
		System.out.println("Consultant 보너스 = 기본급 * 12 * 2");
	}
}

class Manager extends Employee {  //abstract 삭제
	int num_team;
	public void calcSalary() {
		System.out.println("Manager 급여 = 기본급 + 팀 성과 수당");
	}
	public void calcBonus() {
		System.out.println("Manager 보너스 = 기본급*12*6");
	}

}

class Director extends Manager {
	public void calcBonus() {
		System.out.println("Director 보너스 = 기본급 * 12 * 6");
	}
}

public class HRSTest {
	
	public static void calcTax(Employee e) {
		if(e instanceof Salesman) {
			System.out.println("Salesman 입니다.");
		}else if(e instanceof Manager) {
			System.out.println("Manager 입니다.");
		}else if(e instanceof Consultant) {
			System.out.println("Consultant 입니다.");
		}else {
			System.out.println("Employee 입니다.");
		}
//		System.out.println("소득세를 계산합니다.");
	}
	
	public static void main(String[] args) {
		
		Salesman s = new Salesman();
		Manager m = new Manager();
		Consultant c = new Consultant();
		
		calcTax(s);
		calcTax(m);
		calcTax(c);
		
//		Salesman s1 = new Salesman();
//		Employee s2 = new Salesman();
//		Object s3 = new Salesman();
//		
//		Object m1 = new Manager();
//		Employee m2 = new Manager();
//		Manager m3 = new Manager();
//		
//		Object arr[] = new Object[6];
//		arr[0] = s1;
//		arr[1] = s2;
//		arr[2] = s3;
//		arr[3] = m1;
//		arr[4] = m2;
//		arr[5] = m3;
//		
//		for(int i = 0; i < arr.length; i++) {
//			System.out.println(arr[i]);
//		}
		
//		Salesman s = new Salesman();
//		Consultant c = new Consultant();
//		Director d = new Director();
//		
//		Salesman s1 = new Manager();
//		Employee s2 = new Manager();
//		Object s3 = new Manager();
//		
//		Object m1 = new Manager();
//		Employee m2 = new Manager();
//		Manager m3 = new Manager();
//		Director m4 = new Manager();
//		
//		
//		
//		
//		System.out.println(s.toString());
//		System.out.println(c.toString());
//		System.out.println(d.toString());
//		
		
//		Salesman s2 = s;
//		System.out.println(s2.toString());
//		
//		if(s.equals(s2)) {
//			System.out.println("동일한 객체입니다.");
//			}else {
//				System.out.println("서로 다른 객체입니다.");
//			}
		// Manager m = new Manager(); // 아직 추상 클래스이기때문에 객체를 못만들어서 에러가 뜸.
//		s.calcSalary();
//		c.calcSalary();
//		d.calcSalary();
//		
//		calcTax(s);
//		calcTax(c);
//		calcTax(d);
		
	}
}


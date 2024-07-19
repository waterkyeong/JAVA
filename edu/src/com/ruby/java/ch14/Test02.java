package com.ruby.java.ch14;
@FunctionalInterface

interface Multiply { //이 인터페이스는 functional interface가 아니라고 오류가 남.
	double getValue();
//	void setValue(); 이걸 정상화 시키면 위의 인터페이스에 오류가 뜸
}

public class Test02 {

	public static void main(String[] args) {

		Multiply m;
		m = () -> 3.14 * 2;
		System.out.println(m.getValue());

		m = () -> 10 * 3;
		System.out.println(m.getValue());
	}
}
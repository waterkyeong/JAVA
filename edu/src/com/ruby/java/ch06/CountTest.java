package com.ruby.java.ch06;

class Count {
	public static int totalCount;
	int count;
	public Count() {
		totalCount++;
	}
}

public class CountTest {

	public static void main(String[] args) {
		System.out.println("실행시작");
		System.out.println(Count.totalCount);
		// System.out.println(num); // 위의 sysout과의 차이 는 static의 차이
		Count c1 = new Count();
	}

}

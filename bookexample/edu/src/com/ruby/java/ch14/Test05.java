package com.ruby.java.ch14;

interface NumberFunc {
	int func(int n);
}

public class Test05 {

	public static void main(String[] args) {
		NumberFunc sum = (n) -> {
			int result = 0;
			for (int i = 0; i <= n; i++) {
				result += i;
			}
			return result;
		};

		System.out.println("1부터 10까지의 합 : " + sum.func(10));
		System.out.println("1부터 100까지의 합 : " + sum.func(100));
	}

}
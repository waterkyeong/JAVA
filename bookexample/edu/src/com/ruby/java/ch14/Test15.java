package com.ruby.java.ch14;

import java.util.function.Predicate;

public class Test15 {
	public static void main(String[] args) {
		Predicate<Integer> func = (n) -> n % 2 == 0;
		if (func.test(123))
			System.out.println("¦���Դϴ�.");
		else
			System.out.println("Ȧ���Դϴ�.");
	}
}
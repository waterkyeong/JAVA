package com.ruby.java.ch14;

import java.util.function.Function;

public class Test14 {
	public static void main(String[] args) {
		Function<String, Integer> func = (s) -> {
			int cnt = 0;
			String[] word = s.split(" ");
			cnt = word.length;
			return cnt;
		};

		int wordCnt = func.apply("���� ��� ������ ���� ��� �߸� ���� ��������");
		System.out.println("�ܾ� �� : " + wordCnt);
	}
}
package com.ruby.java.ch10;

import java.util.TreeSet;

public class Test12 {

	public static void main(String[] args) {
		TreeSet<Integer> score = new TreeSet<Integer>();

		score.add(90);
		score.add(100);
		score.add(85);
		score.add(65);
		score.add(50);
		score.add(75);

		System.out.println(score);

		Integer value = null;

		value = score.first();
		print("���� ���� ����", value);
		value = score.last();
		print("���� ���� ����", value);
		value = score.lower(85);
		print("85 �ٷ� ���� ����", value);
		value = score.higher(85);
		print("85 �ٷ� ���� ����", value);
		value = score.floor(85);
		print("85 �Ǵ� �ٷ� ���� ����", value);
		value = score.ceiling(85);
		print("85 �Ǵ� �ٷ� ���� ����", value);

		while (!score.isEmpty()) {
			value = score.pollLast();
			print("���� ���� ���� ����", value);
		}
	}

	public static void print(String s, Integer value) {
		System.out.println(s + " : " + value);
	}
}
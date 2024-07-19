package com.ruby.java.ch15;

import java.util.stream.IntStream;
import java.util.stream.Stream;

public class Test03 {

	public static void main(String[] args) {
		int[] score = { 50, 10, 80, 70, 90, 60, 20 };

		System.out.print("���� ��� : ");
		IntStream.of(score).forEach((n) -> System.out.print(n + " "));
		System.out.println();

		int minVal = IntStream.of(score).min().getAsInt();
		System.out.println("���� ���� : " + minVal);

		int maxVal = IntStream.of(score).max().getAsInt();
		System.out.println("���� ���� : " + maxVal);

		System.out.print("���� ���� : ");
		IntStream stream = IntStream.of(score).sorted();
		stream.forEach((n) -> System.out.print(n + " "));
		System.out.println();

		System.out.print("���� ���� : ");
		IntStream failScore = IntStream.of(score).filter((n) -> n < 60);
		failScore.forEach((n) -> System.out.print(n + " "));
		System.out.println();

		int totalScore = IntStream.of(score).sum();
		System.out.println("���� �հ� : " + totalScore);

		System.out.print("5�� �߰� : ");
		IntStream addScore = IntStream.of(score).map((n) -> n + 5);
		addScore.forEach((n) -> System.out.print(n + " "));
		System.out.println();

		long cnt = IntStream.of(score).count();
		System.out.println("���� ���� : " + cnt);

		System.out.println("���� ��� : " + totalScore / cnt);
	}

}
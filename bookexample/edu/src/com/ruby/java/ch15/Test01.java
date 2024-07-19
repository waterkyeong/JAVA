package com.ruby.java.ch15;

import java.util.ArrayList;
import java.util.Optional;
import java.util.stream.Stream;

public class Test01 {

	public static void main(String[] args) {
		ArrayList<Integer> myList = new ArrayList<>();
		myList.add(50);
		myList.add(10);
		myList.add(80);
		myList.add(70);
		myList.add(90);
		myList.add(60);
		myList.add(20);

		System.out.print("���� ��� : ");
		Stream<Integer> myStream = myList.stream();
		myStream.forEach((n) -> System.out.print(n + " "));
		System.out.println();

		Optional<Integer> minVal = myList.stream().min(Integer::compare);
		System.out.println("���� ���� : " + minVal.get());

		Optional<Integer> maxVal = myList.stream().max(Integer::compare);
		System.out.println("�ְ� ���� : " + maxVal.get());

		System.out.print("���� ���� : ");
		Stream<Integer> myStream2 = myList.stream().sorted();
		myStream2.forEach((n) -> System.out.print(n + " "));
		System.out.println();

		System.out.print("���� ���� : ");
		Stream<Integer> failScore = myList.stream().filter((n) -> n < 60);
		failScore.forEach((n) -> System.out.print(n + " "));
		System.out.println();

		System.out.print("���� �հ� : ");
		Optional<Integer> totalScore = myList.stream().reduce((a, b) -> a + b);
		System.out.println(totalScore.get());

		System.out.print("5�� �߰� : ");
		Stream<Integer> addScore = myList.stream().map((n) -> n + 5);
		addScore.forEach((n) -> System.out.print(n + " "));
		System.out.println();

		long cnt = myList.stream().count();
		System.out.println("���� ���� : " + cnt);

		System.out.println("���� ��� : " + totalScore.get() / cnt);
	}
}
package com.ruby.java.ch15;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.stream.Stream;

public class Test09 {

	public static void main(String[] args) {
		ArrayList<String> names = new ArrayList<>();
		names.add("��Ǫ��");
		names.add("���ϴ�");
		names.add("������");

		Stream<String> myStream = names.stream();

		Iterator<String> it = myStream.iterator();
		while (it.hasNext())
			System.out.println(it.next());
	}
}
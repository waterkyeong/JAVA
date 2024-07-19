package com.ruby.java.ch15;

import java.util.ArrayList;
import java.util.stream.Stream;

public class Test05 {

	public static void main(String[] args) {
		ArrayList<Member> members = new ArrayList<>();
		members.add(new Member("��Ǫ��", 25, "010-123-4562", "����"));
		members.add(new Member("���ϴ�", 30, "010-803-6356", "�λ�"));
		members.add(new Member("������", 29, "010-264-4872", "����"));

		System.out.println("<<ȸ�� ����>>");
		Stream<Member> stream = members.stream();
		stream.forEach(System.out::println);

		System.out.println("<<����ó>>");
		Stream<Contact> contactList = members.stream().map((m) -> new Contact(m.getName(), m.getPhoneNum()));
		contactList.forEach(System.out::println);

		System.out.println("<<����ó �˻�>>");
		Stream<Contact> searchList = members.stream().filter((m) -> m.getName().equals("���ϴ�"))
				.map((m) -> new Contact(m.getName(), m.getPhoneNum()));
		searchList.forEach(System.out::println);
	}
}
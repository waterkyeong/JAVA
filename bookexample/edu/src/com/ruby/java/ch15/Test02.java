package com.ruby.java.ch15;

import java.util.ArrayList;
import java.util.Optional;

public class Test02 {

	public static void main(String[] args) {

		ArrayList<Member> members = new ArrayList<>();
		members.add(new Member("��Ǫ��", 25, "010-123-4562", "����"));
		members.add(new Member("���ϴ�", 30, "010-803-6356", "�λ�"));
		members.add(new Member("������", 29, "010-264-4872", "����"));

		Optional<Member> mem1 = members.stream().filter((m) -> m.getAge() > 20).findFirst();

		if (mem1.isPresent())
			System.out.println(mem1.get());

		members.stream().filter((m) -> m.getAge() > 20).findFirst().ifPresent(System.out::println);

		Member mem2 = members.stream().filter((m) -> m.getAge() > 30).findFirst().orElseGet(Member::new);

		System.out.println(mem2);
	}
}
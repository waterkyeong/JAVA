package com.ruby.java.ch09;

public class Test09 {
	public static void main(String[] args) {
		StringBuilder sb = new StringBuilder("���� ���Ƽ� ");

		System.out.println(sb);
		System.out.println(sb.append("���� �����ؼ�"));
		System.out.println(sb.insert(8, "���� ���� �ʾƼ� "));
		System.out.println(sb.append(" ��� ���� ���Ҵ� "));

		int start = sb.indexOf("��� ���� ���Ҵ� ");
		int end = sb.length();
		System.out.println(sb.replace(start, end, "�ʿ� �Բ� �� �ð� ��� ���μ̴�"));
	}
}
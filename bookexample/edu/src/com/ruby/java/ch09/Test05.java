package com.ruby.java.ch09;

public class Test05 {
	public static void main(String[] args) {
		String address[] = { "��⵵ ������ ������", "����� �������� ��굿", "�泲 õ�Ƚ� ���ϱ�", "����� ��õ�� ��", "����� ���ı� ���̵�", "���� �ξȱ� �ξ���" };

		System.out.println("1");
		for (int i = 0; i < address.length; i++) {
			if (address[i].indexOf("�����") != -1) {
				System.out.println(address[i]);
			}
		}
		System.out.println("2");
		for (int i = 0; i < address.length; i++) {
			if (address[i].lastIndexOf("������") != -1) {
				System.out.println(address[i]);
			}
		}
		System.out.println("3");
		for (int i = 0; i < address.length; i++) {
			if (address[i].startsWith("�����")) {
				System.out.println(address[i]);
			}
		}
		System.out.println("4");
		for (int i = 0; i < address.length; i++) {
			if (address[i].endsWith("������")) {
				System.out.println(address[i]);
			}
		}
	}
}
package com.ruby.java.ch08;

enum Mandarin {
	�ݱ�(600), �Ѷ��(500), ������(300), õ����(400), Ȳ����(800);

	private int price;

	Mandarin(int p) {
		price = p;
	}

	int getPrice() {
		return price;
	}
}

public class EnumTest02 {
	public static void main(String[] args) {

		Mandarin ma = Mandarin.�Ѷ��;
		if (ma == Mandarin.�Ѷ��)
			System.out.println("ma�� �Ѷ���Դϴ�.");
		System.out.println(ma + " ���� : " + ma.getPrice());

		Mandarin list[] = Mandarin.values();
		System.out.println("== ���� ���� ==");
		for (Mandarin m : list)
			System.out.println(m + ":" + m.getPrice());
	}
}
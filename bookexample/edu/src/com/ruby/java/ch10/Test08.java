package com.ruby.java.ch10;

import java.util.Hashtable;

public class Test08 {

	public static void main(String[] args) {
		Hashtable<String, String> dic = new Hashtable<String, String>();

		dic.put("��������", "��� ���� ��ſ��� ��");
		dic.put("�а���", "���� �μ��������� ����� ����");
		dic.put("�����߷�", "���и� ���ǻ�� �����");
		dic.put("���л���", "����ġ�� ���鼭 ���� ������");

		System.out.println(dic);
		System.out.println(dic.keySet());
		System.out.println(dic.values());

		System.out.println(dic.get("��������"));
		System.out.println(dic.get("���ʱ���"));

		System.out.println(dic.containsKey("�а���"));
		System.out.println(dic.containsValue("��� ���� ��ſ��� ��"));

		dic.remove("��������");
		System.out.println(dic.containsKey("��������")); // false

		dic.clear();
		System.out.println(dic.isEmpty()); // true
		System.out.println(dic.size()); // 0
	}
}
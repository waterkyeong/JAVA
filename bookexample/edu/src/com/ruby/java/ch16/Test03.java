package com.ruby.java.ch16;

public class Test03 {
	public static void main(String[] args) {
		Work1 w1 = new Work1();
		Work2 w2 = new Work2();
		w1.start();
		w2.start();
	}
}

class Work1 extends Thread {
	Work1() {
		setName("���� ����");
	}

	public void run() {
		for (int i = 1; i <= 10; i++) {
			System.out.println(this.getName() + " �۾� ��... ");
		}
	}
}

class Work2 extends Thread {
	Work2() {
		setName("���� ����");
	}

	public void run() {
		for (int i = 1; i <= 10; i++) {
			System.out.println(this.getName() + " �۾� ��... ");
		}
	}
}
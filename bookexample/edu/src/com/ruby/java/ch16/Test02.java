package com.ruby.java.ch16;

public class Test02 {
	public static void main(String[] args) {
		Thread t1 = new Thread(new Movie());
		Thread t2 = new Thread(() -> {
			for (int i = 1; i <= 1000; i++) {
				System.out.println("��ȭ �ޱ� : " + i);
			}
		});

		t1.start();
		t2.start();
		for (int i = 1; i <= 1000; i++) {
			System.out.println("TV ���� : " + i);
		}
	}
}

class Movie implements Runnable {
	@Override
	public void run() {
		for (int i = 1; i <= 1000; i++) {
			System.out.println("���� �Ա� : " + i);
		}
	}
}
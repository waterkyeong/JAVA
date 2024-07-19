package com.ruby.java.ch07.abstraction;

public class MessengerTest {
	public static void main(String[]arg) {
		
		IPhoneMessenger iphone = new IPhoneMessenger();
		iPhone.getMessage(); //같은 인터페이스 사용
		GalaxyMessenger galaxy = new GalaxyMessenger();
		galaxy.getMessange(); //같은 인터페이스 사용
	}

}

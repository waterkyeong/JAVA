package com.ruby.java.ch07.abstraction;

public class IPhoneMessenger implements Messenger {
	public String getMessenger() {
		return "iphone";
	}
	public void setMessage(String msg) {
		System.out.println("message = " + msg);
	}
}

class IPhone15 extends IPhoneMessenger{
	
}
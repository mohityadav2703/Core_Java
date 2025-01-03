package com.app.stream;

public class PhoneMessage implements Message{
	
	public void textMessage(String message) {
		System.out.println("Phone Message ::"+message);
	}
}

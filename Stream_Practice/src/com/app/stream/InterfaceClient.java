package com.app.stream;

public class InterfaceClient {

	public static void main(String[] args) {
		Message msg=new PhoneMessage();
		msg.textMessage("Hello this is java stream example");
	}
}

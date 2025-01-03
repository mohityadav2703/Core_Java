package com.app.stream;

public class Java8InterfaceClient {
	public static void main(String[] args) {
		
		Message phoneMessage=(String message)-> System.out.println(message);
		phoneMessage.textMessage("Hello this is phone message");
		
		Message emailMessage=(String message) ->System.out.println(message);
		emailMessage.textMessage("Hello this is email message");
	}

}

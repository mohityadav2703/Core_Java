package com.app.singlton;

public class Singlton {
	static Singlton s1=new Singlton();
	
	private Singlton(){
		
	}
	
	static Singlton getInstance() {
		return s1;
	}
}

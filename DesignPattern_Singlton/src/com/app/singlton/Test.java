package com.app.singlton;

public class Test {

	public static void main(String[] args) {
		Singlton s1=Singlton.getInstance();
		System.out.println(s1.hashCode());
		
		Singlton s2=Singlton.getInstance();
		System.out.println(s2.hashCode());
		
		Singlton s3=Singlton.getInstance();
		System.out.println(s3.hashCode());
		
//		Singlton s1=new Singlton();
//		System.out.println(s1.hashCode());
//		
//		Singlton s2=new Singlton();
//		System.out.println(s2.hashCode());
//		
//		Singlton s3=new Singlton();
//		System.out.println(s3.hashCode());
	}
}

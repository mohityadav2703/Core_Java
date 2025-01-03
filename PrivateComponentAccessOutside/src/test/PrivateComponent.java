package test;

public class PrivateComponent {
	
	private int a=10;
	private int b=20;
	
	private void m1() {
		System.out.println("--------Private Method---------");
	}
	
	public void privateAccess() {
		int a1=this.a;
		int b1=this.b;
		this.m1();
		System.out.println("This is private variable 'a' is :"+a1);
		System.out.println("This is private variable 'b' is :"+b1);
	}
}

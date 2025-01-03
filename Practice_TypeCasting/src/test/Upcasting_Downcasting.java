package test;

class Parent{
	void show() {
		System.out.println("This is Parent class Method");
	}
}

class Child extends Parent{
	void show() {
		System.out.println("This is Child Class Method");
	}
}

public class Upcasting_Downcasting {
	public static void main(String[] args) {
		Parent p = new Parent();
		p.show();
		
		p=(Parent) new Child(); // upcasting
		p.show();
		
		Child c = (Child) p; //downcasting
		c.show();
	}

}

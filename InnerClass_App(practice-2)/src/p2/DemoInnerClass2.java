package p2;
import p1.*;
public class DemoInnerClass2 {

	public static void main(String[] args) {
		ClassA ob = new ClassA();
		ob.m1();
		ClassA.SubClass2 ob1 = new ClassA.SubClass2();
		ob1.m4();
		ClassA.SubClass2.m5();
		ClassA.SubClass1 ob2 = ob.new SubClass1();  // instance inner class object creation
		ob2.m2();
		ClassA.SubClass1.m3();
	

	}

}

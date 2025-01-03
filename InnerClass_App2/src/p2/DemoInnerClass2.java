package p2;
import p1.*;

public class DemoInnerClass2 {

	public static void main(String[] args)
	{
		SubClass1 ob1 = new SubClass1();
		ob1.m1();
		
		SubClass1.SubClass2 ob2 = ob1.new SubClass2();// instance member innerclass object
		ob2.m2(); // innerClass instance method_call
		SubClass1.SubClass2.m22();// innerClass static method_call
	}

}

package p2;
import p1.*;

public class DemoInnerClass3 
{

	public static void main(String[] args) 
	{
		SubClass1 ob1 = new SubClass1(); //outerclass object
		ob1.m1(123);
		SubClass1.m11(124);
	}

}

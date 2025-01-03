package p2;
import p1.*;
public class DemoInterface4 {

	public static void main(String[] args) 
	{
		IClass ob = new IClass();
		ob.m1(11);
		ITest.access1(16);
		ob.access2(12,13);
	}

}

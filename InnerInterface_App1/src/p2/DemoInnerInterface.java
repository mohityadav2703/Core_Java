package p2;
import p1.*;

public class DemoInnerInterface {

	public static void main(String[] args)
	{
		System.out.println("-------InnerInterface in Interface--------");
		ITest.Itest2 ob1 = (int c)->
		{
			System.out.println("*****m2(c)*****");
			System.out.println("The value of c :"+c);
		};
		ob1.m2(11);
		
		System.out.println("------InnerInterface in Class------");
		SubClass.ITest1 ob2 =(int a)->
		{
			System.out.println("*****m1(a)*****");
			System.out.println("The Value of a :"+a);
		};
		ob2.m1(12);
		SubClass.ITest11 ob22 = (int b)->
		{
			System.out.println("*****m11(b)*****");
			System.out.println("The value of b :"+b);
		};
		ob22.m11(13);
		
		System.out.println("------InnerInterface in AbstractClass------");
		AClass.ITest3 ob3 =(int d)->
		{
			System.out.println("*****m3(d)*****");
			System.out.println("The value of d :"+d);
		};
		ob3.m3(14);
		AClass.ITest33 ob33=(int e)->
		{
			System.out.println("*****m22(e)*****");
			System.out.println("The value of e :"+e);
		};
		ob33.m33(15);
		
	}

}

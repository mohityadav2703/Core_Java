package p2;
import p1.*;

public class DemoAnonymous1 {

	public static void main(String[] args)
	{
		PClass ob = new PClass()   //CClass as Anonymous InnerClass	
		{
			public void dis1(int a)  //override
			{
				System.out.println("****CClass dis1(a)****");
				System.out.println("The value of a :"+a);
			}
			@SuppressWarnings("unused")
			public void dis3(int c)
			{
				System.out.println("*****CClass dis3(int c)*****");
				System.out.println("The value of c :"+c);
			}
		};
		ob.dis1(11);
		ob.dis2(12);
	//	ob.dis3(14);  Error
		PClass.dis5(20);
		
	}

}

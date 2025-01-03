package p1;
public class ClassA {
	public void m1(int x,double y)
	{
		System.out.println("========ClassA Instance Method m1(x,y)========");
		System.out.println("The value x :"+x);
		System.out.println("The Value y :"+y);
		
		class SubClass1
		{
			public void m11(int p)
			{
				System.out.println("****SubClass1 m11(p)****");
				System.out.println("The value of p :"+p);
			}
			public static void m111(int q)
			{
				System.out.println("****SubClass1(q)****");
				System.out.println("The value of q :"+q);
			}
		}
		SubClass1 ob=new SubClass1();
		ob.m11(10);
		SubClass1.m111(11);
		
	}
	public static void m2(int a,int b)
	{
		System.out.println("========ClassA Static Method m2(a,b)========");
		System.out.println("The value a :"+a);
		System.out.println("The Value b :"+b);
		
		class SubClass2
		{
			public void m22(int m)
			{
				System.out.println("****SubClass2 m22(m)****");
				System.out.println("The Value of m :"+m);
			}
			public static void m222(int k)
			{
				System.out.println("****SubClass2 static m222(k)****");
				System.out.println("The value of k :"+k);
			}
		}
		SubClass2 ob1=new SubClass2();
		ob1.m22(13);
		SubClass2.m222(14);
	}
}

package p1;

public class P_class
{
	private int a=10;
	
	public P_class(int x)
	{
		System.out.println("****P_class Parameterized constructor****");
		System.out.println("The Value Of x :"+x);
	}
	
	//To Access private Variable outside the class
	public void m1() {
	  int b=this.a;
	  System.out.println("Value of private varible a which is accessed outside is :"+b);
	}
}

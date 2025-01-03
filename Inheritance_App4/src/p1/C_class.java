package p1;

public class C_class extends P_class
{
	public static int z;
	
	//C_class static block
	static
	{
		System.out.println("****C_class Static block****");
		System.out.println("The value of z:"+z);
		System.out.println("The vAlue Of k:"+k);
	}
	//C_class instance block
	{
		System.out.println("****C_class instance block****");
		System.out.println("The Value Of z :"+z);
		System.out.println("The Value Of k :"+k);
	}
}

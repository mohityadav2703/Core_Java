package p1;

public class C_class extends P_class
{
	public static int z;
	
	// Static block
	static
	{
		System.out.println("****C_class Static block****");
		System.out.println("The value of z :"+z);
		System.out.println("The value of k :"+k);
	}
	//instance block
	{
		System.out.println("*****C_class static block*****");
		System.out.println("The value of z :"+z);
		System.out.println("The value of k :"+k);
	}
}

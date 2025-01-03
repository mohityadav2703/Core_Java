package p1;

public class C_class extends P_class
{
	public static int z;
	// C_class static block
	{
		System.out.println("*****C_class static block*****");
		System.out.println("The Value of z :"+z);
		System.out.println("The value of k :"+k);
	}
	//instance block
	{
		System.out.println("****C_class instance block****");
		System.out.println("The value of z :"+z);
		System.out.println("The value of k :"+k);
	}
}

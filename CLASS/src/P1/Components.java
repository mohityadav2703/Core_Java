package P1;

public class Components 
{
// VARIABLES	
	public int a=10;
	public int pc;
	public static float b=7.3f;
	public static int sb;
// INSTANCE_METHOD	
	public void method1(int m1,int m2)
	{
		System.out.println("*****ACCESS_INSTANCE_METHODS******");
		System.out.println("The Value Of M1 :"+m1);
		System.out.println("The Value Of M2 :"+m2);
	}
// STATIC_METHOD	
	public static void method2(int sm1,int sm2)
	{
		System.out.println("*****ACCESS_STATIC_METHODS********");
		System.out.println("The Value Of sm1 :"+sm1);
		System.out.println("The Value Of sm2 :"+sm2);
	}
//CONSTRUCTOR WITHOUT PARAMETER
	public Components()
	{
		System.out.println("******ACCESS_INSTANCE_CONSTRUCTOR_WITHOUT PARAMETER*******");
		System.out.println("The Value Of a :"+a);
		System.out.println("The Value Of b :"+b);
	}
//CONSTRUCTOR WITH PARAMETER
	public Components(int pc)
	{
		this.pc=pc;
		System.out.println("*****ACCESS_INSTANCE_CONSTRUCTOR_WITH_PARAMETER******");
		System.out.println("The value of pc :"+pc);
	}
// STATIC BLOCK
	static
	{
		System.out.println("******ACCESS_STATIC_BLOCK******");
		System.out.println("The value of sb :"+sb);
		System.out.println("The value of b :"+b);
	}
}

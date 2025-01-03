package maccess;
public class Demostring11 {
	public static void main(String[] args) {
		String s1="hyd";
		String s2="hyd";
		String s3=new String("nit");
		String s4=new String("nit");
		
		System.out.println("===========String Literal===========");
		if(s1==s2)
		{
			System.out.println("Strings Are Equal..");
		}
		else
		{
			System.out.println("String Are Not Equals...");
		}
		System.out.println("===========New Operator Process==========");
		if(s3==s4)
		{
			System.out.println("Strings Are Equals...");
		}
		else
		{
			System.out.println("Strings Are Not Equals...");
		}
		
	}

}

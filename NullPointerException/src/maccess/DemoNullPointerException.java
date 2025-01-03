package maccess;

public class DemoNullPointerException 
{
	public static String name;
	public static void main(String[] args) 
	{
		String branch="CSE";
		
		int l1=name.length(); //NullPointerException
		int l2=branch.length();
		
		System.out.println("The Value Of Name :"+name);
		System.out.println("Length of name: "+l1);
		System.out.println("The Value of branch "+branch);
		System.out.println("Length of l2 :"+l2);
	}

}

package maccess;
import java.util.*;
public class DemoString19 {
	public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	try(sc;)
	{
		System.out.println("Enter The String :");
		String str = sc.nextLine();
		System.out.println("Enter The delimeter :");
		String d1 = sc.nextLine();
		StringTokenizer ob = new StringTokenizer(str,d1);
		System.out.println("Count Of Tokens :"+ob.countTokens());
		System.out.println("*****Displaying Tokens*****");
		while(ob.hasMoreTokens())
		{
			String tk = ob.nextToken();
			System.out.println("Tokens Are :"+tk.toString());
		}
		System.out.println("*****After Displaying*****");
		System.out.println("Count Of Tokens :"+ob.countTokens());
	}
 }
}

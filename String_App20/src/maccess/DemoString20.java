//Wap to read String and display the reverse of word in the given String
package maccess;
import java.util.*;
public class DemoString20 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		try(sc;)
		{
			System.out.println("Enter The String :");
			String str = sc.nextLine();
			System.out.println("Enter The delimeter:");
			String d1 = sc.nextLine();
			StringTokenizer ob = new StringTokenizer(str,d1);
			System.out.println("*********RESULT*********");
			while(ob.hasMoreTokens())
			{
				String tk = ob.nextToken();
				StringBuffer sb = new StringBuffer(tk);
				sb.reverse();
				System.out.print(sb.toString()+" ");
			}	
		}
	}
}
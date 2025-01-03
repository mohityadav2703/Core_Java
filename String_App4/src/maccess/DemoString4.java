//count number in string

package maccess;
import java.util.*;;
public class DemoString4 {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		try(s;)
		{
			System.out.println("Enter Any Strings:");
			String str=s.nextLine();
			int len=str.length();
			int count=0;
			
			for(int i=0;i<=len-1;i++)
			{
				char ch=str.charAt(i);
				int k=(int)ch;
				if(k>=48 && k<=57)
				{
					System.out.print(ch+" ");
					count++;
				}
			}
			System.out.println("\ncount of number :"+count);
			
		}

	}

}

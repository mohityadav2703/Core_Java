package maccess;
import java.util.*;
public class DemoString18 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		try(sc;)
		{
			System.out.println("Enter The String :");
			String str=sc.nextLine();
			int len=str.length();
			StringBuffer sb1=new StringBuffer();
			StringBuffer sb2=new StringBuffer();
			StringBuffer sb3=new StringBuffer();
			StringBuffer sb4=new StringBuffer();
			
			for(int i=0;i<=len-1;i++)
			{
				char ch = str.charAt(i);
				int k=(int)ch;
				if((k>=65 && k<=90) || (k>=97 && k<=122))
				{
					switch(ch)
					{
					case 'a':
					case 'A':
						sb1.append(ch+" ");
						break;
					case 'e':
					case 'E':
						sb1.append(ch+" ");
						break;
					case 'i':
					case 'I':
						sb1.append(ch+" ");
						break;
					case 'o':
					case 'O':
						sb1.append(ch+" ");
						break;
					case 'u':
					case 'U':
						sb1.append(ch+" ");
						break;
						default:
							sb2.append(ch+" ");
					}
				}
				else if(k>=48 && k<=57)
				{
					sb3.append(ch+" ");
				}
				else
				{
					sb4.append(ch+" ");
				}
			}
			System.out.println("List Of Vowels :"+sb1.toString());
			System.out.println("List Of Consonents :"+sb2.toString());
			System.out.println("List Of Numbers :"+sb3.toString());
			System.out.println("List Of Others :"+sb4.toString());
			
		}

	}

}

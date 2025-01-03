package maccess;
import java.util.Scanner;											

public class Practice_String {

	public static void main(String[] args) {
		@SuppressWarnings("resource")
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter The String");
		String str=sc.nextLine();
		int len=str.length();
		
		StringBuilder sb1=new StringBuilder();
		StringBuffer sb2=new StringBuffer();
		StringBuffer sb3=new StringBuffer();
		StringBuffer sb4=new StringBuffer();
		
		for(int i=0;i<=len-1;i++)
		{
			char ch=str.charAt(i);
			int k=(int) ch;
			
			// mohit@123_ 
			
			if((k>=65 && k<=90)|| (k>=97 && k<=122))
			{
				switch(k)
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
		System.out.println("List Of Vowels Are :"+sb1);
		System.out.println("List Of Vowels Are :"+sb2);
		System.out.println("List Of Vowels Are :"+sb3);
		System.out.println("List Of Vowels Are :"+sb4);
	}

}

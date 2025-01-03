package maccess;
import java.util.*;
public class DemoConsonant {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		try(s;)
		{
			System.out.println("Enter Any String Value");    							
			String str=s.nextLine();
			int len=str.length();
			int vc=0,ac=0,nc=0,sum=0;
			for(int i=0;i<len-1;i++)
			{
				char ch=str.charAt(i); //char by index
				switch(ch)
				{
				case 'a':
				case 'A':
					vc++;
					break;
				case 'e':
				case 'E':
					vc++;
					break;
				case 'i':
				case 'I':
					vc++;
					break;
				case 'o':
				case 'O':
					vc++;
					break;
				case 'u':
				case 'U':
					vc++;
					break;
				} //end of switch
				int k=(int)ch;
				if((k>=65 && k<=90) || (k>=97 && k<=122))
				{
					ac++;
				}
				if(k>=48 && k<=57)
				{
					nc++;
					String sr = String.valueOf(ch); // change char to String
					int num=Integer.parseInt(sr);  // string to number
					sum=sum+num;
				}
			}
			System.out.println("Count of alphabets :"+ac);
			System.out.println("Count of vowels :"+vc);
			System.out.println("Counts of consonents :"+(ac-vc));
			
			System.out.println("Count of Numbers :"+nc);
			System.out.println("Sum of Numbers :"+sum);
			System.out.println("Count of others :"+(len-(ac+nc)));
		}//end of try
		s.close();

	}

}

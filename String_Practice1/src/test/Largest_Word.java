//find the largest word of string

package test;
import java.util.Scanner;

public class Largest_Word {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter The String");
		String str=sc.nextLine();
		String [] words=str.split(" ");
		int large=0;
		String longe="";
		for(int i=0;i<words.length;i++)
		{
			if(large<words[i].length())
			{
				large=words[i].length();
				longe=words[i];
			}
			
		}
		System.out.println(longe);
	}

}

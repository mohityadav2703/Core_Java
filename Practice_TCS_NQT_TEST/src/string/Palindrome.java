package string;
import java.util.Scanner;

public class Palindrome {
	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter The String :");
		String str=sc.nextLine().toLowerCase();
		String revString="";
		//1st way
		StringBuffer sb = new StringBuffer(str);
		sb.reverse();
		String str1= new String(sb);
		if(str.equals(str1)) {
			System.out.println("Given String is Palindrome ");
		}
		else{
			System.out.println("Given String is not Palindrome");
		}	
		
		//2nd way
		for(int i=str.length()-1;i>=0;i--) {
			revString=revString+str.charAt(i);
		}
		if(str.equals(str1)) {
			System.out.println("Given String is Palindrome");
		}
		else {
			System.out.println("Given String is Not Palindrome");
		}
		
	}

}

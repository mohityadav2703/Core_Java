//reverse each words of string

package Test;
import java.util.Scanner;

public class ReverseString {
    public static void main(String[] args) {
    	Scanner sc=new Scanner(System.in);
    	System.out.println("Enter The String");
    	String str=sc.nextLine();
        String[] words=str.split(" ");
        String reverseString="";
        
        for(String w : words)
        {
        	String reverseWord="";
        	for(int i=w.length()-1;i>=0;i--)
        	{
        		reverseWord=reverseWord+w.charAt(i);
        	}
        	reverseString=reverseString+reverseWord+" ";
        }
        System.out.println(reverseString);
    }
}
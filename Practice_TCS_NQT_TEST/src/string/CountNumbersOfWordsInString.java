package string;
import java.util.Scanner;

public class CountNumbersOfWordsInString {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter The String :");
		String str =sc.nextLine();
		
		String[] str1=str.split(" ");
		System.out.println("Total Words in this Sentence Are : "+str1.length);
		sc.close();
	}

}

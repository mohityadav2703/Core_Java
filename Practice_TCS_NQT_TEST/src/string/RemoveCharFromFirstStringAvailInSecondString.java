package string;
import java.util.Scanner;

public class RemoveCharFromFirstStringAvailInSecondString {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter The First String :");
		String str1= sc.nextLine();
		System.out.println("Enter The Second String :");
		String str2= sc.nextLine();

		for(int i=0;i<str1.length();i++) {
			boolean unique=true;
			for(int j=0; j<str2.length();j++) {
				if(str1.charAt(i)==str2.charAt(j)) {
					unique=false;
				}
			}
			if(unique) {
				System.out.println(str1.charAt(i));
			}
		}	
		sc.close();
	}
}

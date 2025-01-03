package string;
import java.util.Scanner;
public class MixTwoString {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter The First String :");
		String str1 =sc.nextLine();
		System.out.println("Enter The Second String :");
		String str2 =sc.nextLine();	//output : MKouhmiatr
		
		char[] ch1=str1.toCharArray();
		char[] ch2=str2.toCharArray();
		char[] result=new char[ch1.length+ch2.length];
		int index=0;
		
		for(int i=0;i<ch1.length;i++) {
			result[index]=ch1[i];
			index++;
			result[index]=ch2[i];
			index++;	
		}
		System.out.print(result);
	sc.close();
	}
}

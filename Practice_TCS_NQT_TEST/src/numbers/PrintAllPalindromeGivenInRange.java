package numbers;
import java.util.Scanner;

public class PrintAllPalindromeGivenInRange {

	static boolean isPalindrome(int n) {
		int reverse =0;
		int temp=n;
		while(temp > 0) {
			reverse= reverse*10 + temp%10;
			temp=temp/10;
		}
		if (n==reverse) return true;
		return false;
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter From Integer :");
		int min =sc.nextInt();
		System.out.println("Enter To Integer :");
		int max =sc.nextInt();
		
		for(int i=min;i<=max;i++) {
			if(isPalindrome(i)) {
				System.out.print(i+" ");
			}
		}
		sc.close();
	}
}

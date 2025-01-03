package numbers;
import java.util.Scanner;

public class CheckPalindrome {
	
	static int reverse(int x) {
		int y=0;
	while (x>0) {
			//extract the last digit
			int digit = x%10;	// 1
			
			//appending last digit
			y = y * 10 + digit;	// 1
			
			//shrinking x by discarding the last digit
			x = x / 10;		// 12
		}
		return y;
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Any Integer Value :");
		int x=sc.nextInt();
		int dummy=x;
		int y=reverse(x);
		if(dummy == y) {

			System.out.println("This is Palindrome");
		}
		else {
			System.out.println("This is not a Palindrome");
		}
	
		sc.close();
	}

}

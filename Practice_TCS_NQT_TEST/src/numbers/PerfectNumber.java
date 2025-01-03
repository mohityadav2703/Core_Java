// Perfect Number means Number is equal to their divisior
// Ex :6 is divisible by (1,2,3) and the sum of (1,2,3) is equal to 6 so it is perfect Number

package numbers;
import java.util.Scanner;

public class PerfectNumber {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Any Integer Value :");
		int x = sc.nextInt();
		int sum=0;
		for(int i=1;i<6;i++) {
			if(x % i ==0) {
				sum=sum+i;
			}
		}
		if (sum==x) {
			System.out.println("Given Number is Perfect Number");
		}
		else {
			System.out.println("Given Number is Not Perfect Number");
		}
		sc.close();
	}

}

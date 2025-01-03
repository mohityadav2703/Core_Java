package numbers;
import java.util.Scanner;
public class PowerOfNumber {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n=5;
		System.out.println("Enter the power of given number");
		int pow=sc.nextInt();
		int ans=1;
		
		for(int i=0;i<pow;i++) {
			ans=ans*n;
		}
		System.out.println("Power of n into "+pow+" times is :" +ans);
	sc.close();
	}
}

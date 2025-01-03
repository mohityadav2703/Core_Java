package numbers;
import java.util.Scanner;

public class FibonacciSeries {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter any Number :");
		int n=sc.nextInt();
		int a=0;
		int b=1;
		System.out.print(a+" "+b);
		int sum=0;
		for(int i=1;i<=n;i++) {
			sum=a+b;
			System.out.print(" "+sum);
			a=b;
			b=sum;
		}
		sc.close();
	}

}

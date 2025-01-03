package numbers;
import java.util.Scanner;

public class PrimeNumber {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Any Integer Value ");
		int x =sc.nextInt();
		int temp=0;
		for(int i=2;i<=x-1;i++) {
			if(x % i ==0) {
				temp=temp+1;
			}
		}
		if(temp==0) {
			System.out.println("Given Number is Prime Number");
		}	
		else {
			System.out.println("Given Number is Not Prime Number");
		}
		sc.close();
	}

}

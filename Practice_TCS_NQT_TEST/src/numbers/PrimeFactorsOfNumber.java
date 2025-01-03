package numbers;
import java.util.Scanner;

public class PrimeFactorsOfNumber {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter The Number to Find Prime Factor");
		int n=sc.nextInt();
		
		for(int i=2;n>1;i++) {
			if(n%i==0) {
				while(n%i==0) {
					System.out.print(i+" ");
					n=n/i;
				}
			}
		}
		sc.close();
	}
}

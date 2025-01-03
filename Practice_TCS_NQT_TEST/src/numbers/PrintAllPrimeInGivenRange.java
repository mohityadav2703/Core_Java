package numbers;
import java.util.Scanner;

public class PrintAllPrimeInGivenRange {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Integer From ");
		int min = sc.nextInt();
		System.out.println("Enter Integer To ");
		int max = sc.nextInt();
		
		for(int i=min;i<=max;i++) {
			int temp=0;
			for(int j=2;j<=i-1;j++) {
				if(i%j ==0) {
					temp=temp+1;
				}
			}
			if(temp==0) {
				System.out.print(i+" ");
			}
		}
		sc.close();
	}

}

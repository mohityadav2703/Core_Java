// AP Formula : a+(n-1)d

package numbers;
import java.util.Scanner;

public class SumOfAP {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Start value of integer Series");
		int a=sc.nextInt();
		System.out.println("Enter Common Difference between two integer");
		int d = sc.nextInt();
		System.out.println("Enter The Total Number of Integer");
		int n=sc.nextInt();
		
		float sumOfAp= a+(n-1)*d;
		System.out.println(sumOfAp);
		
		sc.close();
	}

}

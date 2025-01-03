package numbers;
import java.util.Scanner;

public class SumOfFirstNNumber {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Any Integer Value ");
		int num = sc.nextInt();
		
		int sum = (num * (num+1))/2;
		System.out.println(sum);
		
		sc.close();
	}
}

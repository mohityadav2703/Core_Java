package numbers;
import java.util.Scanner;

public class CheckNumberIsPositiveOrNegative {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Any Integer Value ");
		int num = sc.nextInt();
		
		if(num >0) {
			System.out.println("Given Number is Positive Number");
		}
		else {
			System.out.println("Given Number is Negative Number");
		}
		sc.close();
	}
}

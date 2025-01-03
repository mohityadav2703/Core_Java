package numbers;
import java.util.Scanner;

public class EvenOrOdd {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Any Integer Value ");
		int num = sc.nextInt();
		
		if(num % 2 ==0) {
			System.out.println("Geven Number Is Even ");
		}
		else {
			System.out.println("Given Number Is Odd ");
		}
		sc.close();
	}
}

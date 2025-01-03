package numbers;
import java.util.Scanner;

public class GreatestNumberOFThreeValue {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter First Value ");
		int first = sc.nextInt();
		System.out.println("Enter Second Value ");
		int second = sc.nextInt();
		System.out.println("Enter Third Value ");
		int third = sc.nextInt();
		
		if(first > second && first >third) {
			System.out.println(first +" is Greater Than "+second+" and "+ third);
		}
		else if(second > first && second > third) {
			System.out.println(second+" is Greater Than "+first+" and "+third);
		}
		else {
			System.out.println(third+" is Greater Than "+first+" and "+second);
		}
		sc.close();
	}
}

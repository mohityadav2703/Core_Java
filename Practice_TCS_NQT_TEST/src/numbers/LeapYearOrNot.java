package numbers;

import java.util.Scanner;

public class LeapYearOrNot {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter year Between 2000 to 2999");
		int year = sc.nextInt();

		if (((year % 4 == 0) && (year % 100 != 0)) || year % 400 == 0) {
			System.out.println("This Year Is Leap Year");
		} else {
			System.out.println("This Year Is Not Leap Year");
		}
		sc.close();
	}

}

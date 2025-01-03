package numbers;
import java.util.*;

public class Armstrong {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Any Integer Value ");
		int x = sc.nextInt();
		
		int temp = x;
		int dummy =x;
		int count=0;
		int sum = 0;
		
		while (temp > 0) {
			count++;
			temp = temp / 10;
		}
		while (dummy > 0) {					
			int n = dummy % 10;				 
			sum += Math.pow(n, count);	
			dummy=dummy/10;					 
		}
		if(sum == x) {
			System.out.println("Given Number is Armstrong Number ");
		}
		else {
			System.out.println("Given Number is Not An Armstrong Number");
		}
		sc.close();
	}
}

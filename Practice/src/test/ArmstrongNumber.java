package test;
import java.util.Scanner;

public class ArmstrongNumber {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Integer Value ");
		int no=sc.nextInt();
		int t1=no;
		int len=0;
		while(t1!=0) {
			len=len+1;
			t1=t1/10;
		}
		int t2=no;
		int arm=0;
		int rem;
		while(t2!=0) {
			int mul=1;
			rem=t2%10;
			for(int i=1;i<len;i++) {
				mul=mul*rem;
			}
			arm=arm+mul;
			t2=t2/10;
		}
		if(arm==no) {
			System.out.println(no+" : Is Armstrong");
		}
		else {
			System.out.println(no+" : is not Armstrong");
		}
		sc.close();
	}
}

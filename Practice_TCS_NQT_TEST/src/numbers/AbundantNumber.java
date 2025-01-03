//Sum of the divisor of given number is greater than given  
//number is abundant number otherwise not.
//ex:Divisors of 18 are 1,2,3,6,9. 1+2+3+6+9=21, Since 21 is greater than 18, 
//		18 is an abundant number.

package numbers;

public class AbundantNumber {
	public static void main(String[] args) {
		int num=18;	// 1 2 3 6 9
		int temp=num;
		int sum=0;
		for(int i=1;i<temp;i++) {
			if(temp%i==0) {
				sum=sum+i;
			}
		}
		if(num<sum) {
			System.out.println(num+" : is an abundant number");
		}
		else {
			System.out.println(num+" : is not an abundant number");
		}
		
	}
}

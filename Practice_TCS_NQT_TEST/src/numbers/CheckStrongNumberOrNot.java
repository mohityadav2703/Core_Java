//sum of factorial of individual digits of a number is equal to the 
//original number the number is called a strong number

package numbers;

public class CheckStrongNumberOrNot {
	public static void main(String[] args) {
		int num=145;
		int temp=num;
		int result=1;
		
		while(temp > 0) {
			int digit=temp%10;	//3
			for(int i=1;i<=digit;i++) {
				result=result*digit*i;
			}
			temp=temp/10;
		}
		
	}
}

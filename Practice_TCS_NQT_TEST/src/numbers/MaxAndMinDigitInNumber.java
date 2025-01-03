package numbers;

public class MaxAndMinDigitInNumber {
	public static void main(String[] args) {
		int num = 23786;
		int temp=num;	//2378
		int min=0;	//6
		int max =0;	//6
	
		while(temp > 0) {
			int digit=temp%10;	//6 
			if(max>digit) {
				min=digit;
			}
			else {
				max=digit;
			}
			temp=temp/10;
		}
		System.out.println("Minimun Digit of this Number is :"+min);
		System.out.println("Maximum Digit of this Number is :"+max);
		
	}
}

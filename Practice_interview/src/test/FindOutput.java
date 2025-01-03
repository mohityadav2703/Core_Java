// find the output

package test;

public class FindOutput {
	public static void main(String[] args) {
		Integer num1=100;
		Integer num2=100;
		Integer num3=500; //range are -127 to 128
		Integer num4=500;
		
		if(num1==num2) {
			System.out.println("num1==num2");
		}
		else {
			System.out.println("num1!==num2");
		}
		if(num3==num4) {
			System.out.println("num3==num4");
		}
		else {
			System.out.println("num3!==num4");
		}
	}
}

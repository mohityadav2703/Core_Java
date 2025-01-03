package test;

import java.util.Arrays;

public class MultiplyTwoArray {

	public static void main(String[] args) {
		int[] a1= {1,2,3,4,5,6,7};
		int[] a2= {1,2,3,4,5,6,7};
		String result="";
		
		System.out.println("A1 Array :"+Arrays.toString(a1));
		System.out.println("A2 Array :"+Arrays.toString(a2));
		
		for(int i=0;i<a1.length;i++) {
			int num1=a1[i];
			int num2=a2[i];
			result=result+Integer.toString(num1*num2)+" ";
		}
		System.out.println("Result    :"+result);
	}
}

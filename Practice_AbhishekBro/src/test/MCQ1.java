package test;

import java.util.Arrays;

public class MCQ1 {
	public static void changeValue(int a) {
		a=100;
	}
	
	public static void changeArray(int[] arr) {
		arr[0]=0;
		arr[1]=0;
		arr[2]=0;
	}
	
	public static void main(String[] args) {
		int a=20;
		changeValue(a);
		System.out.println(a);
		int[] arr= {10,20,30};
		changeArray(arr);
		System.out.println(Arrays.toString(arr));
	}

}

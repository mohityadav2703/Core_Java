package test;

import java.util.ArrayList;

public class FindOddEven {

	public static void main(String[] args) {
		int[] a= {1,2,3,4,5,6,7,8,9,13,14,15,11};
		int even=0,odd=0;
		
		ArrayList<Integer> en=new ArrayList<Integer>();
		ArrayList<Integer> on=new ArrayList<Integer>();
		
		for(int i=0;i<a.length;i++) {
			if(a[i]%2==0) {
				en.add(a[i]);
				even++;
			}
			else {
				on.add(a[i]);
				odd++;
			}
		}
		System.out.println("Even Numbers Are :"+en.toString());
		System.out.println("Total Number of Even is :"+even);
		
		System.out.println("Odd Numbers Are :"+on.toString());
		System.out.println("Total Number of Odd is :"+odd);
	}
}

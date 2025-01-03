package test;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class SecondMaximumValue {

	public static void main(String[] args) {
		int []a= {10,45,67,3,2,45,6,45,67,67};
		Set<Integer> s=new HashSet<Integer>();
		
		System.out.println("Original Array elements :"+Arrays.toString(a));
		
		Arrays.sort(a);
		for(int no : a) {
			s.add(no);
		}
		System.out.println("Set Elements Are :"+s.toString());
		
		int n=s.size();
		Integer arr[] =new Integer[n];
		
		arr=s.toArray(arr);
		Arrays.sort(arr);
		System.out.println("New Arrays element after sort :"+Arrays.toString(arr));
		System.out.println("Second Largest Array :"+arr[arr.length-2]);
	     
	}
}

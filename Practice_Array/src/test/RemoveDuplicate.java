package test;

import java.util.HashSet;
import java.util.Set;

public class RemoveDuplicate {
	public static void main(String[] args) {
		int[] arr= {1,2,4,2,2,3,5,5,6,1,6,7,8,9,8,4};	//1,2,4,3,5,6,7,8,9
		
		Set<Integer> hs = new HashSet<>();
		for(int i=0;i<arr.length;i++) {
			hs.add(arr[i]);
		}
		System.out.print(hs);
		
	}

}

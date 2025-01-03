package test;

import java.util.HashSet;
import java.util.Set;

public class DuplicateElementFromTwoArray {

	public static void main(String[] args) {
		int[] a1= {4,3,7,9,2};
		int[] a2= {5,1,4,8,3};
		
		Set<Integer> hs=new HashSet<>();
		for(int i=0;i<a1.length;i++) {
			for(int j=0;j<a2.length;j++) {
				if(a1[i]==a2[j]) {
					hs.add(a1[i]);
					break;
				}
			}
		}
		System.out.print("Duplicate Elements Are :");
		for(int no : hs) {
			System.out.print(no+",");
		}
	}
}

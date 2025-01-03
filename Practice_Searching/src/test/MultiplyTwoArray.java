package test;

import java.util.ArrayList;

public class MultiplyTwoArray {
	public static void main(String[] args) {
		int []a= {1,2,3,4,5,6,7,8};
		int []b= {1,2,3,4,5,6,7,8};
		
		ArrayList<Integer> al=new ArrayList<Integer>();
		for(int i=0;i<a.length;i++) {
			al.add(a[i]* b[i]);
		}
		for(int no : al) {
			System.out.print(no+" ");
		}
	}
}

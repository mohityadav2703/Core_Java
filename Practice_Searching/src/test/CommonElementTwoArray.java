package test;

import java.util.HashSet;
import java.util.Set;

public class CommonElementTwoArray {

	public static void main(String[] args) {
		int []a= {1,4,5,3,6,7,8,9};
		int []b= {4,2,0,3};
		
		Set<Integer> s=new HashSet<Integer>();
		
		for(int no : a) {
			s.add(no);
		}
		for(int no : b) {
			boolean x=s.add(no);
			if(x==false) {
				System.out.print(no+" ");
			}
		}
	
	}
}

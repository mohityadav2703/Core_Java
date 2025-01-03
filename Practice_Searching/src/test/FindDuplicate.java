package test;

import java.util.HashSet;
import java.util.Set;

public class FindDuplicate {

	public static void main(String[] args) {
		int []a= {5,1,4,2,3,5,7,1,5,3,9,8};
				
		Set<Integer> s=new HashSet<Integer>();
		for(int i=0;i<a.length;i++) {
			for(int j=i+1;j<a.length;j++) {
				if(a[i]==a[j]&& i!=j) {
					s.add(a[i]);
				}
			}
		}
		System.out.println(s.toString());
	}
}

package test;

import java.util.HashSet;
import java.util.Set;

public class CommonElementThreeArray {

	public static void main(String[] args) {
		int []a1= {1,2,3,4,5,6,7};
		int []a2= {1,3,4,6,9,0};
		int []a3= {3,6,7,9,5};							
		
		Set<Integer> hs=new HashSet<Integer>();
		for(int i=0;i<a1.length;i++) {
			for(int j=0;j<a2.length;j++) {
				for(int k=0;k<a3.length;k++) {
					if(a1[i]==a2[j] && a1[i]==a3[k]) {
						hs.add(a1[i]);
					}
				}
			}
		}
		for(int no : hs) {
			System.out.print(no+" ");
		}
	}
}

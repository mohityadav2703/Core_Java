package test;

import java.util.Arrays;

public class SearchMin {
	public static void main(String[] args) {
	int []a= {3,7,1,2,5,8,9,4,11};
	
	int min=a[0];
	for(int i=1;i<a.length;i++) {
		if(min>a[i]) {
			min=a[i];
		}
	}
	System.out.println("Minimum Value is :"+min);
	
	//OR
	
	Arrays.sort(a);
	System.out.println("Minimum value is :"+a[0]);
	System.out.println("Second Minimum Value is :"+a[1]);
  }
}
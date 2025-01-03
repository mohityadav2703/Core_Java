package array;

import java.util.Arrays;

public class PrintElementWithTheirIndex {
	public static void main(String[] args) {
		int[] arr= {8,3,1,6,4,2,9,7,8};
		Arrays.sort(arr);
		
		for(int i=0;i<arr.length;i++) {
			System.out.println(i+"=> "+arr[i]);
		}
		
		
	}

}

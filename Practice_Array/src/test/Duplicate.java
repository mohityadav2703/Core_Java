package test;

import java.util.Arrays;

public class Duplicate {
	public static void main(String[] args) {
		int[] arr= {1,3,2,6,1,7,3,4,9,2,2,2,2,8};
		
		Arrays.sort(arr);
		int[] temp=new int[arr.length];
		int j=0,k=0;
		for(int i=0;i<arr.length-1;i++) {
			if(arr[i]!=arr[i+1]) {
				temp[j]=arr[i];
				j++;
			}
			else {
				k++;
			}
		}
		temp[j]=arr[arr.length-1];
		for(int i=0;i<temp.length-k;i++) {
			System.out.print(temp[i]+" ");
		}
		
		
	}
}

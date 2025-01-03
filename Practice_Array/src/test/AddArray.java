/* break array into two parts and reverse both array and add both array
 * Ex :{1,2,3,4,5,6,7,8,9,10} => {5,4,3,2,1} and {10,9,8,7,6}
 * 		{5,4,3,2,1,10,9,8,7,6} :{(1+10),(2+9),(3+8),(4+7),(5+6)} =>{11,11,11,11,11} 	
 */
package test;

import java.util.Arrays;

public class AddArray {
	public static void main(String[] args) {
		int[] arr= {1,2,3,4,5,6,7,8,9,10,55};
		
		int mid=arr.length/2;	//5
		int[] firstPart=Arrays.copyOfRange(arr, 0, mid);
		int[] secondPart=Arrays.copyOfRange(arr, mid,arr.length);
		
		reverseArray(firstPart);	// 5 4 3 2 1
		reverseArray(secondPart);	// 10 9 8 7 6
		
		int[] result=new int[mid];
		for(int i=0;i<mid;i++) {
						//		5				6
			result[i]=firstPart[i]+secondPart[mid-i -1];
		}
		
		for(int ab : result) {
			System.out.print(ab+" ");
		}	
	}

	public static void reverseArray(int[] arr) {
		int start=0;
		int end=arr.length-1;
		
		int temp=arr[start];
		arr[start]=arr[end];
		arr[end]=temp;
		start++;
		end--;
	}
}
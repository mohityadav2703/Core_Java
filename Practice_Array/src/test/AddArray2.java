/* break array into two parts and reverse both array and add both array
 * Ex :{1,2,3,4,5,6,7,8,9,10} => {5,4,3,2,1} and {10,9,8,7,6}
 * 		{5,4,3,2,1,10,9,8,7,6} :{(1+10),(2+9),(3+8),(4+7),(5+6)} =>{11,11,11,11,11} 	
 */
package test;

import java.util.Arrays;

public class AddArray2 {
	public static void main(String[] args) {
		int[] arr= {1,2,3,4,5,6,7,8,9,10};
		int[] arr1=new int[arr.length];
		int mid=arr.length/2;
		int index=0,index1=0;
		
		int[] r1=new int[mid];
		int[] r2=new int[mid];
		
		for(int i=mid-1;i>=0;i--) {
			r1[index]=arr[i];
			arr1[index]=arr[i];
			index++;
		}
		
		for(int i=arr.length-1;i>=mid;i--) {
			r2[index1]=arr[i];
			arr1[index]=arr[i];
			index1++;
			index++;
		}
		
		System.out.println("Reverse of Two Arrays :");
		for(int ab :arr1) {
			System.out.print(ab+" ");
		}
		System.out.println();
		
		System.out.println("After Added Two Arrays :");
		int[] result=new int[mid];
		for(int i=0;i<mid;i++) {
			result[i]=r1[i]+r2[mid-i -1];
		}
		
		for(int ab :result) {
			System.out.print(ab+" ");
		}
	}
}
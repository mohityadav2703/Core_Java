/**
 * input :{1,2,3,4,5,6,7}
 * output:{4,5,6,7,1,2,3}
 */

package test;

public class RotateArray {
	public static void main(String[] args) {
		int []arr= {1,2,3,4,5,6,7};
		int pos=3, index=0;
		int[] arr1=new int[arr.length];
		
		for(int i=pos;i<arr.length;i++) {
			arr1[index]=arr[i];
			index++;
		}
		for(int i=0;i<pos;i++) {
			arr1[index]=arr[i];
			index++;
		}
		
		for(int ab : arr1) {
			System.out.print(ab+" ");
		}
	}

}

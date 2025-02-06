/**
 * input :{1,2,3,4,5,6,7}
 * output:{4,3,2,1,7,6,5}
 */

package test;

public class RotateArrayInReverse {
	public static void main(String[] args) {
		int arr[]= {1,2,3,4,5,6,7};
		int arr1[]=new int[arr.length];
		
		int pos=3,index=0;
		for(int i=pos;i>=0;i--) {
			arr1[index]=arr[i];
			index++;
		}
		for(int i=arr.length-1;i>pos;i--) {
			arr1[index]=arr[i];
			index++;
		}
		
		for(int k : arr1) {
			System.out.print(k+" ");
		}
	}

}

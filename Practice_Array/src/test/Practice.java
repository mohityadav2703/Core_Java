// {3,6,1,5,4,2,8,9,6} => {4,5,1,6,3,6,9,8,2}

package test;

public class Practice {
	public static void main(String[] args) {
		int[] arr= {3,6,1,5,4,2,8,9,6};
		int[] arr1=new int[arr.length];
		int index=0;
		
		for(int i=arr.length/2;i>=0;i--) {
			arr1[index]=arr[i];
			index++;
		}
		for(int i=arr.length-1;i>arr.length/2;i--) {
			arr1[index]=arr[i];
			index++;
		}
		for(int a : arr1) {
			System.out.print(a+" ");
		}
	}

}

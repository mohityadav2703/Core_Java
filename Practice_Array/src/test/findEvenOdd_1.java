//first print even then after print odd number

package test;

public class findEvenOdd_1 {
	public static void main(String[] args) {
		int[] arr= {1,4,2,6,7,9,11,20};
		int[] a=new int[arr.length];
		int index=0;
		
		for(int i=0;i<arr.length;i++) {
			if(arr[i]%2==0) {		
				a[index]=arr[i];	
				index++;
			}
		}
		for(int i=0;i<arr.length;i++) {
			if(arr[i]%2!=0) {
				a[index]=arr[i];
				index++;
			}
		}
		for(int i=0;i<a.length;i++) {
			System.out.print(a[i]+" ");
		}
	}

}

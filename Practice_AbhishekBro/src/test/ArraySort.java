package test;

public class ArraySort {

	public static void main(String[] args) {
		int[] a= {1,4,3,9,2,5,8,6};
		
		for(int i=0;i<a.length;i++) {
			for(int j=i+1;j<a.length;j++) {
				if(a[i]>a[j]) {
					int temp=a[j];
					a[j]=a[i];
					a[i]=temp;
				}
			}
		}
		for(int no : a) {
			System.out.print(no+" ");
		}
	}
}

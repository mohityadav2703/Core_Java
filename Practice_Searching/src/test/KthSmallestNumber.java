package test;

public class KthSmallestNumber {

	public static void main(String[] args) {
		int[] a= {7,2,8,3,5,1,9,6,4};
		int k=3;
		
		for(int i=0;i<a.length;i++) {
			for(int j=i+1;j<a.length;j++) {
				if(a[i]>a[j]) {
					int temp=a[j];
					a[j]=a[i];
					a[i]=temp;
				}
			}
			if(i==k-1) {
				System.out.println("Smallest Number of Kth Position :"+a[i]);
			}
		}
	}
}

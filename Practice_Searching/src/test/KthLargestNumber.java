package test;

public class KthLargestNumber {

	public static void main(String[] args) {
		int []a= {5,8,12,7,6,2,4}; //12,8,7,6,5,4,2
		int k=4;
		
		for(int i=0;i<a.length;i++) {
			for(int j=i+1;j<a.length;j++) {
				if(a[i]<a[j]) {
					int temp=a[i];
					a[i]=a[j];
					a[j]=temp;
				}
			}
			if(i==k-1) {
				System.out.println("Largest Number At Kth Position :"+a[i]);
			}
		}
	}
}

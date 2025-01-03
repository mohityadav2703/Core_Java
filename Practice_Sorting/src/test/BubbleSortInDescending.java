package test;

public class BubbleSortInDescending {

	public static void main(String[] args) {
		int a[]= {12,3,19,7,2,6,11,37,28,5};
		
		for(int i=0;i<a.length;i++) {
			for(int j=i+1;j<a.length;j++) {
				if(a[i]<a[j]) {
					int temp=a[j];
					a[j]=a[i];
					a[i]=temp;
				}
			}
			System.out.print(a[i]+" ");
		}
	}
}

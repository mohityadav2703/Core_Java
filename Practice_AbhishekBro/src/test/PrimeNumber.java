package test;

public class PrimeNumber {

	public static void main(String[] args) {
		int[] a= {1,3,4,7,11,12,21,43};
		
		for(int i=0;i<a.length;i++) {
			int temp=0;
			for(int j=2;j<a[i];j++) {
				if(a[i]%j==0) {
					temp=temp+1;
				}
			}
			if(temp==0) {
				System.out.print(a[i]+" ");
			}
		}
	}
}

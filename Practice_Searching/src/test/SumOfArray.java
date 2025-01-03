package test;

public class SumOfArray {

	public static void main(String[] args) {
		int[] a= {1,3,2,4,6,5,7,8,9};
		int sum=0;
		for(int i=0;i<a.length;i++) {
			sum=sum+a[i];
		}
		System.out.println(sum);
	}
}

package test;

public class LargestElementOfArray {

	public static void main(String[] args) {
		int[] a= {1,5,3,4,2,88};
		
		int max=0;
		for(int i=0;i<a.length;i++) {
			if(max<a[i]) {
				max=a[i];
			}
		}
		System.out.println("Largest Number is  :"+max);
	}
}

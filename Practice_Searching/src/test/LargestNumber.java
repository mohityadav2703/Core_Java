package test;

public class LargestNumber {

	public static void main(String[] args) {
		int []a= {1,2,3,4,5,6,7,8,9,17,13,90,85};
		int max=a[0];
		for(int i=0;i<a.length;i++) {
			if(max < a[i]) {
				max=a[i];
			}
		}
		System.out.println(max);
	}
}

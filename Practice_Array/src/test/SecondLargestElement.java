package test;

public class SecondLargestElement {

	public static void main(String[] args) {
		int[] a = {1, 2, 3, 4, 4, 5, 6, 7, 8, 8, 9, 9};
		int count=0;
		
		for(int i=0;i<a.length;i++) {
			for(int j=1;j<a.length;j++) {
				if(a[i]==a[j]) {
					count++;					
				}
			}
		}	
		System.out.println(count);
	}
}

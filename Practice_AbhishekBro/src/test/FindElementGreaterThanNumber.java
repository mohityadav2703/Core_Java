package test;

public class FindElementGreaterThanNumber {

	public static void main(String[] args) {
		int[] a= {1,2,3,4,5,6,7,8,9};
		int num=5;
		int count=0;
		
		for(int i=0;i<a.length;i++) {
			if(a[i]>num) {
				count++;
				System.out.print(a[i]+" ");
			}
		}
		System.out.println("\nTotal number of element :"+count);
	}
}

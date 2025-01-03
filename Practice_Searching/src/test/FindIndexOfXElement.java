package test;

public class FindIndexOfXElement {

	public static void main(String[] args) {
		int[] a= {1,2,3,4,5,6,7,8,9};
		int x=7;
		
		for(int i=0;i<a.length;i++) {
			if(a[i]==x) {
				System.out.print("Index of Given Number in Array is :"+i);
				break;
			}
		}
		
		
	}
}

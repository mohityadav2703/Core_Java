package test;

public class FindGivenElement {

	public static void main(String[] args) {
		int[] a= {1,2,3,4,5,6};
		int ele=3;
		for(int i=0; i<a.length;i++) {
			if(a[i]==ele) {
				System.out.println("Given Number is present at index position :"+i+"th");
			}
		}
	}
}

package test;

public class OccuranceOfElement {

	public static void main(String[] args) {
		int a[]= {2,3,5,3,1,3,3,4};
		int x=3;
		int count=0;
		for(int i=0;i<a.length;i++) {
			if(a[i]==x) {
				count++;
			}
		}
		System.out.println("Total Number of Occurance :"+count);
	}
}

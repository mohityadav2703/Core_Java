package test;

public class LastOccuranceOfElement {

	public static void main(String[] args) {
		int []a= {2,3,5,3,1,3,4};
		int x=3;
		int index=0,count=0;
		
		for(int i=0;i<a.length;i++) {
			if(a[i]==x) {
				count++;
				index=i;
			}
		}
		System.out.println("Index value of last occurance of "+x+" is :"+index);
		System.out.println("Total Number of Occurance is :"+count);
	}
}

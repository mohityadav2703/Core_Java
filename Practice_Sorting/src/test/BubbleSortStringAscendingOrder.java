package test;

public class BubbleSortStringAscendingOrder {

	public static void main(String[] args) {
		String []a= {"Mohit","Satrudhan","Rajeev","Chandan","Deepak","Nihit","mohit","satrudhan","rajeev","chandan","deepak","nihit"};
		
		for(int i=0;i<a.length;i++) {
			for(int j=i+1;j<a.length;j++) {
				if(a[i].compareTo(a[j])>0) {
					String temp=a[j];
					a[j]=a[i];
					a[i]=temp;
				}
			}
			System.out.println(new String(a[i]));
		}
	}
}

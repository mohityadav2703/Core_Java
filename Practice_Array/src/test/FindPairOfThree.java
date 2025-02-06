package test;

public class FindPairOfThree {
	public static void main(String[] args) {
		int []arr= {3,1,6,8,2,5,9};
		int sum=9;
		for(int i=0;i<arr.length;i++) {
			for(int j=i+1;j<arr.length;j++) {
				for(int k=j+1;k<arr.length;k++) {
					if(arr[i]+arr[j]+arr[k]==sum) {
						System.out.print("{"+arr[i]+","+arr[j]+","+arr[k]+"}");
					}
				}
			}
		}
	}
}

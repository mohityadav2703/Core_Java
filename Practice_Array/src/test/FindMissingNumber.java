package test;

public class FindMissingNumber {

	public static void main(String[] args) {
		int[] arr= {1,2,3,4,5,6,7,9};
		int expectedSizeOfArray=arr.length+1;
		
		//formulla a_sum=(a*(a+1))/2;
		int expectedTotalSum=(expectedSizeOfArray * (expectedSizeOfArray+1))/2;
		int actualSum = 0;
		for(int i=0;i<arr.length;i++) {
			actualSum=actualSum+arr[i];
		}
		
		System.out.print("Missing Number is  :"+(expectedTotalSum-actualSum));
	}
}

package array;

public class AverageOfArray {
	public static void main(String[] args) {
		int[] arr= {1,2,3,4,5,6,7,8,9};
		int len=arr.length;
		int sum=0, average=0;
		
		for(int i=0;i<arr.length;i++) {
			sum=sum+arr[i];
			average=sum/len;
		}
		System.out.println("Sum of Array :"+sum);
		System.out.println("Average of Array :"+average);
	}
}

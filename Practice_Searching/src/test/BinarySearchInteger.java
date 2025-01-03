// write a program to search given element Index position

package test;

public class BinarySearchInteger {

	public static void main(String[] args) {
		int []a= {2,5,7,9,12,14,16,17,19,24,28};
		int search=14;
		
		int lowerIndex=0;
		int higherIndex=a.length-1;
		int middleIndex=(lowerIndex+higherIndex)/2;
		
		while(lowerIndex<=higherIndex) {
			if(a[middleIndex]==search) {
				System.out.println("Element is Present at "+middleIndex+" Position");
				break;
			}
			else if(a[middleIndex]<search) {
				lowerIndex=middleIndex+1;
			}
			else {
				higherIndex=middleIndex+1;
			}
			middleIndex=(lowerIndex+higherIndex)/2;
		}
		if(lowerIndex>higherIndex) {
			System.out.println("Element Not Found");
		}
	}
}

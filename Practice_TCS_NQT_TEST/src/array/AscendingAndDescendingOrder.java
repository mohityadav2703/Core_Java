package array;

public class AscendingAndDescendingOrder {
	public static void main(String[] args) {
		int[] arr= {4,1,6,3,9,7,8,5};
		int[] res=new int[arr.length];
		int index=0;
		
		for(int i=0;i<arr.length;i++) {
			for(int j=i+1;j<arr.length;j++) {
				if(arr[i]>arr[j]) {
					int temp=arr[i];
					arr[i]=arr[j];
					arr[j]=temp;
				}
			}
		}
		for(int i=0;i<arr.length/2;i++) {
			res[index]=arr[i];
			index++;
		}
		
		for(int i=arr.length-1;i>arr.length/2-1;i--) {
			res[index]=arr[i];
			index++;
		}
		
		for(int ab : res) {
			System.out.print(ab+" ");
		}
	}
}

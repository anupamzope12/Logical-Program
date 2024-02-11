package Array;

public class SmallestAndLargest {
	public static void main(String[] args) {
		int [] arr= {85,56,98,12,66,35,32};
		int smallest=arr[0];
		int largest=arr[0];
		
		for(int i=0 ;i<arr.length ; i++) {
			if(arr[i]>largest) {
				largest=arr[i];
			}
			else{
				smallest=arr[i];
			}
		}
		System.out.println("Largest " + largest);
		System.out.println("Smallest " + smallest);
	}
	
}

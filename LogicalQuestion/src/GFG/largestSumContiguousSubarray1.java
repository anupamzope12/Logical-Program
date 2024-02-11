package GFG;

public class largestSumContiguousSubarray1 {
	public static void main(String[] args) {
		int arr[]= { -1, -2, 3, 0, 7, -8, 2 , 2 };
		System.out.println(largestSumContiguous(arr));
	}
	public static int  largestSumContiguous(int arr[]) {
		int maxEndingHere=arr[0];
		int maxSoFar=arr[0];
		int n=arr.length;
		
		for(int i=0 ;i<arr.length ;i++) {
			maxEndingHere=Math.max(arr[i], maxEndingHere+arr[i]);
			maxSoFar=Math.max(maxSoFar,maxEndingHere);
		}
		return maxSoFar;
	}
}
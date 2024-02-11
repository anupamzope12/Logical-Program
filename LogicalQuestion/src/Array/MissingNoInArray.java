package Array;

//public class MissingNoInArray {
//	public static void main(String[] args) {
//		int [] arr= {1,2,3,5,6};
//		System.out.println();
//		for(int i=0 ; i<arr.length ; i++) {
//			System.out.print(arr[i] + " ");
//			for(int j=i+1 ; j<arr.length ; j++ ) {
//				while(arr[i]+1 == arr[j]) {
//					if(arr[i]+1 !=arr[j]) {
//						 System.out.println(arr[i]);
//					}
////					else {
////						 System.out.println(arr[i]);
////						
////					}
//				}
//			}
//		}
//	}
//}

class MissingNoInArray {

	// Function to find the missing number
	public static void findMissing(int arr[], int N)
	{
		int i;
		int temp[] = new int[N + 1];
		for (i = 0; i <= N; i++) {
			temp[i] = 0;
		}

		for (i = 0; i < N; i++) {
			temp[arr[i] - 1] = 1;
		}

		int ans = 0;
		for (i = 0; i <= N; i++) {
			if (temp[i] == 0)
				ans = i + 1;
		}
		System.out.println(ans);
	}
	
	// Driver Code
	public static void main(String[] args)
	{
		int arr[] = { 1, 3, 7, 5, 6, 2 };
		int n = arr.length;

		// Function call
		findMissing(arr, n);
	}
}

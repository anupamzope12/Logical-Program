package GFG;

public class LargestSumContiguousSubarray {

		static int largestSumContiguousSubarray(int arr[])
		{
			// Initializing result
			int result = arr[0];
//			int result = Math.abs(arr[0]);
			int n = arr.length;

			for (int i = 0; i < n; i++) {
				int add = arr[i];
				// traversing in current subarray
				for (int j = i + 1; j < n; j++) {
					// updating result every time to keep an eye
					// over the maximum add
					result = Math.max(result, add);
//					result = Math.abs(result);
					add += arr[j];
				}
				// updating the result for (n-1)th index.
				result = Math.max(result, add);
			}
			return result;
		}
		// Driver Code
		public static void main(String[] args)
		{
			int arr[] = { -1, -2, 3, 0, 7, -8, 2 , 2 };
			System.out.println("Maximum Sub array product is " + largestSumContiguousSubarray(arr) );
		}
	}
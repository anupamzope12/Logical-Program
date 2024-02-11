package Array;


	public class FindMissingNumber {
	    public static void main(String[] args) {
	        int[] arr = {1, 2, 4, 5}; // Example array with one missing number
	        int n = arr.length + 1; // Expected length of the array with the missing number

	        // Calculate the sum of all numbers from 1 to n
	        int expectedSum = n * (n + 1) / 2;

	        // Calculate the sum of elements in the array
	        int actualSum = 0;
	        for (int num : arr) {
	            actualSum += num;
	        }

	        // Find the missing number
	        System.out.println(expectedSum);
	        System.out.println(actualSum);
	        int missingNumber = expectedSum - actualSum;

	        System.out.println("The missing number is: " + missingNumber);
	    }
}

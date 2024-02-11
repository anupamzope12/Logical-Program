////package leetecodeInteger;
////
////public class Subsets {
////	public static void main(String[] args) {
////		int arr[]= {1,2,3,4};
////		for(int i=0 ;i<=arr.length;i++)
////		{
////			for(int j=0;j<i;j++) {
////				System.out.print(arr[j]);
////			}
////			System.out.println();
////		}
////	}
////
////}
//package leetecodeInteger;
//
//public class Subsets {
//    public static void main(String[] args) {
//        int arr[] = {1, 2, 3, 4};
//        int n = arr.length;
//
//        // Total number of subsets = 2^n
//        int totalSubsets = 1 << n;
//        System.out.println(totalSubsets);
//        for (int i = 0; i < totalSubsets; i++) {
//            for (int j = 0; j < n; j++)    {
//                if ((i & (1 << j)) > 0) {
//                    System.out.print(arr[j] + " ");
//                }
//            }
//            System.out.println();
//        }
//    }
//}
package leetecodeInteger;

import java.util.ArrayList;
import java.util.List;

public class Subsets {
    public static void main(String[] args) {
        // Define the input array.
        int arr[] = {1, 2, 3};
        int n = arr.length;  // Get the length of the array, which is the number of elements.

        // Total number of subsets = 2^n
        int totalSubsets = 1 << n;
        
        // ArrayList to store the subsets
       List<List<Integer>> subsets = new ArrayList<>();

        // The outer loop iterates through all possible subset combinations.
        for (int i = 0; i < totalSubsets; i++) {
            // Create a new subset for each iteration
            List<Integer> subset = new ArrayList<>();
            
            // The inner loop iterates through each element of the input array.
            for (int j = 0; j < n; j++) {
                // Check if the j-th bit of i is set (i.e., 1).
                if ((i & (1 << j)) > 0) {
                    // If the j-th bit is set, add the corresponding element to the subset.
                    subset.add(arr[j]);
                }
            }
            
            // Add the current subset to the list of subsets
            subsets.add(subset);
        }
        
        // Print the subsets in the desired format
       // System.out.print("Output: ");
        System.out.println(subsets);
    }
}

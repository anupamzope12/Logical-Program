package GFG;

import java.util.Arrays;

public class LongestConsecutiveSubsequence {
    public static void main(String[] args) {
        int [] arr = {1, 9, 8, 2, 3, 5, 6, 4};
        System.out.println(longestCons(arr));
    }

    public static int longestCons(int[] arr) {
        if (arr.length == 0) {
            return 0;
        }

    Arrays.sort(arr);
    System.out.println(Arrays.toString(arr));
        int maxCount = 1; // Initialize the maximum count to 1
        int currentCount = 1; // Initialize the current count to 1

        for (int i = 1; i < arr.length; i++) {
            if (arr[i] == arr[i - 1] + 1) {
                currentCount++; // Increment the current count if consecutive
            } else  if(arr[i] != arr[i - 1]){
                currentCount = 1; // Reset the current count if not consecutive and not equal
            }
            maxCount = Math.max(maxCount, currentCount); // Update maxCount if needed
        }

        return maxCount-1;
    }
}

package coupa;

import java.util.ArrayList;
import java.util.List;

public class SplitArray {
    public static void main(String[] args) {
        int[] originalArray = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        int subarraySize = 3; // Change this value to set the size of subarrays

        List<int[]> subarrays = splitArray(originalArray, subarraySize);

        // Printing the subarrays
        for (int i = 0; i < subarrays.size(); i++) {
            int[] subarray = subarrays.get(i);
            System.out.print("Subarray " + (i + 1) + ": ");
            for (int j = 0; j < subarray.length; j++) {
                System.out.print(subarray[j] + " ");
            }
            System.out.println();
        }
    }

    public static List<int[]> splitArray(int[] array, int subarraySize) {
        List<int[]> subarrays = new ArrayList<>();
        int startIndex = 0;
        while (startIndex < array.length) {
            int endIndex = Math.min(startIndex + subarraySize, array.length);
            int[] subarray = new int[endIndex - startIndex];
            for (int i = startIndex, j = 0; i < endIndex; i++, j++) {
                subarray[j] = array[i];
            }
            subarrays.add(subarray);
            startIndex = endIndex;
        }
        return subarrays;
    }
}
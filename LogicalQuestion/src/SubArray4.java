public class SubArray4 {
    public static void main(String[] args) {
        int[] arr = {1, -2, 4, -5, 1};
        int totalCount = 0;  
        for (int i = 0; i < arr.length; i++) {
            for (int j = i; j < arr.length; j++) {
                int count = 0;
                int sum = 0;

                for (int k = i; k <= j; k++) {
                    sum = sum + arr[k];
                    }
                if (sum < 0) {
                   System.out.println("Sum =" +sum );
                	count++;
                }
                // System.out.print(arr[k]);  // If you want to print the subarray, you can uncomment this line
                System.out.println(count);
                totalCount += count;  // Accumulate the count
            }
        }
        System.out.println("Total Count: " + totalCount);  // Print the total count after both loops
    }
}

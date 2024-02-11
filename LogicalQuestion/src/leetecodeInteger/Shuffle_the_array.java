package leetecodeInteger;
//
//public class Shuffle_the_array {
//public static void main(String[] args) {
//	int [] nums= {4,5,8,3,6,9};
//	shuffle(nums);
//}
//public static int[] shuffle(int[] nums) {
//	int mid=nums.length/2;
//	int [] newarr= new int[nums.length];
//	for(int i=0;i<mid;i++) {
//		newarr[]
//	}
//	for(int i=mid;i<nums.length;i++) {
//		
//	}
//	return nums;
//    
//}
//}
public class Shuffle_the_array {
    public static void main(String[] args) {
        int[] nums = {4, 5, 8, 3, 6, 9};
        int[] result = shuffle(nums);

        // Print the shuffled array
        for (int num : result) {
            System.out.print(num + " ");
        }
    }

    public static int[] shuffle(int[] nums) {
        int mid = nums.length / 2;
        int[] newarr = new int[nums.length];

        for (int i = 0; i < mid; i++) {
            newarr[i * 2] = nums[i];          // Place x elements at even indices
            newarr[i * 2 + 1] = nums[i + mid]; // Place y elements at odd indices
        }

        return newarr; // Return the shuffled array
    }
}

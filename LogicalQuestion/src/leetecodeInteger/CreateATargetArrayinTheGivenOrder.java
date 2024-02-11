//package leetecodeInteger;
//
//import java.util.Arrays;
//
//public class CreateATargetArrayinTheGivenOrder {
//    public static void main(String[] args) {
//        int nums[] = {0, 1, 2, 3, 4};
//        int[] index = {0, 1, 2, 2, 1};
//        System.out.println(Arrays.toString(createTargetArray(nums, index)));
//    }
//
//    public static int[] createTargetArray(int[] nums, int[] index) {
//        int[] targetArray = new int[nums.length];
//        for (int i = 0; i < nums.length; i++) {
//            // Shifting elements to the right to make space for nums[i] at index[i]
//            for (int j = nums.length - 1; j > index[i]; j--) {
//                targetArray[j] = targetArray[j - 1];
//            }
//            // Inserting nums[i] at index[i]
//            targetArray[index[i]] = nums[i];
//        }
//        return targetArray;
//    }
//[0, 4, 1, 3, 2]

//}
package leetecodeInteger;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class CreateATargetArrayinTheGivenOrder {
    public static void main(String[] args) {
        int nums[] = {0, 1, 2, 3, 4};
        int[] index = {0, 1, 2, 2, 1};
        System.out.println(Arrays.toString(createTargetArray(nums, index)));
    }

    public static int[] createTargetArray(int[] nums, int[] index) {
        List<Integer> targetList = new ArrayList<>();

        for (int i = 0; i < nums.length; i++) {
            // Insert nums[i] at the specified index
            targetList.add(index[i], nums[i]);
        }
        System.out.println(targetList);

        // Convert ArrayList to an array
        int[] targetArray = targetList.stream().mapToInt(Integer::intValue).toArray();

        return targetArray;
    }
}//[0, 4, 1, 3, 2]


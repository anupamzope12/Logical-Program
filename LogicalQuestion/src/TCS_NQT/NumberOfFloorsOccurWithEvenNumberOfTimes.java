//package TCS_NQT;
//
//public class NumberOfFloorsOccurWithEvenNumberOfTimes {
//public static void main(String[] args) {
//	int [] arr= {1,2,2,3,2};
//
//	for(int i=0;i<arr.length;i++) {
//		int count=1;
//		for(int j=i+1;j<arr.length;j++) {
//			if(arr[i]==arr[j]) {
//				count++;
//			}
//		}
//		System.out.println("occurance of " + arr[i] + "  "+ count);
//	  }
//    }
//  }
//package TCS_NQT;
//
//public class NumberOfFloorsOccurWithEvenNumberOfTimes {
//    public static void main(String[] args) {
//        int[] arr = {1, 2, 2, 3, 2};
//
//        // Array to keep track of whether a number is counted
//        boolean[] counted = new boolean[arr.length];
//
//        for (int i = 0; i < arr.length; i++) {
//            // Skip if the number is already counted
//            if (counted[i]) {
//                continue;
//            }
//
//            int count = 1;
//
//            for (int j = i + 1; j < arr.length; j++) {
//                if (arr[i] == arr[j]) {
//                    count++;
//                    counted[j] = true; // Mark the number as counted
//                }
//            }
//
//            System.out.println("Occurrence of " + arr[i] + "  " + count);
//        }
//    }
//}

//package TCS_NQT;
//
//public class NumberOfFloorsOccurWithEvenNumberOfTimes {
//    public static void main(String[] args) {
//        int[] arr = {1, 2, 2, 3, 2};
//
//        // Array to keep track of whether a number is counted
//        boolean[] counted = new boolean[arr.length];
//
//        for (int i = 0; i < arr.length; i++) {
//            // Skip if the number is already counted
//            if (counted[i]) {
//                continue;
//            }
//
//            int count = 1;
//
//            for (int j = i + 1; j < arr.length; j++) {
//                if (arr[i] == arr[j]) {
//                    count++;
//                    counted[j] = true; // Mark the number as counted
//                }
//            }
//
//            System.out.println("Occurrence of " + arr[i] + "  " + count);
//        }
//    }
//}
package TCS_NQT;

import java.util.HashSet;
import java.util.Set;

public class NumberOfFloorsOccurWithEvenNumberOfTimes {
    public static void main(String[] args) {
        int[] arr = {1, 2, 2, 3, 2};

        Set<Integer> uniqueNumbers = new HashSet<>();

        for (int i = 0; i < arr.length; i++) {
            // Skip if the number is already counted
            if (!uniqueNumbers.contains(arr[i])) {
                int count = 1;

                for (int j = i + 1; j < arr.length; j++) {
                    if (arr[i] == arr[j]) {
                        count++;
                    }
                }

                uniqueNumbers.add(arr[i]); // Mark the number as counted
                System.out.println("Occurrence of " + arr[i] + "  " + count);
            }
        }
    }
}

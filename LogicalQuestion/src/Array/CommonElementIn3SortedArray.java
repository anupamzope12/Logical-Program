package Array;

//public class CommonElementIn3SortedArray {
//	public static void main(String[] args) {
//
//	int [] arr1= {10,56,32,89,36,23,20};
//	int [] arr2= {10,98,45,20};
//	int [] arr3= {10,56,23,11,22,20};
//	
//	for(int i=0 ; i<arr1.length ; i++) {
//		for(int j=0 ; j<arr2.length ; j++) {
//			for(int k=0 ; k<arr3.length ; k++) {
//				if(arr1[i]==arr2[j] && arr2[j]==arr3[k] && arr1[i]==arr3[k]) {
//					System.out.println(arr1[i]);
//				}
//			}
//		}
//	}

	import java.util.HashSet;

	public class CommonElementIn3SortedArray {
	    public static void main(String[] args) {
	        int[] arr1 = {10, 56, 32, 89, 36, 23, 20};
	        int[] arr2 = {10, 98, 45, 20};
	        int[] arr3 = {10, 56, 23, 11, 22, 20};

	        HashSet<Integer> set = new HashSet<>();

	        // Create a HashSet to store common elements
	        for (int num : arr1) {
	            set.add(num);
	        }
//	        System.out.println(1);
	        System.out.println(set);
	        // Iterate through the second array and remove elements not in common
	        for (int num : arr2) {
	            if (!set.contains(num)) {
	                set.remove(num);
	            }
	        }
	   
//	        System.out.println(2);
	        System.out.println(set);
	        // Iterate through the third array and remove elements not in common
	        for (int num : arr3) {
	            if (set.contains(num)) {
	                System.out.println(num);
	              //  set.remove(num); // Remove to avoid duplicates
	        }    
       }
//	        System.out.println(3);
//		    System.out.println(set);
	}
}
//package Array;

//public class CommonElementIn3SortedArray {
//    public static void main(String[] args) {
//
//        int[] arr1 = {10, 56, 32, 89, 36, 23, 20};
//        int[] arr2 = {10, 98, 45, 20};
//        int[] arr3 = {10, 56, 23, 11, 22, 20};
//
//        int i = 0, j = 0, k = 0;
//
//        while (i < arr1.length && j < arr2.length && k < arr3.length) {
//            if (arr1[i] == arr2[j] && arr2[j] == arr3[k]) {
//                System.out.println(arr1[i]);
//                i++;
//                j++;
//                k++;
//            } else if (arr1[i] < arr2[j]) {
//                i++;
//            } else if (arr2[j] < arr3[k]) {
//                j++;
//            } else {
//                k++;
//            }
//        }
//    }
//}

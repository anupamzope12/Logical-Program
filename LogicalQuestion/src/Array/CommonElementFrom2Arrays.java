//package Array;
//import java.util.HashSet;
//public class CommonElementFrom2Arrays {
//	public static void main(String[] args) {
//		int arr1[]= {10,56,23,47,28,98,12,32,91};
//		int arr2[]= {56,48,87,54,44,28,12,65,91,80};
//		
//		HashSet <Integer>hs=new HashSet<>();
//		for(int num:arr1) {
//			hs.add(num);
//		}
//		
//		System.out.println(hs);
//		for(int num1:arr2) {
//			if(hs.contains(num1)) {
//				System.out.println(num1);
//			}
//		}
//	}
//}

package Array;

import java.util.HashSet;

public class CommonElementFrom2Arrays {
    public static void main(String[] args) {
        int arr1[] = {10, 56, 23, 47, 28, 98, 12, 32, 91};
        int arr2[] = {56, 48, 87, 54, 44, 28, 12, 65, 91, 80};
        int arr3[] = {56, 23, 91, 78, 12, 28, 65};

        HashSet<Integer> commonElements = new HashSet<>();

        HashSet<Integer> hs = new HashSet<>();
        for (int num : arr1) {
            hs.add(num);
        }

        System.out.println(hs);
        for (int num1 : arr2) {
            if (hs.contains(num1)) {
                commonElements.add(num1);
            }
        }
        
        System.out.println(commonElements);

        // Now, check common elements with the third array
        HashSet<Integer> commonElementsWith3rdArray = new HashSet<>();
        for (int num2 : arr3) {
            if (commonElements.contains(num2)) {
                commonElementsWith3rdArray.add(num2);
            }
        }

        System.out.println("Common Elements from all three arrays: " + commonElementsWith3rdArray);
    }
}
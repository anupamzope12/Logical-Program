package leetecodeInteger;

import java.util.Arrays;

//import java.util.HashMap;
//import java.util.Map;
//
//public class RemoveDuplicatesElementFromArray {
//	public static void main(String[] args) {
//		Map <Integer,Integer>hs=new HashMap<>();
//		int [] arr = {10,20,20,56,65,20,10,65,98};
////		int val=1;
//		for(int i=0 ;i<arr.length;i++) {
//			hs.put(arr[i], hs.getOrDefault(arr[i], 0)+1);
//			System.out.println(hs.get(arr[i]));
////			val++;
//		}
//	}
//}

//public class RemoveDuplicatesElementFromArray{
//	public static void main(String[] args) {
//		int arr[]= {10,20,30,40,50,10,20,50,60,80};
//		int newarr[] = new int[arr.length];
//		int k=0;
//		System.out.println("45");
//		for(int i=0;i<arr.length;i++) {
//			System.out.println("46");
//			for(int j=i+1;j<arr.length;j++) {
//				System.out.println("47");
//				if(arr[i]!=arr[j]) {
//					newarr[k]=arr[j];
//					k++;
//				}
//			}
//		}
//		System.out.println(newarr.toString());
//		
//	}
//}
public class RemoveDuplicatesElementFromArray {
    public static void main(String[] args) {
        int arr[] = { 10, 20, 30, 40, 50, 10, 20, 50, 60, 80 };
        int newarr[] = new int[arr.length]; // Initialize with the same length as arr
        int k = 0;

        for (int i = 0; i < arr.length; i++) {
            boolean isDuplicate = false;
            for (int j = 0; j < k; j++) {
                if (arr[i] == newarr[j]) {
                    isDuplicate = true;
                    break;
                }
            }

            if (!isDuplicate) {
                newarr[k] = arr[i];
                k++;
            }
        }
System.out.println(newarr.toString());
System.out.println(Arrays.toString(newarr));;
        // Print the unique elements in newarr
        for (int i = 0; i < k; i++) {
            System.out.print(newarr[i] + " ");
        }
    }
}


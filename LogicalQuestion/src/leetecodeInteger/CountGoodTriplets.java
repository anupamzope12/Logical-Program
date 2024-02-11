//package leetecodeInteger;
//
//public class CountGoodTriplets {
//	public static void main(String[] args) {
//		int [] arr = {7,3,7,3,12,1,12,2,3};
////		[7,3,7,3,12,1,12,2,3]
//		int a = 5, b = 8, c = 1;
//		System.out.println(countGoodTriplets(arr,a,b,c));
//	}
//    	public static int countGoodTriplets(int[] arr, int a, int b, int c) {
//    	int count = 0;
//    	for(int i=0;i<arr.length;i++) {
//    		for(int j=i+1;j<arr.length-1;j++) {
//    			for(int k=j+1;k<arr.length-2;k++) {
//    		if(Math.abs(arr[i]-arr[j])<=a) {
////    			System.out.print(arr[i]);
//    			if(Math.abs(arr[j]-arr[k])<=b) {
////        			System.out.print(arr[j]);
//    				if(Math.abs(arr[i]-arr[k])<=c) {
////            			System.out.print(arr[k]);
//    					count++;
//    				}
//    			}
//    		}
////    		System.out.println();
////    		System.out.println(count);
////    		System.out.println();
//    			}
//    	}
//    	}
//		return count;
//    }
//}
//package leetecodeInteger;
//
//public class CountGoodTriplets {
//    public static void main(String[] args) {
//        int[] arr = {7, 3, 7, 3, 12, 1, 12, 2, 3};
//        int a = 5, b = 8, c = 1;
//        System.out.println(countGoodTriplets(arr, a, b, c));
//    }
//
//    public static int countGoodTriplets(int[] arr, int a, int b, int c) {
//        int count = 0;
//
//        for (int i = 0; i < arr.length; i++) {
//            for (int j = i + 1; j < arr.length - 1; j++) {
//                for (int k = j + 1; k < arr.length - 2; k++) {
//                    if (Math.abs(arr[i] - arr[j]) <= a && Math.abs(arr[j] - arr[k]) <= b && Math.abs(arr[i] - arr[k]) <= c) {
//                        System.out.println("i "+arr[i] + " j "+ arr[j]+" k "+arr[k]);
//                    	count++;
//                    }
//                }
//            }
//        }
//
//        return count;
//    }
//}
package leetecodeInteger;

public class CountGoodTriplets {
    public static void main(String[] args) {
        int[] arr = {7, 3, 7, 3, 12, 1, 12, 2, 3};
        int a = 5, b = 8, c = 1;
        System.out.println(countGoodTriplets(arr, a, b, c));
    }

    public static int countGoodTriplets(int[] arr, int a, int b, int c) {
        int count = 0;

        for (int i = 0; i < arr.length - 2; i++) {
            for (int j = i + 1; j < arr.length - 1; j++) {
                for (int k = j + 1; k < arr.length; k++) {
                    if (Math.abs(arr[i] - arr[j]) <= a && Math.abs(arr[j] - arr[k]) <= b && Math.abs(arr[i] - arr[k]) <= c) {
                        count++;
                    }
                }
            }
        }

        return count;
    }
}

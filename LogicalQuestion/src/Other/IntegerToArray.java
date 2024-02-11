//package Other;
//
//import java.util.ArrayList;
//import java.util.Arrays;
//import java.util.List;
//public class IntegerToArray {
//	
//public static void main(String[] args) {
//	List <Integer> ls= Arrays.asList(4,3,2,1);
//	System.out.println(sumIndicesWithKSetBits(ls, 2));;
//}
//	
//	public static int  sumIndicesWithKSetBits(List<Integer> nums, int k) {
//
//		List<String> ls=new ArrayList<String>();
//		  for(int i=0;i<nums.size();i++) {
//			  	ls.add(Integer.toBinaryString(i));
//		  }
//		  List<Integer> arr=new ArrayList<Integer>();
//		  for(int i=0;i<ls.size();i++) {
//			  //System.out.println(ls.get(i));
//			  char ch[]=ls.get(i).toCharArray();
//				 int count=0;
//
//			  for(int j=0;j<ch.length;j++)
//			 {
//				  
////				 System.out.println(ch[i]);
//				 if(ch[j]=='1') {
//					 count++;
//					// System.out.println(" ch[j] : " +ch[j] + " count " + count);
//					 if(count==k) {
//					arr.add(i);
//					 }
//				  }
//			 }
//	    }
//		  int sum=0;
//		  for(int i=0;i<arr.size();i++) {
//			  sum =sum+arr.get(i);
//		  }
//			  return sum;
//	}
//}
//package Other;
//
//import java.util.ArrayList;
//import java.util.Arrays;
//import java.util.List;
//
//public class IntegerToArray {
//
//    public static void main(String[] args) {
//        List<Integer> ls = Arrays.asList(4,3,2,1);
//        System.out.println(sumIndicesWithKSetBits(ls,2));
//    }
//
//    public static int sumIndicesWithKSetBits(List<Integer> nums, int k) {
//
//        List<String> ls = new ArrayList<String>();
//        for (int i = 0; i < nums.size(); i++) {
//            ls.add(Integer.toBinaryString(i));
//        }
//        List<Integer> arr = new ArrayList<Integer>();
//        for (int i = 0; i < ls.size(); i++) {
//            // System.out.println(ls.get(i));
//            char ch[] = ls.get(i).toCharArray();
//            int count = 0;
//
//            for (int j = 0; j < ch.length; j++) {
//                // Corrected line: use ch[j] instead of ch[i]
//                //System.out.println(ch[j]);
//                if (ch[j] == '1') {
//                    count++;
//                    // System.out.println(" ch[j] : " + ch[j] + " count " + count);
//                    if (count == k) {
//                        arr.add(i);
//                    }
//                }
//            }
//        }
//        int sum = 0;
//      System.out.println(arr);
//        for (int i = 0; i < arr.size(); i++) {
//        	System.out.println("i "+ nums.indexOf((arr).get(i)));
//            sum = sum + nums.indexOf(i);
//        }
//        return sum;
//    }
//}
//package Other;
//
//import java.util.ArrayList;
//import java.util.Arrays;
//import java.util.List;
//
//public class IntegerToArray {
//
//    public static void main(String[] args) {
//        List<Integer> ls = Arrays.asList(5, 10, 1, 5, 2);
//        System.out.println(sumIndicesWithKSetBits(ls, 1));
//    }
//
//    public static int sumIndicesWithKSetBits(List<Integer> nums, int k) {
//
//        List<String> ls = new ArrayList<String>();
//        for (int i = 0; i < nums.size(); i++) {
//            ls.add(Integer.toBinaryString(i));
//        }
//        List<Integer> arr = new ArrayList<Integer>();
//        for (int i = 0; i < ls.size(); i++) {
//            char ch[] = ls.get(i).toCharArray();
//            int count = 0;
//
//            for (int j = 0; j < ch.length; j++) {
//                if (ch[j] == '1') {
//                    count++;
//                    if (count == k) {
//                        arr.add(i);
//                    }
//                }
//            }
//        }
//        int sum = 0;
//        System.out.println(arr);
//        for (int i = 0; i < arr.size(); i++) {
////            sum = sum + nums.get(arr.get(i)); // Use nums.get(arr.get(i)) to get the value from the original list
//            sum = sum + nums.get(arr.get(i));
//        }
//        return sum;
//    }
//}

package Other;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class IntegerToArray {

    public static void main(String[] args) {
        List<Integer> ls = Arrays.asList(5, 10, 1, 5, 2);
        System.out.println(sumIndicesWithKSetBits(ls, 1));
    }

    public static int sumIndicesWithKSetBits(List<Integer> nums, int k) {

        List<String> ls = new ArrayList<String>();
        for (int i = 0; i < nums.size(); i++) {
            ls.add(Integer.toBinaryString(i));
        }
        List<Integer> arr = new ArrayList<Integer>();
        for (int i = 0; i < ls.size(); i++) {
            char ch[] = ls.get(i).toCharArray();
            int count = 0;

            for (int j = 0; j < ch.length; j++) {
                if (ch[j] == '1') {
                    count++;
                }
            }
            if (count == k) {
                arr.add(i);
            }
        }
        int sum = 0;
        System.out.println(arr);
        for (int i = 0; i < arr.size(); i++) {
         sum = sum + nums.get((arr).get(i));
        }
        System.out.println();
        return sum;
    }
}
//package AlphaSense;
//
//public class StringSubArrayofArray {
//public static void main(String[] args) {
//	String str="abcd";
//	for(int i=0;i<str.length();i++) {
//		for(int j=i;j<str.length();j++) {
//			for(int k=i;k<=j;k++) {
//				System.out.print(str.charAt(k));
//			}
//			System.out.println();
//		}
//	}
//}
//
//}
package AlphaSense;

public class StringSubArrayofArray {
    public static void main(String[] args) {
        String str = "abcd";

        for (int start = 0; start < str.length(); start++) {
            for (int end = start; end < str.length(); end++) {
                String subArray = str.substring(start, end + 1);
                System.out.println(subArray);
            }
        }
    }
}

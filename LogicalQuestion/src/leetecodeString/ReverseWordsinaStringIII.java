//package leetecodeString;
//
//import java.util.Arrays;
//
//public class ReverseWordsinaStringIII {
//public static void main(String[] args) {
//	String s="Let's take LeetCode contest";
//	//Output: "s'teL ekat edoCteeL tsetnoc"
//
//	System.out.println(reverseWords(s));
//} 
//public static String reverseWords(String s) {
//	char ch[];
//		ch=s.toCharArray();
//		System.out.println(ch.length);
//		for(int i=ch.length-1;i>0;i--) {
//			System.out.print(ch[i]);
//		}
//		System.out.println(Arrays.toString(ch));;
//	return s;
//	}
//}
package leetecodeString;

import java.util.Arrays;

public class ReverseWordsinaStringIII {
    public static void main(String[] args) {
        String s = "Let's take LeetCode contest";
        System.out.println(reverseWords(s));
    }

    public static String reverseWords(String s) {
        String[] words = s.split(" ");
        StringBuilder result = new StringBuilder();

        for (String word : words) {
            char[] chars = word.toCharArray();
            for (int i = chars.length - 1; i >= 0; i--) {
                result.append(chars[i]);
            }
            result.append(" "); // Add a space between reversed words
        }

        // Remove the trailing space
        result.deleteCharAt(result.length() - 1);

        return result.toString();
    }
}

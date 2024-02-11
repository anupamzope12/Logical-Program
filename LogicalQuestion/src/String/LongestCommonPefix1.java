package String;

import java.util.Arrays;

//
//import java.util.Arrays;
//
//public class LongestCommonPefix1 {
//public static void main(String[] args) {
//	String[] input = {"geeksforgeeks", "geeks", "geek", "geezer" ,"geetanjaliadaf","anupam"};
//	int size =input.length;
//	System.out.println(size);
//	
//	if(size == 0) {
//		System.out.println("Empty array");
//	}
//	if(size==1) {
//		System.out.println("NA");
//	}
//	
//	Arrays.sort(input);
//	System.out.println(input.toString());
//	System.out.println(input);
//	
//	int end=Math.min(input[0].length(),input[size-1].length());
//	System.out.println(" END " + end);
//	
//	int i=0;
//	while(i<end && input[0].charAt(i)==input[size-1].charAt(i))
//		i++;
//	String pre=input[0].substring(0,i);
//	System.out.println(pre);
//}
//}
class LongestCommonPefix1 {
    public String longestCommonPrefix(String[] strs) {
        Arrays.sort(strs);
        int size=strs.length;
        int end =Math.min(strs[0].length(),strs[size-1].length());
        int i=0;
        String pre="";
        while(i<end && strs[0].charAt(i)==strs[size-1].charAt(i)){
            i++;
         pre=strs[0].substring(0,i);
        }
        return pre;
}
    public static void main(String[] args) {
  	String[] input = {"geeksforgeeks", "geeks", "geek", "geezer" ,"geetanjaliadaf",};
  		LongestCommonPefix1 l1=new LongestCommonPefix1();
  		System.out.println(l1.longestCommonPrefix(input));;
	}
}
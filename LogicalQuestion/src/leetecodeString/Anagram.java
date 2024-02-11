package leetecodeString;

import java.util.Arrays;

public class Anagram {
	public static void main(String[] args) {
		String s="anagram";
		String t="amranga";
		System.out.println(isAnagram(s, t));;
	}
	    public static boolean isAnagram(String s, String t) {
	        if(s.length()!=t.length()){
	        	return false;
	        }
	            char chs[]=s.toCharArray();
	            char []cht=t.toCharArray();
	            Arrays.sort(chs);
	            Arrays.sort(cht);
	            System.out.println( Arrays.toString(chs));;
	            System.out.println( Arrays.toString(cht));;
	            for(int i=0 ;i<chs.length ;i++){
	                if(chs[i]!=cht[i]){
	                    return false;
	                }
	            }

	        
			return true;
	    }
}
//package leetecodeString;
//
//import java.util.Arrays;
//
//public class Anagram {
//    public static void main(String[] args) {
//        String s = "cat";
//        String t = "acl";
//        System.out.println(isAnagram(s, t));
//    }
//
//    public static boolean isAnagram(String s, String t) {
//        if (s.length() != t.length()) {
//            return false; // Anagrams must have the same length.
//        }
//
//        char[] chs = s.toCharArray();
//        char[] cht = t.toCharArray();
//        Arrays.sort(chs);
//        Arrays.sort(cht);
//
//        // Compare sorted arrays to check if they are anagrams
//        for (int i = 0; i < chs.length; i++) {
//            if (chs[i] != cht[i]) {
//                return false; // Characters don't match, not anagrams.
//            }
//        }
//
//        return true; // All characters matched, they are anagrams.
//    }
//}

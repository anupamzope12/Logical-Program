//package leetecodeString;
//
//import java.util.ArrayList;
//import java.util.List;
//
//public class SortTheVowelInTheString {
//public static void main(String[] args) {
//	String s="lEetcOde";
//	System.out.println(sortVowels(s));
//	
//}
//	public static String sortVowels(String s) {
//		List<Character>ls =new ArrayList<>();
//		for(int i=0;i<s.length();i++) {
//			if(s.charAt(i)==isVowel(s.charAt(i))) {
//				ls.add(s.charAt(i));
//			}
//		}
//		System.out.println(ls);
//		System.out.println();
//		return s;
//	
//	}
//	private static char isVowel(char c) {
//				if (c == 'a' | c== 'e' | c== 'i' | c==  'o' | c== 'u') {
//					
//					
//				}
//		
//		// TODO Auto-generated method stub
//		return 0;
//	}
//}

//package leetecodeString;
//
//import java.util.ArrayList;
//import java.util.List;
//
//public class SortTheVowelInTheString {
//    public static void main(String[] args) {
//        String s = "lEetcOde";
//        System.out.println(sortVowels(s));
//    }
//
//    public static String sortVowels(String s) {
//        List<Character> ls = new ArrayList<>();
//        for (int i = 0; i < s.length(); i++) {
//            if (isVowel(s.charAt(i))) {
//                ls.add(s.charAt(i));
//            }
//        }
//        System.out.println(ls);
//        System.out.println();
//        return s;
//    }
//
//    private static boolean isVowel(char c) {
//        return (c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u');
//    }
//}

//package leetecodeString;
//
//import java.util.ArrayList;
//import java.util.List;
//
//public class SortTheVowelInTheString {
//    public static void main(String[] args) {
//        String s = "lEetcOde";
//        System.out.println(sortVowels(s));
//    }
//
//    public static String sortVowels(String s) {
//        List<Character> vowelsList = new ArrayList<>();
//        List<Character> consonantList = new ArrayList<>();
//
//        for (int i = 0; i < s.length(); i++) {
//            char currentChar = Character.toLowerCase(s.charAt(i));
//            if (isVowel(currentChar)) {
//            	vowelsList.add(s.charAt(i));
//            }
//            else {
//            	consonantList.add(s.charAt(i));
//            }
//        }
//        
//        System.out.println(vowelsList);
//        System.out.println(consonantList);
//        return s;
//    }
//
//    private static boolean isVowel(char c) {
//        return (c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u');
//    }
//}
//package leetecodeString;
//
//import java.util.ArrayList;
//import java.util.Collections;
//import java.util.List;
//
//public class SortTheVowelInTheString {
//    public static void main(String[] args) {
//        String s = "lEetcOde";
//        System.out.println(sortVowels(s));
//    }
//
//    public static String sortVowels(String s) {
//        List<Character> vowelsList = new ArrayList<>();
//        List<Character> consonantList = new ArrayList<>();
//
//        for (int i = 0; i < s.length(); i++) {
//            char currentChar = Character.toLowerCase(s.charAt(i));
//            if (isVowel(currentChar)) {
//                vowelsList.add(s.charAt(i));
//            } else {
//                consonantList.add(s.charAt(i));
//            }
//        }
//
//        // Sort the vowels in ascending order
//        Collections.sort(vowelsList);
//        StringBuffer sb=new StringBuffer();
//        System.out.println(vowelsList);
//        for(int i=0;i<s.length();i++){
//        	char currentChar=Character.toLowerCase(s.charAt(i));
//        	if(isVowel(currentChar)) {
//        		sb.append(vowelsList.indexOf(i));
//        	}else {
//        		sb.append(consonantList.indexOf(i));
//        	}
//       }
//        System.out.println(sb.toString());
//
//        return s;
//    }
//
//    private static boolean isVowel(char c) {
//        return (c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u');
//    }
//}

package leetecodeString;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class SortTheVowelInTheString {
    public static void main(String[] args) {
        String s = "lEetcOde";
        System.out.println(sortVowels(s));
    }

    public static String sortVowels(String s) {
        List<Character> vowelsList = new ArrayList<>();
        List<Character> consonantList = new ArrayList<>();

        for (int i = 0; i < s.length(); i++) {
            char currentChar = Character.toLowerCase(s.charAt(i));
            if (isVowel(currentChar)) {
                vowelsList.add(s.charAt(i));
            } else {
                consonantList.add(s.charAt(i));
            }
        }

        // Sort the vowels in ascending order
        Collections.sort(vowelsList);

        // Construct the final string with sorted vowels and original consonants
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < s.length(); i++) {
            char currentChar = Character.toLowerCase(s.charAt(i));
            if (isVowel(currentChar)) {
                sb.append(vowelsList.remove(0)); // Append the first vowel and remove it from the list
            } else {
                sb.append(consonantList.get(0)); // Append the next consonant
                consonantList.remove(0); // Remove the appended consonant from the list
            }
        }
        System.out.println("S " + s);
        System.out.println("sb " + sb.toString());
        return sb.toString();
 }

    private static boolean isVowel(char c) {
        return (c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u');
    }
}

package leetecodeInteger;

import java.util.HashSet;

public class MaximumNumberOfStringPairs {
    public static void main(String[] args) {

        String[] words = {"cd", "ac", "dc", "ca", "zz"};

        int result = countStringPairs(words);
        
        System.out.println("Maximum number of pairs: " + result);
    }

    public static int countStringPairs(String[] words) {
        int count = 0;
        HashSet<String> seen = new HashSet<>();

        for (String word : words) {
        	System.out.println("word "+ word);
        	StringBuilder sb=new StringBuilder(word);
        	System.out.println("sb	" +sb);
            String reversedWord = sb.reverse().toString();
            System.out.println("reverseWord "+ reversedWord);
            if (seen.contains(reversedWord)) {
                count++;
                seen.remove(reversedWord); // Remove the pair to avoid counting it twice
            } else {
                seen.add(word);
            }
        }

        return count;
    }

    }

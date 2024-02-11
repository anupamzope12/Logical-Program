package leetecodeString;

import java.util.Arrays;

public class Sorting_The_Sentence {
    public static void main(String[] args) {
        String s = "is2 sentence4 This1 a3";
        Sorting_The_Sentence sorter = new Sorting_The_Sentence();
        System.out.println(sorter.sortSentence(s));
    }

    public String sortSentence(String s) {
        String[] words = s.split(" ");
        System.out.println(Arrays.toString(words));;
        String[] sortedWords = new String[words.length];

        for (String word : words) {
            int position = Character.getNumericValue(word.charAt(word.length() - 1)) - 1;
            System.out.println(position);
            sortedWords[position] = word.substring(0, word.length() - 1);
        }
        return String.join(" ", sortedWords);
    }
}

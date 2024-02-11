package leetecodeInteger;

public class Reverse_prefix_of_word {
    public static void main(String[] args) {
        System.out.println(reversePrefix("abcdefd", 'd'));
    }

    public static String reversePrefix(String word, char ch) {
        String newWord = "";
        int index = -1;
        
        // Find the index of the specified character
        for (int i = 0; i < word.length(); i++) {
            if (word.charAt(i) == ch) {
                index = i;
                break;
            }
        }
        
        if (index != -1) {
            // Reverse the prefix
            for (int j = index; j >= 0; j--) {
                newWord = newWord + word.charAt(j);
            }
            
            System.out.println("Reverse part: " + newWord);

            // Get the remaining part of the word using substring
            String newWord1 = word.substring(index + 1);
            newWord=newWord+newWord1;
        } else {
        	return word;
        }

        return newWord;
    }
}


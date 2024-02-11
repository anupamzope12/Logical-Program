package Other;

public class reverseVowlesfromstring {
    public static void main(String[] args) {
        String str = "gadhanoone";
        char[] charArray = str.toCharArray();
        
        int left = 0;
        int right = str.length() - 1;
        
        while (left < right) {
            while (left < right && !isVowel(charArray[left])) {
                left++;
            }
            while (left < right && !isVowel(charArray[right])) {
                right--;
            }
            
            // Swap the vowels
            char temp = charArray[left];
            charArray[left] = charArray[right];
            charArray[right] = temp;
            
            left++;
            right--;
        }
        
        // Convert the character array back to a string
        String reversedString = new String(charArray);
        System.out.println(reversedString);
    }
    
    // Helper function to check if a character is a vowel
    private static boolean isVowel(char c) {
        c = Character.toLowerCase(c);
        return c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u';
    }
}

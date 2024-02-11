package String;

public class LowerToUpperConversion {
    public static void main(String[] args) {
        String lowercase = "hello world";
        String uppercase = convertToLowerToUpper(lowercase);
        System.out.println("Original lowercase string: " + lowercase);
        System.out.println("Converted uppercase string: " + uppercase);
    }

    public static String convertToLowerToUpper(String lowercase) {
        char[] chars = lowercase.toCharArray();
        for (int i = 0; i < chars.length; i++) {
            if (chars[i] >= 'a' && chars[i] <= 'z') 
            {
                chars[i] = (char) (chars[i] - 'a' + 'A');
            }
        }
        return new String(chars);
    }
}
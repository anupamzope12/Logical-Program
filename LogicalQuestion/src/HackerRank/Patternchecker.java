package HackerRank;

import java.util.Scanner;
import java.util.regex.Pattern;
import java.util.regex.PatternSyntaxException;

public class Patternchecker {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the integer");
        int numTestCases = scanner.nextInt();
//        scanner.nextLine(); // Consume the newline character after reading the integer

        for (int i = 0; i < numTestCases; i++) {
            String patternString = scanner.nextLine();
            if (isValidRegex(patternString)) {
                System.out.println("Valid");
            } else {
                System.out.println("Invalid");
            }
        }

        scanner.close();
    }

    public static boolean isValidRegex(String patternString) {
        try {
            Pattern.compile(patternString);
            return true; // No exception, so the pattern is valid
        } catch (PatternSyntaxException e) {
            return false; // Pattern syntax is invalid
        }
    }
}
public class LuckyNumber {
    public static boolean isLuckyNumber(int number) {
        while (number > 0) {
            int digit = number % 10;
            if (digit != 4 && digit != 7) {
                return false; // If a digit is not 4 or 7, it's not a lucky number
            }
            number /= 10;
        }
        return true;
    }

    public static void main(String[] args) {
        int number = 474;
        
        if (isLuckyNumber(number) && (number % 4 == 0 || number % 7 == 0)) {
            System.out.println("YES");
        } else {
            System.out.println("NO");
        }
    }
}

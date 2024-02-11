//package TCS_NQT;
//
//import java.util.Scanner;
//
//	public class FindHighestProduct {
//	    public static void main(String[] args) {
//	        Scanner scanner = new Scanner(System.in);
//
//	        System.out.print("Enter a number N: ");
//	        int N = scanner.nextInt();
//
//	        int result = highestProduct(N);
//	        System.out.println("Highest product for N=" + N + ": " + result);
//	    }
//
//	    private static int highestProduct(int N) {
//	        if (N <= 1) {
//	            // For N less than or equal to 1, the highest product is the number itself
//	            return N;
//	        }
//
//	        // Initialize the result to 1
//	        int result = 1;
//
//	        // Keep dividing N by 3 until it becomes less than or equal to 4
//	        while (N >0) {
//	        	System.out.println("N " + N);
//	            result *= 3;
//	            System.out.println("result " +result);
//	            N -= 3;
//	        }
//	        System.out.println("reamaining N " +N+ "  result so far "+ result   );
//
//	        // Multiply the remaining N to the result
//	        result *= N;
//
//	        return result;
//	 }
//}
package TCS_NQT;

import java.util.Scanner;

public class FindHighestProduct {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a number N: ");
        int N = scanner.nextInt();

        int result = highestProduct(N);
        System.out.println("Highest product for N=" + N + ": " + result);
    }

    private static int highestProduct(int N) {
        if (N <= 1) {
            return N;
        }

        int result = 1;
        // Check if remaining N can be further divided into 3s
        while (N >3) {
        	System.out.println("N "+N);
            result *= 3;
            System.out.println("Result " +result);
            N -= 3;
            System.out.println("N after reduction "+N);
        }
        	result *=3;
        // Handle edge cases for remaining N
       
            result *= N;
        

        return result;
    }
}

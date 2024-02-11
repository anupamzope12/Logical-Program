package BajajFinser;


	import java.util.Arrays;

	public class st {
	    public static void main(String[] args) {

	        String str = "abscdaca";

	        char[] ch = str.toCharArray();

	        int mid = str.length() / 2;

	        char[] leftArray = new char[mid];
	        char[] rightArray = new char[str.length() - mid];

	        for (int i = 0; i < mid; i++) {
	            leftArray[i] = ch[i];
	        }

	        for (int i = mid; i < str.length(); i++) {
	            rightArray[i - mid] = ch[i];
	        }

	        char[] concatArray = new char[leftArray.length + rightArray.length];

	        for (int i = 0; i < rightArray.length; i++) {
	            concatArray[i] = rightArray[i];
	        }

	        for (int i = 0; i < leftArray.length; i++) {
	            concatArray[rightArray.length + i] = leftArray[i];
	        }

	        System.out.println("Concat Array Before Removing Duplicates:");
	        System.out.println(Arrays.toString(concatArray));

	        // Create a new array to store the result without characters that occur more than twice
	        char[] resultArray = new char[concatArray.length];
	        int resultLength = 0;

	        for (int i = 0; i < concatArray.length; i++) {
	            char currentChar = concatArray[i];
	            int count = 0;
	            // Count occurrences of the current character in concatArray
	            for (int j = 0; j < concatArray.length; j++) {
	                if (concatArray[j] == currentChar) {
	                    count++;
	                }
	            }
	            // If the character occurs less than or equal to 2 times, add it to the result
	            if (count <= 2) {
	                resultArray[resultLength++] = currentChar;
	            }
	        }
	        // Create a new array with the appropriate size for the result
	        char[] finalResult = Arrays.copyOf(resultArray, resultLength);
	        System.out.println("Concat Array After Removing Duplicates:");
	        System.out.println(Arrays.toString(finalResult));
	    }
	}
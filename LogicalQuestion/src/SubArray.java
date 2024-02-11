// Java program to find substring with equal
// number of 0's, 1's and 2's

import java.util.*;

public class SubArray {

	// Method to count number of substring which
	// has equal 0, 1 and 2
	static long getSubstringWithEqual012(String s)
	{

		ArrayList<String> arr = new ArrayList<>();
		int n = s.length();
		// generating subarrays
		for (int i = 0; i < n; i++) {
			for (int j = i; j < n; j++) {
				String s1 = "";
				for (int k = i; k <= j; k++) {
					s1 += s.charAt(k);
					System.out.print(s.charAt(k)+" ");
				}
				System.out.println();
				arr.add(s1);
				
			}
		}
		int count = 0;
		int countZero, countOnes, countTwo;
		// iterating over array of all substrings
		for (int i = 0; i < arr.size(); i++) {
			countZero = 0;
			countOnes = 0;
			countTwo = 0;
			String curs = arr.get(i);
			for (int j = 0; j < curs.length(); j++) {
				if (curs.charAt(j) == '0')
					countZero++;
				if (curs.charAt(j) == '1')
					countOnes++;
				if (curs.charAt(j) == '2')
					countTwo++;
			}
			// if number of ones,two and zero are equal in a
			// substring
			if (countZero == countOnes
				&& countOnes == countTwo) {
				count++;
			}
		}

		return count;
	}
	// Driver's code
	public static void main(String[] args)
	{
		String str = "0102010";
		System.out.println(getSubstringWithEqual012(str));
	}
}

// This code is contributed by Karandeep1234


//public class SubArray {
//    public static void main(String[] args) {
//        int arr[] = {12, 32, 56, 879};
//        int n = arr.length;
//
//        for (int start = 0; start < n; start++) {
//            for (int end = start; end < n; end++) {
//                for (int i = start; i <= end; i++) {
//                    System.out.print(arr[i]);
//                    if (i < end) {
//                        System.out.print(", ");
//                    }
//                }
//                System.out.println();
//            }
//        }
//    }
//}
//
//

package GFG;

// Java code to implement the approach

import java.io.*;

class MiniDistBetw {
	
// Function to return shortest distance
static int shortestDistance(String[] s,String word1, String word2)
{
	int d1 = -2, d2 = -2;
	int ans = Integer.MAX_VALUE;
	System.out.println(ans);
	// Traverse the string
	for (int i = 0; i < s.length; i++) {
		if (s[i] == word1)
			d1 = i;
		if (s[i] == word2)
			d2 = i;
		if (d1 != -2 && d2 != -1) {
			System.out.println(ans);
		System.out.println(Math.abs(d1 - d2));
			ans = Math.min(ans, Math.abs(d1 - d2));
			System.out.println(ans);
			System.out.println(Math.abs(d1 - d2));}
	}
	// Return the answer
	return ans;
}

// Driver Code
	public static void main (String[] args) {
		String[] S
		= { "the", "quick", "brown", "fox", "quick" };

	String word1 = "the", word2 = "brown";

	// Function Call
	System.out.println(shortestDistance(S, word1, word2));
	}
}
// This code is contributed by Pushpesh Raj.
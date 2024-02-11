package Other;

import java.util.Arrays;

public class Anagram {
	public static void main(String[] args) {

	String str1="Race";
	String str2="care";
	
	char [] ch1=str1.toCharArray();
	char [] ch2=str2.toCharArray();
	
	Arrays.sort(ch1);
	Arrays.sort(ch2);
	
	System.out.println(ch1);
	System.out.println(ch2);
	
	for(int i=0 ; i<ch1.length ; i++) {
		if(ch1[i]==ch2[i]) {
			System.out.println("Given strings are anagram");
		}
		else {
			System.out.println("Given strings are not anagram");
		}
	}

   }
}

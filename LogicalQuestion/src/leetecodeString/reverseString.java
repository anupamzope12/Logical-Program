package leetecodeString;

import java.util.Arrays;

public class reverseString {
	public static void main(String[] args) {
		char ch[]= {'h','e','l','l','o'};
//		reverseString(ch);
		reverseString.reverseString(ch);
	}
	public static void reverseString(char [] s) {
		char []ch = new char[s.length];
		for(int i=s.length-1,j=0;i>=0;i--,j++) {
			ch[j]=s[i];
		}
		System.out.println(Arrays.toString(ch));
	}

}

package String;

import java.util.Arrays;

public class printOddCharacter1 {
	public static char oddCharacter(String s,String t) {
		char [] ch1=s.toCharArray();
		char [] ch2=t.toCharArray();
		
		Arrays.sort(ch1);
		Arrays.sort(ch2);
		
		for(int i=0 ;i<ch1.length ;i++) {
			if(ch1[i] != ch2[i]) {
				return ch2[i];
			}
			
		}
		return ch2[ch2.length-1];
		
	}
	public static void main(String[] args) {
		String s="anupam";
		String t="anupaml";
		char ch=oddCharacter(s, t);
		System.out.println(ch);
	}
}

package String;

import java.util.Arrays;

public class printOddCharacter {
	public static void main(String[] args) {
		String s="ganesh";
		String t="ganzesh";
		
		char [] ch1=s.toCharArray();
		char [] ch2=t.toCharArray();
		
		Arrays.sort(ch1);
		System.out.println(ch1);
		Arrays.sort(ch2);
		System.out.println(ch2);
		
		for(int i=0 ;i<ch2.length-1;i++)
		{
			if(ch1[i] != ch2[i]) {
				System.out.println(ch2[i]);
			}
		}
		System.out.println(ch2[ch2.length-1]);

	}	
}	

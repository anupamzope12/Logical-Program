package Important;

import java.util.Arrays;

public class Anagram {
public static void main(String[] args) {
	String str1="virendra";
	String str2="arviendr";
	boolean anagram=checkanangram(str1, str2);
	System.out.println(anagram);
}

public static boolean checkanangram(String str1,String str2)
  {
	if(str1.length()!=str2.length()) {
		return false;
	}
	
	char []ch1=str1.toCharArray();
	char []ch2=str2.toCharArray();
	Arrays.sort(ch1);
	Arrays.sort(ch2);

	for(int i=0;i<ch1.length;i++) {
		if(ch1[i]!=ch2[i]) {
			return false;
		}
	}
	return true;
  }
}
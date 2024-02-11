package String;
import java.util.Arrays;
public class Anagram {
	
	public static void main(String[] args) {
	
	String str1="listen";
	String str2="silent";
	
	boolean isAnagram=checkAnagram(str1,str2);
	if (isAnagram) {
        System.out.println("Anagrams");
    } else {
        System.out.println("Not Anagrams");
    }
  }
	public static boolean checkAnagram(String str1 , String str2) {
		char [] ch1=str1.toCharArray();
		char [] ch2=str2.toCharArray();	
		if(ch1.length !=ch2.length )
		{
			System.out.println("Not anagram");
		}

		Arrays.sort(ch1);
		Arrays.sort(ch2);
	
		for(int i=0 ;i<ch1.length ;i++)
		{
			if(ch1[i] != ch2[i]) {
				return false;
			}	
		
		}
		return true;
		
	}
}
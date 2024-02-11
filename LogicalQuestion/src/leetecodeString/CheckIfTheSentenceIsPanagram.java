package leetecodeString;

import java.util.HashSet;

public class CheckIfTheSentenceIsPanagram {
	public static void main(String[] args) {
		String sentence = "thequickbrownfoxjumpsoverthelazydog";
		System.out.println(checkIfPangram(sentence));;

	}
    public static boolean checkIfPangram(String sentence) {
        HashSet<Character>hs=new HashSet<>();
        char ch[]=sentence.toCharArray();
        for(char s:ch) {
        hs.add(s);
        }
        if(hs.size()==26) {
        	return true;
        }		return false;

//        hs.size()=="26";
    }
}

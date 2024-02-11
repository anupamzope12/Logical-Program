package leetecodeString;

import java.util.ArrayList;
import java.util.List;

public class MaximumNumberOfWordsFoundInSentence {
public static void main(String[] args) {
	String []sentence={"alice and bob love leetcode", "i think so too", "this is great thanks very much"};
	List<String> ls=new ArrayList<String>();

	for(int i=0;i<sentence.length;i++) {
		System.out.println(sentence[i]);
		ls.add(sentence[i]);
		for(int j=0;j<ls.size();j++) {
//			System.out.println(ls[j]);
		}
		
		}
	System.out.println(ls);
//		char [] ch=sentence[i].toCharArray();
//		System.out.println(Arrays.toString(ch));
	}
}
package GFGString;

import java.util.HashMap;
import java.util.Map;

public class Panagram {
	public static void main(String[] args) {
		String str="The quick brown fox jumps over the lazy dog";
//	System.out.println(checkPanagram(str));
		checkPanagram(str);
	}
	
	public static int checkPanagram(String str) {
		Map<Character,Integer> map=new HashMap<>();
		str=str.toLowerCase().trim();
//		System.out.println(str.trim());
		System.out.println(str=str.replaceAll("\\s",""));
		char [] ch=str.toCharArray();
		int count=1;
		for(int i=0 ; i<ch.length ;i++) {
			if(Character.isLetter(ch[i]))
			{
			map.put(ch[i], count);
			}
//			map.putIfAbsent(ch[i],count);
		}
		System.out.println(map);
		//count++;
		System.out.println(map.size());
		if(map.size()==26) {
			System.out.println("string is panagram");
		}
		else {
			System.out.println("String is not panagram");
		}
		return 1;
		
	}

}

package String;

import java.util.HashMap;

public class ocuurance {
	public static void main(String[] args) {
	String str="hello world";
	
	HashMap<Character,Integer> hashmap=new HashMap<>();
	
//	char []ch=str.toCharArray();
	
	for(int i=0; i<str.length() ;i++) {
		char ch=str.charAt(i);
		if(hashmap.containsKey(ch)) {
			int count=hashmap.get(ch);
			count ++;
			hashmap.replace(ch, count);
		}else {
			hashmap.put(ch, 1);
		}
		
		
	}
	
}	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
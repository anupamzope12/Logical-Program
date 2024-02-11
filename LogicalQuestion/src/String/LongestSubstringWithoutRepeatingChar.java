package String;

import java.util.LinkedHashMap;
import java.util.Map;

public class LongestSubstringWithoutRepeatingChar {
	public static void main(String[] args) {
		legthOfLongestSubString("anupamzope");
	}
	
	public static void legthOfLongestSubString(String s) {
		String longestSubstring =null;
		int longestSubstringLenght=0;
		
		Map<Character,Integer>map=new LinkedHashMap<>();
		
		char []arr=s.toCharArray();
		for(int i=0 ;i<arr.length ;i++) {
			char ch=arr[i];
			if(!map.containsKey(ch)) {
				map.put(ch, i);
				
			}
			else {
				i=map.get(ch);
//				map.clear();
			}
		}
		System.out.println(map);
		
	}
}

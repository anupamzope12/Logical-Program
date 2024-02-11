package String;

import java.util.HashMap;
import java.util.Map;

public class OcuuranceOfEachString {
	public static void main(String[] args) {
		
	String str="anupam";
	Map<Character,Integer>map=new HashMap();
	
	char[]ch=str.toCharArray();
	for(char chs:ch)
	{
		if(!map.containsKey(chs)) {
			map.put(chs, 1);
		}
		else {
			int cnt=map.get(chs);
			map.put(chs, cnt+1);
		}
	}
	System.out.println(map);
	}
}

package leetecodeInteger;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class CountNumberofOccurance {
	public static void main(String[] args) {
		List <Integer> ls=List.of(54,12,32,54,78,4589,12,32,56,54);
		Map<Integer,Integer> occuranceMap1=countOccurrences(ls);
		for(Map.Entry<Integer,Integer> entry :occuranceMap1.entrySet()) {
			int element=entry.getKey();
			int count=entry.getValue();
			System.out.println("Element : " + element + " ,Occurances: " + count);
		}
	}

	public static Map<Integer,Integer> countOccurrences(List<Integer>list){
		Map<Integer,Integer> occuranceMap=new HashMap<Integer, Integer>();
		for(int num:list) {
			occuranceMap.put(num, occuranceMap.getOrDefault(num,0 )+1);
		}
		return occuranceMap;	
	}
}
package leetecodeInteger;

import java.util.HashMap;

public class ContainsDuplicate_I {
public static void main(String[] args) {
	int arr[]= {4,2,3,4};
	ContainsDuplicate_I cd=new ContainsDuplicate_I();
	System.out.println(cd.containsKey(arr));;
	
	
}
	public boolean containsKey(int [] nums) {
		HashMap <Integer,Integer> hs=new HashMap<>();	
		for(int num:nums) {
			hs.put(num, hs.getOrDefault(num, 0)+1);
		}
		for(int nu:hs.keySet()) {
			if(hs.get(nu)>1) {
				return true;
			}
		}
		return false;
	}
}

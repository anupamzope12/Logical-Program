package GFG;

import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;

public class UnionIntersectionofTwoSortedArray {
	public static void main(String[] args) {
		int []arr1= {10,20,30,40,50,60,110};
		int []arr2= {10,70,80,40,50,90,100,20};
		
		int newarr[]=new int[arr1.length+arr2.length];
		for(int i=0 ;i<arr1.length;i++) {
			newarr[i]=arr1[i];
		}
		for(int i=0 ;i<arr2.length;i++) {
			newarr[arr1.length+i]=arr2[i];
		}
		
		System.out.println(Arrays.toString(newarr));;
		System.out.println("=======HashSet========");
		HashSet<Integer>hs=new HashSet<>();
		for(int i=0 ;i<newarr.length;i++) {
			hs.add(newarr[i]);
		}
		System.out.println(hs);
		
		char count='A';
		System.out.println("=============HashMap==============");
		HashMap<Integer,Character>hsmap=new HashMap<>();
		for(int i=0 ;i<newarr.length;i++) {
			hsmap.putIfAbsent(newarr[i],count);
			count++;
		}
		System.out.println(hsmap);

		HashSet<Integer>hs1=new HashSet<>();
		for(int i=0 ;i<arr1.length;i++) {
			hs1.add(arr1[i]);
		}
		System.out.println(hs1);

		System.out.println("Intersection of two arrays : ");
		for(int i=0 ;i<arr2.length;i++) {
			if(hs1.contains(arr2[i])) {
				System.out.print(arr2[i]+ " ");
			}
	}
  }
}
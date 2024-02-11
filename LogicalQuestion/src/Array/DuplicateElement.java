package Array;

import java.util.HashSet;
import java.util.Set;

public class DuplicateElement {
	public static void main(String[] args) {
	
	int arr[]= {1,6,1,7,8,6,5};
	
	Set<Integer>uniqueNumber = new HashSet<>();
//	boolean isDuplicateExists=false;
	
	for(int i=0 ; i<arr.length ; i++)
	{
		if(uniqueNumber.contains(arr[i])) {
//			isDuplicateExists =true;
			System.out.println("Duplicate Element " + arr[i]);
		}
		else {
			uniqueNumber.add(arr[i]);	
		}
	}
//	if(!isDuplicateExists) {
//		System.out.println(-1);
//	}
	}
}
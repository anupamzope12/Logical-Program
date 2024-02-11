package GFG;

import java.util.HashSet;

public class Find1stCommon1 {
	public static void commonElement(int arr[]) {
		int min=-1;
		HashSet <Integer> hs=new HashSet<>();
//		for(int i=0 ;i<arr.length;i++) {
		for(int i=arr.length-1 ; i>0 ;i--) {
			if(hs.contains(arr[i]))
			{
				min=i;
			}
			else {
				hs.add(arr[i]);
			}
		}
			if(min != -1) {	
				System.out.println("1st common element found at " + arr[min]);
			}else {
				System.out.println("No element found");
			}
		
		}
	public static void main(String[] args) {
		int arr[]= {10,20,30,40,50,40,50,30,80};
		commonElement(arr);
		
	}
}

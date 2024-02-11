package String;

import java.util.Arrays;

public class SortStringCharacters {
	
	public static void main(String[] args) {
	String str="softwareengineering";
//	String str="AnuPam";
	char []arr=str.toCharArray();
	char temp;
	
	for(int i=0 ; i<arr.length ; i++ )
	{
		for(int j=i+1 ; j<arr.length ; j++) {
			if(arr[i]>arr[j]) {
				temp=arr[i];
				arr[i]=arr[j];
				arr[j]=temp;
			}
		}
		System.out.print(arr[i] + " ");
	}
	
	System.out.println();
	//Approach-2
	String str1="AnuPam";
	char[] charArray = str1.toCharArray();
	Arrays.sort(charArray);
	System.out.println(charArray);	

	}
}
package BajajFinser;

import java.util.Arrays;

public class StringArray {
	public static void main(String[] args) {
		
	String str="abscdaca";
	
	char []ch=str.toCharArray();
	
	int mid=str.length()/2;
	
	
	char[] leftArray=new char [mid];
	char[] rightArray=new char [str.length()-mid];
	
	for(int i=0 ;i<ch.length ; i++) {
		System.out.print(ch[i] + " ");
	}

	
	for(int i=mid ;i<str.length() ;i++) {
		rightArray[i-mid]=ch[i];
	}
	System.out.println();
	System.out.println("Left Array");
	for(int i=0 ;i<leftArray.length ;i++) {
		System.out.print(leftArray[i]+" ");	
	}
	System.out.println();
	System.out.println(Arrays.toString(leftArray));
	System.out.println();
	System.out.println("right Array");
	for(int i=0 ;i<rightArray.length ;i++) {
		System.out.print(rightArray[i]+" ");	
	}
	System.out.println();

	System.out.println(Arrays.toString(rightArray));
	
	char [] concatArray=new char[leftArray.length+rightArray.length];
	
	for(int i=0 ; i<rightArray.length ;i++) {
		concatArray[i]=rightArray[i];
	}
	
	for(int i=0 ;i<leftArray.length ;i++) {
		concatArray[rightArray.length+i]=leftArray[i];
	}
	System.out.println();
	System.out.println("Concat Array");
	for(int i=0 ;i<concatArray.length ;i++) {
		System.out.print(concatArray[i] + " ");
	}
	System.out.println();

	System.out.println(Arrays.toString(concatArray));
	
	char[] resultArray=new char[concatArray.length];
	int resultLength=0;
	for(int i=0;i<concatArray.length;i++) {
		char currentchar=concatArray[i];
		int count=0;
		for(int j=0 ; j<concatArray.length;j++) {
			if(concatArray[j]==currentchar) {
				count++;
			}
		}
		if(count <=2) {
			resultArray[resultLength++]=currentchar;
		}
	}
	char [] finalResult =Arrays.copyOf(resultArray, resultLength);
	System.out.println("Concat Array After Removing Duplicates : ");
	System.out.println(Arrays.toString(finalResult));
	}
}
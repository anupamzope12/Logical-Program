package Array;
import java.util.Arrays;
public class RemoveElementFromArray {
	public static void main(String[] args) {
	int []arr= {1,2,3,4,5};
	
	int elementToRemove=2;
	int []newarray=remove(arr, elementToRemove);
	System.out.println("Original array"+arr.toString() + Arrays.toString(arr));
	System.out.println("Duplicate array"+newarray.toString() + Arrays.toString(newarray));
	}
	
	public static int[] remove(int[]arr , int element) 
	{
		int newarry[]=new int[arr.length-1];
		int index=0;
		for(int i=0 ; i<arr.length ; i++) 
		{
			if(arr[i]!=element)
			{
				newarry[index]=arr[i];
				index++;
			}
		}
		return newarry;
	}
}
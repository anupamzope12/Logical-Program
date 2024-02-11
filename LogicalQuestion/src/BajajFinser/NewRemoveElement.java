package BajajFinser;
import java.util.Arrays;

public class NewRemoveElement {
	public static void main(String[] args) {
		
		int [] arr= {1,2,1,2,5,1,54,5,1};
		
		int mid=arr.length/2;
		System.out.println(mid);
			
		int [] leftArray=new int [mid];
		int [] rightArray=new int [arr.length-mid];
		
		//save the value in leftArray
		for(int i=0 ; i<leftArray.length;i++) {
			leftArray[i]=arr[i];
		}
		System.out.print("Left Array" + Arrays.toString(leftArray));
		
		//save the value in rightArray
		for(int i=mid ; i<arr.length;i++) {
			rightArray[i-mid]=arr[i];
		}
		System.out.println();
		System.out.print("Right Array" + Arrays.toString(rightArray));
		
		int [] concatArray=new int [leftArray.length+rightArray.length];
		
		for(int i=0;i<rightArray.length;i++) {
			concatArray[i]=rightArray[i];
		}
		for(int i=0 ;i<leftArray.length ;i++) {
			concatArray[rightArray.length+i]=leftArray[i];
		}
		System.out.println();
		System.out.println("Concat Array" +Arrays.toString(concatArray));
		
		int [] resultArray=new int[concatArray.length];
		int resultLength=0;
		for(int i=0 ; i<concatArray.length ;i++) {
			int currentInt=concatArray[i];
			int count=0;
			for(int j=0 ; j<concatArray.length ;j++)
			{
				if(concatArray[j]==currentInt) {
					count++;
				}
			}
			if(count <=2) {
				resultArray[resultLength++]=currentInt;
			}
		}

		int [] finalResult = Arrays.copyOf(resultArray, resultLength);
		System.out.println("Concat Array After removing Duplicate :");
		System.out.println(Arrays.toString(finalResult));		
	}
}
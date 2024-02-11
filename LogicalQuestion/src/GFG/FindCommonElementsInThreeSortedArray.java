package GFG;

public class FindCommonElementsInThreeSortedArray {
	public static void main(String[] args) {
		int [] arr1 = {10,20,30,40,50,60,90,100,110};
		int [] arr2 = {10,20,40,90,100,154};
		int [] arr3 = {10,20,40,50,90,100,122,133,144};
		System.out.println("SSSSSSSSSSS");
		
		int i=0 , j=0 , k=0;
		while(i<arr1.length && j<arr2.length && k<arr3.length) {
			if(arr1[i]==arr2[j] && arr2[j]==arr3[k] )
			{
				System.out.println(arr1[i] + " " );
				i++;
				j++;
				k++;
			}
			else if(arr1[i]<arr2[j]){
				i++;
			}
			else if(arr2[j]<arr3[k]) {
				j++;
			}
			else {
				k++;
			}
		}
	}
}

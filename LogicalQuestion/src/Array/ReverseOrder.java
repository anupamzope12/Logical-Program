package Array;

public class ReverseOrder {
public static void main(String[] args) {
	
	int [] arr= {56,88,45,12,32,19};
	
	System.out.println("Original array");
	for(int i=0;i<arr.length ;i++) {
		
		System.out.print(arr[i] + " ");
	}
	
	System.out.println();
	
	System.out.println("Reverse array");
	for(int i=arr.length-1; i>=0 ; i--)
	{
		System.out.print(arr[i] +" ");
	}	
}
}

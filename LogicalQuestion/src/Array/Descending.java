package Array;

public class Descending {
	public static void main(String[] args) {
		
		int arr[]= {45,98,4,312,55,23,41};
		
		System.out.println("Array before order");
		
		for(int i=0 ; i<arr.length ; i++) {
			System.out.println(arr[i]);
		}
		
		System.out.println("Array after sort");
		for(int i=0 ; i<arr.length ; i++)
		{
			for(int j=i+1 ; j<arr.length ; j++) {
				if(arr[i]<arr[j]) {
				int temp=arr[i];
				arr[i]=arr[j];
				arr[j]=temp;
				}
			}
		}
		
		System.out.println("Array after order");
		
		for(int i=0 ; i<arr.length; i++) {
			System.out.print(arr[i]+ " ");
		}
		
	}
}

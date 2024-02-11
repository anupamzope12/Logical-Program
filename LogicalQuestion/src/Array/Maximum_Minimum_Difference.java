package Array;

public class Maximum_Minimum_Difference {
	public static void main(String[] args) {
		int [] arr= {10,50,60,48,97,52,45,53};
		int smallest=arr[0];
		int largest=arr[0];
		
		for(int i=0 ;i<arr.length ; i++) {
			if(arr[i]<smallest)
			{
				smallest=arr[i];
			}
			else {
				largest= arr[i];
			}
		}
		System.out.println("Largest " + largest);
		System.out.println("Smallest " + smallest);
		
		int max_difference=largest-smallest;
		System.out.println("Maximum difference " + max_difference);
		
		
	}

}

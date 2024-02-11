package Array;

public class DuplicateEle {
	public static void main(String[] args) {
		
	
	int [] arr= {10,5,8,23,56,41,22,55,23,10,5,8,};
	
	for(int i=0 ; i<arr.length ; i++)
	{
		for(int j=i+1 ; j<arr.length ; j++)
		{
			if(arr[i]==arr[j]) {
				System.out.println(arr[j]);
			}
		}
	}
	
	}
}
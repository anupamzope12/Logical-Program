package GFG;

public class Find1stCommon {
	
public static void main(String[] args) {
	
	int arr[]= {10,12,02,50,98,12,02,50,24};
	int n =arr.length;
	int index=commonElement(arr, n);
	if(index==-1) {
		System.out.println("no element found");
	}
	else {
		System.out.println("First common Elelemt is " + arr[index]);
	}	
}

	public static int commonElement(int arr[],int n)
	{
		for(int i=0 ;i<n ; i++)
		{
			for(int j=i+1 ;j<n ;j++) {
				if(arr[i]==arr[j]) {
					return i;
				}
			}
		}
		return -1;
	}
}
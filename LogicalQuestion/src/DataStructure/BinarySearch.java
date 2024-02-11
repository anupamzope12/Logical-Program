package DataStructure;

public class BinarySearch {
	public static void main(String[] args) {
		int arr[]= {12,26,98,100,121,135};
		int search=binaryserach(arr,100);
		System.out.println(search);
	}
	public static int binaryserach(int arr[],int x)
	{
		int start=0;
		int end=arr.length;
		while (start<=end) {
		int mid=(start+end)/2;
		if(x==arr[mid]) {
			return mid;
		}
		else if(x>arr[mid]) {
			start=mid+1;
		}
		else {
			end=mid-1;
		}	
	}
	return end;
  }
}
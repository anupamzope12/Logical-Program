package Array;

public class PeakElement1 {
public static void main(String[] args) {
	int arr[]= {10,20,23,56,15,45,898,2};
	for(int i=1 ;i<arr.length-1 ;i++) {
		if(arr[i]>arr[i-1] && arr[i]>arr[i+1]) {
			System.out.println(arr[i]);
		}
	}
  }
}

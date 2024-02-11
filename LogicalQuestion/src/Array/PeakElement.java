package Array;
public class PeakElement {
	public static void main(String[] args) {
		int arr[]= {12,1,32,45,2,15,89,31};
		for(int i=0 ;i<arr.length ;i++) {
			for(int j=i+1 ;j<arr.length-1;j++) {
			if(arr[i]<arr[j]) {
				if(arr[j]>arr[j+1]) {
					System.out.println(arr[j]);
				}else {
					System.out.println();
				}
			}
		}
	}
  }
}
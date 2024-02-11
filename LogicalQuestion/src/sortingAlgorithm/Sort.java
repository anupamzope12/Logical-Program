package sortingAlgorithm;

public class Sort {
	public static int bubbleSort(int [] arr)
	{
		int passes=arr.length-1;
		int comps=arr.length-1;
		
		for(int i=0 ;i<passes ;i++)
		{
			int count=0;
			for(int j=0 ;j<(comps-i) ;j++) {
				if(arr[j]>arr[j+1]) {
					int temp=arr[j];
					arr[j]=arr[j+1];
					arr[j+1]=temp;
					count++;
				}
			}
			if(count==0) {
				System.out.println("passes " +(i+1));
				return 1;
			}
			}
		return 0;		
	}
	
	public static void selectionSort (int [] arr) {
		for(int i=0 ;i<arr.length-1 ;i++) {
			int min=i;
			for(int j=i+1 ;j<arr.length;j++) {
				if(arr[j]<arr[min]) {
					min=j;
				}
			}
			if(min != i) {
				int temp=arr[i];
				arr[i]=arr[min];
				arr[min]=temp;
			}
		}
	}
	
	public static void insertionSort(int [] arr) {
		for(int i=0 ;i<arr.length ; i++)
		{
			for(int j=0 ; j<i  ;j++) {
				if(arr[i]<arr[j])
				{
					int temp=arr[i];
					arr[i]=arr[j];
					arr[j]=temp;
				}
			}
		}
	}

}

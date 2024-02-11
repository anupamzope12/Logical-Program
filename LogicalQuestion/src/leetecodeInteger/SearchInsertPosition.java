package leetecodeInteger;

public class SearchInsertPosition {
public static void main(String[] args) {
	int arr[]= {1,3,5,6};
	System.out.println(SearchInsert(arr, 7));
}

public static int SearchInsert(int nums[],int target) {
	for(int i=0 ;i<nums.length;i++) {
		if(nums[i]==target) {
		System.out.println(i);
		}
		else if(nums[i]>target )
		{
			System.out.println(i);
		}
	}
	return nums.length;
}
}

package leetecodeInteger;

import java.util.Arrays;

public class MergerTwoSortedArray {
public static void main(String[] args) {
	MergerTwoSortedArray mgr=new MergerTwoSortedArray();
	int [] nums1= {23,56,89,54};
	int [] nums2= {98,78,63,61,34};
	mgr.merge(nums1, 2,nums2, 3);
}
//	public void merge(int nums1[],int m,int nums2[],int n)
//	{
//		int newnum[]=new int [m+n];
//		int k=0;
//		for(int i=0;i<m;i++) {
//			newnum[k]=nums1[i];	
//			System.out.println("nums1[i]" + nums1[i] );
//			System.out.println("newnum[k]" + newnum[k] );
//
//			k++;
//		}
//		for(int j=0 ;j<n;j++) {
//			newnum[k]=nums2[j];
//			System.out.println("nums2[i]" + nums2[j] );
//			System.out.println("newnum[k] " + newnum[k]  +" k " + k );
//			k++;
//		}
//		Arrays.sort(newnum);
//		System.out.println(Arrays.toString(newnum));
//	}

//    public void merge(int[] nums1, int m, int[] nums2, int n) {
//        int newnum[]=new int[m+n];
//        int k=0;
//        for(int i=0 ;i<m;i++){
//            newnum[k]=nums1[i];
//            k++;
//        }
//        for(int j=0 ;j<n;j++){
//            newnum[k]=nums2[j];
//            k++;
//        }
//        // Arrays.sort(newnum);
//        // System.out.prinltn(Arrays.toString(newnum));
//        Arrays.sort(newnum);
//		System.out.println(Arrays.toString(newnum));
//
//    }
public void merge(int[] nums1, int m, int[] nums2, int n) {
    for (int j = 0, i = m; j < n; j++) {
        nums1[i] = nums2[j];
        i++;
    }
    Arrays.sort(nums1);
}

}
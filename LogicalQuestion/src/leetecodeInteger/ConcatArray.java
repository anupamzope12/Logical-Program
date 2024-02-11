package leetecodeInteger;

import java.util.Arrays;

public class ConcatArray {
public static void main(String[] args) {
	int num []= {1,2,1};
	int [] resultarry=getConcatenation(num);
	System.out.println(Arrays.toString(resultarry));
	}
//	    public static int[] getConcatenation(int[] nums) {
//	        int [] newnums=new int[2*nums.length];
//	        int j=0;
//	        for(int i=0;i<nums.length;i++){
//	            newnums[j]=nums[i];
//	            j++;
//	        }
//	        for(int k=0;k<nums.length;k++){
//	            newnums[j]=nums[k];
//	            j++;
//	        }
//	        return newnums;
//	    }

    public static int[] getConcatenation(int[] nums) 
    {
        int n,m;
        n=nums.length;
        m=n+n;
        int [] ne = new int[m];
        System.arraycopy(nums,0,ne,0,n);
        System.arraycopy(nums,0,ne,n,n);
        return ne;
    }
}

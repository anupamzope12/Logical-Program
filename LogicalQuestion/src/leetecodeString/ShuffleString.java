package leetecodeString;

public class ShuffleString {
	public static void main(String[] args) {
		int [] arr= {4,5,6,7,0,2,1,3};
		String s="codeleete";
		System.out.println(restoreString(s, arr));;
	}
	    public static String restoreString(String s, int[] arr) {
	        char ans [] = new char[arr.length];
	        for(int i=0;i<arr.length;i++)
	        {
	            ans[arr[i]] = s.charAt(i);
	        }
	        return new String(ans);
	    }
}

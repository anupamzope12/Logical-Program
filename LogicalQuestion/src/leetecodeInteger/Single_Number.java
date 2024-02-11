package leetecodeInteger;

import java.util.HashMap;

public class Single_Number {
public static void main(String[] args) {
	int arr[] ={1,2,1,2,5};
	Single_Number sn=new Single_Number();
	System.out.println(sn.singleNumber(arr));
	
}
  public int singleNumber(int[] nums) {
        HashMap<Integer,Integer> hs=new HashMap<>();
        for(int num:nums){
            hs.put(num,hs.getOrDefault(num,0)+1);
        }
        System.out.println(hs.toString());
        for(int nu:hs.keySet()){
            if(hs.get(nu)==1){
            	int p=nu;
//            	break;
            	return p;
            }
        }
    return -1;
    }
}                            
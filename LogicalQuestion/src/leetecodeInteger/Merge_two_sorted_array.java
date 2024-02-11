package leetecodeInteger;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Merge_two_sorted_array {
	public static void main(String[] args) {
		 	ArrayList<Integer> list1 = new ArrayList<>(Arrays.asList(1, 3, 5));
	        ArrayList<Integer> list2 = new ArrayList<>(Arrays.asList(2, 4, 6));

	        List<Integer> mergedList = mergeTwoLists(list1, list2);

	        System.out.println("Merged List: " + mergedList);
	}
    public static List<Integer> mergeTwoLists(ArrayList<Integer> list1, ArrayList<Integer> list2) {
        List <Integer> ls=new ArrayList<>();
        
        ls.addAll(list1);
        ls.addAll(list2);

        Integer [] arr =ls.toArray(new Integer[0]);
      
        Arrays.sort(arr);
//        List <Integer> ls1=new ArrayList<>();
        List<Integer> result = new ArrayList<>(Arrays.asList(arr));

//        for(int c:arr)
//        {
//        ls1.add(c);
//        }
        return result;
    }

}

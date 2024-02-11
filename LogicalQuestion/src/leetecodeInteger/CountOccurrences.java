package leetecodeInteger;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;

public class CountOccurrences {
    public static void main(String[] args) {
    	int arr[]= {10,50,2,03,55,446,45,50,50};
    	List <Integer>ls=new LinkedList<Integer>();
    	for(int i=0 ;i<arr.length;i++) {
    		ls.add(arr[i]);
    	}
//        List<Integer> ls = List.of(10, 12, 45, 10, 12, 45, 12);

        // Calculate the number of occurrences of each unique element
        Map<Integer, Integer> occurrenceMap = countOccurrences(ls);

        // Print the results
        for (Map.Entry<Integer, Integer> entry : occurrenceMap.entrySet()) {
            int element = entry.getKey();
            int count = entry.getValue();
            System.out.println("Element: " + element + ", Occurrences: " + count);
        }
    }

    // Function to count occurrences of each unique element in a list
    public static Map<Integer, Integer> countOccurrences(List<Integer> list) {
        Map<Integer, Integer> occurrenceMap = new HashMap<>();
        for (int num : list) {
            occurrenceMap.put(num, occurrenceMap.getOrDefault(num, 0) + 1);
        }
        return occurrenceMap;
    }
}

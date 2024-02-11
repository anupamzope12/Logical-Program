package GFG;

import java.util.ArrayList;
  
public class TripletThatSum 
{
    
    // The check function recursively checks all possible subsets of the array
    // to see if any of them sum to the target value
    public static boolean check(int n, int[] arr, int target, ArrayList<Integer> triplet) {
          
    	// If the target value has been reached and the length of the triplet is 3,
        // then a triplet with a sum of target has been found and is printed
        if (target == 0 && triplet.size() == 3) {
            System.out.println(triplet.get(0) + " " + triplet.get(1) + " " + triplet.get(2));
            return true;
        }
  
        // If there are no more elements in the array or the target value has gone negative,
        // then a triplet with a sum of target cannot be found
        if (n == 0 || target < 0 || triplet.size() == 3)
            return false;
  
        triplet.add(arr[n - 1]);
  
        // Recursively check if target can be reached by including the current element in the triplet
        // or by excluding the current element and checking the remaining elements
        boolean a = check(n - 1, arr, target - arr[n - 1], triplet);
  
        triplet.remove(triplet.size() - 1);
  
        boolean b = check(n - 1, arr, target, triplet);
  
        return a | b;
    }
  
    public static void main(String[] args) {
        // array
        int[] arr = {1, 4, 45, 6, 10, 8 , 6,};
  
        // array length
        
        int n=arr.length;
        
        // target value
        int target = 22;
  
        // taking empty array for triplet
        ArrayList<Integer> triplet = new ArrayList<>();
  
        // calling function
        if (!check(n, arr, target, triplet)) {
            System.out.println("does not exist");
        }
    }
}
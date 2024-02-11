package leetecodeInteger;

//import java.util.Arrays;
//
//public class ShuffleString {
//	public static void main(String[] args) {
//	  String s = "codeleet";
//	  int [] indices = {4,5,6,7,0,2,1,3};
//	  int [] newindices=new int [indices.length];
//      for(int i=0;i<indices.length;i++) {
//       		 newindices[i]=indices[i];
//      }
//       	
//	    Arrays.sort(indices);		
//	    for(int i=0;i<indices.length;i++) {
//	    //	System.out.println(s.charAt(newindices[i]));
//	 
//	    	System.out.println(indices[i]+ " " +s.charAt(newindices[i])+ " " +newindices[i]);
//	    }
//	    System.out.println();
//	    System.out.println(Arrays.toString(indices));
//		System.out.println(Arrays.toString(newindices));	
//	}
//}
//import java.util.Arrays;
//
//public class ShuffleString {
//    public static void main(String[] args) {
//        String s = "codeleet";
//        int[] indices = {4, 5, 6, 7, 0, 2, 1, 3};
//        int[] newindices = new int[indices.length];
//        for (int i = 0; i < indices.length; i++) {
//            newindices[i] = indices[i];
//        }
//
//        Arrays.sort(indices);
//        for (int i = 0; i < indices.length; i++) {
//            // Print the characters in the order specified by newindices
//            System.out.print(s.charAt(newindices[i]));
//        }
//    }
//}
import java.util.Arrays;

public class ShuffleString {
    public static void main(String[] args) {
        String s = "codeleet";
        int[] indices = {4, 5, 6, 7, 0, 2 ,1, 3};
//        Arrays.sort(indices);

        for (int i = 0; i < indices.length; i++) {
            // Print the characters in the order specified by indices
            System.out.print(s.charAt(indices[i]));
        }
    }
}


package Array;

public class TwoDArray {
	    public static void main(String[] args) {
	        // Given 2D array
	        int[][] array = {{1, 2, 3}, {3, 2, 1}};

	        // Accessing elements
	        int element = array[0][1];
	        System.out.println("Element at index [0][1]: " + element);

	        // Iterating through elements
	        System.out.println("Iterating through the array:");
	        for (int i = 0; i < array.length; i++) {
	            for (int j = 0; j < array[i].length; j++) {
	                System.out.print(array[i][j] + " ");
	            }
	            System.out.println();
	        }

	        // Modifying values
	        array[1][2] = 10;
	        System.out.println("Modified array:");
	        for (int i = 0; i < array.length; i++) {
	            for (int j = 0; j < array[i].length; j++) {
	                System.out.print(array[i][j] + " ");
	            }
	            System.out.println();
	        }

	        // Finding the length
	        int rows = array.length;
	        int columns = array[0].length;
	        System.out.println("Number of rows: " + rows);
	        System.out.println("Number of columns: " + columns);
	    }
}
package star_Pattern;

public class Left_Triangle_Star_Pattern {
	public static void main(String[] args) {
		int rows=6;
		for(int i=0 ; i<rows ;i++) {
			for(int j=rows-i ; j>1 ; j--) {
				System.out.print(" ");
			}
			for(int k=0 ; k<i ; k++) {
				System.out.print("* ");
			}
			System.out.println();
		}
	}
}

package star_Pattern;

public class Right_down_Mirror_Star_Pattern {
public static void main(String[] args) {
	int rows=5;
	for(int i=0 ; i<rows ; i++) {
		for(int k=rows-i ; k<rows ;k++) {
			System.out.print(" ");
		}
		for(int j=rows-i ; j>1 ; j--) {
			System.out.print("*");
		}
		System.out.println();
	}
}
}

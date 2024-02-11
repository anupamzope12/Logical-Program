package star_Pattern;

public class Reversed_Pyramid_Star_Pattern {
public static void main(String[] args) {
	int rows=5;
	for(int i=0 ; i<rows ;i++) {
		for(int j=rows-i ; j<rows ;j++)
		{
			System.out.print(" ");
		}
		for(int k=i ; k<rows ; k++) {
			System.out.print("* ");
		}
		System.out.println();
	}
}
}

package Star_4Pattern_Reveision;

public class Right_down_Mirror_Start_Pattern {
public static void main(String[] args) {
	int rows=5;
	for(int i=0 ;i<rows;i++) {
		for(int k=0;k<i;k++) {
			System.out.print(" ");
		}
		for(int l=i;l<rows;l++) {
			System.out.print("*");
		}
		System.out.println();
	}
}
}

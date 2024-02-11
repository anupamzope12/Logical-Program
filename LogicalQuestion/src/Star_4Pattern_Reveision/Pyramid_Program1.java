package Star_4Pattern_Reveision;

public class Pyramid_Program1 {
	public static void main(String[] args) {
		for(int i=1 ;i<=5;i++) {
			for(int j=0 ;j<5-i;j++) {
				System.out.print(" ");
			}
			for(int k=0 ;k<2*i-1;k++)
			{
				System.out.print("*");
			}
			System.out.println();
		}
	}

}

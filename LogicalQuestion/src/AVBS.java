import java.util.Scanner;

public class AVBS {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number");
		int number=sc.nextInt();
		boolean flag=true;
	while (number > 0) {
        int digit = number % 10;
        if (digit% 4==0 || digit% 7==0) {     
        	System.out.println("YES");
        	flag=true;
        	break;
        }
        number /= 10;
    }
	if(flag==false)
   System.out.println("NO");
}
}


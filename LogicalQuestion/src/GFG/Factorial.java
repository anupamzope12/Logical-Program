package GFG;

//public class Factorial {
//public static void main(String[] args) {
//	int num=6;
//	int i=0;
//	int fact=1;
//	while(num>0)
//	{
//		fact = num*fact;
//		i++;
//		num=num-i;
//		
//	}
//	System.out.println(fact);
//  }
//	public class Factorial {
//	    public static void main(String[] args) {
//	        int num = 6;
//	        int fact = 1;
//
//	        for (int i = 1; i <= num; i++) {
//	            fact = fact * i;
//	        }
//
//	        System.out.println(fact);
//	    }
//	}
public class Factorial {
    public static void main(String[] args) {
        int num = 6;
        int fact = 1;
        int i = 1;

        while (num>0) {
            fact =fact * i;
            num--;
            i++;
        }

        System.out.println(fact);
    }
}

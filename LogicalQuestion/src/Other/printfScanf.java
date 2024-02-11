package Other;

public class printfScanf {
	public static void main(String[] args)
	{
		double d=100.123225;
		int q =45;
		
		System.out.println(" double d is " + d + "   " + " int q is " + q);
		
		System.out.println();
//        System.out.printf("Name: %s%n", name);
//        System.out.printf("Age: %d%n", age);
//        System.out.printf("Height: %.2f meters%n", height);
		
		System.out.printf("double d : %f%n " , d);
//		System.out.println();
		System.out.printf("int q : %.2f%n " , d);
		
		String s1="Anupam";
//		System.out.printf("%-15%s%n" , s1);
		int x=56;
        System.out.printf("%-15s%03d%n", s1 , x);

        
        
	}

}
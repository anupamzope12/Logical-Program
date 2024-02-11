package Static_block;

public class staticvariable {
	static double b=54;
	static int a=m1();
	
	static {
		System.out.println("in static block");
	}
	static int m1() { 
		System.out.println("from m1");
		return 20;
	}
	public static void main(String[] args) {
		System.out.println(b);
		System.out.println("value of a : " + a);
		System.out.println("from main");
	}
}

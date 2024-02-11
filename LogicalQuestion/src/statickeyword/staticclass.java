package statickeyword;

public class staticclass {
	static int a=10;
	
	public static boolean display(){
		System.out.println("in static method");
		int b=12;
		return true;
	}
	static {
		System.out.println("In static block");
	}
	
	public static void main(String[] args) {
	
		staticclass s=new staticclass();
//		System.out.println(s.display());
//		System.out.println(a);
//		display();
		System.out.println(s);
	}	
}
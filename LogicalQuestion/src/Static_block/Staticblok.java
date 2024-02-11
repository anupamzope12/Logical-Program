package Static_block;

public class Staticblok {

	static int a=56;
	static int b;
	static {
		try {
			b=a*2;
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println(b + " " + a);;
	}
	public static void main(String[] args) {
		Staticblok s=new Staticblok();
		System.out.println(s.a);
		//System.out.println(s.mystatvar);
		
	}
}

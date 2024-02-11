package InnerClass;

public class StaticMemberInnerClass {
	static int i;
	static class B{
		int j;
	}

	public static void main(String[] args) {
		StaticMemberInnerClass.i=5;
		StaticMemberInnerClass.B obj1=new StaticMemberInnerClass.B();
		
		System.out.println(obj1.j=54);
	
	}
}
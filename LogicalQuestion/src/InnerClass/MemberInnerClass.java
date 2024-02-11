package InnerClass;

public class MemberInnerClass {
	int i;
	class B{
		int j;
	}

	public static void main(String[] args) {
		MemberInnerClass obj=new MemberInnerClass();
		MemberInnerClass.B obj1=obj.new B();
		
		System.out.println(obj1.j=5);
	
	}
}
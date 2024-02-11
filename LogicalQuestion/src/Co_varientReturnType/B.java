package Co_varientReturnType;

public class B extends A{
	B(){
		super();
		System.out.println("In constructor of B");
		
	}
	B Show() {
		System.out.println("Please like");
		super.Show();
		return this;
	}
public static void main(String[] args) {
//	B b=new B();
//	b.Show();
	A a=new B();
	a.Show();
//	A a1=new A();
//	a1.Show();
		
	}
}



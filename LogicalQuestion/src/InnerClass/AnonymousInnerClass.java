package InnerClass;

public class AnonymousInnerClass {
	public void show() {
		System.out.println("Call");
	}
	public static void main(String[] args) {
		AnonymousInnerClass a=new AnonymousInnerClass()
		{
			public void show() {
				System.out.println("Call,message,camera");
			}
		};
		a.show();
	}
}
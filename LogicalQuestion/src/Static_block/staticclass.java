package Static_block;

public class staticclass {
	private static String str="anupam";
	
	static class MyNestedClass{
		//non static method
		public void disp() {
			System.out.println(str);
		}
	}
	
	public static void main(String[] args) 
	{
		staticclass.MyNestedClass obj=new staticclass.MyNestedClass();
		obj.disp();
	}
}
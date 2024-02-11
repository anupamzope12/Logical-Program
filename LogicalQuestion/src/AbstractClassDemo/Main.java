package AbstractClassDemo;

abstract class MyAbstractClass {
    abstract void abstractMethod();
}

public class Main {
    public static void main(String[] args) {
        // Attempting to instantiate an abstract class will result in a compilation error
//         MyAbstractClass myObject = new MyAbstractClass(); // Compilation error
    	MyAbstractClass c=new MyAbstractClass() {
			
			@Override
			void abstractMethod() {
				// TODO Auto-generated method stub
				
			}
		};
    }
}

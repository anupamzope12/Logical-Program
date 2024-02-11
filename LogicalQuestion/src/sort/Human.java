package sort;


public class Human {

}
class Doctor extends Human{};

class Animal {}
class Dog extends Animal {};

class Test{
	public static void main(String[] args) {
		printInfo(new Human());
		printInfo(new Animal());
	}
	
	public static <T> void  printInfo(T anyObj){
		System.out.println("Hey yor ar human / animal");
	}
}
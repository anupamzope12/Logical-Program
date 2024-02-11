package Other;

public class println_and_format {
public static void main(String[] args) {
	String s="Anupam";
	
	System.out.println("Hi my name is " + s);
	
	System.out.format("Hi my name is  %s " ,s );
	
	System.out.println();
	
	String name = "Alice";
	int age = 30;
	System.out.format(" Name: %s, Age: %d ", name, age);
	
	System.out.format(" Name: %s, Age: %d %n", name, age);
	
	float a=1.56f;
	float b=5.33f;
	float result=a/b;
	
	System.out.format(result+" "+"%.4f",result);

   }
}

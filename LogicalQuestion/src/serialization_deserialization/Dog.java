package serialization_deserialization;

import java.io.*;

public class Dog  implements Serializable{
	int i=10;
	int j=20;
	public static void main(String[] args) throws IOException, ClassNotFoundException {
		Dog d1=new Dog();
		
		FileOutputStream fos=new FileOutputStream("nabc.ser");
		ObjectOutputStream oos=new ObjectOutputStream(fos);
		oos.writeObject(d1);
		
		System.out.println(d1.i + "+++++++++" + d1.j);
		
		FileInputStream fis=new FileInputStream("abc.ser");
		ObjectInputStream ois=new ObjectInputStream(fis);
		Dog d2=(Dog)ois.readObject();
		
		System.out.println(d2.i + "+++++++++" + d2.j);	
	}
}
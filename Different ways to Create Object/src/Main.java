
public class Main {
	public static void main(String[] args) {
		
		Student stud1=new Student("anupam","bhusawal",24);
		System.out.println(stud1.toString());
		
		try {
			Student stud2=(Student)stud1.clone();
			System.out.println(stud2);
		} catch (CloneNotSupportedException e) {
					System.out.println(e);
					
		}			
	}
}
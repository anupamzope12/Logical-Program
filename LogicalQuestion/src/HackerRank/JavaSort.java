package HackerRank;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;

public class JavaSort
{
	public static void main(String[] args){
		Scanner in = new Scanner(System.in);
		System.out.println("Enter the number of testCases");
		int testCases = Integer.parseInt(in.nextLine());
		
		List<Student> studentList = new ArrayList<Student>();
		while(testCases>0){
			System.out.println("Enter the id");

			int id = in.nextInt();
			System.out.println("Enter the fname");

			String fname = in.next();
			System.out.println("Enter the cgpa");
			double cgpa = in.nextDouble();
			
			Student st = new Student(id, fname, cgpa);
			studentList.add(st);
			
			testCases--;
		}
        Collections.sort(studentList, new Comparator<Student>() {
            @Override
            public int compare(Student s1,Student s2){
                if(s2.getCgpa()!=s1.getCgpa()){
                    return Double.compare(s2.getCgpa(),s1.getCgpa());
                }
                else{
                    int nameCompare=s1.getFname().compareTo(s2.getFname());
                    if(nameCompare!=0)
                        return nameCompare;
                }
                return s2.getId()-s1.getId();
            }
        });
      	for(Student st: studentList){
			System.out.println(st.getFname());
		}
	}
}

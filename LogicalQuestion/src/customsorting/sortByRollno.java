package customsorting;

import java.util.Comparator;

public class sortByRollno implements Comparator<StudentDetails>{
	
@Override
public int compare(StudentDetails s1, StudentDetails s2) {
	// TODO Auto-generated method stub
	if(s1.getRollNo()>s2.getRollNo()) {
		return +1;
	}
	if(s1.getRollNo()<s2.getRollNo()) {
		return -1;
	}
	return 0;
}

}
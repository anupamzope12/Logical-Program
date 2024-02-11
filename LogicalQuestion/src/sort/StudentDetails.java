package sort;

public class StudentDetails implements Comparable<StudentDetails>{
	private String fName;
	private String lName;
	private Integer rollNo;
	public StudentDetails(String fName, String lName, Integer rollNo) {
		super();
		this.fName = fName;
		this.lName = lName;
		this.rollNo = rollNo;
	}
	public String getfName() {
		return fName;
	}
	public void setfName(String fName) {
		this.fName = fName;
	}
	public String getlName() {
		return lName;
	}
	public void setlName(String lName) {
		this.lName = lName;
	}
	public Integer getRollNo() {
		return rollNo;
	}
	public void setRollNo(Integer rollNo) {
		this.rollNo = rollNo;
	}
	@Override
	public String toString() {
		return "StudentDetails [fName=" + fName + ", lName=" + lName + ", rollNo=" + rollNo + "]";
	}

//	@Override
//	public int compareTo(StudentDetails anotherstud) {
//		// TODO Auto-generated method stub
//		return - this.getRollNo().compareTo(anotherstud.getRollNo());
//	}
	@Override
	public int compareTo(StudentDetails anotherstud) {
		// TODO Auto-generated method stub
		return  this.getfName().compareTo(anotherstud.getlName());
	}
//	
//	@Override
//	public int compareTo(StudentDetails anotherstud) {
//		return this.getfName().compareTo(anotherstud.getfName());
//	}
//	@Override
//	public int compareTo(StudentDetails anotherstud) {
//		return this.getlName().compareTo(anotherstud.getlName());
//	}

}

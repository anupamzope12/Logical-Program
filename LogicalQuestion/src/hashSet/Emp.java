package hashSet;

public class Emp {
	private String name;
	private Integer empid;
	private String empAdd;
	public Emp() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Emp(String name, int empid, String empAdd) {
		super();
		this.name = name;
		this.empid = empid;
		this.empAdd = empAdd;
	}
	@Override
	public String toString() {
		return "Emp [name=" + name + ", empid=" + empid + ", empAdd=" + empAdd + "]";
	}
	@Override
	public boolean equals(Object o) {
		System.out.println("in emp equals");;
		if(o instanceof Emp) {
			return this.empid.equals(((Emp)o).empid);
			
		}
		return false;
	}
	@Override
	public int hashCode() {
		System.out.println("in emp hashcode");
		return 54988;
	}
}

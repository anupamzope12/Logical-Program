package List;

import java.util.ArrayList;

public class Customer {
	public String  name;
	public Integer age;
	public String city;
	
	public Customer(String name ,Integer age,String city) {
		this.name=name;
		this.age=age;
		this.city=city;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Integer getAge() {
		return age;
	}

	public void setAge(Integer age) {
		this.age = age;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}
	
	@Override
	public String toString() {
		return "Customer [name=" + name + ", age=" + age + ", city=" + city + "]";
	}
	public static void main(String[] args) {
		Customer cus=new Customer("Anupam", 23, "bhusawal");
		Customer cus1=new Customer("Sagar", 28, "Nashik");
		Customer cus2=new Customer("Virendra", 23, "Indore");
		Customer cus3=new Customer("Gadha", 26, "hagankhadi");
		Customer cus4=new Customer("poja", 23, "sambhaji nagar");
		
		ArrayList<Customer>al=new ArrayList<>();
		al.add(cus4);
		al.add(cus3);
		al.add(cus2);
		al.add(cus1);
		al.add(cus);
		
		System.out.println(al.toString());
		System.out.println("++++++++++++++++++++");
		for(Customer c:al) {
			System.out.println(c);
		}
	
	}
}

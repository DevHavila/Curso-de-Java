package entities;

public class Employee{
	
	public String name;
	public String gmail;
	public Double salary;
	
	public Employee() {
	}
	
	public Employee(String name, String gmail, Double salary) {
		this.name = name;
		this.gmail = gmail;
		this.salary = salary;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getGmail() {
		return gmail;
	}

	public void setGmail(String gmail) {
		this.gmail = gmail;
	}

	public Double getSalary() {
		return salary;
	}

	public void setSalary(Double salary) {
		this.salary = salary;
	}

	@Override
	public String toString() {
		return "Employee [name=" + name + ", gmail=" + gmail + ", salary=" + salary + "]";
	}
	
	

}

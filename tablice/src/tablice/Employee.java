package tablice;

public class Employee {
	//class fields
	private String Name;
	private String lastName;
	private double salary;
	
	
	//getters and setters
	public String getName() {
		return this.Name;
		}
	
	public void setName(String name) {
		this.Name=name;
	}
		
	public String getLastName() {
		return this.lastName;	
	}
	
	public void setLastName(String lastName) {
		this.lastName=lastName;
	}
	
	
	public double getSalary() {
		return this.salary;
	}
	
	public void setSalary(double salary) {
		this.salary=salary;
	}
	
	//constructor
	
	Employee(String Name, String LastName, double salary){
		this.setName(Name);
		this.setLastName(LastName);
		this.setSalary(salary);
	}

}

package zadanie;

public class Person {
	private String name;
	private String lastName;
	private int salary;
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	public int getSalary() {
		return salary;
	}
	public void setSalary(int salary) {
		this.salary = salary;
	}
	
	public Person(String name, String lastName, int salary) {
		setName(name);
		setLastName(lastName);
		setSalary(salary);
	}
	@Override
	public String toString() {
		return name+ " "+lastName+" "+salary;
	}
}

package data;

public class Patient {
	private String name;
	private String lastName;
	private int pesel;
	
	//settets and getters
	
	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name=name;
	}
	
	public String getLastName() {
		return lastName;
	}
	
	public void setLastName(String lastName) {
		this.lastName=lastName;
	}
	
	public int getPesel() {
		return pesel;
	}
	
	public void setPesel(int pesel) {
		this.pesel=pesel;
	}
		
	//constructor 1
	public Patient(String name, String lastName, int pesel) {
		setName(name);
		setLastName(lastName);
		setPesel(pesel);
	}
	
	public void getPatientInfo() {
		System.out.println(getName()+" "+getLastName()+" "+getPesel());
	}
	
}

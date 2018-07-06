package data;

public class Patient {
	//class fields
	private String name;
	private String lastName;
	private int pesel;
	
	//setters and getters
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

	//constructor
	public Patient(String name, String lastName, int pesel) {
		setName(name);
		setLastName(lastName);
		setPesel(pesel);		
	}
	
	//methods
	
	public void patientInfo() {
		String info=getName()+" "+ getLastName()+" "+getPesel();
		System.out.println(info);
	}
	

}

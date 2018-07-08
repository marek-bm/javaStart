package zadanie;

public class Nurse extends Person {
	private double overtime;

	public double getOvertime() {
		return overtime;
	}

	public void setOvertime(double overtime) {
		this.overtime = overtime;
	}
	
	public Nurse(String name, String lastName, int salary, double overtime) {
		super(name, lastName, salary);
		setOvertime(overtime);
		
	}
	
	public String toString() {
		return super.toString()+" "+overtime;
	}
	

	
}

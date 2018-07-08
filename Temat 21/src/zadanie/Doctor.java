package zadanie;

public class Doctor extends Person{
	private int bonus;
	
	public int getBonus() {
		return bonus;
	}

	public void setBonus(int bonus) {
		this.bonus = bonus;
	}

	public Doctor(String name, String lastName, int salary, int bonus) {
		super(name, lastName,salary);
		setBonus(bonus);
	}
	
	@Override
	public String toString() {
		return super.toString()+" "+bonus+"PLN";
	}

}

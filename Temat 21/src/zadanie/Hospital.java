package zadanie;

public class Hospital{
	private Person[] personel=new Person[10];
	private int staffCounter=0;
	
	public void add(Person person) {
		personel[staffCounter]=person;
		staffCounter++;
		}

	@Override
	public String toString() {
		String info="";
		for(int i=0; i<staffCounter; i++) {
			info+=personel[i]+"\n";
		}
		return info;	
	}
	
	
	
}

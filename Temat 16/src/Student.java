
public class Student {
	private String name;
	private String lastName;
	private int index;
	
	public static int studentsNumber=0;
	public int liczbaStudentow=0;
	
	//set and get
	
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
	
	public int getIndex() {
		return index;
	}
	
	public void setIndex(int index) {
		this.index=index;
	}
	
	//constructor
	public Student(String name, String lastName, int index) {
		setName(name);
		setLastName(lastName);
		setIndex(index);
		studentsNumber++;
		liczbaStudentow++; // test zeby zobaczyc co sie stanie gdy zwieksze zmienna non-static
	}
	
}


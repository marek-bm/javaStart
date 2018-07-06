package temp;

public class Student {
	private String name;
	private String surname;
	private int indexNumber;
	
	private static int allStudentsCurrently=0;

	public Student(String name, String surname, int indexNumber) {
		super();
		this.name = name;
		this.surname = surname;
		this.indexNumber = indexNumber;
		Student.allStudentsCurrently++;
	}
	
	public int getallStudentsCurrently() {
		return Student.allStudentsCurrently;
	}
	
	public String studentInfo() {
		return "Name :"+name+" \nSurname: "+surname+" \nIndex number: "+indexNumber;
	}
}



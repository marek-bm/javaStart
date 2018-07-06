public class University {
	public static void main(String[] args) {
		System.out.println("poczatkowa liczba studentow "+Student.studentsNumber);
		//System.out.println("liczbaStudentow: "+Student.liczbaStudentow); nie zadziala cannot make static reference to nonstatic value
		Student s1=new Student("Marek", "jast", 2345);
		Student s2=new Student("Filip", "jastrz", 47852);
		System.out.println("aktualna liczba studentow "+Student.studentsNumber);
	
	}
}


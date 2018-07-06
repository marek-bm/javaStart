package temp;

public class University {public static final int ADD_STUDENTS = 14;

public static void main(String[] args) {
	Student[] students = new Student[ADD_STUDENTS];
	for(int i=0;i<ADD_STUDENTS;i++) {
		students[i] = new Student("name"+i,"surname"+i,i);
	}
	System.out.println(students[5].getallStudentsCurrently()+" students is studying currently.");
}

}

package tablice;

public class Company {
	public static void main(String[] args) {
		Employee[] employees=new Employee[10];
		
		employees[0]=new Employee("Jan", "Nowak", 3500);
		employees[1]=new Employee("Marian", "Kowalski", 4000);
		employees[2]=new Employee("Karol", "Wojak", 1500);
		employees[3]=new Employee("Marek", "Jast", 5000);
		employees[4]=new Employee("Anna", "Maria", 2000);
		
		int empIndex=3;
		
		System.out.println(employees[empIndex-1].getName()+" "+employees[empIndex-1].getLastName()+" "+employees[empIndex-1].getSalary()+" PLN");
		int tabLength=employees.length;
		Employee last=employees[tabLength-1];		
		
		System.out.println("Wielkosc tablicy: "+ tabLength);
		System.out.println("Ostatnim elementem tablicy jest "+last);
		
	}

}

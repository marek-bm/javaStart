package method;
import data.Patient;
import java.util.Scanner;

public class Hospital {
		private Scanner input;
		private int len;
		private Patient[] queue=new Patient[len];
		
		
		public Hospital() {
			input=new Scanner(System.in);
		}
	
		public void Close() {
			input.close();
		}
	
	//kreator pacjenta
		public Patient createPatient() {
		System.out.println("Imie: ");
		String name=input.nextLine();
		System.out.println("Nazwisko:");
		String lastName=input.nextLine();
		System.out.println("PESEL:");
		int pesel=input.nextInt();
		input.nextLine();
		return new Patient(name, lastName, pesel);
		}
	
		
		
		
		
		
	
}
	

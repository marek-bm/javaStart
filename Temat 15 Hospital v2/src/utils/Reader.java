package utils;
import java.util.Scanner;
import data.Patient;
import data.Hospital;

public class Reader {
	//inicjalizacja skanera
	Scanner input=new Scanner(System.in);
	//inicjalizacja zmiennej klasy Patient
	Patient patient;
	//inicjalizacja zmiennej klasy Hospital
	Hospital hospital;
	
	//kreator pacjenta
	
	public Patient createPatient() {
		System.out.println("Enter name");
		String name=input.nextLine();
		System.out.println("Enter last name");
		String lastName=input.nextLine();
		System.out.println("Enter pesel");
		int pesel=input.nextInt();
		input.nextLine();
		
		return new Patient(name, lastName, pesel);
		
		}
	}

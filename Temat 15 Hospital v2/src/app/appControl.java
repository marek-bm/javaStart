package app;
import java.util.Scanner;
import utils.Reader;
import data.Hospital;
import data.Patient;


public class appControl {
	//zmienne sterujace
	public final int exit=0;
	public final int add=1;
	public final int display=2;
	
	Reader reader= new Reader();
	Hospital hospital=new Hospital();
	
	Scanner input=new Scanner(System.in);
	int option;
	
	public void printOptions() {
		System.out.println("Wybor opcji:");
		System.out.println("0-exit");
		System.out.println("1-add patient");
		System.out.println("2 display queue");
	}
	
	public void controlLoop() {
		printOptions();
		while((option=input.nextInt())!=exit) {
			switch(option) {
			case add:
				Patient patient = reader.createPatient();
				hospital.addPatient(patient);
				break;
			case display:
				hospital.getQueueInfo();
				break;
			default:
				System.out.println("Nie znaleziono opcji");
			}
			printOptions();
		}
		input.close();
	}

}

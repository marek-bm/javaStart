package app;
import java.util.Scanner;
import data.Patient;
import method.Hospital;

public class AddPatient {
	public static void main(String[] args) {
		//inicjalizacja skanera
		Scanner input=new Scanner(System.in);
		//inicjalizacja metod klasy Hospital (
		Hospital hospital= new Hospital();
		
		//inicjalizacja kolejki do ktorej zapisywani sa pacjenci
		Patient[] kolejka=new Patient[10];

		// inicjalizacja zmiennej action, ktore streuje dzialaniem programu
		int action;
		int index=0;
			
		System.out.println("Choose 0 for exit, 1 to add patient, 2 for displaing queue  ");
		while ((action=input.nextInt())!=0) {
			input.nextLine();
			
			switch(action) {
			case 1: //add patient
				System.out.println("Create patient "+(index+1));
				kolejka[index]=hospital.createPatient();
				index=index+1;
				System.out.println("index= "+index);
				if (index==9) {
					break;
				}
				System.out.println("choose 0,1,2");
				continue;
			case 2: //print info
				for (int i=0; i<index; i++) {
					kolejka[i].patientInfo();
				}
				System.out.println("choose 0,1,2");
				continue;
			 default:
				 System.out.println("podaj 0, 1 lub 2");
				 continue;
			}
			System.out.println("progam ended");
			break;	
			
		}
		input.close();	
}
}

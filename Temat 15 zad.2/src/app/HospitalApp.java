package app;
import data.Patient;
import method.Hospital;
import java.util.Scanner;


public class HospitalApp {
	public static void main(String[] args) {
		// inicjalizacja scannera
		Scanner input=new Scanner(System.in);
		
		// inicjalizacja kolejki pacjentow
		Patient[] queue= new Patient[10];
		
		// inicjalizacja zmiennej klasy Hospoital, 
		// umozliwia dodawanie i wyswietlnie informacji o pacjentach
		Hospital hospital=new Hospital();
	
		//trigger 0-exit, 1-edit, 2- display
		int trigger;
		
		
		System.out.println("Choose 0 for exit, 1 to add patient, 2 for displaing queue  ");
		while((trigger=input.nextInt())!=0){
			int index=0;
			switch(trigger) {
				case 1: //add patient
					System.out.println("Dodawanie pacjenta");
					System.out.println("aktualny status kolejki:");
					System.out.println(index);
					System.out.println(len);
					index++;
					
					
			
					/*
					if (queue.length>10) {
						System.out.println("osiagnieto limit pacejntow");	
					} else {
						queue[index]=hospital.createPatient();
						len++;
						System.out.println("dlugosc kolejki: "+len);
						index++;
					}*/
					
					break;
			
				case 2: //display queue
					System.out.println("wyswietlanie kolejki");
					/*
					for (int i=0; i<len ; i++) {
				queue[i].patientInfo();
					}
					*/
					
					break;
		default:
			System.out.println("press 0 for exit, 1-edit, 2-display");
				
			}
			
			
		}System.out.println("wybrales 0 -exit");
	}
}

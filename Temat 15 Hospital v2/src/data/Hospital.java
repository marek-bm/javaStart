package data;
import data.Patient;

public class Hospital {
	//dlugosc kolejki
	public final int queueLength=10;
	//liczba zarejestrowanych pacjentow
	private int register=0;
	//kolejka - tablica w ktorej rejestrowani sa pacjenci
	public Patient[] queue=new Patient[queueLength];
	
	
	
	//dodawanie pacjenta do kolejki - queue[]
	public void addPatient(Patient patient) {
		if (register==10) {
			System.out.println("Osiagnieto limit pacjentow");
		} else {
			System.out.println("Dodaj "+ (register+1)+ " pacjenta");
			queue[register]=patient;
			register++;
		}
	}
	//wyswietlanie infrmacji o pacjencie
	public void getQueueInfo() {
		if(register==0) {
			System.out.println("brak pacjentow w kolejce");
		} else {
			for (int i=0; i<register; i++) {
				System.out.print("Pacjent "+(i+1)+": ");
				queue[i].getPatientInfo();
			}
		}
	}
	
	//wyswietlanie dlugosci kolejki
	public int getQueueLength() {
		return queueLength;
	}
	
	

}

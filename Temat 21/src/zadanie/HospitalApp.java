package zadanie;

public class HospitalApp {

	public static void main(String[] args) {
		
		//inicjalizacja zmiennej hospital
		Hospital hospital=new Hospital();
		//tworzenie personelu
		Person doc1=new Doctor("Dr", "Lubicz", 2500, 300); 
		Person nurse1=new Nurse("Bozena", "Nowicka", 1500, 32);
		Person nurse2=new Nurse("Irena", "Kwiatkowska", 1300, 21);
		
		//dodawanie stworzonego personelu
		hospital.add(doc1);
		hospital.add(nurse1);
		hospital.add(nurse2);
		
		//jednoczesne tworzenie i dodawanie
		hospital.add(new Doctor("Jan","Kowal", 5000, 500));
		
		//wyswietlanie personelu
		System.out.println(hospital); // taki zapis jest rownowazny hospital.toString()
		
	}
}

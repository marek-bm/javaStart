package data;
import java.util.Scanner;

public class DataStore {
	DataStore dataStore;
	
	
	Computer[] store= new Computer[100];
	Scanner input=new Scanner(System.in);
	int compNumber=0;
	
	public void create() {
		System.out.println("Podaj producenta");
		String producent=input.nextLine();
		System.out.println("Podaj model");
		int model=input.nextInt();
		input.nextLine();
		//input.close();
		Computer comp= new Computer(producent, model);
		store[compNumber]=comp;
		compNumber++;
		System.out.println("compNumber="+ compNumber);
	}

	public Computer add() {
		System.out.println("Podaj producenta");
		String producent=input.nextLine();
		System.out.println("Podaj model");
		int model=input.nextInt();
		input.nextLine();
		//input.close();
		Computer comp= new Computer(producent, model);
		return comp;

	}
	
	public void storeInfo() {
		
		for(int i=0; i<compNumber; i++) {
			System.out.println(store[i].toString());
			
		}
	}
	
	
	public void checkAvailability() {
		int duplicates=0;
		
		System.out.println("producent:");
		String prod=input.nextLine();
		System.out.println("model procesora:");
		int model= input.nextInt();
		input.nextLine();
		Computer comp=new Computer(prod,model);
		
		for(int i=0; i<compNumber; i++) {
			
			if (store[i].toString().equals(comp.toString())) {
				duplicates++;
			}
				
		}
		System.out.println("Liczba procesorow: "+duplicates);
	}

}

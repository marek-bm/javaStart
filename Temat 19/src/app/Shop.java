package app;
import data.DataStore;
import java.util.Scanner;

public class Shop {
	public static final int EXIT=0;
	public static final int ADD_COMP=1;
	public static final int DISPLAY=2;
	public static final int CHECK_AVAILABILITY=3;
	
	DataStore dataStore=new DataStore();
	Scanner sc=new Scanner(System.in);
	int action;
	
	public void info() {
		System.out.println("Wybierz opcje:");
		System.out.println("0- for exit");
		System.out.println("1 - to add computer");
		System.out.println("2 - to display processors");
		System.out.println("3 - to check availability");
	}
	
	public void controlLoop() {
		//drukuj instrukcje	
		info();
		
		while ((action=sc.nextInt())!=EXIT) {
			switch(action) {
				case ADD_COMP:
					dataStore.create();
					break;
				case DISPLAY:
					dataStore.storeInfo();
					break;
				case CHECK_AVAILABILITY:
					dataStore.checkAvailability();
					break;
					
				default:
					System.out.println("brak takiejopcji");
					System.out.println(" ");
					
			}
			System.out.println(" ");	
			info();	
			
		}
		sc.close();
	}
}

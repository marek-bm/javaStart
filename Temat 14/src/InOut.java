import java.util.Scanner;

public class InOut {
	public static void main(String[] args) {
		Scanner input=new Scanner(System.in);
		String firstName;
		String lastName;
		int age;
		
		System.out.println("Wprowadz swoje imie:");
		firstName= input.nextLine();
		System.out.println("Wprowadz swoje nazwisko:");
		lastName= input.nextLine();
		System.out.println("Podaj swoj wiek:");
		age=input.nextInt();
		
		input.close();
		
		System.out.println("Czesc "+firstName+" "+lastName);
		System.out.println("Masz juz "+age+" lata, starosc nie radosc");
		
			
		
	}
	
	

}

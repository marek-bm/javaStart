import java.util.Scanner;

public class GuessGame {
	public static void main(String[] args) {
		Scanner reader= new Scanner(System.in);
		int number = 500;
		int userInput;
		System.out.println("zgadnij liczbe");
		
		while((userInput= reader.nextInt())!=number) {
			if (userInput<500) {
				System.out.println("wprowadzona liczba jest zbyt mala, zgaduj dalej");
			}
			else {
				System.out.println("wprowadzona liczba jest zbyt duza, zgaduj dalej");
			}
				
		}
		System.out.println("Brawo, zgadles o jakas liczbe chodzilo");
		reader.close();
	}

}

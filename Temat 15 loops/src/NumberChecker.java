import java.util.Scanner;

public class NumberChecker {
	public static void main(String[] args) {
		Scanner input=new Scanner(System.in);
		int tmp;
		
		for (int i=0; i<3; i++) {
			System.out.println("podaj liczbe do sprawdzenia: ");
			tmp=input.nextInt();{
				if (tmp%2==0) {
					System.out.println("Liczba "+ tmp + " jest parzysta");
				}
				else {System.out.println("Liczba "+tmp+" jest nieparzysta");
				}
			}
			
		}
		input.close();
	}

}

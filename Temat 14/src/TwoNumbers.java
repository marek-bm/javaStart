import java.util.Locale;
import java.util.Scanner;

public class TwoNumbers {
	public static void main(String[] args) {
		Scanner input=new Scanner(System.in);
		input.useLocale(Locale.US);
		
		System.out.println("podaj pierwsza liczbe");
		double num1=input.nextDouble();
		System.out.println("podaj druga liczbe");
		double num2=input.nextDouble();
		input.close();
		
		System.out.println("num1+num2 = "+(num1+num2));
		
	}
	
		
	
	


	
}

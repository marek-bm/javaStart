package zadanie;
import java.util.Scanner;


public class Pizzeria {
	public static void main(String[] args) {
		System.out.println("Menu:");
		for(Pizza p: Pizza.values()) {
			System.out.println(p);
		}
		
		Scanner input=new Scanner(System.in);
		System.out.println("jaka wybierasz pizze?");
		Pizza pizza=Pizza.valueOf(input.nextLine());
		System.out.println("Twoje zamowienie:"+ pizza.name());
		input.close();
			
		}
		
		
	
	}



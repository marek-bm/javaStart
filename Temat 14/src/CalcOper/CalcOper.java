package CalcOper;
import CalcMethods.CalcMethods;
import java.util.Scanner;
import CalcData.CalcData;
import java.util.Locale;


public class CalcOper {
	public static void main(String[] args) {
		Scanner inp=new Scanner(System.in); //import scannera
		CalcData num1=new CalcData(); //inicjalizacja zmiennej double
		CalcData num2=new CalcData(); //inicjalizacja zmiennej double
		CalcData sign=new CalcData(); //inicjalizacja zmiennej String (+-/*)
		CalcMethods oper=new CalcMethods(); //inicjalizacja 
		
		//wybor 1-szej liczby
		System.out.println("Podaj pierwsza liczbe:");
		num1.setNum();
		//System.out.println(num1.getNum());  //podglad num1
		
		//wybor operatora 
		System.out.println("Wybierz operator +,-,* lub /:");
		sign.setZnak();
		//System.out.println(sign.getZnak());
		
		//wybor drugiej liczby
		System.out.println("Poddaj druga liczbe");
		num2.setNum();
				
		//wybor + (dodawanie)
		if (sign.getZnak().charAt(0)=='+') {
			System.out.println("Result: "+oper.add(num1, num2));
		}
		//wybor - (odejmowanie)
		else if (sign.getZnak().charAt(0)=='-'){
			System.out.println("Result: "+oper.minus(num1, num2));
		}
		//wybor * (mnozenie)
		else if (sign.getZnak().charAt(0)=='*'){
			System.out.println("Wynik: "+ oper.multiply(num1, num2));
		}
		
		//wybor '/' (dzielenie)
		else if (sign.getZnak().charAt(0)=='/'){
			System.out.print("Wynik: "); 
			oper.divide(num1,num2);
		}
		else
	
		{
			System.out.println("brak dzialania");
			
		}
		


		
			
				
		//wybor 2 liczby
		/*
		System.out.println("podaj druga liczbe:");
		double n2=inp.nextDouble();
		inp.nextLine();
		num2.setNum(n2);
		
		//zamkniecie close
		inp.close();
		
		//wybor operacji matematycznej
		if (operator=="+") {
			
			System.out.println("Wykonam dzia³anie "+num1.getNum() +" " +sign.getZnak()+" " +num2.getNum());
			oper.add(num1, num2);
		}
		else {
			System.out.println("niedozwolony znak");
			*/
		}
		
		
		
		
		
		
		
		
		
		
	}
	
	
		

	



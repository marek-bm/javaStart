package CalcMethods;
import CalcData.CalcData;

public class CalcMethods {

	//dodawanie
	public double add(CalcData number1, CalcData number2) {
		double a=number1.getNum();
		double b=number2.getNum();
		return a+b;
	}
	
	// odejmowanie
	public double minus(CalcData number1, CalcData number2) {
		double a=number1.getNum();
		double b=number2.getNum();
		return a-b;
	}
		
	//mnozenie
	public double multiply(CalcData number1, CalcData number2) {
		double a=number1.getNum();
		double b=number2.getNum();
		return a*b;
	}

	//dzielenie
	public void divide(CalcData num1, CalcData num2) {
		double a=num1.getNum();
		double b=num2.getNum();
		if (b!=0) {System.out.println((a/b));}
		else {
			System.out.println("Cannot divide by 0");
		}
			
		}
		
	}
	
	
	
	

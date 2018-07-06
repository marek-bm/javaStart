package CalcData;
import java.util.Scanner;
import java.util.Locale;


public class CalcData {
	private double num;
	private String znak;
	private Scanner input=new Scanner(System.in);
	
	
	
//setters and getters for numbers and operator
	public double getNum() {
		return num;
	}

	public void setNum() {
		input.useLocale(Locale.US);
		double num=input.nextDouble();
		this.num = num;
	}
	
	public String getZnak() {
		return znak;
	}
	
	public void setZnak() {
		//this.znak=znak;
		//popracowac nad warunkami
		znak=input.nextLine();
				
		if(znak.charAt(0)=='+' ||
		   znak.charAt(0)=='-' ||
		   znak.charAt(0)=='*' ||
		   znak.charAt(0)=='/')
		{
		this.znak=znak;}
		else {
		System.out.println("wprowadz operator +,-,* lub /");	
		}
		
		
	}
	}
	
	
					
		

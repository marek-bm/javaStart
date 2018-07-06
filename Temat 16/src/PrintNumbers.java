import java.util.Scanner;

public class PrintNumbers {
	public final static int EXIT=0;
	
	private static void printNumbers(int start, int end) {
		for (int i=start; i<= end; i++) {
			System.out.println(i+" ");
		}
		System.out.println();
	}


public static void main(String [] args) {
	Scanner input= new Scanner(System.in);
	int start,end;
	do {
		System.out.println("podaj pierwsza liczbe");
		start=input.nextInt();
		System.out.println("podaj druga liczbe");
		end=input.nextInt();
		printNumbers(start,end);
		
		System.out.println("0 for exit");
		System.out.println("1 for continue");
	} while(input.nextInt()!=EXIT);
		input.close();
		
}
}
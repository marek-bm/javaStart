import java.util.Scanner;

public class Sumowanie {
	public static void main(String[] args) {
		Scanner input= new Scanner(System.in);
		int sum=0;
		int temp;
		
		System.out.println("Ile liczb chcesz sumowac?");
		int userLength=input.nextInt();
		input.nextLine();
		
		for (int i=0; i<userLength; i++) {
			System.out.println("Podaj liczbe "+(i+1));
			temp=input.nextInt();
			sum+= temp;
			
		}
		System.out.println("Suma podanych liczb: "+sum);		
		
	}

}

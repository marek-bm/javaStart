import java.util.Scanner;

public class SumowanieV2 {
	public static void main(String[] args) {
		Scanner input=new Scanner(System.in);
		int sum=0;
		System.out.println("Ile liczb chcesz zsumowac?");
		int userLength=input.nextInt();
		
		while (userLength-- >0) {
			System.out.println("Podaj liczbe");
			sum=sum+input.nextInt();
			
		}
		System.out.println("suma podanych liczb = "+sum);
	}

	
}

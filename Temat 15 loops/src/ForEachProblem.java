import java.util.Scanner;

public class ForEachProblem {
	public static void main(String[] args) {
		Scanner input= new Scanner(System.in);
		int[] numbers= new int[3];
		
		for (int tmp:numbers) {
			System.out.println("Podaj liczbe:");
			tmp=input.nextInt();
		}
		for (int tmp:numbers) {
			System.out.println(tmp);
		}
		
		input.close();
	}

}

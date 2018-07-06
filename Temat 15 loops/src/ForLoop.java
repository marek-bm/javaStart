
public class ForLoop {
public static void main(String[] args) {
	//tworzenie tablicy o dlugosci 10
	int[] numbers = new int[10];
	
	//wypelnianie tablicy za pomoca petli
	for (int i=0; i<numbers.length; i++) {
		numbers[i]=i+1;
	}
			
	//wyswietlamy tablice
	for (int i=0;i<numbers.length; i++) {
		System.out.println("Liczba "+ numbers[i]);
	}
}
}

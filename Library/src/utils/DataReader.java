package utils;
import java.util.Scanner;
import data.Magazine;
import data.Publication;
import data.Book;

public class DataReader {
	private Scanner sc;
	
	public DataReader() {
		sc=new Scanner(System.in);
	}
	
	public void Close() {
		sc.close();
	}
	
	public int getInt() {
		int number=sc.nextInt();
		sc.nextLine();
		return number;				
	}
	
	public Book readAndCreateBook() {
		System.out.println("Tytul:");
		String title=sc.nextLine();
		System.out.println("Autor:");
		String author=sc.nextLine();
		System.out.println("Wydawnictwo:");
		String publisher=sc.nextLine();
		System.out.println("ISBN");
		String isbn=sc.nextLine();
		System.out.println("Rok wydania");
		int releaseDate=sc.nextInt();
		sc.nextLine();
		System.out.println("Ilosc stron:");
		int pages=sc.nextInt();
		sc.nextLine();
		
		return new Book(title, author, releaseDate, pages, publisher, isbn);
	}
	
	public Magazine readAndCreateMagazine() {
		System.out.println("Tytul:");
		String title = sc.nextLine();
		System.out.println("Wydawnictwo:");
		String publisher=sc.nextLine();
		System.out.println("Jezyk:");
		String language=sc.nextLine();
		System.out.println("Rok wydania:");
		int year=sc.nextInt();
		sc.nextLine();
		System.out.println("Miesiac");
		int month=sc.nextInt();
		sc.nextLine();
		System.out.println("Dzien:");
		int day=sc.nextInt();
		sc.nextLine();
		sc.close();
		
		return new Magazine(title, publisher, language, year, month, day);
			
		
	}

}





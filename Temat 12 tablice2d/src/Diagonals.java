
public class Diagonals {
	public static void main(String[] args) {
		
	
		Double[] tabRow1= {1.0, 1.5, 2.0};
		Double[] tabRow2= {1.5, 2.0, 2.5};
		Double[] tabRow3= {2.0, 2.5, 3.0};
		
		Double[][] hugeTab= {tabRow1, tabRow2, tabRow3};
		
		System.out.println("Suma iloczynow przekotnych: ");
		System.out.println(hugeTab[0][0]*hugeTab[1][1]*hugeTab[2][2]+hugeTab[0][2]*hugeTab[1][1]*hugeTab[2][0]);
		
		System.out.println("Iloczyn sum srodkowego wiersza i srodkowej kolumny tablicy:");
		System.out.println((hugeTab[1][0]+hugeTab[1][1]+hugeTab[1][2])*(hugeTab[0][1]+hugeTab[1][1]+hugeTab[2][1]));
		
		System.out.println("Suma wszystkich elementow przy krawedzi:");
		System.out.println(hugeTab[0][0]+hugeTab[0][1]+hugeTab[0][2]+hugeTab[1][0]+hugeTab[1][2]+hugeTab[2][0]+hugeTab[2][1]+hugeTab[2][2]);
	}
		
}
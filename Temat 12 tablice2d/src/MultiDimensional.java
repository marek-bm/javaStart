
public class MultiDimensional {
	public static void main (String[] args) {
		String[] firstNames= {"Karol", "Basia", "Kasia"};
		String[] lastNames= {"Kowalski", "Nowak", "Wodecka"};
		String[][] firstLast= {firstNames, lastNames};
		
		System.out.println("Pierwsza osoba to:");
		System.out.println(firstLast[0][0]+" "+ firstLast[1][0]);
		System.out.println("Drugaa osoba to:");
		System.out.println(firstLast[0][1]+" "+firstLast[1][1]);
		System.out.println("Trzecia osoba to:");
		System.out.println(firstLast[0][2]+" "+firstLast[1][2]);
		
		int[] longTab=new int[1000];
		int[] midTab=new int[100];
		longTab[99]=100;
		int[] smallTab= new int[10];
		
		int[][] hugeTab=new int[3][];
		hugeTab[0]=longTab;
		hugeTab[1]=midTab;
		hugeTab[2]=smallTab;
		
		System.out.println("Dlugosc tablic:");
		System.out.println("wiersz1:" +hugeTab[0].length+" ,wiersz2: "+hugeTab[1].length+ " ,wiersz3: "+ hugeTab[2].length);
		System.out.println("100-tny elemnt z tablicy longTab: "+hugeTab[0][99]);
		
		
	}

}
	

public class CrossCircle {
	public static void main(String[] args) {
		int[][] tab=new int[3][3];
		tab[0][0]=5;
		tab[1][1]=5;
		tab[2][2]=5;
		System.out.println("tab[0][0]= "+tab[0][0]);
		
		int[][] array=new int[3][]; //chcemy 3 wiersza
		array[0]= new int[3]; //pierwszy wiersz z 3 elementami
		array[1]= new int[2]; // drugi z dwoma
		array[2]= new int[1]; // trzeci z jednym
	}

}

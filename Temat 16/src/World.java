
public class World {
	public static void main(String[] args) {
		Human adam=new Human("Adam", 185.5);
		Human ewa=new Human("Ewa", 167.5);
		
		double avgHeight=((adam.getHeight()+ewa.getHeight())/2);
		Human.avgHeight=avgHeight;
		
		System.out.println("Pierwsi ludzie na ziemi:");
		System.out.println(adam.getName()+" "+adam.getHeight());
		System.out.println(ewa.getName()+" "+ewa.getHeight());
		
		System.out.println("Sredni wzrost:");
		System.out.println(adam.avgHeight);
		System.out.println(ewa.avgHeight);
		System.out.println(Human.avgHeight);
		
	}

}

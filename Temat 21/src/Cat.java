
public class Cat extends Animal{
	public Cat(String name) {
		super(name);
	}
	
	@Override
	public void giveSound() {
		System.out.println("Jestem kotem i mam na imie "+ getName());
	}
	
	public void meow() {
		System.out.println("Miauuu");
	}

}

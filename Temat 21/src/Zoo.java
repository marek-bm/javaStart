
public class Zoo {
	
	public static void main(String[] args) {
		Animal dog=new Dog("Burek");
		Animal cat=new Cat("Mruczek");
		Animal doge=new Animal("Kotopies");
		
		dog.giveSound();
		cat.giveSound();
		doge.giveSound();

		Dog specificDog=(Dog)dog;
		specificDog.bark();
		
		((Cat)cat).meow();
				
	}
	
}

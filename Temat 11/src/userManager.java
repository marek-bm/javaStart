
public class userManager {
	public static void main(String[] args) {
	
		user user1=new user("Jan", "Kowalski");
		
		System.out.println("Wybierz opcje:");
		System.out.println("0 - exit");
		System.out.println("1 - user info");
		System.out.println("2 - modify user\'s data");
		
		int option=1;
		
		if (option==0) {
			System.out.println("bye, bye");
		} else if (option == 1) {
			System.out.println(user1.getName() +" "+ user1.getSurname());			
		} else if(option ==2) {
			user1.setName("Edek");
			user1.setSurname("Z krainy kredek");
			System.out.println("Zmieniono dane uzytkownika na "+ user1.getName()+" "+user1.getSurname());
		}
			
	}
	
	
	
	

}

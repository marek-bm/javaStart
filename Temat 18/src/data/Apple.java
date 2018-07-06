package data;

public class Apple extends Fruit {
	private String appleGrade;
	
	public String getAppleGrade() {
		return appleGrade;
	}
	
	public void setAppleGrade(String appleGrade) {
		this.appleGrade=appleGrade;
	}
	
	public void printInfo() {
		super.printInfo();
		System.out.println("jablko "+ appleGrade);
	}
	
	public Apple(String appleGrade) {
		super();
		setAppleGrade(appleGrade);
	}

}

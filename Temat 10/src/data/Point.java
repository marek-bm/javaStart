package data;

public class Point{
	private int X;
	private int Y;
	
	//setter getter for X coordinate
	public int getX() {
		return X;
	}

	public void setX(int x) {
		this.X = x;
	}
	
	// setter, getter for Y coordinate
	public int getY() {
		return Y;
	}

	public void setY(int y) {
		Y = y;
	}

	//konsturktor
	public Point (int x, int y){
		this.setX(x);
		this.setY(y);
	}
	
	
	//metody
	public void pointInfo() {
		System.out.println("x=" + getX() + ", y=" + getY());
	}
	
	public static void main(String[] args) {
		
		Point pt2= new Point(1, 5);
		pt2.pointInfo();
		
	}
}
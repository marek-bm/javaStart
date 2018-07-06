package controller;

import data.Point;

public class PointController{
		
	public void addX(Point point) {
		point.setX(point.getX()+1);
		
	}
	
	public void minusX(Point point) {
		point.setX(point.getX()-1);
	}
	
	public void addY(Point point) {
		point.setY(point.getY()+1);
	}
	
	public void minusY(Point punkt) {
		punkt.setY(punkt.getY()-1);				
	}
	
	public static void main(String[] args) {
		Point pt1=new Point(2, 3);
		
		PointController action=new PointController();
		action.minusY(pt1);
		
		
		pt1.pointInfo();
	}
}



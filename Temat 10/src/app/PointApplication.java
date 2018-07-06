package app;

import controller.PointController;
import data.Point;

public class PointApplication {
	public static void main(String[] args) {
		Point pkt1= new Point(3, -5);
		Point pkt2=new Point(0,0);
		pkt1.pointInfo();
		pkt2.pointInfo();
		
		PointController action=new PointController();
		action.addX(pkt1);
		pkt1.pointInfo();
		action.minusY(pkt2);
		pkt2.pointInfo();

		//public static final int ADD_X = 1;
		//public static final int MINUS_X=-1;
		
		final int actionButton=2;
		
		switch(actionButton) {
		case 1:
			action.addX(pkt1);
			pkt1.pointInfo();
			break;
		case 2:
			action.minusX(pkt1);
			pkt1.pointInfo();
			break;
		case 3:
			action.addY(pkt1);
			pkt1.pointInfo();
			break;
		case 4:
			action.minusY(pkt1);
			pkt1.pointInfo();
			break;
		default:
			System.out.println("Brak akcji, wprowadz liczbe od 1 do 4");
		}
		
		
	}

	
}

package app;
//import hurtownia.Part;
import hurtownia.ExhaustPart;
import hurtownia.TireAndWheel;

public class testClass {
	public static void main(String[] args) {
		TireAndWheel tire1= new TireAndWheel();
		tire1.type="Opona";
		tire1.manufacturer="Stomil";
		tire1.partID="St100";
		tire1.productionLot="abc123";
		tire1.size=14;
		tire1.width=185;
		
		TireAndWheel wheel1= new TireAndWheel();
		wheel1.type="Felga Al";
		wheel1.manufacturer="OEM";
		wheel1.partID="FGH";
		wheel1.productionLot="DFC123";
		wheel1.size=14;
		wheel1.width=185;
		
				
		ExhaustPart exh1=new ExhaustPart();
		exh1.type="wydech";
		exh1.EuroCompliance="yes";
		exh1.manufacturer="Acme";
		exh1.partID="AC-100";
		exh1.productionLot="AAA 12-03-2018";
		
				
		tire1.partInfo();
		wheel1.partInfo();
		exh1.partInfo();
	}

}

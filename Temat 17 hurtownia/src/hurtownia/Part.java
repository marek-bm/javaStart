package hurtownia;

public class Part {
	public String type;
	public String partID;
	public String manufacturer;
	public String productionLot;
	
	public void partInfo() {
		System.out.println(type+ " partId: "+ partID+" ,Producent:  "+manufacturer+" ,Lot: "+productionLot);
	}
	
}

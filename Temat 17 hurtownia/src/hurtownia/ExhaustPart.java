package hurtownia;

public class ExhaustPart extends Part {
	public String EuroCompliance;
	public void partInfo() {
		System.out.println("informacja o produkcie:");
		System.out.println(type+ " partId: "+ partID+" ,Producent:  "+manufacturer+" ,Lot: "+productionLot);
		System.out.println("Euro compliance: "+ EuroCompliance+"\n");
	}

}

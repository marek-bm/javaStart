package hurtownia;

public class TireAndWheel extends Part{
	
	public int size;
	public int width;

	public void partInfo() {
		System.out.println("informacja o produkcie:");
		System.out.println(type+ " partId: "+ partID+" ,Producent:  "+manufacturer+" ,Lot: "+productionLot);
		System.out.println("Diameter: "+size+" Width: "+width+"\n");
	}
}

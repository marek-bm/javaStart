package data;

public class Computer {
	private String producer;
	private int model;
	
	public String getProducer(){
		return producer;
	}
	
	public void setProducer(String producer) {
		this.producer=producer;
	}
	
	public int getModel() {
		return model;
	}
	
	public void setModel(int model) {
		this.model=model;
	}
	
	// konstruktor
	
	public Computer(String producer, int model) {
		setProducer(producer);
		setModel(model);
	}
	
	@Override
	public boolean equals(Object obj) {
		//sprawdzanie rownosci fizycznej (miejsca w pamieci) 	
		if (this==obj) {
			return true;
		}
		
		//sprawdzenie czy nie null
		if (obj==null) {
			return false;
		}
		
		//sprawdzenie czy przekazany obiekt jest typu Computer
		if (!(obj instanceof Computer)) {
			return false;
		}
		
		//rzutowanie na odpowiedni typ
		Computer comp=(Computer) obj;
		
		//sprawdzanie pol klasy
		if (this.model==comp.model && this.producer==comp.producer)
			return true;
		if (this.producer!=null) {
			if(!this.producer.equals(comp.producer))
				return false;
		}
		if (this.model==comp.model)
			return true;
		
		return true;

	}
	
	@Override
	public String toString() {
		return producer + " " + model;
		
	}

}

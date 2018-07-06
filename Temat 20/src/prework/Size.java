package prework;

public enum Size {
	SMALL ("Maly"), MEDIUM ("Sredni"), LARGE ("Duzy");
	// pole opisu
	private String description;
	
	//konstruktor
	Size (String desc){
		description=desc;
	}
	
	//getter
		public String getDescription() {
			return description;
		}

}

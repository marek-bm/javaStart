package data;

public class Library {
		
		public static final int MAX_PUBLICATIONS=2000;
        private Publication[] publications;
        private Magazine[] magazines;
        private int publicationsNumber;
        
        
        public Library() {
        	publications=new Book[MAX_PUBLICATIONS];
        	
        }
        
        public int getPublicationsNumber() {
        	return publicationsNumber;
        }
		
        public Magazine[] getMagazines() {
        	return magazines;
        }
        
        public void addBook(Book book) {
        	addPublication(book);
        }
        	
        	public void printBooks() {
        		int countBooks = 0;
        		for(int i=0; i<publicationsNumber; i++) {
        			if(publications[i] instanceof Book) {
        				System.out.println(publications[i]);
        				countBooks++;
        			}
        		}
        		
        		if(countBooks == 0) {
        			System.out.println("Brak ksi��ek w bibliotece");
        		}
        	}
        	
        	public void addMagazine(Magazine magazine) {
        		addPublication(magazine);
        	}
        	
        	public void printMagazines() {
        		int countMagazines = 0;
        		for(int i=0; i<publicationsNumber; i++) {
        			if(publications[i] instanceof Magazine) {
        				System.out.println(publications[i]);
        				countMagazines++;
        			}
        		}
        		
        		if(countMagazines == 0) {
        			System.out.println("Brak magazyn�w w bibliotece");
        		}
        	}
        	
        	private void addPublication(Publication pub) {
        		if(publicationsNumber < MAX_PUBLICATIONS) {
        			publications[publicationsNumber] = pub;
        			publicationsNumber++;
        		} else {
        			System.out.println("Maxymalna liczba publikacji zosta�a osi�gni�ta");
        		}
    }   	
      
}       	
        
		

        
            




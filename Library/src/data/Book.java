package data;

public class Book extends Publication {
    private String title;
    private String author;
    private int releaseDate;
    private int pages;
    private String publisher;
    private String isbn;

    //setters and getters
    public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}
	
	public String getAuthor() {
		return author;
	}
	
	public void setAuthor(String author) {
		this.author=author;
	}	
	
	public int getReleaseDate() {
		return releaseDate;
	}

	public void setReleaseDate(int releaseDate) {
		this.releaseDate=releaseDate;
	}
	
	public int getPages() {
		return pages;
	}
	
	public void setPages(int pages) {
		this.pages=pages;
	}
	
	public String getPublisher() {
		return publisher;
	}
	
	public void setPublisher(String publisher) {
		this.publisher=publisher;
	}
	
	public String getIsbn() {
		return isbn;
	}
	
	public void setIsbn(String isbn) {
		this.isbn=isbn;
	}
		
//CONSTRUCTOR:	

	public Book(String bookTitle,String bookAuthor, int bookReleaseDate, int bookPages, String bookPublisher, String bookIsbn){
        super(bookReleaseDate, bookTitle, bookPublisher);
        setAuthor(bookAuthor);
        setPages(bookPages);
        setIsbn(bookIsbn);
    }

    public Book(Book book){
        this(book.getTitle(), book.getAuthor(), book.getReleaseDate(), book.getPages(), book.getPublisher(), book.getIsbn());
    }

//METHODS:
    public void printInfo(){
        String info= getTitle()+"; "+getAuthor()+"; "+";"+getReleaseDate()+"; "+getPages()+"; "+getPublisher()+"; "+getIsbn();
        System.out.println(info);

    }
}





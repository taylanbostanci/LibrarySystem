
public class Book {

	
	private int id;
	private String name;
	private Person author;
    private float price;
    private static int id_counter=1;
    
	public Book( String name, Person author, float price) {
		super();
		this.id = id_counter;
		this.name = name;
		this.author = author;
		this.price = price;
		this.id_counter++;
		
	}

	public int getId() {
		return id;
	}

	

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Person getAuthor() {
		return author;
	}

	public void setAuthor(Person author) {
		this.author = author;
	}

	public float getPrice() {
		return price;
	}

	public void setPrice(float price) {
		this.price = price;
	}
    
    
    
}

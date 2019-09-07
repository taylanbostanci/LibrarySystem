import java.util.*;
public class BookManagement {
	
	private Scanner sc;
	
	private BookManager book;
	
    public BookManagement() {
	
	this.sc = new Scanner(System.in);
	
	this.book= new BookManager();
	
    }

    private int menu() {
	
	System.out.println("WELCOME TO LIBRARY SYSTEM");
	
	System.out.println("1-ADD BOOK");
	
	System.out.println("2-SHOW ALL BOOKS");
	
	System.out.println("3-REMOVE BOOK");
	System.out.println("4-UPDATE BOOK");
	System.out.println("0-EXIT");
	
	int choice = readInt(0,4);
	
		return choice;
	}
    
    public void start() {
	
	while(true) {
		
	int choice = menu();
		
	switch(choice) {
		
		
		case 0:
			
			System.exit(0);
			
		break;
		
		case 1: addBook();
		
		break;
		
		case 2: show();
		
		break;
		
		case 3: removeBook();
		
		break;
		case 4 : updateBook();
		break;
		
		default :
			
		throw new AssertionError();
		
		}
	    }
        }


public void updateBook() {
    
	  System.out.println("Enter ID of book");
      int id = readInt(0, Integer.MAX_VALUE);
  
      boolean result = this.book.removeBook(id);


      

	System.out.println("Enter new Book name");
	
	String name = sc.next();
	
	System.out.println("Enter Author name");
	String authorname = sc.next();
	System.out.println("price");
	Person author= new Person();
	author.setName(authorname);
	float price = readFloat(0,Float.MAX_VALUE);
	Book b = new Book(name,author,price);
	this.book.addBook(b);
	
}

	

	public void addBook() {
		//TODO call add book scene
		
    System.out.println("Enter Book ID:");
 
    int id = readInt(0,Integer.MAX_VALUE);

	System.out.println("Enter Book name");
	
	String name = sc.next();
	
	System.out.println("Enter Author name");
	String authorname = sc.next();
	boolean result = this.book.removeBook(id);

Person author= new Person();
author.setName(authorname);
	
	System.out.println("Enter Price");
	
	float price = readFloat(0,Float.MAX_VALUE);
	
	Book b = new Book(name,author,price);
	
    this.book.addBook(b);
 
    
    
	}
	
	
	private int readInt(int min , int max) {
		
    int choice;
    
    while(true) {
    	
			 try{
				 
				choice = Integer.parseInt(sc.nextLine());
				
				if(choice>=min && choice <=max) {
					
					break;
				}
			    }
			 
		    catch(Exception  e) {
			
			e.printStackTrace();
			
			}
	        }
    
	        return choice;
	        
	        }

	private float readFloat(int min,float max ){
		
		
	float price;
	
	while(true) {
		
			try {
				
			price=Float.parseFloat(sc.nextLine());
			
			if(price>=min && price <= max) {
				
				break;
				
			}
			}catch (Exception e) {
				
				System.out.println("Try to enter float value for price");
			}
		    }
	
	        return price;
	        } 
	
    private void show() {
	//TODO call show scene
	System.out.println("ID \t Name \t Author \tPrice");
	
	for(int i =0 ;i<this.book.count();i++) {
		
    Book  b = this.book.getBook(i);
		
	System.out.println(b.getId()+"\t"+b.getName()+"\t"+b.getAuthor()+"\t"+b.getPrice());
		
		
	  }
      }

    private void removeBook() {
    	//TODO call removebook scene
        System.out.println("Enter ID of book");
        int id = readInt(0, Integer.MAX_VALUE);
        boolean result = this.book.removeBook(id);
        if(result){
            System.out.println("Book was removed");
        }else{
            System.out.println("Book not found");
        }
    }
         }












import java.util.ArrayList;
import java.util.List;

public class BookManager {

	private List<Book> Booklist;

	public BookManager() {

		this.Booklist = new ArrayList<>();

	}

	public int addBook(Book b) {
		if (b != null) {
			this.Booklist.add(b);
		}
		return count();

	}

	public int count() {

		return this.Booklist.size();
	}

	public Book getBook(int index) {

		if (index < 0 || index >= count()) {

			return null;

		}

		return this.Booklist.get(index);

	}

	
	public int update(int id,Book b) {
		
	
		if(id>=0) {
			
		
			int index = -1;
			for(int i=0,n=count();i<n;i++) {
		if(this.Booklist.get(i).getId()==id) {
			index =i;
			break;
		}}
			if (index != -1) {
				Booklist.remove(index);
				
			}
			if (b != null) {
				this.Booklist.add(b);
			
			return count();
		
		}
			
		
		}
		return id;

		
	}
	public boolean removeBook(int id) {
		if (id >= 0) {
			int index = -1;

			for (int i = 0, n = count(); i < n; i++) {

				if (this.Booklist.get(i).getId() == id) {

					index = i;

					break;
				}
			}

			if (index != -1) {
				this.Booklist.remove(index);
				return true;
			}
			return false;
		} else
			return false;
	}

}
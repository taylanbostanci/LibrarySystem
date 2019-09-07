import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.Menu;
import javafx.scene.control.MenuBar;
import javafx.scene.control.MenuItem;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class UILibrary extends Application {
	BookManager book = new BookManager();
Stage stage;
	public static void main(String[] args) {
		launch(args);

	}

	@Override
	public void start(Stage arg0) throws Exception {
		stage=arg0;
		arg0.setScene(startMenu());
		arg0.show();

	}
	
	public Scene removeBook() {
		VBox a = new VBox();
		Label a1 = new Label("Write id for delete");
		TextField a2 = new TextField();
		Button a3 = new Button();
		EventHandler myEventHandler45 = new EventHandler<ActionEvent>() {
			public void handle(ActionEvent event) {
				
				final int id;
				id = Integer.parseInt(a2.getText());
				book.removeBook(id);
				stage.setScene(startMenu());
			}
		};a3.setOnAction(myEventHandler45);
		a.getChildren().addAll(a1,a2,a3);
		Scene removeBook = new Scene(a,500,500);

		return removeBook;
	}
	
	
	
	
	
	
	
public Scene updateBook() {
	
	Person author = new Person();
	
	VBox v2 = new VBox();
	Label l5 = new Label("Write id for update");
	TextField tf4 = new TextField();
	Label l2 = new Label("New Book Name");
	TextField tf = new TextField();
	Label l3 =new Label("New Author name");
	TextField tf2 = new TextField();
	Label l4 = new Label("New Price");
	TextField tf3 = new TextField();
	Button ba = new Button("Update");
	
	
	
	EventHandler myEventHandler = new EventHandler<ActionEvent>() {

		@Override
		public void handle(ActionEvent event) {
			final int id;
			
			
			id=Integer.parseInt(tf4.getText());
			book.removeBook(id);
			final String name ;
		
			final float price;

			
			author.setName(tf2.getText());
			name = tf.getText();
			tf3.setText(name);
	
			price = Float.parseFloat(tf3.getText());
			
			Book b = new Book(name, author, price);
			 GridPane root = new GridPane();
			
			root.add(tf4,id,1);
	
			book.addBook(b);

			
		
			stage.setScene(startMenu());
			
			
			
		}
	};
	ba.setOnAction(myEventHandler);
	
	v2.getChildren().addAll(l5,tf4,l2,tf,l3, tf2, l4, tf3,ba);
	Scene updateBook = new Scene(v2,500,500);
	return updateBook;
}
	public Scene addBook() {

		Person author = new Person();
		VBox v1 = new VBox();
		Label l1 = new Label("Book Name");
		TextField tf = new TextField();
		Label l2 = new Label("Author Name");
		TextField tf1 = new TextField();
		Label l3 = new Label("Price");
		TextField tf2 = new TextField();
		Button b = new Button("Add");

		EventHandler myEventHandler = new EventHandler<ActionEvent>() {

			@Override
			public void handle(ActionEvent event) {
				final String name;
				final float price;
				author.setName(tf1.getText());
				name = tf.getText();
				price = Float.parseFloat(tf2.getText());
				
				Book b1 = new Book(name, author, price);

				book.addBook(b1);
				
				stage.setScene(startMenu());
				
			}
		};
		b.setOnAction(myEventHandler);

		v1.getChildren().addAll(l1, tf, l2, tf1, l3, tf2,b);

		Scene addBook = new Scene(v1,500,500);
		return addBook;

	}
	
	
	public Scene showBook() {
		VBox v1 = new VBox();
		
		
		
		
		
		
		for(int i =0 ;i<this.book.count();i++) {
			
		    Book  b = this.book.getBook(i);
				
			System.out.println(b.getId()+"\t"+b.getName()+"\t"+b.getAuthor().getName()+"\t"+b.getPrice());
			Label sl = new Label(b.getId()+"\t"+b.getName()+"\t"+b.getAuthor().getName()+"\t"+b.getPrice());
			v1.getChildren().addAll(sl);	
		}
		Scene showBook = new Scene(v1,500,500);
		return showBook;
	}
	public Scene startMenu() {

	 MenuBar menuBar = new MenuBar();
	 Menu book = new Menu("Book");
     // --- Menu File
     MenuItem menuFile = new MenuItem("Add");
     EventHandler myEventHandler = new EventHandler<ActionEvent>() {

			@Override
			public void handle(ActionEvent event) {
			
				stage.setScene(addBook());
				
			}
		};
		menuFile.setOnAction(myEventHandler);

     // --- Menu Edit
     MenuItem menuEdit = new MenuItem("Update");

	 EventHandler myEventHandler3 = new EventHandler<ActionEvent>() {

			@Override
			public void handle(ActionEvent event) {
			
				stage.setScene(updateBook());
				
			}
		};
		menuEdit.setOnAction(myEventHandler3);

     
     // --- Menu View
     MenuItem menuView = new MenuItem("Show");
     
     EventHandler myEventHandler1 = new EventHandler<ActionEvent>() {

			@Override
			public void handle(ActionEvent event) {
			
				stage.setScene(showBook());
				
			}
		};
		menuView.setOnAction(myEventHandler1);
		
		
		
		
		
		
		
     MenuItem menuRemove = new MenuItem("Delete");
     book.getItems().addAll(menuView,menuEdit,menuFile,menuRemove);
     menuBar.getMenus().addAll(book);
EventHandler myEvent = new EventHandler<ActionEvent>() {
	public void handle(ActionEvent event) {
		stage.setScene(removeBook());
	}
};

menuRemove.setOnAction(myEvent);

     
      
     Scene showBook = new Scene(menuBar,500,500);
		return showBook;


	}

}



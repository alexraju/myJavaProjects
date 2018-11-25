import java.util.ArrayList;
import java.util.List;

public class Book {


	private String author;
	private String nameOfTheBook;
	
	public Book(String author, String nameOfTheBook) {
		this.author = author;
		this.nameOfTheBook = nameOfTheBook;
	}
	
	
	public String toString() {
		return "book author = " + author + ",name of book = " + nameOfTheBook;
	}
	
}

import java.util.ArrayList;
import java.util.List;

public class Library {
	
	String nameOfTheLibrary;
	String address;
	
	
	private List<Book> allBooks = new ArrayList<>();
	private List<Subscriber> allSubscribers = new ArrayList<>();
	
	
	
	public Library(String name, String address) {
		this.nameOfTheLibrary= name;
		this.address = address;
	}
	
	public void addBook(Book book ) {
		allBooks.add( book);
	}
	
	public void removeBook (Book book) {
		allBooks.remove(book);
	}
	
	public void addSubscriber(Subscriber subscriber) {
		allSubscribers.add(subscriber);
	}
	
	public void removeSubscriber(Subscriber subscriber) {
		allSubscribers.remove(subscriber);
	}
	
	public void borrowBook(Book book, Subscriber subscriber) {
		removeBook(book);
		addSubscriber(subscriber);
		
	}
	
	public void returnBook (Book book, Subscriber subscriber) {
		addBook(book);
		removeSubscriber(subscriber);
	}
	
	
	public void showBooks() {
		for(int i = 0; i < allBooks.size(); i++ ) {
		Book b = allBooks.get(i);
			System.out.println(b);
		}
	}
	
	public void showSubscribers() {
		for(int i = 0; i < allSubscribers.size(); i++) {
			Subscriber s = allSubscribers.get(i);
			System.out.println(s);		
		}
			
	}
	
	
	
	}
	
	

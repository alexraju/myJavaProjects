
public class Library_Main {

	public static void main(String[] args) {
		
		Library myLibrary = new Library("Concord LIbrary", "Concord");
		Book fiction = new Book("Harry Potter", "J.K.Rowling");
		
		Subscriber s1 = new Subscriber();	
		s1.setNameOfTheSubscriber("Sujith");
		
		myLibrary.addBook(fiction);
		myLibrary.showBooks();
		myLibrary.addSubscriber(s1);
		myLibrary.showSubscribers();
		
		
	
		

	}

}

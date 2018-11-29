package chapter_3;

class Books {
	String title;
	String author;
}


class BooksTestDrive {
public static void main(String[] args) {

	Books [] myBooks = new Books [3];
	
	
	
	myBooks[0] = new Books();
	myBooks[1] = new Books();
	myBooks[2] = new Books();
	myBooks[1].title = "Game fo thrones";
	myBooks[1].author = "George";
	
	myBooks[2].title = "Snow Swords";
	myBooks[2].author = "R.R";
	
	myBooks[0].title = "A dance of Dragons";
	myBooks[0].author = "Martin";
	
	int x = 0;
	while (x < 3) {
		System.out.println(myBooks[x].title + " by " + myBooks[x].author);
		x = x + 1;
	}

}
}
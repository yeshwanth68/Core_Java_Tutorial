package Constructor;

class Book {
	String title;
	String author;

	Book(String title, String author) {
		this.title = title;
		this.author = author;
	}

	Book(Book another) {
		this.title = another.title;
		this.author = another.author;
	}

	void display() {
		System.out.println("Title: " + title + ", Author: " + author);
	}
}

public class CopyConstructor {

	public static void main(String[] args) {
		Book book1 = new Book("Java Programming", "James Gosling");

		// Create another object using copy constructor
		Book book2 = new Book(book1);

		book1.display();
		book2.display();

	}

}

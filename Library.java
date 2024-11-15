package week1.day2.homeassigments;

public class Library {
	
	//defining a method to print the book added confirmation
	public String addBook(String bookTitle) {
		System.out.println("Book added successfully");
		return bookTitle;
	}
	//defining a method to print the book issued confirmation
	public void issueBook() {
		System.out.println("Book issued successfully");
	}
	public static void main(String[] args) {
		
		Library library = new Library();  //Creating an object for the Library class
		//calling the addBook and issueBook methods
		String lb =library.addBook("Wings of Fire"); 
		System.out.println("Book Title : "+lb);
		library.issueBook();		
	}

}

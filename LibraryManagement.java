package week1.day2.homeassigments;

public class LibraryManagement {

	public static void main(String[] args) {
		
		Library library = new Library(); //Creating an object for the Library class
		//calling the addBook and issueBook methods
		String lb =library.addBook("Wings of Fire"); 
		System.out.println("Book Title : "+lb);
		library.issueBook();	

	}

}

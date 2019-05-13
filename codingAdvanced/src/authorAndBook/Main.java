package authorAndBook;

import java.util.ArrayList;
import java.util.List;

public class Main {

	public static void main(String[] args) {

		Author Csabi = new Author("Csabi", "DoeJohn@gamil.com", 'M');
		List<Author> authorList1 = new ArrayList<>();
		authorList1.add(Csabi);
		Book Da = new Book("Da", authorList1, 30, 2);

		Author Sergiu, Janos, Pista = new Author("DrSergiu", "Sergiu.Jisa@gmail.com", 'M');
		// Book Energie = new Book("Energie", Sergiu, Janos, Pista, 200, 40);
		Author Paul = new Author("Paul", "Paul@yahoo.com", 'M');
		// Book Politica = new Book("Politica", Paul, 10, 0);

		List<Book> bookList = new ArrayList<>();
		bookList.add(Da);
		// bookList.add(Energie);
		// bookList.add(Politica);
		for (Book carti : bookList) {

		}

//		Book[] books = { Da, Energie, Politica };
//		for (Book carti : books) {
//			System.out.println(carti.getAuthor().getEmail());
		// }
	}
}
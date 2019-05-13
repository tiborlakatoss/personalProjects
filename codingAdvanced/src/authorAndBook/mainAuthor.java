package authorAndBook;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.Map;
import java.util.Set;
import java.util.TreeSet;

public class mainAuthor {

	public static void main(String[] args) {

		Author Janos = new Author("Janos", "Janos@gmail.com", 'M');
		Author Feri = new Author("Feri", "Feri@gmail.com", 'M');
		Author Pista = new Author("Pista", "Pirta@gmail.com", 'M');
		Author PistaF = new Author("Pista", "Pirta@gmail.com", 'M');

		List<Author> authorList1 = new ArrayList<>();
		authorList1.add(Janos);
		authorList1.add(Feri);
		authorList1.add(Pista);
		// System.out.println(authorList1);
		// System.out.println(authorList1.get(2));

		List<Author> authorList2 = new LinkedList<>();
		authorList2.add(Janos);
		authorList2.add(Feri);
		authorList2.add(Pista);
		// System.out.println(authorList2);
		// System.out.println(authorList2.get(2));

		Set<Author> SetAuthor1 = new HashSet<>();

		SetAuthor1.add(Janos);
		SetAuthor1.add(Feri);
		SetAuthor1.add(Pista);
		SetAuthor1.add(PistaF);
		// System.out.println(authorList2);
		// System.out.print(SetAuthor1);

		Map<String, Author> mapAuthors = new HashMap<>();

		mapAuthors.put(Janos.getEmail(), Janos);
		mapAuthors.put(Feri.getEmail(), Feri);
		mapAuthors.put(Pista.getEmail(), Pista);
		for (String email : mapAuthors.keySet()) {
			// System.out.println(email);
			// System.out.println(mapAuthors.get(email));
		}
		Set<Author> TreeSetAuthor1 = new TreeSet<>();

		TreeSetAuthor1.add(Janos);
		TreeSetAuthor1.add(Feri);
		TreeSetAuthor1.add(Pista);
		TreeSetAuthor1.add(PistaF);
		System.out.println(TreeSetAuthor1);

	}

}
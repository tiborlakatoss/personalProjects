package authorAndBook;

import java.util.List;

public class Book {
	private String name;
	private List<Author> authors;
	private double price;
	private int qty = 0;

	public Book(String name, List<Author> authors, double price) {

		super();
		this.name = name;
		this.authors = authors;
		this.price = price;

	}

	public Book() {

	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public List<Author> getAuthor() {
		return authors;
	}

	public void setAuthor(List<Author> authors) {
		this.authors = authors;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public int getQty() {
		return qty;
	}

	public void setQty(int qty) {
		this.qty = qty;
	}

	public Book(String name, List<Author> authors, double price, int qty) {
		super();
		this.name = name;
		this.authors = authors;
		this.price = price;
		this.qty = qty;
	}

	@Override
	public String toString() {
		return "Book [name=" + name + ", authors=" + authors + ", price=" + price + ", qty=" + qty + "]";
	}

}

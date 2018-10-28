package core.designPattern.prototype;

import java.util.ArrayList;
import java.util.List;

public class Store {

	private String storeName;
	List<Book> books = new ArrayList<>();
	
	public String getStoreName() {
		return storeName;
	}
	public void setStoreName(String storeName) {
		this.storeName = storeName;
	}
	public List<Book> getBooks() {
		return books;
	}
	public void setBooks(List<Book> books) {
		this.books = books;
	}
	
	@Override
	public String toString() {
		return "Store [storeName=" + storeName + ", books=" + books + "]";
	}
	
	
}

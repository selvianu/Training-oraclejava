package test.dao;

import dao.BookDAOImpl;
import model.Book;

public class TestBookDelete {

	public static void main(String[] args) throws Exception {
		Book b = new Book();
		b.setId(3l);
		BookDAOImpl bd = new BookDAOImpl();
		bd.delete(b);
	}
}

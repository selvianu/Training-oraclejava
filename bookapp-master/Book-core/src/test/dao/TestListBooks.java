package test.dao;

import java.util.List;

import dao.BookDAOImpl;
import model.Book;

public class TestListBooks {

	public static void main(String[] args) throws Exception {
		

		BookDAOImpl bd = new BookDAOImpl();
		List<Book> list = bd.list();
		for (Book book : list) {
			System.out.println(book);

		}
	}

}
	
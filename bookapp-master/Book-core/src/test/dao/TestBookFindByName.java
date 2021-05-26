package test.dao;

import java.util.List;

import dao.BookDAOImpl;
import model.Book;

public class TestBookFindByName {

	public static void main(String[] args) throws Exception {
		String bookName = "dbms";

		BookDAOImpl bd = new BookDAOImpl();
		List<Book> list = bd.findByName(bookName);
		for (Book book : list) {
			System.out.println(book);

		}
	}

}
	
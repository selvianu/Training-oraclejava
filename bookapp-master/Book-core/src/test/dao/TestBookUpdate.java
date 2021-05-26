package test.dao;

import java.sql.SQLException;

import dao.BookDAOImpl;
import model.Book;

public class TestBookUpdate {

	public static void main(String[] args) throws SQLException, Exception {
		Book b = new Book();
		b.setId(1l);
		b.setName("maths");
		BookDAOImpl bd = new BookDAOImpl();
		bd.update(b);
	}

	
}

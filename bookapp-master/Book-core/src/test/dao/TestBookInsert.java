package test.dao;

import model.Book;

import java.util.Scanner;

import dao.BookDAOImpl;

public class TestBookInsert {

	public static void main(String[] args) throws Exception {
		Book b = new Book();
		

		BookDAOImpl bd = new BookDAOImpl();
		bd.insert(b);
	}

}

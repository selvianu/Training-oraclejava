package com.chainsys.product_test;

import java.sql.SQLException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

import com.chainsys.product.Product;
import com.chainsys.product.dao.ProductDAOImple;

public class ProductTest {

	public static void main(String[] args) throws ParseException, ClassNotFoundException, SQLException {

		Product product = new Product();
		ProductDAOImple impl = new ProductDAOImple();
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter product id, name and product expiry date");
		int id = scanner.nextInt();
		String name = scanner.next();

		String date = scanner.next();
	//	Date date1 = new SimpleDateFormat("dd-MM-yyyy").parse(date);
		// System.out.println(date1);

		product.setId(id);
		product.setName(name);
	//	product.setExpiryDate((java.sql.Date) date1);

		// System.out.println(product);

	//	impl.save(product);
		impl.findById(id);
	}

}

package com.chainsys.product.dao;

import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Set;

import com.chainsys.product.Product;
import com.chainsys.util.Util;

public class ProductDAOImple implements ProductDAO {

	@Override
	public void save(Product product) throws ClassNotFoundException, SQLException {
		System.out.println("product saved through impl	" + product);
		Connection con = Util.getConnection();

		String query = "insert into product(product_id,product_name,expiry) values(?,?,to_date('2021/05/25','yyyy/mm/dd'))";
		PreparedStatement p = con.prepareStatement(query);
		p.setInt(1, product.getId());
		p.setString(2, product.getName());
		// p.setDate(3, product.getExpiryDate());
		int rows = p.executeUpdate();
		System.out.println("no of user added" + rows);

	}

	@SuppressWarnings("null")
	@Override
	public Product findById(int id) throws ClassNotFoundException, SQLException {
		Product product = null;
		Connection con = Util.getConnection();
		String query = "select * from product where product_id=?";
		PreparedStatement p = con.prepareStatement(query);
		p.setInt(1, product.getId());
		ResultSet rs = p.executeQuery();
		int int1 = rs.getInt(1);
		String name = rs.getString(2);
		Date expiryDate = rs.getDate(3);
		product = new Product();
		product.setId(int1);
		product.setName(name);
		product.setExpiryDate(expiryDate);
		System.out.println(name + expiryDate);
		return product;

	}

	@Override
	public void findAll() {
		// TODO Auto-generated method stub

	}

	@Override
	public void Update(int id) {
		// TODO Auto-generated method stub

	}

	@Override
	public void delete(int id) {
		// TODO Auto-generated method stub

	}

}

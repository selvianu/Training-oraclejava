package com.chainsys.product.dao;

import java.sql.SQLException;

import com.chainsys.product.Product;

public interface ProductDAO {
	public void save(Product product) throws ClassNotFoundException, SQLException;

	public Product findById(int id) throws ClassNotFoundException, SQLException;

	public void findAll();

	public void Update(int id);

	public void delete(int id);

}

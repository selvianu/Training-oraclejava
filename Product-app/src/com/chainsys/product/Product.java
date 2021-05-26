package com.chainsys.product;

import java.sql.Date;

public class Product {

	private int id;
	private String name;
	private java.sql.Date ExpiryDate;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public java.sql.Date getExpiryDate() {
		return ExpiryDate;
	}

	public void setExpiryDate(Date expiryDate) {
		ExpiryDate = (java.sql.Date) expiryDate;
	}

	public String toString() {
		return id + "  " + name + " " + ExpiryDate;
	}
}

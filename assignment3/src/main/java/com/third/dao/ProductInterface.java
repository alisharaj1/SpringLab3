package com.third.dao;

import java.util.List;

import com.third.entity.Product;
public interface ProductInterface {
	public boolean create(Product product);
	public List<Product> fetch();
}
